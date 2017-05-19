
<!DOCTYPE html>
<!--[if IE 8 ]> <html lang="en" class="ie8 lt-ie9 ie"> <![endif]-->
<!--[if IE 9 ]> <html lang="en" class="ie9 ie"> <![endif]-->
<!--[if IE 10 ]> <html lang="en" class="ie10 ie"> <![endif]-->

<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="description" content="" />
    <title>Giant Eagle Accounts</title>
    <script type="text/javascript" src="website/js/js1.js" data-dtconfig="rid=RID_-1737835921|rpid=1940273076|domain=gianteagle.com|lab=1|reportUrl=dynaTraceMonitor|agentUri=/dtagent_ICAijqx_6000500141012.js"></script><link rel="icon" type="image/x-icon" href="img/favicon.ico" />
    
    <link href="website/css/style.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
    <script type="text/javascript" src="website/js/js2.js"></script>
    <script src="website/js/js3.js"></script>   
    <script type="text/javascript" src='https://www.google.com/recaptcha/api.js' async defer></script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body class="page-standard page-guest"> 
    <!--[if lt IE 10]>
    <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://www.microsoft.com/en-us/download/internet-explorer.aspx">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->             
    <div class="page-wrapper">
        <header role="header">
            <div class="topbar">
              <h5><a href="auditorLogin.jsp"><i class="fa-caret-left hidden-sm-up"></i><u>Auditor Log in</u></a></h5>
            </div>

<script src="/Areas/Account/Assets/scripts/CommonScripts?v=3Z_MTicl0k6OwWqXo0cL0Odz8AeLjSROE_DfVWo38uU1"></script>

        </header>
        <div class="content-wrapper">
            <section class="content-main bordered" role="main">
    <div class="intro">
        <h1>Create An Account</h1>
    </div>
    <div class="row">
        <div class="col-lg-9 col-lg-offset-1 col-xl-8 col-xl-offset-2">
<form action="/accountcreation" autocomplete="off" class="form-createAccount form-inlined" method="post"><input name="__RequestVerificationToken" type="hidden" value="1t8oTXSqaK-pvM4zQ9ZVgfxJ2--PmIs1GS6ftXSnnSJk-tuYykTeKSV_BKYBvno-to3c_oq4V5kAGlsc7sMyMFnaylxVKJO3wA_NJdYNq3Y1" /><input id="PhoneType" name="PhoneType" type="hidden" value="ishomenumber" />                <h2 class="heading1 text-xs-center m-y-3">
                    Have an account?
                    <a href="#" onclick="location.href='login.html'" style="font-size:22px;" class="btn-link">Sign In <i class="fa fa-caret-right"></i></a>
<p style="font-size:large; color:green"> ${message}</p>
<p style="font-size:large; color:red"> ${errors}</p>
                
                </h2>
                <h2 class="heading1 m-y-2">Your Personal Info</h2>
                <div class="form-group row">
                    <p class="form-control-label">Name:</p>
                    <div class="col-sm-9 input-wrapper">
                        <div class="col-sm-6">
                            <label for="FirstName" class="sr-only col-sm-3 form-control-label">First Name:</label>
                            <input class="form-control" data-val="true" data-val-maxlength="First Name cannot be more than 50 characters" data-val-maxlength-max="50" data-val-regex="Invalid first name." data-val-regex-pattern="^[a-zA-Z-&#39; ]+$" data-val-required="Please enter your first name" id="FirstName" name="fname" placeholder="First name" type="text" value="" />
                            <span class="field-validation-valid errorMessage" data-valmsg-for="FirstName" data-valmsg-replace="true"></span>
                        </div>
                        <div class="col-sm-6">
                            <label for="LastName" class="sr-only col-sm-3 form-control-label">Last Name:</label>
                            <input class="form-control" data-val="true" data-val-maxlength="Last Name cannot be more than 35 characters" data-val-maxlength-max="35" data-val-regex="Invalid last name." data-val-regex-pattern="^[a-zA-Z-&#39; ]+$" data-val-required="Please enter your last name" id="LastName" name="lname" placeholder="Last name" type="text" value="" />
                            <span class="field-validation-valid errorMessage" data-valmsg-for="LastName" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <p for="birthday" class="form-control-label">Birthday:</p>
                    <div class="clearfix hidden-sm-up"></div>
                    <div class="col-sm-9 input-wrapper">
                        <div class="col-sm-6">
                            <div class="cd-select icon">
                                <label for="Birth_Month" class="sr-only form-control-label">Birth Month:</label>
                                <select class="form-control" data-val="true" data-val-required="Please select your birth month" id="Birth_Month" name="birth_month"><option value=""></option>
