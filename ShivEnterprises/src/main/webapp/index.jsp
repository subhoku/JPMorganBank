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


      <!-- main menu-->
      <!--.main-menu(class="#{menuColor} #{menuOpenType}", class=(menuShadow == true ? 'menu-shadow' : ''))-->
      <div data-active-color="white" data-background-color="purple-bliss" data-image="app-assets/img/sidebar-bg/01.jpg" class="app-sidebar">

<%@include file="aside.jsp" %>
</div>
<%@include file="header.jsp" %>
<div class="main-panel">
<div class="main-content">
<div class="content-wrapper">
<div class="row">
	<div class="col-xl-3 col-lg-6 col-md-6 col-12">
		<div class="card gradient-blackberry">
			<div class="card-body">
				<div class="card-block pt-2 pb-0">
					<div class="media">
						<div class="media-body white text-left">
							<h3 class="font-large-1 mb-0">$2156</h3>
							<span>Total Tax</span>
						</div>
						<div class="media-right white text-right">
							<i class="icon-pie-chart font-large-1"></i>
						</div>
					</div>
				</div>
				<div id="Widget-line-chart" class="height-75 WidgetlineChart WidgetlineChartshadow mb-2">					
				<svg xmlns:ct="http://gionkunz.github.com/chartist-js/ct" width="100%" height="100%" class="ct-chart-line" style="width: 100%; height: 100%;"><g class="ct-grids"><line x1="10" x2="10" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="31.645833333333332" x2="31.645833333333332" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="53.291666666666664" x2="53.291666666666664" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="74.9375" x2="74.9375" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="96.58333333333333" x2="96.58333333333333" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="118.22916666666666" x2="118.22916666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="139.875" x2="139.875" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="161.52083333333331" x2="161.52083333333331" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="183.16666666666666" x2="183.16666666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="204.8125" x2="204.8125" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="226.45833333333331" x2="226.45833333333331" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="248.10416666666666" x2="248.10416666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="269.75" x2="269.75" y1="15" y2="70" class="ct-grid ct-horizontal"></line></g><g><g class="ct-series ct-series-a"><path d="M10,51.667C31.646,60.833,31.646,60.833,31.646,60.833C53.292,33.333,53.292,33.333,53.292,33.333C74.938,42.5,74.938,42.5,74.938,42.5C96.583,15,96.583,15,96.583,15C118.229,42.5,118.229,42.5,118.229,42.5C139.875,33.333,139.875,33.333,139.875,33.333C161.521,42.5,161.521,42.5,161.521,42.5C183.167,24.167,183.167,24.167,183.167,24.167C204.813,38.833,204.813,38.833,204.813,38.833C226.458,33.333,226.458,33.333,226.458,33.333C248.104,46.167,248.104,46.167,248.104,46.167C269.75,46.167,269.75,46.167,269.75,46.167" class="ct-line"></path><line x1="10" y1="51.66666666666667" x2="10.01" y2="51.66666666666667" class="ct-point" ct:value="50"></line><line x1="31.645833333333332" y1="60.833333333333336" x2="31.655833333333334" y2="60.833333333333336" class="ct-point" ct:value="45"></line><line x1="53.291666666666664" y1="33.333333333333336" x2="53.30166666666666" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="74.9375" y1="42.5" x2="74.9475" y2="42.5" class="ct-point" ct:value="55"></line><line x1="96.58333333333333" y1="15" x2="96.59333333333333" y2="15" class="ct-point" ct:value="70"></line><line x1="118.22916666666666" y1="42.5" x2="118.23916666666666" y2="42.5" class="ct-point" ct:value="55"></line><line x1="139.875" y1="33.333333333333336" x2="139.885" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="161.52083333333331" y1="42.5" x2="161.5308333333333" y2="42.5" class="ct-point" ct:value="55"></line><line x1="183.16666666666666" y1="24.166666666666664" x2="183.17666666666665" y2="24.166666666666664" class="ct-point" ct:value="65"></line><line x1="204.8125" y1="38.83333333333333" x2="204.8225" y2="38.83333333333333" class="ct-point" ct:value="57"></line><line x1="226.45833333333331" y1="33.333333333333336" x2="226.4683333333333" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="248.10416666666666" y1="46.16666666666667" x2="248.11416666666665" y2="46.16666666666667" class="ct-point" ct:value="53"></line><line x1="269.75" y1="46.16666666666667" x2="269.76" y2="46.16666666666667" class="ct-point" ct:value="53"></line></g></g><g class="ct-labels"></g></svg></div>
			</div>
		</div>
	</div>
	<div class="col-xl-3 col-lg-6 col-md-6 col-12">
		<div class="card gradient-ibiza-sunset">
			<div class="card-body">
				<div class="card-block pt-2 pb-0">
					<div class="media">
						<div class="media-body white text-left">
							<h3 class="font-large-1 mb-0">$1567</h3>
							<span>Total Cost</span>
						</div>
						<div class="media-right white text-right">
							<i class="icon-bulb font-large-1"></i>
						</div>
					</div>
				</div>
				<div id="Widget-line-chart1" class="height-75 WidgetlineChart WidgetlineChartshadow mb-2">					
				<svg xmlns:ct="http://gionkunz.github.com/chartist-js/ct" width="100%" height="100%" class="ct-chart-line" style="width: 100%; height: 100%;"><g class="ct-grids"><line x1="10" x2="10" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="31.645833333333332" x2="31.645833333333332" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="53.291666666666664" x2="53.291666666666664" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="74.9375" x2="74.9375" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="96.58333333333333" x2="96.58333333333333" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="118.22916666666666" x2="118.22916666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="139.875" x2="139.875" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="161.52083333333331" x2="161.52083333333331" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="183.16666666666666" x2="183.16666666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="204.8125" x2="204.8125" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="226.45833333333331" x2="226.45833333333331" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="248.10416666666666" x2="248.10416666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="269.75" x2="269.75" y1="15" y2="70" class="ct-grid ct-horizontal"></line></g><g><g class="ct-series ct-series-a"><path d="M10,51.667C31.646,60.833,31.646,60.833,31.646,60.833C53.292,33.333,53.292,33.333,53.292,33.333C74.938,42.5,74.938,42.5,74.938,42.5C96.583,15,96.583,15,96.583,15C118.229,42.5,118.229,42.5,118.229,42.5C139.875,33.333,139.875,33.333,139.875,33.333C161.521,42.5,161.521,42.5,161.521,42.5C183.167,24.167,183.167,24.167,183.167,24.167C204.813,38.833,204.813,38.833,204.813,38.833C226.458,33.333,226.458,33.333,226.458,33.333C248.104,46.167,248.104,46.167,248.104,46.167C269.75,46.167,269.75,46.167,269.75,46.167" class="ct-line"></path><line x1="10" y1="51.66666666666667" x2="10.01" y2="51.66666666666667" class="ct-point" ct:value="50"></line><line x1="31.645833333333332" y1="60.833333333333336" x2="31.655833333333334" y2="60.833333333333336" class="ct-point" ct:value="45"></line><line x1="53.291666666666664" y1="33.333333333333336" x2="53.30166666666666" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="74.9375" y1="42.5" x2="74.9475" y2="42.5" class="ct-point" ct:value="55"></line><line x1="96.58333333333333" y1="15" x2="96.59333333333333" y2="15" class="ct-point" ct:value="70"></line><line x1="118.22916666666666" y1="42.5" x2="118.23916666666666" y2="42.5" class="ct-point" ct:value="55"></line><line x1="139.875" y1="33.333333333333336" x2="139.885" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="161.52083333333331" y1="42.5" x2="161.5308333333333" y2="42.5" class="ct-point" ct:value="55"></line><line x1="183.16666666666666" y1="24.166666666666664" x2="183.17666666666665" y2="24.166666666666664" class="ct-point" ct:value="65"></line><line x1="204.8125" y1="38.83333333333333" x2="204.8225" y2="38.83333333333333" class="ct-point" ct:value="57"></line><line x1="226.45833333333331" y1="33.333333333333336" x2="226.4683333333333" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="248.10416666666666" y1="46.16666666666667" x2="248.11416666666665" y2="46.16666666666667" class="ct-point" ct:value="53"></line><line x1="269.75" y1="46.16666666666667" x2="269.76" y2="46.16666666666667" class="ct-point" ct:value="53"></line></g></g><g class="ct-labels"></g></svg></div>

			</div>
		</div>
	</div>
	
	<div class="col-xl-3 col-lg-6 col-md-6 col-12">
		<div class="card gradient-green-tea">
			<div class="card-body">
				<div class="card-block pt-2 pb-0">
					<div class="media">
						<div class="media-body white text-left">
							<h3 class="font-large-1 mb-0">$4566</h3>
							<span>Total Sales</span>
						</div>
						<div class="media-right white text-right">
							<i class="icon-graph font-large-1"></i>
						</div>
					</div>
				</div>
				<div id="Widget-line-chart2" class="height-75 WidgetlineChart WidgetlineChartshadow mb-2">				
				<svg xmlns:ct="http://gionkunz.github.com/chartist-js/ct" width="100%" height="100%" class="ct-chart-line" style="width: 100%; height: 100%;"><g class="ct-grids"><line x1="10" x2="10" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="31.645833333333332" x2="31.645833333333332" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="53.291666666666664" x2="53.291666666666664" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="74.9375" x2="74.9375" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="96.58333333333333" x2="96.58333333333333" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="118.22916666666666" x2="118.22916666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="139.875" x2="139.875" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="161.52083333333331" x2="161.52083333333331" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="183.16666666666666" x2="183.16666666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="204.8125" x2="204.8125" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="226.45833333333331" x2="226.45833333333331" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="248.10416666666666" x2="248.10416666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="269.75" x2="269.75" y1="15" y2="70" class="ct-grid ct-horizontal"></line></g><g><g class="ct-series ct-series-a"><path d="M10,51.667C31.646,60.833,31.646,60.833,31.646,60.833C53.292,33.333,53.292,33.333,53.292,33.333C74.938,42.5,74.938,42.5,74.938,42.5C96.583,15,96.583,15,96.583,15C118.229,42.5,118.229,42.5,118.229,42.5C139.875,33.333,139.875,33.333,139.875,33.333C161.521,42.5,161.521,42.5,161.521,42.5C183.167,24.167,183.167,24.167,183.167,24.167C204.813,38.833,204.813,38.833,204.813,38.833C226.458,33.333,226.458,33.333,226.458,33.333C248.104,46.167,248.104,46.167,248.104,46.167C269.75,46.167,269.75,46.167,269.75,46.167" class="ct-line"></path><line x1="10" y1="51.66666666666667" x2="10.01" y2="51.66666666666667" class="ct-point" ct:value="50"></line><line x1="31.645833333333332" y1="60.833333333333336" x2="31.655833333333334" y2="60.833333333333336" class="ct-point" ct:value="45"></line><line x1="53.291666666666664" y1="33.333333333333336" x2="53.30166666666666" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="74.9375" y1="42.5" x2="74.9475" y2="42.5" class="ct-point" ct:value="55"></line><line x1="96.58333333333333" y1="15" x2="96.59333333333333" y2="15" class="ct-point" ct:value="70"></line><line x1="118.22916666666666" y1="42.5" x2="118.23916666666666" y2="42.5" class="ct-point" ct:value="55"></line><line x1="139.875" y1="33.333333333333336" x2="139.885" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="161.52083333333331" y1="42.5" x2="161.5308333333333" y2="42.5" class="ct-point" ct:value="55"></line><line x1="183.16666666666666" y1="24.166666666666664" x2="183.17666666666665" y2="24.166666666666664" class="ct-point" ct:value="65"></line><line x1="204.8125" y1="38.83333333333333" x2="204.8225" y2="38.83333333333333" class="ct-point" ct:value="57"></line><line x1="226.45833333333331" y1="33.333333333333336" x2="226.4683333333333" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="248.10416666666666" y1="46.16666666666667" x2="248.11416666666665" y2="46.16666666666667" class="ct-point" ct:value="53"></line><line x1="269.75" y1="46.16666666666667" x2="269.76" y2="46.16666666666667" class="ct-point" ct:value="53"></line></g></g><g class="ct-labels"></g></svg></div>
			</div>
		</div>
	</div>
	<div class="col-xl-3 col-lg-6 col-md-6 col-12">
		<div class="card gradient-pomegranate">
			<div class="card-body">
				<div class="card-block pt-2 pb-0">
					<div class="media">
						<div class="media-body white text-left">
							<h3 class="font-large-1 mb-0">$8695</h3>
							<span>Total Earning</span>
						</div>
						<div class="media-right white text-right">
							<i class="icon-wallet font-large-1"></i>
						</div>
					</div>
				</div>
				<div id="Widget-line-chart3" class="height-75 WidgetlineChart WidgetlineChartshadow mb-2">					
				<svg xmlns:ct="http://gionkunz.github.com/chartist-js/ct" width="100%" height="100%" class="ct-chart-line" style="width: 100%; height: 100%;"><g class="ct-grids"><line x1="10" x2="10" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="31.645833333333332" x2="31.645833333333332" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="53.291666666666664" x2="53.291666666666664" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="74.9375" x2="74.9375" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="96.58333333333333" x2="96.58333333333333" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="118.22916666666666" x2="118.22916666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="139.875" x2="139.875" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="161.52083333333331" x2="161.52083333333331" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="183.16666666666666" x2="183.16666666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="204.8125" x2="204.8125" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="226.45833333333331" x2="226.45833333333331" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="248.10416666666666" x2="248.10416666666666" y1="15" y2="70" class="ct-grid ct-horizontal"></line><line x1="269.75" x2="269.75" y1="15" y2="70" class="ct-grid ct-horizontal"></line></g><g><g class="ct-series ct-series-a"><path d="M10,51.667C31.646,60.833,31.646,60.833,31.646,60.833C53.292,33.333,53.292,33.333,53.292,33.333C74.938,42.5,74.938,42.5,74.938,42.5C96.583,15,96.583,15,96.583,15C118.229,42.5,118.229,42.5,118.229,42.5C139.875,33.333,139.875,33.333,139.875,33.333C161.521,42.5,161.521,42.5,161.521,42.5C183.167,24.167,183.167,24.167,183.167,24.167C204.813,38.833,204.813,38.833,204.813,38.833C226.458,33.333,226.458,33.333,226.458,33.333C248.104,46.167,248.104,46.167,248.104,46.167C269.75,46.167,269.75,46.167,269.75,46.167" class="ct-line"></path><line x1="10" y1="51.66666666666667" x2="10.01" y2="51.66666666666667" class="ct-point" ct:value="50"></line><line x1="31.645833333333332" y1="60.833333333333336" x2="31.655833333333334" y2="60.833333333333336" class="ct-point" ct:value="45"></line><line x1="53.291666666666664" y1="33.333333333333336" x2="53.30166666666666" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="74.9375" y1="42.5" x2="74.9475" y2="42.5" class="ct-point" ct:value="55"></line><line x1="96.58333333333333" y1="15" x2="96.59333333333333" y2="15" class="ct-point" ct:value="70"></line><line x1="118.22916666666666" y1="42.5" x2="118.23916666666666" y2="42.5" class="ct-point" ct:value="55"></line><line x1="139.875" y1="33.333333333333336" x2="139.885" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="161.52083333333331" y1="42.5" x2="161.5308333333333" y2="42.5" class="ct-point" ct:value="55"></line><line x1="183.16666666666666" y1="24.166666666666664" x2="183.17666666666665" y2="24.166666666666664" class="ct-point" ct:value="65"></line><line x1="204.8125" y1="38.83333333333333" x2="204.8225" y2="38.83333333333333" class="ct-point" ct:value="57"></line><line x1="226.45833333333331" y1="33.333333333333336" x2="226.4683333333333" y2="33.333333333333336" class="ct-point" ct:value="60"></line><line x1="248.10416666666666" y1="46.16666666666667" x2="248.11416666666665" y2="46.16666666666667" class="ct-point" ct:value="53"></line><line x1="269.75" y1="46.16666666666667" x2="269.76" y2="46.16666666666667" class="ct-point" ct:value="53"></line></g></g><g class="ct-labels"></g></svg></div>
			</div>
		</div>
	</div>
