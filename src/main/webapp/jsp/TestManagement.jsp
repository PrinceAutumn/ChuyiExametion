<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta name = "viewport" content="width=device-width, initial-scale=1.0">
<meta charset="utf-8"> 
<title>TestManagement</title>
<style>
* {
    box-sizing: border-box;
}
.row:after {
    content: "";
    clear: both;
    display: block;
}
[class*="col-"] {
    float: left;
    padding: 15px;
}
.col-1 {width: 8.33%;}
.col-2 {width: 16.66%;}
.col-3 {width: 25%;}
.col-4 {width: 33.33%;}
.col-5 {width: 41.66%;}
.col-6 {width: 50%;}
.col-7 {width: 58.33%;}
.col-8 {width: 66.66%;}
.col-9 {width: 75%;}
.col-10 {width: 83.33%;}
.col-11 {width: 91.66%;}
 .col-12 {width: 100%;}
html {
    font-family: "Lucida Sans", sans-serif;
}
.header {
    background-color: #9933cc;
    color: #ffffff;
    padding: 15px;
}
.menu ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
}
.menu li {
    padding: 8px;
    margin-bottom: 7px;
    background-color :#33b5e5;
    color: #ffffff;
    box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
}
.menu li:hover {
    background-color: #0099cc;
}
</style>
</head>
<body>
<div class="header">
    <h2>试卷导入栏</h2>
    <h3>试卷压缩包的位置：
        <form method="post" action="/ChuyiExamination_war_exploded/UploadServlet" enctype="multipart/form-data">
            选择一个文件:
            <input type="file" name="uploadFile" />
            <br>
            <input type="；" value="上传" />
            <input type="text" id="msg">
            <input type="file"><br/>
                <button id="sendBtn"onclick="send()">浏览</button>
                <a href=InformationVerification.jsp> <button id="closeBtn" onclick="studentwebsocket()">导入</button></a>

            </form>
<div>
<div style="position:absolute;">
    <body style="background-color:pink">
    <table style="width:100%; ">
        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
            </td>
        </tr>
        <tr>
            <td>
                <span id="Label1">准考证号/ID：</span>
            </td>
            <td>

        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
            </td>
        </tr>
        <tr>
            <td>
                <span id="Label2">考生姓名/StudentsName：</span>
            </td>
            <td>

        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
        </tr>
        <tr>
            <td>
                <span id="Label3">考试成绩/TestScore：</span>
            </td>
            <td>

        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
        </tr>
        <tr>
            <td>
                <span id="Label4">考试科目/Number：</span>
            </td>
            <td>


        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
        </tr>
        <tr>
            <td>
                <span id="Label5">考试工种/Test： </span>
            </td>
            <td>

        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
        </tr>
        <tr>
            <td>
                <span id="Label6">等     级/Class： </span>
            </td>
            <td>

        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
        </tr>
        <tr>
            <td>
                <span id="Label7"> 科目成绩/Score：</span>
            </td>
            <td>

        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
        </tr>
        <tr>
            <td>
                <span id="Label8"> 考試試卷/Examination paper：</span>
            </td>
            <td>

        <tr>
            <td>&nbsp;
            </td>
            <td>&nbsp;
        </tr>
        <tr>
            <td>
                <span id="Label9"> 鑒定等級/Appraisal grade：</span>
            </td>
            <td>

</div>
<div style="position:absolute;top:110%; width:400% ;height:72%;text-align: center">
        <a href=StudentExam.jsp><button id="ReadingTestBtn" onclick="window.location='TestManagement.jsp'">预览试卷</button> </a>&emsp;

        <a href=TheStudentsResearching.jsp> <button id="ReadingStudentsMessageBtn" onclick="ReadingStudentsMessage()">预览考生信息</button> </a>
</div>
        <div style="position:absolute;top:130%; width:400% ;weight:70%;text-align: center">
        <a href="welcometoXiamen.jsp"> <button id="DetemineStudentsMessageBtn" onclick="DetermineStudentsMessage()">确认考生信息</button></a>
</div>
</body>
</html>