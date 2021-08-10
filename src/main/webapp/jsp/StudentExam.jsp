<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生考试界面</title>
    <style>
        table, td, th {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<div style="width: 95%;height: 95%;background-color: gray;margin: 2% 0 0 2%;">
    <div Style="width: 48%;height: 90%;margin: 1% 0 0 2%;float:left;grid-area: main;">
        <div style="width: 100%;background-color: white ;border-bottom-style: solid">
            <h3 style="text-align:center">职业技能鉴定国家题库--福建片区考点</h3>
            <h3 style="text-align:center">数控车工高级理论知识试卷QZ001</h3>
        </div>
        <div>
            <LABEL>         &nbsp&nbsp&nbsp&nbsp&nbsp   科目代码：<label>knumbers</label>
                            &nbsp&nbsp&nbsp&nbsp&nbsp   科目名称：<label>kname</label>
                            &nbsp&nbsp&nbsp&nbsp&nbsp   准考证号：<label>Nunbers</label>
                            &nbsp&nbsp&nbsp&nbsp&nbsp   考生姓名：<label>Name</label></LABEL>
        </div>
        <div style="width: 100%;height: 75%;background-color: pink;">
            <DIV>一、单项选择题</DIV>
                <DIV>
                <div>1、企业诚实守信的内在要求是？（  ）</div>
                <div>A、维护企业的信誉</div>
                <div>B、增加职工福利  </div>
                <div>C、注重经济效益  </div>
                <div>D、开展员工培训  </div>
                <DIV>
                           <input type="radio" name="oneBut" >A.
                           <input type="radio" name="oneBut" >B.
                           <input type="radio" name="oneBut" >C.
                           <input type="radio" name="oneBut" >D.</DIV>
            </DIV>
            <DIV>二、判断题（第51起~第70起，将判断结果填入括号中，正确打V 错误打X </DIV>
            <DIV>
                <div>1、（  ）职业道德体现是职业对社会所负责的道德责任与义务</div>
                <div>A、正确</div>
                <div>B、错误</div>
                <DIV><input type="radio" name="oneBut" >A.
                           <input type="radio" name="oneBut" >B.
                    </DIV>
            </DIV>
            <DIV>二、多项选择题</DIV>
            <DIV>
                <div>1、就业几率包括（  ）等</div>
                <div>A、劳动纪律</div>
                <div>B、组织纪律</div>
                <div>C、财经纪律</div>
                <div>D、群众纪律</div>
                <DIV><input type="radio" name="oneBut" >A.
                           <input type="radio" name="oneBut" >B.
                           <input type="radio" name="oneBut" >C.
                           <input type="radio" name="oneBut" >D.</DIV>
            </DIV>
       
        </div>

    </div>
    <div Style="width: 48%;height: 90%;margin: 2% 0 0 2%;float:left;background-color: white">
        <div Style="width: 80%;height: 90%;margin: 1% 0 0 3%;">
            <H2>注意事项</H2>
            <H4>1、本试卷依据2005年颁布的《数控车工》国家职业标准命制，考试时间：120分钟。</H4>
            <H4>2、请在考试之前认真核实自己的姓名、准考证号和所在的单位的名称。</H4>
            <H4>3、请仔细阅读答题要求，在规定位置填写答案。</H4>
            <H4>剩余时间：<label>XX:XX</label><label style="float: right"> 题目导航栏</label></H4>
            <table style=" width: 100%;border-collapse: collapse;">
                <tr>
                    <td>1</td>
                    <td>2</td>
                    <td>3</td>
                    <td>4</td>
                    <td>5</td>
                    <td>6</td>
                    <td>7</td>
                    <td>8</td>
                    <td>9</td>
                    <td>10</td>
                </tr>
                <tr>
                    <td>11</td>
                    <td>12</td>
                    <td>13</td>
                    <td>14</td>
                    <td>15</td>
                    <td>16</td>
                    <td>17</td>
                    <td>18</td>
                    <td>19</td>
                    <td>20</td>
                </tr>
                <tr>
                    <td>21</td>
                    <td>22</td>
                    <td>23</td>
                    <td>24</td>
                    <td>25</td>
                    <td>26</td>
                    <td>27</td>
                    <td>28</td>
                    <td>29</td>
                    <td>30</td>
                </tr>
                <tr>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                    <td> &nbsp</td>
                </tr>
            </table>
            <H4>共<label>30</label>题；
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 已答：<label>0</label>题；
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 剩余：<label>30</label>题；
            </H4>
            <input type="button" value="交卷"style="width: 30%;font-size: 20px;margin: 2% 0 0 40%;">
        </div>
    </div>
</div>
</body>
</html>
