<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
	在线考试系统登录界面/test login systems online
</title></head>
<body style="background-color:#21AEFE;">
    <form method="post" action="./" id="form1">
<div class="aspNetHidden">
<input type="hidden" name="__EVENTTARGET" id="__EVENTTARGET" value="" />
<input type="hidden" name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="" />
<input type="hidden" name="__LASTFOCUS" id="__LASTFOCUS" value="" />
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwULLTEyMTc2MzEyMTAPZBYCAgMPZBYCAgEPEGRkFgFmZBgBBR5fX0NvbnRyb2xzUmVxdWlyZVBvc3RCYWNrS2V5X18WAQUMSW1hZ2VCdXR0b24xCKREyHm3TRabuhM+zHOJZJF9V31tTUQtcaom26Mp6Ho=" />
</div>
<script type="text/javascript">
//<![CDATA[
var theForm = document.forms['form1'];
    if (!theForm) {
       theForm = document.form1;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>
</script>
<div class="aspNetHidden">
    <input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="CA0B0334" />
	<input type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEdAAjkQHxBXPgbSBAo3eQVmLqneAvXgMJqZJrALQ+/0SkkbgXLy7i1CwZPvKCGHTosRDhSHWRs4Q89N3tezdxnADg/6ZACrx5RZnllKSerU+IuKgBFfR5671U18f+AWDpAkI5cCvP9YJ59uTpXZUTciHnZ0uxP6KL4yVZFzai1nTIrn8XxzTMKIvGMrM1qu73+iowFFRbtkkpGz8O2Sjp9eAME" />
</div>
             <div class="box1">
	         <div class="box_In">
             <div class="box_hd" style="text-align:center;margin-top:200px">
                 <h2 >厦门市职业技能鉴定中心--学生考试系统</h2>
                 <h2 > Xiamen Vocational Skills Assessment centre-student examination system</h2>
                          </div>
	                   <div class="box1_con">
                  <div style="margin-top:-100px;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
            <tr>
                <td>
                    <table width="497" height="278" border="0" align="center" cellpadding="0" cellspacing="0" background="images/login.jpg">
                        <tr>
                            <td><br>
                                <table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td>考试名称/Subject：</td>
                                        <td>
                <select name="role" onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;role\&#39;,\&#39;\&#39;)&#39;, 0)" id="role" style="height:16px;width:130px;">
	            <option selected="selected" value="UserDetail">考   生/Students</option>
                <option selected="selected" value="UserDetail">监考人员/Invigilators</option>
                <option value="Admin">执勤人员/Duty Officer</option>
	            <option value="Admin">管理员/Manager</option>
                </select>
                                        </td>
                                        <td rowspan="6"><div align="right">
                                            &nbsp;<input type="image" name="ImageButton1" id="ImageButton1" src="images/loginButton.gif" />
                                        </div></td>
                                        </tr>
                                        <tr>
                                            <td colspan="2">
			                            <div id="Panel1" style="height:89px;">
                                            <table style="width:100%;">
                                                <tr>
                                                    <td>&nbsp;
                                                    </td>
                                                    <td>&nbsp;
                                                    </td>
                                                </tr>
                                                    <tr>
                                                        <td>
                                                            <span id="Label1">准考证号/Num：</span>
                                                        </td>
                                                        <td>
                                                            <input name="Admin" type="text" id="Admin" style="width:130px;" />
                                                            </td>                                                           
                                                        </tr>
                                                        <tr>
                                                            <td>&nbsp;
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                密   码/Secret：</td>
                                                            <td>
                                                                <input name="Mobile" type="text" id="Mobile" style="width:130px;" />
                                                            </td>
                                                           </tr>
                                                        <tr>
                                                        <td> &nbsp;
                                                        </td>
                                                        <td> &nbsp;
                                                        </td>
                                                   </tr>
                                                        <tr>
                                                            <td>
                                                                <span id="Label2">身份证号/ID：</span>
                                                            </td>
                                                            <td>
                                                                <input name="Password" type="password" id="Password" style="width:130px;" />
                                                            </td>                                                           
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                &nbsp;</td>
                                                            <td>
                                                                &nbsp;</td>
                                                   </table>
                                        </div>
    </form>
    <a href="InformationVerification.jsp"><button type="button" class="btn btn-info btn-lg" style="margin-top: 81px; margin-left: 112px; width: 131px;">登录/login</button></a>
                                               </body>
                                               </html>

