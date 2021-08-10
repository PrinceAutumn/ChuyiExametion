<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="utf-8"> 
<title>WelcometoXiamen vocational skill appraisal center.jsp</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
<h1>厦门市职业技能鉴定中心--鉴定站考试管理系统---欢迎您</h1>
    <h2>WelcometoXiamen vocational skill appraisal center</h2>

</div>
<!--考试信息栏-->
     <div id="divC">
         <H3 style="">
             考试科目
         </H3>
         <H5>
             <label>考试类型：</label>
              <label>正式考试</label>
             <label>考试时间：</label>
             <label>120分钟</label>
             <label>考生人数：</label>
             <label>50人</label>
             <label>鉴定级别：</label>
             <label>一级</label>
             <label>鉴定工种：</label>
             <label>数控原理</label>
         </H5>
     </div>
<div class="row">
    <div class="col-3 menu">
      <div class="layui-btn-group">
<ul>
         <a href=StudentContest.jsp>         <li>开始考试/Beginning Exam</li></a>
         <a href=Studentstestbutton.jsp>     <li>强制交卷/Compulsory submission</li></a>
         <a href=ExamsCheat.jsp>             <li>作   弊/Cheat</li></a>
         <a href=Examinationviolation.jsp>   <li>违   纪/Violation of discipline</li></a>
         <a herf=ContinueTest.jsp>           <li>暂停考试/Suspend</li></a>
         <a href=Studentstestbutton.jsp>     <li>导出成绩/Export results</li></a>
</ul>
</div>

</div>
    <div class="col-9">
        <!--考生状态栏-->
        <div id="divE">
            <div style="width: 100%;height: 5%;">
                <label>考生列表：<input type="radio" name="studentRadio" > 全选</input>
                </label>
            </div>
            <div id="div1" style="float: left;width:30%;height:30%; background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img1" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号:</label></br>
                <label>100001</label></br>
                <label>姓名：<LABEL>林怀杰</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
            <div id="div2" style="float: left;width:30%;height:30%; background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img2" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>100002</label></br>
                <label>姓名：<LABEL>王倩</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
            <div id="div3" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img3" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>100003</label></br>
                <label>姓名：<LABEL>李问泽</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
            <div id="div4" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img4" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>100004</label></br>
                <label>姓名：<LABEL>黄榕城</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
            <div id="div5" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img5" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>10005</label></br>
                <label>姓名：<LABEL>陈艺伟</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
            <div id="div6" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img6" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>10006</label></br>
                <label>姓名：<LABEL>郑怡勤</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
            <div id="div7" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img7" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>10007</label></br>
                <label>姓名：<LABEL>罗文杰</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
            <div id="div8" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img8" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>10008</label></br>
                <label>姓名：<LABEL>林晓星</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
            <div id="div9" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img9" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>10009</label></br>
                <label>姓名：<LABEL>张晓勤</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>

            <div id="div10" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img10" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>100010</label></br>
                <label>姓名：<LABEL>李亚斌</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>

            <div id="div11" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img11" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>100011</label></br>
                <label>姓名：<LABEL>黄晓明</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>

            <div id="div12" style="float: left;width:30%;height:30%;background-color: #00FF00">
                <input type="radio" name="studentRadio" style="float: left"/>
                <img id="img12" width="10%" height="10%"style="margin:1% 0% 0 1%;border-style:solid;background-color: aliceblue;" src="<%=request.getContextPath()%>/image/001.jpg"/>

                <label>准考证号：</label></br>
                <label>100012</label></br>
                <label>姓名：<LABEL>马云</LABEL></label>
                <P>状态：<label>等待考试</label></P>
                <P>成绩：<label>无</label></P>
            </div>
        </div>
    </div>
</body>
</head>
</html>