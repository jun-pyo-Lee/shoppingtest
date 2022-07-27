<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	function deleteCheck(f){
		if(confirm("삭제하시겠습니까?")){
			$(f).submit();
		}else{
			alert("취소되었습니다.");
		}
	}
</script>
</head>
<body>
<div style="width: 500px; height: 500px; border: 1px solid;">
번호 : ${dto.boardNo}<br>
제목 : ${dto.boardTitle}<br>
내용 : ${dto.boardContents}<br>
작성자 : ${dto.boardWriter}<br>
작성일 : ${dto.boardWriteDate}<br>
<input type="button" value="뒤로가기" onClick="location.href='boardListView.do'"/>
<form action="deleteList.do" method="POST">
		<input type="hidden" name="boardNo" value="${dto.boardNo}">
		<input type="button" onclick="deleteCheck(this.form)" value="삭제">
</form>
<form action="updateBoard.do" method="POST">
		<input type="hidden" name="boardNo" value="${dto.boardNo}">
		<input type="button" onclick="submit(${dto.boardNo})" value="수정">
</form>
</div>
</body>
</html>