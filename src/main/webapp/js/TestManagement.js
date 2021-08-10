// 获取弹窗
var modal = document.getElementById('myModal');
// 打开弹窗的按钮对象
var btn = document.getElementById("myBtn");
// 获取 <span> 元素，用于关闭弹窗
var span = document.querySelector('.close');
// 点击按钮密码输入打开弹窗
btn.onclick = function() {
    modal.style.display = "block";
}
function filePwd(){
    var filePwd= prompt("请输入密码：");
    //alert(filePwd);
    $("#pwdText").val()
}
console
// 点击 <span> (x),并在用户点击其他地方时， 关闭弹窗
span.onclick = function() {
    modal.style.display = "none";
}
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

