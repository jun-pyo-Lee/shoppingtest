<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판임</title>
</head>
<body>
<c:forEach items="${list}" var="list">
제목 : <input type="text" value="${list.boardTitle}" readonly="readonly" /><br>
내용 : <input type="text" value="${list.boardContents}" readonly="readonly" /><br>
시간 : <input type="text" value="${list.boardWriteDate}" readonly="readonly" /><br>
</c:forEach>
</body>
</html>