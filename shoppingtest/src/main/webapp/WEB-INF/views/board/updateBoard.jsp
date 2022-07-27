<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	function updateFormCheck(f){
		$(f).submit();
	}
</script>
</head>
<body>
	<div>
		<form action="setUpdateBoard.do" method="POST">
			<input type="hidden" id="boardNo" name="boardNo" value="${dto.boardNo}">
			<label>제목</label>
			<input type="text" id="boardTitle" name="boardTitle" value="${dto.boardTitle}"/><br>
			<label>작성자</label>
			<input type="text" id="boardWriter" name="boardWriter" value="${dto.boardWriter}"/><br>
			<label>내용</label>
			<textarea rows="6" cols="6" id="boardContents" name="boardContents">${dto.boardContents}</textarea><br>
			<input type="button" value="전송" onClick="updateFormCheck(this.form)">
		</form>
	</div>
</body>
</html>