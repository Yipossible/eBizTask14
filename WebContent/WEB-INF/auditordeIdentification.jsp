<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test De-Identification</title>
</head>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="viewbean.NEWAllDataViewBean"%>

<body>

<p style="font-size:large; color:green"> ${message}</p>
<p style="font-size:large; color:red"> ${errors}</p>

<form action="auditorSelectdeIdentification.do" method="POST">

<label >insurance_member_id:</label>
<select name="insurance_member_id"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >grocery_member_id:</label>
<select name="grocery_member_id"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Health Plan Number:</label>
<select name="plan_number"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Date of Birth:</label>
<select name="dob"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Address</label>
<select name="address"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Credit Card</label>
<select name="credit_card"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Ad Keywords</label>
<select name="ad_keywords"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Coupon Code:</label>
<select name="coupon_code"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >First Name:</label>
<select name="firstname"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Last Name:</label>
<select name="lastname"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Gender:</label>
<select name="gender"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >Ethnicity:</label>
<select name="ethnicity"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >SSN:</label>
<select name="ssn"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >zip:</label>
<select name="zip"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >ID:</label>
<select name="id"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >City:</label>
<select name="city"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>

<label >State:</label>
<select name="state"><option value=""></option>
<option value="0">Default</option>
<option value="1">Generalization</option>
<option value="2">Suppression</option>
</select> <br>




<button type="submit" class="sumbit-button">Select Criter and Show Data</button>
</form>


<form action="auditordeIdentification.do" method="POST">
<button type="submit" class="sumbit-button">De-Identify and Show Data</button>
</form>

<c:choose>
	<c:when test="${!empty newDataList}">
		<table border = "1">
				<tr>
						<td>insurance_member_id</td>
						<td>grocery_member_id</td>
						<td>plan_number</td>
						<td>dob</td>
						<td>address</td>
						<td>credit_card</td>
						<td>ad_keywords</td>
						<td>coupon_code</td>
						<td>firstname</td>
						<td>lastname</td>
						<td>gender</td>
						<td>ethnicity</td>
						<td>ssn</td>
						<td>zip</td>
						<td>id</td>
						<td>city</td>
						<td>state</td>
				</tr>
			<c:forEach var= "row" items = "${newDataList}">
				
				<tr>
						<td>${row.insurance_member_id}</td>
						<td>${row.grocery_member_id}</td>
						<td>${row.plan_number}</td>
						<td>${row.dob}</td>
						<td>${row.address}</td>
						<td>${row.credit_card}</td>
						<td>${row.ad_keywords}</td>
						<td>${row.coupon_code}</td>
						<td>${row.firstname}</td>
						<td>${row.lastname}</td>
						<td>${row.gender}</td>
						<td>${row.ethnicity}</td>
						<td>${row.ssn}</td>
						<td>${row.zip}</td>
						<td>${row.id}</td>
						<td>${row.city}</td>
						<td>${row.state}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<p style="font-size:large; color:red">
		 No data available.
		</p>
	</c:otherwise>
</c:choose>
</body>
</html>