<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	function writeFormCheck(f){
		if($("#boardTitle").val()==""){
			   alert("제목을 입력해주세요.")
			   $("#boardTitle").focus();
			   return false;
	    }
		if($("#boardWriter").val()==""){
				   alert("작성자를 입력해주세요.")
				   $("#boardWriter").focus();
				   return false;
	    }
		if($("#boardContents").val()==""){
				   alert("내용을 입력해주세요.")
				   $("#boardContents").focus();
				   return false;
		}
		$(f).submit();
	}
</script>
</head>
<body>
<form action="writeCheck.do" method="POST">
<label>제목</label>
<input type="text" id="boardTitle" name="boardTitle"/>
<label>작성자</label>
<input type="text" id="boardWriter" name="boardWriter"/>
<label>내용</label>
<input type="text" id="boardContents" name="boardContents"/>
<input type="button" value="전송" onClick="writeFormCheck(this.form)"/>
</form>
</body>
</html>