<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${root}/js/jquery-1.7.2.min.js" charset="UTF-8"></script>
<script type="text/javascript">
$(function() {
	/* Auto jump. */
	//window.location.href = "${root}/site/list.do";
});
</script>
<title>Hello</title>
</head>
<body>
<div>Hello, world...</div>
</body>
</html>