<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	function loginCheck(f){
		$(f).submit();
	}
</script>
</head>
<body>
<h2>로그인페이지</h2>
<div>
	<form action=loginCheck.do method="POST">
		<label>아이디</label>
		<input type="text" id="userId" name="userName" /><br>
		<label>패스워드</label>
		<input type="password" id="userPassword" name="userPassword" />
	</form>
</div>
<input type="button" value = "로그인" onClick="loginCheck(this.form)"/>
<input type="button" value = "회원가입" onClick="location.href='user/userSignUpPage.do'"/>
</body>
</html>