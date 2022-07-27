<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판임</title>
<style>
  table {
    width: 500px;
    border: 1px solid #444444;
  }
  th, td {
    border: 1px solid #444444;
  }
</style>
</head>
<body>
<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성자</th>
		<th>작성일</th>
	</tr>
	<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.boardNo}</td>
				<td>
					<a href="contentsView.do?boardNo=${list.boardNo}">${list.boardTitle}</a>
				</td>
				<td>${list.boardContents}</td>
				<td>${list.boardWriter}</td>
				<td> <fmt:formatDate value="${list.boardWriteDate}" pattern="yy-MM-dd HH:mm"/></td>
			</tr>
	</c:forEach>
</table>
<input type="button" value="글쓰기" onClick="location.href='boardWrite.do'"/>
</body>
</html>