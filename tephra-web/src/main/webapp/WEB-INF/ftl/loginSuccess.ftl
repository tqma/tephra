<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>咱家健康</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<style>
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

<#if data.user?exists>
    欢迎您！<br>
    ${data.user.name}
<#else>
    ${data.loginFailed}
    <a href="login">返回登陆</a>
</#if>

</body>

</html>