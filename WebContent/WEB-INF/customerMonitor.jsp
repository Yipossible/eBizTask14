<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="description" content="" />
    <title>Customer Monitor Page</title>
    <script type="text/javascript" src="website/js/js1.js" data-dtconfig="rid=RID_-1737835921|rpid=1940273076|domain=gianteagle.com|lab=1|reportUrl=dynaTraceMonitor|agentUri=/dtagent_ICAijqx_6000500141012.js"></script><link rel="icon" type="image/x-icon" href="img/favicon.ico" />
    
    <link href="website/css/style.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
    <script type="text/javascript" src="website/js/js2.js"></script>
    <script src="website/js/js3.js"></script>   
    <script type="text/javascript" src='https://www.google.com/recaptcha/api.js' async defer></script>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body class="page-standard page-guest">       
    <div class="page-wrapper">
        <div class="content-wrapper">
            <section class="content-main bordered" role="main">
			    <div class="intro">
			        <h1>Customer Monitor Page</h1>
			    </div>
			    <div class="row">
			        <div class="col-lg-9 col-lg-offset-1 col-xl-8 col-xl-offset-2">
				        <c:forEach var="error" items="${errors}">
							<h3 class="heading1 text-xs-center m-y-3" style="color:red"> ${errors}</h3>
						</c:forEach>
						
						<p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
						<p style="font-size: 22px; text-align: center;"> </p>
						
						 <div class="form-group controls">
							<form action="#" method="POST">
								<input type="submit" name="submit" value="Click to your Protected Health Information (PHI)." class="btn btn-primary btn-full" />
							</form>
						</div>
				
						<p style="font-size: 22px; text-align: center;"> </p>
				
						<div class="form-group controls">
							<form action="#" method="POST">
								<input type="submit" name="submit" value="Click to REVISE your Protected Health Information (PHI)." class="btn btn-primary btn-full" />
							</form>
						</div>
						<p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
		                <p style="font-size: 22px; text-align: center;"> </p>
						
						<p class="text-mute text-xs-center text-xl-left"><small>Please refer to our <a title="Privacy Policy" href="http://www.gianteagle.com/About/Giant-Eagle-Inc-Notice-of-Pharmacy-Privacy-Practices/" target="_blank"> Privacy Practice</a> if you have any question.</small></p>

				</div>
			</div>
		</section>
		
		<script src="/Areas/Account/Assets/scripts/CommonScripts?v=3Z_MTicl0k6OwWqXo0cL0Odz8AeLjSROE_DfVWo38uU1"></script>
		<script src="/Areas/Account/Assets/scripts/AccountCreateScripts?v=-wmiCyPxP4nmkaA7nIr0X1XB0B9Fob9UtOwEKW8Pn_Q1"></script>
		<p class="copyright muted"><small>&copy; 2017 Giant Eagle Inc.</small></p>
	</div>
</div>
    <script type="text/javascript" src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
    <script type="text/javascript" src="https://ajax.aspnetcdn.com/ajax/mvc/5.2.3/jquery.validate.unobtrusive.min.js"></script>
    <script src="/Areas/Account/Assets/js/bootstrap.min-min.js"></script>
    <script src="/Areas/Account/Assets/js/main.js"></script>
    <script src="/Areas/Account/Assets/js/plugins.js"></script>
</body>
</html>