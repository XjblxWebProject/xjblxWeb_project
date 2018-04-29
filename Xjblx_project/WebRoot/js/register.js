$(document).ready(function(){
	$("#input_bt").click(function(){
		var userName = document.getElementById("userName").value;
		var passwd = document.getElementById("passwd").value;
		var passwd2 = document.getElementById("passwd_confirm").value;

		if (userName == "") {
			alert("用户名不能为空");
		}
		else if (passwd == "") {
			alert("密码不能为空");
		}
		else if (passwd2 == "") {
			alert("请再次输入密码");
		}
		else if (passwd != passwd2) {
			alert("两次输入的密码不一致");
		}
		else if (passwd == passwd2) {
			if (passwd.length<5) {
				alert("密码位数低于6位")
			}
			else if(passwd.length>19){
				alert("密码位数超过20位")
			}
		}
		else {
			alert("注册成功")
		}
	});
});