<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>欢迎登陆咱家健康</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<style>
    <!-- div{ -->
    <!-- border:1px solid red; -->
    <!-- } -->
    <!-- span{ -->
         <!-- border:1px solid black; -->
         <!-- <!-- background-color:red; --> -->
         <!-- } -->

    img#phoneIconForLogin{
        z-index:-1;
    }

    div#loginDiv{
        text-align:center;
    }

    div.loginContent{
        z-index:1;
        position:absolute;
        left:38%;
        top:30%;
        width:23.5%;
    }
    div.loginTitle{
        background-color:#6a7d8f;
        height:70px;
        top:69px;
        left:578px;
        width:358px;
        position:absolute;

        line-height:100px;
        font-size:20px;
    }

    input{
        border-radius:6px;
        width:300px;
        border:1px solid #889cac;
        margin:10px 0;
        font-size:25px;
    }

</style>

<body>
<div id="loginDiv" >
    <!-- <span class="loginSpan"> -->
    <img id="phoneIconForLogin" src="images\u36.png">
    <div class="loginTitle">
        用户登录
    </div>
    <div class="loginContent">

        <form method="post" action="loginHandler" id="loginButton">
            <input placeholder="请输入用户名" name="name" type="text"/><br>
            <input placeholder="请输入密码第三方" name= "password" type="password"/><br>
            <input type="submit"/>
        </form>
    </div>
    <!-- </span> -->

</div>



</body>

</html>