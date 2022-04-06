package com.codeo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.dao.IssueDao;
import com.codeo.dao.IssueDaoImpl;
import com.codeo.entity.Issues;


public class IssueController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	IssueDao issuedao=null;
	RequestDispatcher rd=null;
	
	public IssueController() {
		super();
		issuedao=new IssueDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String action = request.getParameter("action");
		
		if(action == null) {
			action = "LIST";
		}
		
		switch(action) {
			
			case "LIST":
				listIssues(request, response);
				break;
				
			case "EDIT":
				getSingleIssue(request, response);
				break;
				
			case "DELETE":
				deleteIssues(request, response);
				break;
				
			default:
				listIssues(request, response);
				break;
				
		}
		
	}
private void listIssues(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	List<Issues> theList = issuedao.get();
	
	request.setAttribute("list", theList);
	
	rd = request.getRequestDispatcher("/reports.jsp");
	
	
		rd.forward(request, response);
	
		
	}

private void deleteIssues(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	
	if(issuedao.delete(Integer.parseInt(id))) {
		request.setAttribute("NOTIFICATION", "Issues Deleted Successfully!");
	}
	
	listIssues(request, response);
		
	}

private void getSingleIssue(HttpServletRequest request, HttpServletResponse response) {
	String id = request.getParameter("id");
	
	Issues issues= issuedao.get(Integer.parseInt(id));
	
	request.setAttribute("issues", issues);
	
	rd = request.getRequestDispatcher("Issuefile.jsp");
	
	try {
		rd.forward(request, response);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String id = request.getParameter("id");
	
	Issues issues = new Issues();
	issues.setIssuetitle(request.getParameter("issuetitle"));
	issues.setOpenedby(request.getParameter("openedby"));
	issues.setDateopened(request.getParameter("dateopened"));
	issues.setDatefixed(request.getParameter("datefixed"));
	issues.setPriority(request.getParameter("priority"));
	issues.setStatus(request.getParameter("status"));
	issues.setComments(request.getParameter("comments"));
	System.out.println(request.getParameter("datefixed"));
	if(id.isEmpty() || id == null) {
		
		if(issuedao.save(issues)) {
			request.setAttribute("NOTIFICATION", "Issues Saved Successfully!");
		}
	
	}else {
		
		issues.setId(Integer.parseInt(id));
		if(issuedao.update(issues)) {
			request.setAttribute("NOTIFICATION", "Issues Updated Successfully!");
		}
		
	}
	
	listIssues(request, response);
}

}


		
	


