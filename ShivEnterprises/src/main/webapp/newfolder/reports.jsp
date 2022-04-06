<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Apex admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, Apex admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>API DataTable - Apex responsive bootstrap 4 admin template</title>
    <link rel="apple-touch-icon" sizes="60x60" href="../app-assets/img/ico/apple-icon-60.html">
    <link rel="apple-touch-icon" sizes="76x76" href="../app-assets/img/ico/apple-icon-76.html">
    <link rel="apple-touch-icon" sizes="120x120" href="../app-assets/img/ico/apple-icon-120.html">
    <link rel="apple-touch-icon" sizes="152x152" href="../app-assets/img/ico/apple-icon-152.html">
    <link rel="shortcut icon" type="image/x-icon" href="../app-assets/img/ico/favicon.ico">
    <link rel="shortcut icon" type="image/png" href="../app-assets/img/ico/favicon-32.png">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="default">
    <link href="https://fonts.googleapis.com/css?family=Rubik:300,400,500,700,900|Montserrat:300,400,500,600,700,800,900" rel="stylesheet">
    <!-- BEGIN VENDOR CSS-->
    <!-- font icons-->
    <link rel="stylesheet" type="text/css" href="../app-assets/fonts/feather/style.min.css">
    <link rel="stylesheet" type="text/css" href="../app-assets/fonts/simple-line-icons/style.css">
    <link rel="stylesheet" type="text/css" href="../app-assets/fonts/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../app-assets/vendors/css/perfect-scrollbar.min.css">
    <link rel="stylesheet" type="text/css" href="../app-assets/vendors/css/prism.min.css">
    <link rel="stylesheet" type="text/css" href="../app-assets/vendors/css/tables/datatable/datatables.min.css">
    <link rel="stylesheet" type="text/css" href="../app-assets/vendors/css/tables/datatable/responsive.dataTables.min.css">
    <!-- END VENDOR CSS-->
    <!-- BEGIN APEX CSS-->
    <link rel="stylesheet" type="text/css" href="../app-assets/css/app.css">
    <!-- END APEX CSS-->
    <!-- BEGIN Page Level CSS-->
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <!-- END Custom CSS-->
</head>


<body data-col="2-columns" class=" 2-columns ">

  <div class="wrapper nav-collapsed menu-collapsed">


     
      <div data-active-color="white" data-background-color="purple-bliss" data-image="app-assets/img/sidebar-bg/01.jpg" class="app-sidebar">

<%@include file="../aside.jsp" %>
</div>
<%@include file="../header.jsp" %>
<div class="content-wrapper">
<section id="text-inputs">
    <div class="row">
        <div class="col-16">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Issue Detection Reports</h4>
                </div>
                <div class="card-body collapse show">
                    <div class="card-block">
                       
                        <div id="DataTables_Table_1_wrapper" class="dataTables_wrapper container-fluid dt-bootstrap4"><div class="row"><div class="col-sm-12 col-md-6"><div class="dataTables_length" id="DataTables_Table_1_length">
     </div>
                        </div><div class="col-sm-12 col-md-6">
                 
                        </div></div>
                        <div class="row">
                        <p>${NOTIFICATION}</p>
                        <p>
			<button class = "btn btn-primary" onclick="window.location.href = 'Issuefile.jsp'">Add Issue</button>
		</p>
                        <div class="col-sm-12">
                        <table class="table table-striped table-bordered text-inputs-searching dataTable" id="DataTables_Table_1" role="grid" aria-describedby="DataTables_Table_1_info">
                            <thead>
                                <tr role="row"><th class="sorting_asc" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Name: activate to sort column descending" aria-sort="ascending" style="width: 181px;">Name</th>
                                <th class="sorting" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 181px;">Issue Title</th>
                                <th class="sorting" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 181px;">Opened By</th>
                                <th class="sorting" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 120px;">Date Opened</th>
                                <th class="sorting" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 181px;">Date Closed</th>
                                <th class="sorting" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 181px;">Priority</th>
                                <th class="sorting" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 181px;">Status</th>
                                <th class="sorting" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 181px;">Comments</th>
                                 <th class="sorting" tabindex="0" aria-controls="DataTables_Table_1" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 181px;">Selections</th>
     </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${myList}" var="issues">
                      
                            <tr role="row" class="odd">
                            <td>${issue.name}</td>
							<td>${issues.issuelist}</td>
							<td>${issues.openedby}"</td>
							<td>${issues.dateopened}</td>
							<td>${issues.dateclosed}</td>
							<td>${issues.priority}</td>
							<td>${issues.status}</td>
							<td>${issues.comment}</td>
							<td> 
							<a href = "${pageContext.request.contextPath}/IssueController?action=EDIT&id=${issues.id}">Edit</a> 
							| 
							<a href = "${pageContext.request.contextPath}/IssueController?action=DELETE&id=${issues.id}">Delete</a> 
						</td>
                                </tr>
                                
                                	</c:forEach>
                                	</tbody>
                            <tfoot>
                                <tr><th rowspan="1" colspan="1"><input type="text" placeholder="Search Name"></th><th rowspan="1" colspan="1"><input type="text" placeholder="Search Position"></th><th rowspan="1" colspan="1"><input type="text" placeholder="Search Office"></th><th rowspan="1" colspan="1"><input type="text" placeholder="Search Age"></th><th rowspan="1" colspan="1"><input type="text" placeholder="Search Start date"></th><th rowspan="1" colspan="1"><input type="text" placeholder="Search Salary"></th></tr>
                            </tfoot>
                        </table></div></div></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</div></div>
 <!-- Theme customizer Ends-->
    <!-- BEGIN VENDOR JS-->
    <script src="../app-assets/vendors/js/core/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="../app-assets/vendors/js/core/popper.min.js" type="text/javascript"></script>
    <script src="../app-assets/vendors/js/core/bootstrap.min.js" type="text/javascript"></script>
    <script src="../app-assets/vendors/js/perfect-scrollbar.jquery.min.js" type="text/javascript"></script>
    <script src="../app-assets/vendors/js/prism.min.js" type="text/javascript"></script>
    <script src="../app-assets/vendors/js/jquery.matchHeight-min.js" type="text/javascript"></script>
    <script src="../app-assets/vendors/js/screenfull.min.js" type="text/javascript"></script>
    <script src="../app-assets/vendors/js/pace/pace.min.js" type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src="../app-assets/vendors/js/datatable/datatables.min.js" type="text/javascript"></script>
    <script src="../app-assets/vendors/js/datatable/dataTables.responsive.min.js" type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN APEX JS-->
    <script src="../app-assets/js/app-sidebar.js" type="text/javascript"></script>
    <script src="../app-assets/js/notification-sidebar.js" type="text/javascript"></script>
    <script src="../app-assets/js/customizer.js" type="text/javascript"></script>
    <!-- END APEX JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src="../app-assets/js/data-tables/datatable-api.js" type="text/javascript"></script>
</body>

</html>