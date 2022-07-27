<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	function signUpCheck(f){
		var pw1 = $('#userPassword1').val();
		var pw2 = $('#userPassword2').val();
		if(pw1!=pw2){
			alert("비밀번호가 일치하지 않습니다.");
			$("#userPassword1").focus();
			return false;
		}else{
			$(f).submit();
		}
	}
</script>
</head>
<body>
	<div>
		<form action="userSignUP.do" method="POST">
			<label>아이디</label>
			<input type="text" id="userId" name="userId"/><br>
			<label>비밀번호</label>
			<input type="password" id="userPassword1" name="userPassword"/><br>
			<label>비밀번호 확인</label>
			<input type="password" id="userPassword2" name="userPassword2"/><br>
			<input type="button" value="전송" onClick="signUpCheck(this.form)">
		</form>
		
	</div>
</body>
</html>