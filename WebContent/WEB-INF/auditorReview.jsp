<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="viewbean.NEWAllDataViewBean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Auditor Review Dashboard</title>

 <link href="website/css/review.css" rel="stylesheet" />
</head>


<body>

<form action = "auditorReview.do"  method = "POST">

<select name="database"><option value=""></option>
<option value="allData">All Data</option>
<option value="Disease">Disease</option>
<option value="InsuranceCompany">Insurance Company</option>
<option value="GroceryStore">Grocery Store</option>
</select> <br>

<button type="submit" class="sumbit-button">Preview</button>

 </form> <br>
 
 
 <p>Enrollment Statistics</p>
 <table>
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

<div class= "table">
<c:choose>
	<c:when test="${!empty variable}">
			<table border = "1">
			<tr> <td>Data Variable</td> </tr>
			<tr><td>${variable.insurance_member_id}</td></tr>
			<tr><td>${variable.grocery_member_id}</td></tr>
			<tr><td>${variable.plan_number}</td></tr>
			<tr><td>${variable.dob}</td></tr>
			<tr><td>${variable.address}</td></tr>
			<tr><td>${variable.credit_card}</td></tr>
			<tr><td>${variable.ad_keywords}</td></tr>
			<tr><td>${variable.coupon_code}</td></tr>
			<tr><td>${variable.firstname}</td></tr>
			<tr><td>${variable.lastname}</td></tr>
			<tr><td>${variable.gender}</td></tr>
			<tr><td>${variable.ethnicity}</td></tr>
			<tr><td>${variable.ssn}</td></tr>
			<tr><td>${variable.zip}</td></tr>
			<tr><td>${variable.id}</td></tr>
			<tr><td>${variable.city}</td></tr>
			<tr><td>${variable.state}</td></tr>
		</table>
	</c:when>
	<c:otherwise>
		<p style="font-size:large; color:red">
		 No data available.
		</p>
	</c:otherwise>
</c:choose>
</div>

<div class= "table">
<c:choose>
	<c:when test="${!empty method}">
			<table border = "1">
			<tr> <td>De-identification Methods</td> </tr>
			<tr><td>${method.insurance_member_id}</td></tr>
			<tr><td>${method.grocery_member_id}</td></tr>
			<tr><td>${method.plan_number}</td></tr>
			<tr><td>${method.dob}</td></tr>
			<tr><td>${method.address}</td></tr>
			<tr><td>${method.credit_card}</td></tr>
			<tr><td>${method.ad_keywords}</td></tr>
			<tr><td>${method.coupon_code}</td></tr>
			<tr><td>${method.firstname}</td></tr>
			<tr><td>${method.lastname}</td></tr>
			<tr><td>${method.gender}</td></tr>
			<tr><td>${method.ethnicity}</td></tr>
			<tr><td>${method.ssn}</td></tr>
			<tr><td>${method.zip}</td></tr>
			<tr><td>${method.id}</td></tr>
			<tr><td>${method.city}</td></tr>
			<tr><td>${method.state}</td>	</tr>
		</table>
	</c:when>
	<c:otherwise>
		<p style="font-size:large; color:red">
		 No data available.
		</p>
	</c:otherwise>
</c:choose>
</div>

