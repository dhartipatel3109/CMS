  <!DOCTYPE html>
<html dir="ltr" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="../public/assets/images/favicon.png">
    <title>Department List</title>
    <!-- This page plugin CSS -->
    <link href="../public/assets/extra-libs/datatables.net-bs4/css/dataTables.bootstrap4.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="../public/dist/css/style.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>
<body>
	<%@ include file="Header.jsp" %>
	<div class="page-wrapper">
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">
                    <div class="col-7 align-self-center">
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Complaints List</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="javascript:void(0);">Department Dashboard</a>
                                    </li>

                                </ol>
                                <ol></ol>
                            </nav>
                        </div>

                    </div>
                    
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- End Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- Container fluid  -->
            <!-- ============================================================== --> 
            <div class="container-fluid">
                <!-- ============================================================== -->
                <!-- Start Page Content -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-flex align-items-center mb-4">
                                    <h4 class="card-title">ADD Department</h4>
                                </div>
                                <x-alert type="ValidationError" />
                                <div class="table-responsive">
                                    <form action="/" method="POST" enctype="multipart/form-data">
                                        <table class="table table-bordered" width="80%" cellspacing="0">
                                            <tr>
                                                <th>Department Name</th>
                                                <td>
                                                	<input type="text" class="form-control" id="deptname" required placeholder="Department Name" />
                                               	</td>
                                            </tr>
                                            <tr>
                                                <th>Department Email</th>
                                                <td> 
                                                	<input type="text" class="form-control" id="email" required placeholder="Department Email" />
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>Department Password</th>
                                                <td> 
                                                	<input type="text" class="form-control" id="password" required placeholder="Department Password" />
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>Person First Name</th>
                                                <td>
                                                	<input type="text" class="form-control" id="firstname" required placeholder="First Name"/>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>Person Last Name</th>
                                                <td>
                                                	<input type="text" class="form-control" id="lastname" required placeholder="Last Name" />
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>Department Mobile no.</th>
                                                <td>
                                                	<input type="text" class="form-control" id="mobileno" required placeholder="Mobile Number" />
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>Department Location</th>
                                                <td>
                                                	<input type="text" class="form-control" id="location" required placeholder="Department Location" />
                                                </td>
                                            </tr>
                                        
                                        </table>
                                        <br><br>

                                        <button class="btn btn-success"> <i data-feather="check-circle" class="feather-icon"></i>&nbsp;&nbsp;ADD Department</button>
                                    </form>
                                </div>

                            </div> <!-- end card-body-->
                        </div> <!-- end card-->
                    </div> <!-- end col-->
                </div>
                <!-- end row -->



                <!-- ============================================================== -->
                <!-- End PAge Content -->
                <!-- ============================================================== -->
            </div>
            
         
    <%@ include file="Footer.jsp" %>

</body>

</html>
      