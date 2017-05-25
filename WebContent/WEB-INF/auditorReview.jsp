<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="description" content="" />
    <title>Auditor Dashboard</title>
    <script type="text/javascript" src="website/js/js1.js" data-dtconfig="rid=RID_2418|rpid=-186441229|domain=gianteagle.com|lab=1|reportUrl=dynaTraceMonitor|agentUri=/dtagent_ICAijqx_6000500141012.js"></script><link rel="icon" type="image/x-icon" href="img/favicon.ico" />
    <link href="website/css/style.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
    <script type="text/javascript" src="website/js/js2.js"></script>
    <script src="website/js/js3.js"></script>   
    <script type="text/javascript" src='https://www.google.com/recaptcha/api.js' async defer></script>
    <script src="/Areas/Account/Assets/scripts/CommonScripts?v=3Z_MTicl0k6OwWqXo0cL0Odz8AeLjSROE_DfVWo38uU1"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    <div class="page-wrapper">
        <div class="content-wrapper">
        	<section class="content-main bordered" role="main">
			    <div class="intro">
			        <h1>Auditor Dashboard</h1>
			    </div>
			    <div class="row">
					<div class="col-sm-8 col-sm-offset-2 col-lg-6 col-lg-offset-3 m-t-3">
						<form action = "auditorReview.do" method = "POST">
	                            <select class="form-control" data-val="true" name="database">
									<option value="" disabled selected>Dataset</option>
									<option value="allData">All Data</option>
									<option value="Disease">Disease</option>
									<option value="InsuranceCompany">Insurance Company</option>
									<option value="GroceryStore">Grocery Store</option>
								</select>
							<p style="font-size: 22px; text-align: center;"> </p>
		                    <input type="submit" name="submit" value="Preview" class="btn btn-primary btn-full" />
						</form>
						<p style="font-size: 22px; text-align: center;"> </p>
					</div>
					<div class="col-lg-9 col-lg-offset-1 col-xl-8 col-xl-offset-2">
					 <table class="table table-striped table-bordered table-hover table-condensed">
					 	<tr>
					 		<td>Data Category</td>
					 		<td>Total # of Customers</td>
					 		<td>Total # of Enrollment</td>
					 	</tr>
					 	<tr>
					 		<td>Personal Information</td>
					 		<td>95,234</td>
					 		<td>10,001</td>
					 	</tr>
					 	 <tr>
					 		<td>Payment Information</td>
					 		<td>95,234</td>
					 		<td>65,001</td>
					 	</tr>
					 	 <tr>
					 		<td>Insurance Information</td>
					 		<td>95,234</td>
					 		<td>40,001</td>
					 	</tr>
					 	 <tr>
					 		<td>Pharmacy Information</td>
					 		<td>95,234</td>
					 		<td>43,001</td>
					 	</tr>
					 </table>
					 <p style="font-size: 22px; text-align: center;"> </p>
					</div>
					<div class= "table">
					<c:choose>
						<c:when test="${!empty variable and !empty method and !empty dataBefore and !empty dataAfter and !empty code}">
								<table border = "1">
								<tr>
									<td>Data Variable</td>
									<td>De-identification Methods</td>
									<td>Pre De-identification</td>
									<td>Post De-identification</td>
									<td>Legal Compliance Reference</td>
								</tr>
								<tr>
									<td>${variable.insurance_member_id}</td>
									<td>${method.insurance_member_id}</td>
									<td>${dataBefore.insurance_member_id}</td>
									<td>${dataAfter.insurance_member_id}</td>
									<td>${code.insurance_member_id}</td>
									
								</tr>
								<tr>
									<td>${variable.grocery_member_id}</td>
									<td>${method.grocery_member_id}</td>
									<td>${dataBefore.grocery_member_id}</td>
									<td>${dataAfter.grocery_member_id}</td>
									<td>${code.grocery_member_id}</td>
								</tr>
								<tr>
									<td>${variable.plan_number}</td>
									<td>${method.plan_number}</td>
									<td>${dataBefore.plan_number}</td>
									<td>${dataAfter.plan_number}</td>
									<td>${code.plan_number}</td>
								</tr>
								<tr>
									<td>${variable.dob}</td>
									<td>${method.dob}</td>
									<td>${dataBefore.dob}</td>
									<td>${dataAfter.dob}</td>
									<td>${code.dob}</td>
								</tr>
								<tr>
									<td>${variable.address}</td>
									<td>${method.address}</td>
									<td>${dataBefore.address}</td>
									<td>${dataAfter.address}</td>
									<td>${code.credit_card}</td>
								</tr>
								<tr>
									<td>${variable.credit_card}</td>
									<td>${method.credit_card}</td>
									<td>${dataBefore.credit_card}</td>
									<td>${dataAfter.credit_card}</td>
									<td>${code.address}</td>
								</tr>
								<tr>
									<td>${variable.ad_keywords}</td>
									<td>${method.ad_keywords}</td>
									<td>${dataBefore.ad_keywords}</td>
									<td>${dataAfter.ad_keywords}</td>
									<td>${code.ad_keywords}</td>
								</tr>
								<tr>
									<td>${variable.coupon_code}</td>
									<td>${method.coupon_code}</td>
									<td>${dataBefore.coupon_code}</td>
									<td>${dataAfter.coupon_code}</td>
									<td>${code.coupon_code}</td>
								</tr>
								<tr>
									<td>${variable.firstname}</td>
									<td>${method.firstname}</td>
									<td>${dataBefore.firstname}</td>
									<td>${dataAfter.firstname}</td>
									<td>${code.firstname}</td>
								</tr>
								<tr>
									<td>${variable.lastname}</td>
									<td>${method.lastname}</td>
									<td>${dataBefore.lastname}</td>
									<td>${dataAfter.lastname}</td>
									<td>${code.lastname}</td>
								</tr>
								<tr>
									<td>${variable.gender}</td>
									<td>${method.gender}</td>
									<td>${dataBefore.gender}</td>
									<td>${dataAfter.gender}</td>
									<td>${code.gender}</td>
								</tr>
								<tr>
									<td>${variable.ethnicity}</td>
									<td>${method.ethnicity}</td>
									<td>${dataBefore.ethnicity}</td>
									<td>${dataAfter.ethnicity}</td>
									<td>${code.ethnicity}</td>
								</tr>
								<tr>
									<td>${variable.ssn}</td>
									<td>${method.ssn}</td>
									<td>${dataBefore.ssn}</td>
									<td>${dataAfter.ssn}</td>
									<td>${code.ssn}</td>
								</tr>
								<tr>
									<td>${variable.zip}</td>
									<td>${method.zip}</td>
									<td>${dataBefore.zip}</td>
									<td>${dataAfter.zip}</td>
									<td>${code.zip}</td>
								</tr>
								<tr>
									<td>${variable.id}</td>
									<td>${method.id}</td>
									<td>${dataBefore.id}</td>
									<td>${dataAfter.id}</td>
									<td>${code.id}</td>
								</tr>
								<tr>
									<td>${variable.city}</td>
									<td>${method.city}</td>
									<td>${dataBefore.city}</td>
									<td>${dataAfter.city}</td>
									<td>${code.city}</td>
								</tr>
								<tr>
									<td>${variable.state}</td>
									<td>${method.state}</td>
									<td>${dataBefore.state}</td>
									<td>${dataAfter.state}</td>
									<td>${code.state}</td>
								</tr>
							</table>
						</c:when>
						<c:otherwise>
							<p style="font-size:large; color:red"> No dataset selected</p>
						</c:otherwise>
					</c:choose>
					</div>
					<div class="col-sm-8 col-sm-offset-2 col-lg-6 col-lg-offset-3 m-t-3">
					<c:choose>
						<c:when test="${!empty code}">
							<form action="auditordeIdentification.do" method="POST">
								<!-- <button type="submit" class="sumbit-button">De-Identify and Download Data</button> -->
								<input type="submit" name="submit" value="De-Identify and Download Data" class="btn btn-primary btn-full" />
							</form>
						</c:when>
					</c:choose>
					<p style="font-size: 22px; text-align: center;"> </p>
						<div>
							<p>Rows of Data Processed: ${dataCount}</p>
							<p>K-Anonymization minimum K: ${kamin}</p>
							<p>K-Anonymization maximun K: ${kamax}</p>
						</div>
					</div>
					</div>
		</section>
		<p class="copyright muted"><small>&copy; 2017 Giant Eagle Inc.</small></p>
    	</div> <!-- /.content-wrapper -->
    </div> <!-- /.page-wrapper -->
    <script type="text/javascript" src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
    <script type="text/javascript" src="https://ajax.aspnetcdn.com/ajax/mvc/5.2.3/jquery.validate.unobtrusive.min.js"></script>
    <script src="/Areas/Account/Assets/js/bootstrap.min-min.js"></script>
    <script src="/Areas/Account/Assets/js/main.js"></script>
    <script src="/Areas/Account/Assets/js/plugins.js"></script>
</body>
</html>