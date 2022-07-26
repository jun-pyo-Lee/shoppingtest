<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="width: 500px; height: 500px; border: 1px solid;">
번호 : ${dto.boardNo}<br>
제목 : ${dto.boardTitle}<br>
내용 : ${dto.boardContents}<br>
작성자 : ${dto.boardWriter}<br>
작성일 : ${dto.boardWriteDate}<br>
<input type="button" value="뒤로가기" onClick="location.href='boardListView.do'"/>
</div>
</body>
</html>