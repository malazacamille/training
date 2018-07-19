<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Employee Management System</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="assets/css/jquery-ui.min.css">
	<link rel="stylesheet" type="text/css" href="assets/css/jquery-ui.structure.min.css">
	<link rel="stylesheet" type="text/css" href="assets/css/jquery-ui.theme.min.css">
	<script src="assets/js/jquery-3.3.1.min.js"></script>
	<script src="assets/js/jquery-ui.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	
	<style>
		body, html {
		    height: 100%;
		    background-repeat: no-repeat;
    		background-attachment: fixed;
		    background-image: url('http://thetechnologypool.com/wp-content/uploads/2015/11/3_1.jpg');
		}
	</style>
</head>
<body>
	<div class="container" style="background-color: #ffffff">
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="/list"><span class="glyphicon glyphicon-user">&nbsp</span>Employee Management (With Guice, Mybatis & Struts 2)</a>
		    </div>
		     <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		        <li><a href="Welcome">Employee List </a></li>
		        <li class="active"><a href="Add">Register Employee<span class="sr-only">(current)</span></a></li>
		        <li><a href="Login">Log Out</a></li>
		      </ul>
		     </div>
		  </div><!-- /.container-fluid -->
		</nav>
	    <div class="page-header">
	    	<h3>Employee Management - Add New Employee</h3>
	    </div>
		<div align="center">
			<form action="AddEmployee" method="post">
				<table class="table table-responsive">
					<tr>
		                <th>Employee Name: </th>
		                <td>
		                    <input id="employeeName" type="text" name="employeeName" size="45"/>
		                </td>
		            </tr>
		            <tr>
		                <th>Address: </th>
		                <td>
		                    <input id="address" type="text" name="address" size="45"/>
		                </td>
		            </tr>
		            <tr>
		                <th>City: </th>
		                <td>
		                    <input id="city" type="text" name="city" size="45"/>
		                </td>
		            </tr>
		            <tr>
		                <th>Country: </th>
		                <td>
		                    <input id="country" type="text" name="country" size="45"/>
		                </td>
		            </tr>
		            <tr>
		                <th>Department: </th>
		                <td>
		                    <select id="departmentId" name="departmentId">
								<s:iterator value="listDepartment">
								    <option value="<s:property value="departmentId" />">
								    	<s:property value="departmentName" />
								    </option>
								</s:iterator>
							</select>
		                </td>
		            </tr>
		            <tr>
		                <td colspan="2" align="center">
		                    <input id="btnSubmit" class="btn btn-success" type="button" value="Save" />
		                </td>
		            </tr>
				</table>
			</form>
		</div>
	</div>
	<div class="modal" id="modalSuccess" tabindex="-1" role="dialog">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title">Add Employee Successful</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        <p>You have successfully added a new employee.</p>
	      </div>
	      <div class="modal-footer">
	        <a href="Welcome"><button type="button" class="btn btn-primary">Back to Home</button></a>
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
	      </div>
	    </div>
	  </div>
	</div>
	<div class="modal" id="modalFailed" tabindex="-1" role="dialog">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title">Add Employee Failed</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        <p>Adding of employee is unsuccessful.</p>
	      </div>
	      <div class="modal-footer">
	        <a href="Welcome"><button type="button" class="btn btn-primary">Back to Home</button></a>
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		$('#btnSubmit').click(function() {
			var dataObj = {
					"data": [{
						"employeeName" : $('#employeeName').val(),
						"address" : $('#address').val(),
						"city" : $('#city').val(),
						"country" : $('#country').val(),
						"departmentId" : $("#departmentId").val(),
					}]
			}
			var jsonRequest = JSON.stringify(dataObj);
			$.ajax({
			    url: "AddEmployee.action",
			    data: jsonRequest,
			    dataType: 'json',
			    contentType: 'application/json',
			    type: 'POST',
			    async: true,
			    success: function (res) {
			        if(res.success == 1) {
			        	$('#modalSuccess').modal('show');
			        }
			        else {
			        	$('#modalFailed').modal('show');
			        }
			    }
			});
		});
	</script>
</body>
</html>
