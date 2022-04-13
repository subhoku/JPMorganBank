package com.codeo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codeo.conn.DBConnectionUtil;
import com.codeo.entity.Issues;

public class IssueDaoImpl implements IssueDao {

	
	 String select_query="Select * from issuedetection";

	@Override
	public List<Issues> get() {
		//List is interface ArrayList is a class
		List<Issues> list=null;
		Issues issues=null;
		try {
			list=new ArrayList<>();
			Connection connection=DBConnectionUtil.openConnection();
			Statement st=null;
			st=connection.createStatement();
			ResultSet rs=null;
			rs=st.executeQuery(select_query);
			if(rs!=null) {
				/*
				 * id, issuetitle, openedby, dateopened, datefixed, priority, status, comments,
				 * issuedt
				 */
				while(rs.next()) {
					issues=new Issues();
					issues.setId(rs.getInt("id"));
					issues.setIssuetitle(rs.getString("issuetitle"));
					issues.setOpenedby(rs.getString("openedby"));
					issues.setDateopened(rs.getString("dateopened"));
					issues.setDatefixed(rs.getString("datefixed"));
					issues.setPriority(rs.getString("priority"));
					issues.setStatus(rs.getString("status"));
					issues.setComments(rs.getString("comments"));
					
					
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Issues get(int id) {
		
		Issues issues=null;
		try {
			
			Connection connection=DBConnectionUtil.openConnection();
			Statement st=null;
			st=connection.createStatement();
			ResultSet rs=null;
			 String select_query_by_id="Select * from issuedetection where id="+id;
			rs=st.executeQuery(select_query_by_id);
			if(rs!=null) {
				/*
				 * id, issuetitle, openedby, dateopened, datefixed, priority, status, comments,
				 * issuedt
				 */
				while(rs.next()) {
					issues=new Issues();
					issues.setId(rs.getInt("id"));
					issues.setIssuetitle("issuetitle");
					issues.setOpenedby(rs.getString("openedby"));
					issues.setDateopened(rs.getString("dateopened"));
					issues.setDatefixed(rs.getString("datefixed"));
					issues.setPriority(rs.getString("priority"));
					issues.setStatus(rs.getString("status"));
					issues.setComments(rs.getString("comments"));
					
					
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return issues;
	}

	@Override
	public boolean save(Issues issues) {
		boolean flag = false;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
			String sql = "INSERT INTO issuedetection( issuetitle, openedby, dateopened, datefixed, priority, status, comments)VALUES"
					+ "('"+issues.getIssuetitle()+"', '"+issues.getOpenedby()+"', '"+issues.getDateopened()+"', '"+issues.getDatefixed()+"', '"+issues.getPriority()+"', '"+issues.getStatus()+"', '"+issues.getComments()+"')";
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return flag;
	}
	

	@Override
	public boolean delete(int id) {
		boolean flag = false;
		Connection connection;
		PreparedStatement preparedStatement;
		try {
			String sql = "DELETE FROM issue_detection where id="+id;
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Issues issues) {
		boolean flag = false;
		Connection connection;
		PreparedStatement preparedStatement=null;
		/*
		 * id, issuetitle, openedby, dateopened, datefixed, priority, status, comments,
		 */
		try {
			String sql = "UPDATE issuedetection SET issuetitle = '"+issues.getIssuetitle()+"', "
					+ "openedby = '"+issues.getOpenedby()+"', dateopened = '"+issues.getDateopened()+"', datefixed = '"+issues.getDatefixed()+"', priority = '"+issues.getPriority()+"', status = '"+issues.getStatus()+"' , comments = '"+issues.getComments()+"' where id="+issues.getId();
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void emailFunctionality() {
		
		
	}

}
