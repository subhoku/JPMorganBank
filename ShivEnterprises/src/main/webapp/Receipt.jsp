<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" class="loading">
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Apex admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, Apex admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>Invoice Page - Apex responsive bootstrap 4 admin template</title>
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
<%@include file="header.jsp" %>
<%@include file="aside.jsp" %>
<div class="wrapper nav-collapsed menu-collapsed">
<div class="main-panel">
        <div class="main-content">
          <div class="content-wrapper">
          <!--Invoice template starts-->
<div class="row">
    <div class="col-md-12">
        <h4>Invoice</h4>
    </div>
</div>
<section class="invoice-template" method="post" action="" id="myfrm">
    <div class="card">
        <div class="card-body p-3">
            <div id="invoice-template" class="card-block">
                <!-- Invoice Company Details -->
                <div id="invoice-company-details" class="row">
                    <div class="col-6 text-left">
                        <img src="app-assets/img/logos/logo.png" alt="company logo" class="mb-2" width="110">
                        <ul class="px-0 list-unstyled">
                            <li class="text-bold-800">Icon Healthcare Solutions</li>
                            <li>Plot No-121, 1st floor, Suresh Apartment</li>
                            <li>Opp. Sangam Restaurant, Hanuman Nagar</li>
                            <li>Medical Square, Nagpur- 440 009</li>
                            <li>Mobile No: 9545552401, 9545552402, 9545652407</li>
                            <li>Email: maheshicon@gmail.com, manojicon@gmail.com</li>
                            <li>Visit Us: https://www.indiamart.com.Soon-Healthcare-solutions</li>
                        </ul>
                    </div>
                    <div class="col-6 text-right">
                        <h2>INVOICE</h2>
                        <p class="pb-3"># INV-001001</p>
                        <ul class="px-0 list-unstyled">
                            <li>Balance Due</li>
                            <li class="lead text-bold-800">$ 12,000.00</li>
                        </ul>
                    </div>
                </div>
                <!--/ Invoice Company Details -->
                <!-- Invoice Customer Details -->
                <div id="invoice-customer-details" class="row pt-2">
                    <div class="col-sm-12 text-left">
                        <p class="text-muted">Party Details</p>
                    </div>
                    <div class="col-6 text-left">
                        <ul class="px-0 list-unstyled">
                            <li class="text-bold-800">Shiv Enterprises</li>
                            <li>Near Silver City Hospital</li>
                            <li>Khamgaon</li>
                            <li>Pin 444303</li>
                            <li>GST: 24APUPM4265Q125</li>
                        </ul>
                    </div>
                    <div class="col-6 text-right">
                        <p><span class="text-muted">Invoice Date :</span> 06/05/2016</p>
                        <p><span class="text-muted">Terms :</span> Due on Receipt</p>
                        <p><span class="text-muted">Due Date :</span> 10/05/2016</p>
                        <p><span class="text-muted">Customer Mobile :</span> 8446057466</p>
                    </div>
                </div>
                <!--/ Invoice Customer Details -->
                <!-- Invoice Items Details -->
                <div id="invoice-items-details" class="pt-2">
                    <div class="row">
                        <div class="table-responsive col-sm-12">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Sr No</th>
                                        <th>Description of goods</th>
                                        <th class="text-right">Batch No.</th>
                                        <th class="text-right">HSN</th>
                                        <th class="text-right">Exp.Date</th>
                                        <th class="text-right">Quantity</th>
                                        <th class="text-right">Unit</th>
                                        <th class="text-right">Price</th>
                                        <th class="text-right">GST%</th>
                                        <th class="text-right">GST Amt</th>
                                        <th class="text-right">Amount(Rs.)</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>
                                            <p>Create PSD for mobile APP</p>
                                            <p class="text-muted">Simply dummy text of the printing and typesetting industry.</p>
                                        </td>
                                        <td class="text-right">$ 20.00/hr</td>
                                        <td class="text-right">120</td>
                                        <td class="text-right">$ 2400.00</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">2</th>
                                        <td>
                                            <p>iOS Application Development</p>
                                            <p class="text-muted">Pellentesque maximus feugiat lorem at cursus.</p>
                                        </td>
                                        <td class="text-right">$ 25.00/hr</td>
                                        <td class="text-right">260</td>
                                        <td class="text-right">$ 6500.00</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">3</th>
                                        <td>
                                            <p>WordPress Template Development</p>
                                            <p class="text-muted">Vestibulum euismod est eu elit convallis.</p>
                                        </td>
                                        <td class="text-right">$ 20.00/hr</td>
                                        <td class="text-right">300</td>
                                        <td class="text-right">$ 6000.00</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 col-sm-12 text-left">
                            <p class="lead">Payment Methods:</p>
                            <div class="row">
                                <div class="col-12">
                                    <table class="table table-borderless table-sm">
                                        <tbody>
                                            <tr>
                                                <td>Bank name:</td>
                                                <td class="text-right">Bank of Maharashtra, Deonagar Branch</td>
                                            </tr>
                                            <tr>
                                                <td>Acc name:</td>
                                                <td class="text-right">Icon Healthcare Solutions</td>
                                            </tr>
                                            <tr>
                                                <td>Acc Number:</td>
                                                <td class="text-right">20029441365</td>
                                            </tr>
                                            <tr>
                                                <td>IFSC code:</td>
                                                <td class="text-right">MAHB0000240</td>
                                            </tr>
                                        </tbody>
                          
                                    </table>
                                       <ul class="px-0 list-unstyled">
                                        <li class="text-bold-800">Terms & Conditions</li>
                                        <li>LBT: NMCLBT1013148016113 E & O. E.</li>
                                        <li>Goods once sold will not be taken back</li>
                                        <li>Subject to Nagpur Juridiction</li>
                                        <li>Please deposite the cheque in favour of "Icon</li>
                                        <li>healthcare Solutions" at bank of Maharashtra Account</li>
                                        <li>A/C No: 2002941365</li>
                        </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12">
                            <p class="lead">Total due</p>
                            <div class="table-responsive">
                                <table class="table">
                                    <tbody>
                                        <tr>
                                            <td>Sub Total</td>
                                            <td class="text-right">$ 14,900.00</td>
                                        </tr>
                                        <tr>
                                            <td>TAX (12%)</td>
                                            <td class="text-right">$ 1,788.00</td>
                                        </tr>
                                        <tr>
                                            <td class="text-bold-800">Total</td>
                                            <td class="text-bold-800 text-right"> $ 16,688.00</td>
                                        </tr>
                                        <tr>
                                            <td>Payment Made</td>
                                            <td class="pink text-right">(-) $ 4,688.00</td>
                                        </tr>
                                        <tr class="bg-grey bg-lighten-4">
                                            <td class="text-bold-800">Balance Due</td>
                                            <td class="text-bold-800 text-right">$ 12,000.00</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div class="text-center">
                                <p>Authorized person</p>
                                <img src="app-assets/img/pages/signature-scan.png" alt="signature" class="width-250">
                                <h6>Amanda Orton</h6>
                                <p class="text-muted">Managing Director</p>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Invoice Footer -->
                <div id="invoice-footer">
                    <div class="row">
                        <div class="col-md-9 col-sm-12">
                            <h6>Terms &amp; Condition</h6>
                            <p>You know, being a test pilot isn't always the healthiest business in the world. We predict too
                                much for the next year and yet far too little for the next 10.</p>
                        </div>
                        <div class="col-md-3 col-sm-12 text-center">
                            <button type="button" class="btn btn-primary btn-raised my-1"><i class="fa fa-paper-plane-o"></i> Send Invoice</button>
                        </div>
                    </div>
                </div>
                <!--/ Invoice Footer -->
            </div>
        </div>
        <p align="center"><input type="button" onclick="myPrint('myfrm')" value="print"></p>
    <script>
        function myPrint(myfrm) {
            var printdata = document.getElementById(myfrm);
            newwin = window.open("");
            newwin.document.write(printdata.outerHTML);
            newwin.print();
            newwin.close();
        }
    </script>
    
    </div>
</section>
<%@include file="footer.jsp" %>

<!--Invoice template ends-->

          </div>
        </div>
        </div>
        </div>
        
        
        
        
        
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