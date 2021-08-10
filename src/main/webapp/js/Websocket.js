var ws = null;
if ('WebSocket' in window){
    ws = new WebSocket("ws:localhost:8089/Servlet/websocket/23")
}else {
    alert("浏览器不支持");
}
var connBtn = document.getElementById("connBtn");
var sendBtn = document.getElementById("sendBtn");
var closeBtn = document.getElementById("closeBtn");

// 连接安生错误的回调方法
ws.onerror = function () {
    setMessageInnerHTML("WEBSOCKET发生链接错误");
}

// 连接成功的回调方法
ws.onopen = function (ev) {
    setMessageInnerHTML("WebSocket连接成功！");
}

// 收到消息的回调方法
ws.onmessage = function (ev) {
    console.log(1)
    setMessageInnerHTML(ev.data);
}

// 连接关闭的回调方法
ws.onclose = function () {
    setMessageInnerHTML("WebSocket连接关闭");
}


// 监听窗口关闭事件，防止连接没断关闭窗口。
window.onbeforeunload = function () {
    closeWebSocket();
}


// 将消息显示在网页上
function setMessageInnerHTML(innerHtml){
    document.getElementById("message").innerHTML += innerHtml + '<br />'
}

// 关闭websocket连接
function closeWebsocket(){
    ws.close();
}

// 发送消息
function send(){
    var message = document.getElementById("msg").value;
    ws.send(message);
}
$(function (){
    ${"#login"}.click(function(){

    $.ajax({
        url: "/Websocket",//等同于表单中的action
        type: "post",// 等同于表单中的method
        dataType: "json",// 返回的数据类型
        success: function (data) {
            if (data == 1) {
                alert("登录成功");
                window.location = getRootPath() + "/jsp/main.jsp";
            } else {
                alert("登录失败");
            }
        }
    })
    })
})

