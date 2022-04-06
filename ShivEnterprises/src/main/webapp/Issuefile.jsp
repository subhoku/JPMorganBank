
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Apex admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, Apex admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>Dashboard1 - Apex responsive bootstrap 4 admin template</title>
    <link rel="apple-touch-icon" sizes="60x60" href="app-assets/img/ico/apple-icon-60.html">
    <link rel="apple-touch-icon" sizes="76x76" href="app-assets/img/ico/apple-icon-76.html">
    <link rel="apple-touch-icon" sizes="120x120" href="app-assets/img/ico/apple-icon-120.html">
    <link rel="apple-touch-icon" sizes="152x152" href="app-assets/img/ico/apple-icon-152.html">
    <link rel="shortcut icon" type="image/x-icon" href="app-assets/img/ico/favicon.ico">
    <link rel="shortcut icon" type="image/png" href="app-assets/img/ico/favicon-32.png">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="default">
    <link href="https://fonts.googleapis.com/css?family=Rubik:300,400,500,700,900|Montserrat:300,400,500,600,700,800,900" rel="stylesheet">
    <!-- BEGIN VENDOR CSS-->
    <!-- font icons-->
    <link rel="stylesheet" type="text/css" href="app-assets/fonts/feather/style.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/fonts/simple-line-icons/style.css">
    <link rel="stylesheet" type="text/css" href="app-assets/fonts/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/vendors/css/perfect-scrollbar.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/vendors/css/prism.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/vendors/css/chartist.min.css">
    <!-- END VENDOR CSS-->
    <!-- BEGIN APEX CSS-->
    <link rel="stylesheet" type="text/css" href="app-assets/css/app.css">
    <!-- END APEX CSS-->
    <!-- BEGIN Page Level CSS-->
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <!-- END Custom CSS-->

</head>

  <body data-col="2-columns" class=" 2-columns ">
  <div class="wrapper nav-collapsed menu-collapsed">


    
      <div data-active-color="white" data-background-color="purple-bliss" data-image="app-assets/img/sidebar-bg/01.jpg" class="app-sidebar">

<%@include file="aside.jsp" %>
</div>
<%@include file="header.jsp" %>
<div class="main-panel">
<div class="main-content">
<div class="content-wrapper">
<div class="row">
<div class="row match-height">
<div class="col-md-6" >
			<div class="card" style="height: 958px;width:500px ">
				<div class="card-header">
					<h4 class="card-title" id="basic-layout-tooltip">Issue Tracking Form</h4>
				
				</div>
				<div class="card-body">
				
					<form action = "${pageContext.request.contextPath}/IssueController" method="POST">
		
					<div class="px-3">

						
							<div class="form-body">

								<div class="form-group">
									<label for="issueinput1">Issue Title</label>
									<input type="text" id="issueinput1" class="form-control" name="issuetitle" value = "${issues.name}" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Issue Title">
								</div>

								<div class="form-group">
									<label for="issueinput2">Opened By</label>
									<input type="text" id="issueinput2" class="form-control" name="openedby" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Opened By">
								</div>

								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="issueinput3">Date Opened</label>
											<input type="date" id="issueinput3" class="form-control" name="dateopened" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Date Opened">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="issueinput4">Date Fixed</label>
											<input type="date" id="issueinput4" class="form-control" name="datefixed" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Date Fixed">
										</div>
									</div>
								</div>


								<div class="form-group">
									<label for="issueinput5">Priority</label>
									<select id="issueinput5" name="priority" class="form-control" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Priority">
										<option value="low">Low</option>
										<option value="medium">Medium</option>
										<option value="high">High</option>
									</select>
								</div>

								<div class="form-group">
									<label for="issueinput6">Status</label>
									<select id="issueinput6" name="status" class="form-control" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Status">
										<option value="not started">Not Started</option>
										<option value="started">Started</option>
										<option value="fixed">Fixed</option>
									</select>
								</div>

								<div class="form-group">
									<label for="issueinput8">Comments</label>
									<textarea id="issueinput8" rows="5" value = "${issues.comments}" class="form-control" name="comments" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Comments"></textarea>
								</div>

							</div>
</div>
	<input type = "hidden" name = "id" value = "${issues.id}"/>
							<div class="form-actions">
								<button type="reset" class="btn btn-raised btn-warning mr-1">
									<i class="ft-x"></i> Cancel
								</button>
								<button type="submit" class="btn btn-raised btn-primary">
									<i class="fa fa-check-square-o"></i> Save
								</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

</div>
</div>
    
    
</div>

</div></div>

<%@include file="footer.jsp" %>


<!-- Theme customizer Ends-->
    <!-- BEGIN VENDOR JS-->
    <script src="app-assets/vendors/js/core/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/core/popper.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/core/bootstrap.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/perfect-scrollbar.jquery.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/prism.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/jquery.matchHeight-min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/screenfull.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/pace/pace.min.js" type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN APEX JS-->
    <script src="app-assets/js/app-sidebar.js" type="text/javascript"></script>
    <script src="app-assets/js/notification-sidebar.js" type="text/javascript"></script>
    <script src="app-assets/js/customizer.js" type="text/javascript"></script>
    <!-- END APEX JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <!-- END PAGE LEVEL JS-->
 
</body>


</html>