</div>
<div class="row match-height">
    <div class="col-xl-4 col-lg-12">
        <div class="card" style="height: 553px;">
            <div class="card-header">
                <h4 class="card-title mb-0">Discover People</h4>
            </div>
            <div class="card-body">
                <div class="card-block">
                    <div class="media mb-3">
                        <img alt="96x96" class="media-object d-flex mr-3 align-self-center bg-primary height-50 rounded-circle" src="app-assets/img/portrait/small/avatar-s-12.png">
                        <div class="media-body">
                            <h4 class="font-medium-1 mt-2 mb-0">Jessica Rice</h4>
                        </div>
                        <a class="d-flex ml-3 btn btn-raised btn-round gradient-blackberry py-2 width-150 justify-content-center white">Following</a>
                    </div>
                    <div class="media mb-3">
                        <img alt="96x96" class="media-object d-flex mr-3 align-self-center bg-danger height-50 rounded-circle" src="app-assets/img/portrait/small/avatar-s-11.png">
                        <div class="media-body">
                            <h4 class="font-medium-1 mt-2 mb-0">Jacob Rios</h4>
                        </div>
                        <a class="d-flex ml-3 btn btn-raised btn-round btn-outline-grey py-2 width-150 justify-content-center">Follow</a>
                    </div>
                    <div class="media mb-3">
                        <img alt="96x96" class="media-object d-flex mr-3 align-self-center bg-success height-50 rounded-circle" src="app-assets/img/portrait/small/avatar-s-3.png">
                        <div class="media-body">
                            <h4 class="font-medium-1 mt-2 mb-0">Russell Diaz</h4>
                        </div>
                        <a class="d-flex ml-3 btn btn-raised btn-round btn-outline-grey py-2 width-150 justify-content-center">Follow</a>
                    </div>
                    <div class="media mb-3">
                        <img alt="96x96" class="media-object d-flex mr-3 align-self-center bg-warning height-50 rounded-circle" src="app-assets/img/portrait/small/avatar-s-6.png">
                        <div class="media-body">
                            <h4 class="font-medium-1 mt-2 mb-0">Sara Bell</h4>
                        </div>
                        <a class="d-flex ml-3 btn btn-raised btn-round gradient-blackberry py-2 width-150 justify-content-center white">Following</a>
                    </div>
                    <div class="media mb-3">
                        <img alt="96x96" class="media-object d-flex mr-3 align-self-center bg-info height-50 rounded-circle" src="app-assets/img/portrait/small/avatar-s-18.png">
                        <div class="media-body">
                            <h4 class="font-medium-1 mt-2 mb-0">Janet Lucas</h4>
                        </div>
                        <a class="d-flex ml-3 btn btn-raised btn-round btn-outline-grey py-2 width-150 justify-content-center">Follow</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-8 col-lg-12">
        <div class="card" style="height: 553px;">
            <div class="card-header">
                <h4 class="card-title mb-0">Sales Analysis</h4>
            </div>
            <div class="card-body">
                <div class="card-block">
                    <div class="chart-info mb-3">
                        <span class="text-uppercase mr-3"><i class="fa fa-circle primary font-small-2 mr-1"></i> Sales</span>
                        <span class="text-uppercase mr-3"><i class="fa fa-circle warning font-small-2 mr-1"></i> Visits</span>
                        <span class="text-uppercase"><i class="fa fa-circle danger font-small-2 mr-1"></i> clicks</span>
                    </div>
                    <div id="line-chart1" class="height-350 lineChart1 lineChart1Shadow">
                    <svg xmlns:ct="http://gionkunz.github.com/chartist-js/ct" width="100%" height="100%" class="ct-chart-line" style="width: 100%; height: 100%;"><g class="ct-grids"><line y1="320" y2="320" x1="40" x2="736.328125" class="ct-grid ct-vertical"></line><line y1="240" y2="240" x1="40" x2="736.328125" class="ct-grid ct-vertical"></line><line y1="160" y2="160" x1="40" x2="736.328125" class="ct-grid ct-vertical"></line><line y1="80" y2="80" x1="40" x2="736.328125" class="ct-grid ct-vertical"></line><line y1="0" y2="0" x1="40" x2="736.328125" class="ct-grid ct-vertical"></line></g><g><g class="ct-series ct-series-a"><path d="M40,216C86.422,194.667,132.844,173.333,179.266,152C225.688,130.667,272.109,88,318.531,88C364.953,88,411.375,152,457.797,152C504.219,152,550.641,109.333,597.063,88C643.484,66.667,689.906,45.333,736.328,24" class="ct-line"></path><line x1="40" y1="216" x2="40.01" y2="216" class="ct-point" ct:value="65"></line><line x1="179.265625" y1="152" x2="179.275625" y2="152" class="ct-point" ct:value="105"></line><line x1="318.53125" y1="88" x2="318.54125" y2="88" class="ct-point" ct:value="145"></line><line x1="457.796875" y1="152" x2="457.806875" y2="152" class="ct-point" ct:value="105"></line><line x1="597.0625" y1="88" x2="597.0725" y2="88" class="ct-point" ct:value="145"></line><line x1="736.328125" y1="24" x2="736.338125" y2="24" class="ct-point" ct:value="185"></line></g><g class="ct-series ct-series-b"><path d="M40,120C86.422,144,132.844,166.737,179.266,192C225.688,217.263,272.109,272,318.531,272C364.953,272,411.375,229.333,457.797,208C504.219,186.667,550.641,165.333,597.063,144C643.484,122.667,689.906,101.333,736.328,80" class="ct-line"></path><line x1="40" y1="120" x2="40.01" y2="120" class="ct-point" ct:value="125"></line><line x1="179.265625" y1="192" x2="179.275625" y2="192" class="ct-point" ct:value="80"></line><line x1="318.53125" y1="272" x2="318.54125" y2="272" class="ct-point" ct:value="30"></line><line x1="457.796875" y1="208" x2="457.806875" y2="208" class="ct-point" ct:value="70"></line><line x1="597.0625" y1="144" x2="597.0725" y2="144" class="ct-point" ct:value="110"></line><line x1="736.328125" y1="80" x2="736.338125" y2="80" class="ct-point" ct:value="150"></line></g><g class="ct-series ct-series-c"><path d="M40,40C86.422,32,132.844,16,179.266,16C225.688,16,272.109,64,318.531,64C364.953,64,411.375,16,457.797,16C504.219,16,550.641,72.296,597.063,96C643.484,119.704,689.906,138.667,736.328,160" class="ct-line"></path><line x1="40" y1="40" x2="40.01" y2="40" class="ct-point" ct:value="175"></line><line x1="179.265625" y1="16" x2="179.275625" y2="16" class="ct-point" ct:value="190"></line><line x1="318.53125" y1="64" x2="318.54125" y2="64" class="ct-point" ct:value="160"></line><line x1="457.796875" y1="16" x2="457.806875" y2="16" class="ct-point" ct:value="190"></line><line x1="597.0625" y1="96" x2="597.0725" y2="96" class="ct-point" ct:value="140"></line><line x1="736.328125" y1="160" x2="736.338125" y2="160" class="ct-point" ct:value="100"></line></g></g><g class="ct-labels"><foreignObject style="overflow: visible;" x="40" y="325" width="139.265625" height="20"><span class="ct-label ct-horizontal ct-end" xmlns="http://www.w3.org/2000/xmlns/" style="width: 139px; height: 20px;">Jan</span></foreignObject><foreignObject style="overflow: visible;" x="179.265625" y="325" width="139.265625" height="20"><span class="ct-label ct-horizontal ct-end" xmlns="http://www.w3.org/2000/xmlns/" style="width: 139px; height: 20px;">Feb</span></foreignObject><foreignObject style="overflow: visible;" x="318.53125" y="325" width="139.265625" height="20"><span class="ct-label ct-horizontal ct-end" xmlns="http://www.w3.org/2000/xmlns/" style="width: 139px; height: 20px;">Mar</span></foreignObject><foreignObject style="overflow: visible;" x="457.796875" y="325" width="139.265625" height="20"><span class="ct-label ct-horizontal ct-end" xmlns="http://www.w3.org/2000/xmlns/" style="width: 139px; height: 20px;">Apr</span></foreignObject><foreignObject style="overflow: visible;" x="597.0625" y="325" width="139.265625" height="20"><span class="ct-label ct-horizontal ct-end" xmlns="http://www.w3.org/2000/xmlns/" style="width: 139px; height: 20px;">May</span></foreignObject><foreignObject style="overflow: visible;" x="736.328125" y="325" width="30" height="20"><span class="ct-label ct-horizontal ct-end" xmlns="http://www.w3.org/2000/xmlns/" style="width: 30px; height: 20px;">Jun</span></foreignObject><foreignObject style="overflow: visible;" y="240" x="0" height="80" width="30"><span class="ct-label ct-vertical ct-start" xmlns="http://www.w3.org/2000/xmlns/" style="height: 80px; width: 30px;">0</span></foreignObject><foreignObject style="overflow: visible;" y="160" x="0" height="80" width="30"><span class="ct-label ct-vertical ct-start" xmlns="http://www.w3.org/2000/xmlns/" style="height: 80px; width: 30px;">50</span></foreignObject><foreignObject style="overflow: visible;" y="80" x="0" height="80" width="30"><span class="ct-label ct-vertical ct-start" xmlns="http://www.w3.org/2000/xmlns/" style="height: 80px; width: 30px;">100</span></foreignObject><foreignObject style="overflow: visible;" y="0" x="0" height="80" width="30"><span class="ct-label ct-vertical ct-start" xmlns="http://www.w3.org/2000/xmlns/" style="height: 80px; width: 30px;">150</span></foreignObject><foreignObject style="overflow: visible;" y="-30" x="0" height="30" width="30"><span class="ct-label ct-vertical ct-start" xmlns="http://www.w3.org/2000/xmlns/" style="height: 30px; width: 30px;">200</span></foreignObject></g></svg></div>
                </div>
            </div>
        </div>
    </div>
</div>
</div></div></div>

<%@include file="footer.jsp" %>
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
    <script src="app-assets/vendors/js/chartist.min.js" type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN APEX JS-->
    <script src="app-assets/js/app-sidebar.js" type="text/javascript"></script>
    <script src="app-assets/js/notification-sidebar.js" type="text/javascript"></script>
    <script src="app-assets/js/customizer.js" type="text/javascript"></script>
    <!-- END APEX JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src="app-assets/js/dashboard1.js" type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
</body>


</html>