<option value="0">January</option>
<option value="1">February</option>
<option value="2">March</option>
<option value="3">April</option>
<option value="4">May</option>
<option value="5">June</option>
<option value="6">July</option>
<option value="7">August</option>
<option value="8">September</option>
<option value="9">October</option>
<option value="10">November</option>
<option value="11">December</option>
</select>
                            </div>
                            <span class="field-validation-valid errorMessage" data-valmsg-for="Birth_Month" data-valmsg-replace="true"></span>
                        </div>
                        <div class="col-sm-3">
                            <div class="cd-select icon">
                                <label for="Birth_Day" class="sr-only form-control-label">Birth Date:</label>
                                <select class="form-control" data-val="true" data-val-required="Please select your birth date" id="Birth_Day" name="birth_day"><option value=""></option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>
                            </div>
                            <span class="field-validation-valid errorMessage" data-valmsg-for="Birth_Day" data-valmsg-replace="true"></span>
                        </div>
                        <div class="col-sm-3">
                            <div class="cd-select icon">
                                <label for="Birth_Year" class="sr-only form-control-label">Birth Year:</label>
                                <select class="form-control" data-val="true" data-val-required="Please select your birth year" id="Birth_Year" name="birth_year"><option value=""></option>
<option value="2004">2004</option>
<option value="2003">2003</option>
<option value="2002">2002</option>
<option value="2001">2001</option>
<option value="2000">2000</option>
<option value="1999">1999</option>
<option value="1998">1998</option>
<option value="1997">1997</option>
<option value="1996">1996</option>
<option value="1995">1995</option>
<option value="1994">1994</option>
<option value="1993">1993</option>
<option value="1992">1992</option>
<option value="1991">1991</option>
<option value="1990">1990</option>
<option value="1989">1989</option>
<option value="1988">1988</option>
<option value="1987">1987</option>
<option value="1986">1986</option>
<option value="1985">1985</option>
<option value="1984">1984</option>
<option value="1983">1983</option>
<option value="1982">1982</option>
<option value="1981">1981</option>
<option value="1980">1980</option>
<option value="1979">1979</option>
<option value="1978">1978</option>
<option value="1977">1977</option>
<option value="1976">1976</option>
<option value="1975">1975</option>
<option value="1974">1974</option>
<option value="1973">1973</option>
<option value="1972">1972</option>
<option value="1971">1971</option>
<option value="1970">1970</option>
<option value="1969">1969</option>
<option value="1968">1968</option>
<option value="1967">1967</option>
<option value="1966">1966</option>
<option value="1965">1965</option>
<option value="1964">1964</option>
<option value="1963">1963</option>
<option value="1962">1962</option>
<option value="1961">1961</option>
<option value="1960">1960</option>
<option value="1959">1959</option>
<option value="1958">1958</option>
<option value="1957">1957</option>
<option value="1956">1956</option>
<option value="1955">1955</option>
<option value="1954">1954</option>
<option value="1953">1953</option>
<option value="1952">1952</option>
<option value="1951">1951</option>
<option value="1950">1950</option>
<option value="1949">1949</option>
<option value="1948">1948</option>
<option value="1947">1947</option>
<option value="1946">1946</option>
<option value="1945">1945</option>
<option value="1944">1944</option>
<option value="1943">1943</option>
<option value="1942">1942</option>
<option value="1941">1941</option>
<option value="1940">1940</option>
<option value="1939">1939</option>
<option value="1938">1938</option>
<option value="1937">1937</option>
<option value="1936">1936</option>
<option value="1935">1935</option>
<option value="1934">1934</option>
<option value="1933">1933</option>
<option value="1932">1932</option>
<option value="1931">1931</option>
<option value="1930">1930</option>
<option value="1929">1929</option>
<option value="1928">1928</option>
<option value="1927">1927</option>
<option value="1926">1926</option>
<option value="1925">1925</option>
<option value="1924">1924</option>
<option value="1923">1923</option>
<option value="1922">1922</option>
<option value="1921">1921</option>
<option value="1920">1920</option>
<option value="1919">1919</option>
<option value="1918">1918</option>
<option value="1917">1917</option>
<option value="1916">1916</option>
<option value="1915">1915</option>
<option value="1914">1914</option>
<option value="1913">1913</option>
<option value="1912">1912</option>
<option value="1911">1911</option>
<option value="1910">1910</option>
<option value="1909">1909</option>
<option value="1908">1908</option>
<option value="1907">1907</option>
<option value="1906">1906</option>
<option value="1905">1905</option>
<option value="1904">1904</option>
<option value="1903">1903</option>
<option value="1902">1902</option>
<option value="1901">1901</option>
<option value="1900">1900</option>
</select>
                            </div>
                            <span class="field-validation-valid errorMessage" data-valmsg-for="Birth_Year" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <p class="form-control-label">Address:</p>
                    <div class="col-sm-9 input-wrapper">
                        <label for="Address1" class="sr-only form-control-label">Address:</label>
                        <input class="form-control" data-val="true" data-val-length="Street address cannot be more than 128 characters" data-val-length-max="128" data-val-required="Please enter your address" id="Address1" name="address1" placeholder="Street Address" type="text" value="" />
                        <span class="field-validation-valid errorMessage" data-valmsg-for="Address1" data-valmsg-replace="true"></span>

                        <label for="Address2" class="sr-only form-control-label">Address 2:</label>
                        <input class="form-control" data-val="true" data-val-length="Address line 2 cannot be more than 128 characters" data-val-length-max="128" id="Address2" name="address2" placeholder="Address Line 2 (Optional)" type="text" value="" />
                        <span class="field-validation-valid errorMessage" data-valmsg-for="Address2" data-valmsg-replace="true"></span>

                        <div class="col-sm-6">
                            <label for="City" class="sr-only form-control-label">City:</label>
                            <input class="form-control" data-val="true" data-val-maxlength="City cannot be longer than 64 characters." data-val-maxlength-max="64" data-val-regex="Invalid city." data-val-regex-pattern="^[a-zA-Z\#\$\@\+\.\- ]+$" data-val-required="Please enter your city" id="City" name="city" placeholder="City" type="text" value="" />
                            <span class="field-validation-valid errorMessage" data-valmsg-for="City" data-valmsg-replace="true"></span>
                        </div>

                        <div class="col-sm-3">
                            <div class="cd-select icon">
                                <label for="State" class="sr-only form-control-label">State:</label>
                                <select class="form-control select-input" data-val="true" data-val-required="Please select your state" id="State" name="state"><option value=""></option>