<div class= "table">
<c:choose>
	<c:when test="${!empty dataBefore}">
			<table border = "1">
			<tr> <td>Pre De-identification</td> </tr>

			<tr><td>${dataBefore.insurance_member_id}</td></tr>
			<tr><td>${dataBefore.grocery_member_id}</td></tr>
			<tr><td>${dataBefore.plan_number}</td></tr>
			<tr><td>${dataBefore.dob}</td></tr>
			<tr><td>${dataBefore.address}</td></tr>
			<tr><td>${dataBefore.credit_card}</td></tr>
			<tr><td>${dataBefore.ad_keywords}</td></tr>
			<tr><td>${dataBefore.coupon_code}</td></tr>
			<tr><td>${dataBefore.firstname}</td></tr>
			<tr><td>${dataBefore.lastname}</td></tr>
			<tr><td>${dataBefore.gender}</td></tr>
			<tr><td>${dataBefore.ethnicity}</td></tr>
			<tr><td>${dataBefore.ssn}</td></tr>
			<tr><td>${dataBefore.zip}</td></tr>
			<tr><td>${dataBefore.id}</td></tr>
			<tr><td>${dataBefore.city}</td></tr>
			<tr><td>${dataBefore.state}</td>	</tr>

		</table>
	</c:when>
	<c:otherwise>
		<p style="font-size:large; color:red">
		 No data available.
		</p>
	</c:otherwise>
</c:choose>
</div>
<div class= "table">
<c:choose>
	<c:when test="${!empty dataAfter}">
			<table border = "1">
			<tr> <td>Post De-identification</td> </tr>
			<tr><td>${dataAfter.insurance_member_id}</td></tr>
			<tr><td>${dataAfter.grocery_member_id}</td></tr>
			<tr><td>${dataAfter.plan_number}</td></tr>
			<tr><td>${dataAfter.dob}</td></tr>
			<tr><td>${dataAfter.address}</td></tr>
			<tr><td>${dataAfter.credit_card}</td></tr>
			<tr><td>${dataAfter.ad_keywords}</td></tr>
			<tr><td>${dataAfter.coupon_code}</td></tr>
			<tr><td>${dataAfter.firstname}</td></tr>
			<tr><td>${dataAfter.lastname}</td></tr>
			<tr><td>${dataAfter.gender}</td></tr>
			<tr><td>${dataAfter.ethnicity}</td></tr>
			<tr><td>${dataAfter.ssn}</td></tr>
			<tr><td>${dataAfter.zip}</td></tr>
			<tr><td>${dataAfter.id}</td></tr>
			<tr><td>${dataAfter.city}</td></tr>
			<tr><td>${dataAfter.state}</td>	</tr>

		</table>
	</c:when>
	<c:otherwise>
		<p style="font-size:large; color:red">
		 No data available.
		</p>
	</c:otherwise>
</c:choose>
</div>
<div class= "table">
<c:choose>
	<c:when test="${!empty code}">
			<table border = "1">
			<tr> <td>Legal Compliance Reference</td> </tr>
			<tr><td>${code.insurance_member_id}</td></tr>
			<tr><td>${code.grocery_member_id}</td></tr>
			<tr><td>${code.plan_number}</td></tr>
			<tr><td>${code.dob}</td></tr>
			<tr><td>${code.address}</td></tr>
			<tr><td>${code.credit_card}</td></tr>
			<tr><td>${code.ad_keywords}</td></tr>
			<tr><td>${code.coupon_code}</td></tr>
			<tr><td>${code.firstname}</td></tr>
			<tr><td>${code.lastname}</td></tr>
			<tr><td>${code.gender}</td></tr>
			<tr><td>${code.ethnicity}</td></tr>
			<tr><td>${code.ssn}</td></tr>
			<tr><td>${code.zip}</td></tr>
			<tr><td>${code.id}</td></tr>
			<tr><td>${code.city}</td></tr>
			<tr><td>${code.state}</td>	</tr>
		</table>
	</c:when>
	<c:otherwise>
		<p style="font-size:large; color:red">
		 No data available.
		</p>
	</c:otherwise>
</c:choose>
</div>

<c:choose>
	<c:when test="${!empty code}">
	
<form action="auditordeIdentification.do" method="POST">
<button type="submit" class="sumbit-button">De-Identify and Download Data</button>
</form>
	
	</c:when>
</c:choose>


	<p>Rows of Data Processed:</p> <p>${dataCount}</p>



	<p>K-Anonymization min K =</p> <p>${kamin}</p>
	<p>K-Anonymization max K =</p> <p>${kamax}</p>


</body>
</html>