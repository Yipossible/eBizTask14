<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="description" content="" />
     <link href="css/style.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
<title>Enroll in Healthy Choice Program</title>
</head>
<body class="page-standard page-guest">


<div class="page-wrapper">
        <header role="header">
            <div class="topbar">
              <h5><a href="/customerRegister.do"><i class="fa-caret-left hidden-sm-up"></i><u>Return to Registration Page</u></a></h5>
            </div>
        </header>

<p style="font-size:large; color:green"> ${message}</p>
<p style="font-size:large; color:red"> ${errors}</p>

     <div class="content-wrapper">
            <section class="content-main bordered" role="main">
    <div class="intro">
        <h1>Enroll in Healthier Choice Program</h1>
    </div>
    
    <h2 class="heading1 text-xs-center m-y-3">
                    <p>Please check to give your permission to the usage of the data in our Healthy Choice Program: </p><br>
    </h2>

<div class="col-sm-12">
<input type="checkbox" name="personal" value="yes" checked> <p>Personal Information*</p><br>
</div>
<div class="col-sm-12"><input type="checkbox" name="payment" value="yes" checked> <p>Payment Information**</p><br></div>
<div class="col-sm-12"><input type="checkbox" name="insurance" value="yes" checked> <p>Insurance Information***</p><br> </div>
<div class="col-sm-12"><input type="checkbox" name="pharmacy" value="yes" checked> <p>Pharmacy Information****</p><br></div>


 <div class="form-group controls">
<div class="col-sm-9 col-sm-offset-3 p-x-0">
                            <div class="col-xl-6 col-sm-12 next">
<form action="customerEnroll.do" method="POST">
<button type="submit" class="btn btn-default"  name="button" value="NO">Decline Enrollment</button>
</form>
</div></div></div>

 <div class="form-group controls">
<div class="col-sm-9 col-sm-offset-3 p-x-0">
                            <div class="col-xl-6 col-sm-12 next">
<form action="customerMonitor.do" method="POST">
<button type="submit" class="btn btn-default" name="button" value="YES">Confirm to Enroll</button>
</form>
</div></div></div>

<div class="col-xl-6 col-sm-12 p-l-0 prev">
<p class="text-mute text-xs-center text-xl-left">* Personal information includes name, address, etc</p>
<p class="text-mute text-xs-center text-xl-left">** Payment information includes credit card information etc</p>
<p class="text-mute text-xs-center text-xl-left">*** Insurance information includes insurance provider information, etc</p>
<p class="text-mute text-xs-center text-xl-left">**** Pharmacy information includes prescription information, etc</p>
</div>


</section>
</div>
</div>
</body>
</html>