<option value="AL">AL</option>
<option value="AK">AK</option>
<option value="AZ">AZ</option>
<option value="AR">AR</option>
<option value="CA">CA</option>
<option value="CO">CO</option>
<option value="CT">CT</option>
<option value="DC">DC</option>
<option value="DE">DE</option>
<option value="FL">FL</option>
<option value="GA">GA</option>
<option value="HI">HI</option>
<option value="ID">ID</option>
<option value="IL">IL</option>
<option value="IN">IN</option>
<option value="IA">IA</option>
<option value="KS">KS</option>
<option value="KY">KY</option>
<option value="LA">LA</option>
<option value="ME">ME</option>
<option value="MD">MD</option>
<option value="MA">MA</option>
<option value="MI">MI</option>
<option value="MN">MN</option>
<option value="MS">MS</option>
<option value="MO">MO</option>
<option value="MT">MT</option>
<option value="NE">NE</option>
<option value="NV">NV</option>
<option value="NH">NH</option>
<option value="NJ">NJ</option>
<option value="NM">NM</option>
<option value="NY">NY</option>
<option value="NC">NC</option>
<option value="ND">ND</option>
<option value="OH">OH</option>
<option value="OK">OK</option>
<option value="OR">OR</option>
<option selected="selected" value="PA">PA</option>
<option value="RI">RI</option>
<option value="SC">SC</option>
<option value="SD">SD</option>
<option value="TN">TN</option>
<option value="TX">TX</option>
<option value="UT">UT</option>
<option value="VT">VT</option>
<option value="VA">VA</option>
<option value="WA">WA</option>
<option value="WV">WV</option>
<option value="WI">WI</option>
<option value="WY">WY</option>
</select>
                                <span class="field-validation-valid errorMessage" data-valmsg-for="State" data-valmsg-replace="true"></span>
                            </div>
                        </div>

                        <div class="col-sm-3">
                            <label for="ZipCode" class="sr-only form-control-label">Zip:</label>
                            <input class="form-control" data-val="true" data-val-maxlength="Zipcode cannot be more than 10 characters" data-val-maxlength-max="10" data-val-regex="Please enter a valid five-digit zip code" data-val-regex-pattern="^\d{5}(-\d{4})?$" data-val-required="Please enter your zip code" id="ZipCode" name="zip" placeholder="Zip" type="text" value="" />
                            <span class="field-validation-valid errorMessage" data-valmsg-for="ZipCode" data-valmsg-replace="true"></span>
                        </div>

                    </div>
                </div>
                <div class="form-group row">
                    <p class="form-control-label">Home Phone:</p>
                    <div class="col-sm-9 input-wrapper">
                        <label for="phone" class="sr-only form-control-label">Phone Number:</label>
                        <input class="form-control" data-val="true" data-val-phone="Must be a valid home phone number" data-val-regex="Entered phone format is not valid." data-val-regex-pattern="^\(?([0-9]{3})\)?[-]?([0-9]{3})[-]?([0-9]{4})$" data-val-required="Please enter your home phone number" id="HomePhoneNumber" name="phone_number" placeholder="xxx-xxx-xxxx" title="We ask for your phone number for occasions such as important product recalls and to assist looking up your card number in-store." type="text" value="" />
                        <span class="field-validation-valid errorMessage" data-valmsg-for="HomePhoneNumber" data-valmsg-replace="true"></span>

                        <!--<div class="radio cd-form-list">
                            <div class="col-sm-3 col-xs-6">
                                <input data-val="true" data-val-required="The IsHomeNumber field is required." id="IsHomeNumber" name="GroupType" type="radio" value="{ value = IsHomeNumber }"  onclick="setPhoneType('IsHomeNumber')" checked >
                                <label for="IsHomeNumber">Home</label>
                            </div>
                            <div class="col-sm-3 col-xs-6">
                                <input data-val="true" data-val-required="The IsMobileNumber field is required." id="IsMobileNumber" name="GroupType" type="radio" value="{ value = IsMobileNumber }"  onclick="setPhoneType('IsMobileNumber')">
                                <label for="IsMobileNumber">Mobile</label>
                            </div>
                        </div>-->
                    </div>
                </div>
                <hr />
                <h2 class="heading1 m-y-2">Your Account Details</h2>
                <div class="form-group row">
                    <p class="form-control-label">Email Address:</p>
                    <div class="col-sm-9 input-wrapper">
                        <label for="EmailAddress" class="sr-only form-control-label">Email Address:</label>
                        <input class="form-control" data-val="true" data-val-email="Please enter a valid email address" data-val-maxlength="Email cannot be more than 128 characters" data-val-maxlength-max="128" data-val-regex="Please enter a valid email address" data-val-regex-pattern="^(([\w-]+\.)+[\w-]+|([a-zA-Z]{1}|[\w-]{2,}))@((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\.([0-1]?
            [0-9]{1,2}|25[0-5]|2[0-4][0-9])\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\.([0-1]?
            [0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|([a-zA-Z0-9]+[\w-]+\.)+[a-zA-Z]{1}[a-zA-Z0-9-]{1,23})$" data-val-required="Please enter your e-mail address" id="EmailAddress" name="email" placeholder="john@example.com" type="text" value="" />
                        <span class="field-validation-valid errorMessage" data-valmsg-for="EmailAddress" data-valmsg-replace="true"></span>
                        <div class="col-sm-12">
                            <input checked="checked" data-val="true" data-val-required="The IsOptEmailEnrollment field is required." id="IsOptEmailEnrollment" name="isEnrolled" type="checkbox" value="true" />
                            <label for="IsOptEmailEnrollment">Sign up to receive email updates on specials, savings, promotions and store happenings!</label>
                        </div>
                    </div>

                    <div class="clearfix m-y-1"></div>

                    <label for="Password" class="form-control-label">Password:</label>
                    <input autocomplete="off" class="form-control" data-val="true" data-val-minlength="Password must be 8 characters" data-val-minlength-min="8" data-val-regex="Password does not match above requirements" data-val-regex-pattern="^(?=^.{8,256}$)(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s)[0-9a-zA-Z*$-+?_&amp;=!%{}/#^~ @\-&#39;.]*$" data-val-required="Please enter a valid password" id="Password" name="password" placeholder="Password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" type="password" />
                    <div class="col-sm-9 col-sm-offset-3 p-x-0">
                        <p class="p-t-0 p-b-1"><small>Password must be a minimum of <strong>8 characters</strong> and contain <strong>1 number</strong>, <strong>1 uppercase</strong> and <strong>1 lowercase</strong> letter.</small></p>
                        <span class="field-validation-valid errorMessage" data-valmsg-for="Password" data-valmsg-replace="true"></span>
                    </div>

                    <div class="clearfix"></div>

                    <label for="ConfirmPassword" class="form-control-label">Confirm Password:</label>
                    <input autocomplete="off" class="form-control" data-val="true" data-val-equalto="Passwords must match." data-val-equalto-other="*.Password" data-val-required="Please confirm your password" id="ConfirmPassword" name="confirm_password" placeholder="Confirm Password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" type="password" />
                    <div class="col-sm-9 col-sm-offset-3 p-x-0">
                        <span class="field-validation-valid errorMessage" data-valmsg-for="ConfirmPassword" data-valmsg-replace="true"></span>
                    </div>
                    <div class="form-group controls">
                        <div class="col-sm-9 col-sm-offset-3 p-x-0">
                            <div class="col-xl-6 col-sm-12 next">
                                <a href="#" id="btnCreateAccount" class="btn btn-primary btn-full" onclick="disableButton('loadingsection', 'btnCreateAccount', $(this).closest('form')); $(this).closest('form').submit(); return false;">Create Account</a>
                            </div>
                            <div class="col-xl-6 col-sm-12 p-l-0 prev">
                                <p class="text-mute text-xs-center text-xl-left"><small>By&nbsp;creating an account&nbsp;you agree to Giant Eagle&rsquo;s <a title="Privacy Policy" href="privacy-policy.html" target="_blank"> Privacy Policy.</a></small></p>
                            </div>
                        </div>
                    </div>
                </div>
</form>        </div>
   </div>   
</section>

<script src="/Areas/Account/Assets/scripts/CommonScripts?v=3Z_MTicl0k6OwWqXo0cL0Odz8AeLjSROE_DfVWo38uU1"></script>
<script src="/Areas/Account/Assets/scripts/AccountCreateScripts?v=-wmiCyPxP4nmkaA7nIr0X1XB0B9Fob9UtOwEKW8Pn_Q1"></script>

    <p class="copyright muted"><small>&copy; 2017 Giant Eagle Inc.</small></p>
</div> <!-- /.content-wrapper -->
    </div> <!-- /.page-wrapper -->
    <footer>
    </footer>
    <script type="text/javascript" src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
    <script type="text/javascript" src="https://ajax.aspnetcdn.com/ajax/mvc/5.2.3/jquery.validate.unobtrusive.min.js"></script>
    <script src="/Areas/Account/Assets/js/bootstrap.min-min.js"></script>
    <script src="/Areas/Account/Assets/js/main.js"></script>
    <script src="/Areas/Account/Assets/js/plugins.js"></script>
</body>
</html>
