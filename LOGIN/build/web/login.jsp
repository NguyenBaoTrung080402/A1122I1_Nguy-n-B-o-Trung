<%-- 
    Document   : login
    Created on : 13 thg 1, 2023, 14:12:26
    Author     : TRUNG
--%>

<%
    response.setContentType("text/html;charset=UTF-8");
    request.setCharacterEncoding("utf-8");
%>
<%@page contentType="text/html" errorPage="error.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
    <head>
        <meta charset="UTF-8">
        <title>CodePen - Material Compact Login Animation</title>
        <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
        <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900&amp;subset=latin,latin-ext'><link rel="stylesheet" href="./assets/Css/login.css">

    </head>
    <body>
        <!-- partial:index.partial.html -->
        <form action="login1" method="post">
            <div class="materialContainer">


                <div class="box">

                    <div class="title">LOGIN</div>

                    <div class="input">
                        <label for="name">Username</label>
                        <input type="text" name="name" id="name">
                        <span class="spin"></span>
                    </div>

                    <div class="input">
                        <label for="pass">Password</label>
                        <input type="password" name="pass" id="pass">
                        <span class="spin"></span>
                    </div>

                    <div class="button login">
                        <button><span>GO</span> <i class="fa fa-check"></i></button>
                    </div>

                    <a href="" class="pass-forgot">Forgot your password?</a>

                </div>
        </form>
        <form action="" method="POST">
            
            <div class="overbox">
                <div class="material-button alt-2"><span class="shape"></span></div>

                <div class="title">REGISTER</div>

                <div class="input">
                    <label for="regname">Username</label>
                    <input type="text" name="regname" id="regname">
                    <span class="spin"></span>
                </div>

                <div class="input">
                    <label for="regpass">Password</label>
                    <input type="password" name="regpass" id="regpass">
                    <span class="spin"></span>
                </div>

                <div class="input">
                    <label for="reregpass">Repeat Password</label>
                    <input type="password" name="reregpass" id="reregpass">
                    <span class="spin"></span>
                </div>

                <div class="button">
                    <button><span>NEXT</span></button>
                </div>


            </div>

        </div>
    </form>
    <!-- partial -->
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script><script  src="./assets/js/loginJS.js"></script>

</body>
</html>

