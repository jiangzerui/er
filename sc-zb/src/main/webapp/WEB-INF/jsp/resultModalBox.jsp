<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>

<table class="table table-bordered table-hover" id="dataTables-example">
    <thead>
    <tr>
        <th>#</th>
        <th>文件名</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${subjectResults}" var="sr" varStatus="status">
    <tr>
        <td>${status.index+1 }</td>
        <td>${sr.subjectResultName}</td>
        <td>
        	<a href="${sr.subjectResultUrl}">下载</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>



