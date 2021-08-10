<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/6/15
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
</body>
<style type="text/css">
    *{
        margin: 0px;
        padding: 0px;
    }
    .container{
        width: 100%;
        height:100%;
    }
    .nav-top{
        margin: 0px;
        padding: 0px;
        width: 100%;
        height:60px;
        background: green;
    }
    .nav-bottom{
        width: 100%;
        height: 100%;
        padding: 0px;
        margin: 0px;
        position: absolute;
        top: 60px;
        left: 0px;
        background: pink;
    }
    .content{
        width: 400px;
        height: 270px;
        position: fixed;
        top: 50%;
        left: 50%;
        margin-left: -200px;
        margin-top: -135px;
        border: 2px solid #fff;
    }
    .content-top{
        width: 100%;
        height: 100px;
        border: 1px dotted #000;
        margin: 0px;
        padding: 0px;
        background: skyblue;
        text-align: center;
        font-size: 25px;
        font-family: arial;
        line-height: 70px;
    }
    .content-bottom{
        background: #000044;
        height: 200px;
        width:  100%;
        border: 0px solid #fff;
    }
    .content-bottom .put{
        width: 100%;
        height: 40px;
        text-align: center;
        font-size: 16px;
        font-family: arial;
        border: 0px solid #000;
        padding: 10px;
        line-height: 40px;
        color: white;
    }
    .pp{
        width: 100%;
        height: 80px;
        padding: 10px;
        text-align: center;
        line-height: 40px;
        border: 0px solid #000;
    }
    .title{
        width: 80px;
        height: 40px;
        line-height: 40px;
        font-size: 16px;
        font-family: arial;


    }
</style>
</head>
<body>
<div class="container">
    <div class="nav-top"></div>
    <div class="nav-bottom">
        <div class="content">
            <div class="content-top">考试登录系统/Test  login system</div>
            <div class="content-bottom">
                <form  action="../login">
                    <div class="put">账            号/Num：        <input type="text" name="account"/></div>
                    <div class="put">密            码/Secret： &nbsp;&nbsp;     <input type="password" name="pwd"></div>
                    <div class="put">验     证     码/Verification Code： <input type="text" name="card"></div>
                    <div class="pp"><input class="title" type="submit" value="登  录/login">&nbsp;&nbsp;
                        &nbsp;&nbsp;          <input class="title" type="reset" value="重  置/Reset"></div>
                </form>

            </div>
        </div>
    </div>
</div>
</body>
</html>
