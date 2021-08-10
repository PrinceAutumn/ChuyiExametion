// 登录验证
$(function () {
    $("#logBtn").click(function () {
        var $acc = $("#userIn").val();
        var $pwd = $("#pwdIn").val();
        var $code = $("#codeIn").val();
        console.log($acc);
        console.log($pwd);
        console.log($code);
        $.ajax({
            url: "login",//等同于表单中的action
            data: {
                "acc": $acc,
                "pwd": $pwd,
                "code": $code
            },//所要提交的数据
            type: "post",// 等同于表单中的method
            dataType: "json",// 返回的数据类型
            success: function (data) {
                if (data == 1) {
                    alert("登录成功");
                    window.location = "jsp/main.jsp";
                } else {
                    alert("登录失败");
                }
            }
        })
    })
})

// 刷新验证码的方法
function getCode() {
    document.getElementById("codeImg").src = "getCode?time=" + new Date().getTime();
}

// 表单验证
window.onload = function () {
    //给表单绑定onsubmit事件
    document.getElementById("forms").onsubmit = function () {
        return checkUsername() && checkPassword();
    }
    //给账号和密码框分别绑定离焦事件
    document.getElementById("userIn").onblur = checkUsername;
    document.getElementById("pwdIn").onblur = checkPassword;
}

// 账号校验
function checkUsername() {
    //获取账号的值
    var username = document.getElementById("userIn").value;

    //定义正则表达式
    var reg_username = /^[a-zA-Z0-9]{6,16}$/;
    //判断值是否符合正则表达式的规则
    var flag = reg_username.test(username);

    //提示信息
    var s_username = document.getElementById("user_tip");

    if (flag) {
        //提示正确信息
        s_username.innerHTML = "";
    } else {
        //提示红色错误信息
        s_username.innerHTML = "账号格式有误！";
    }
    return flag;
}

// 密码校验
function checkPassword() {
    //1.获取密码的值
    var password = document.getElementById("pwdIn").value;
    //2.定义正则表达式
    var reg_password = /^[a-zA-Z0-9]{6,20}$/;
    //3.判断值是否符合正则的规则
    var flag = reg_password.test(password);
    //4.提示信息
    var s_password = document.getElementById("pwd_tip");

    if (flag) {
        //提示正确信息
        s_password.innerHTML = "";
    } else {
        //提示错误信息
        s_password.innerHTML = "密码格式有误";
    }
    return flag;}