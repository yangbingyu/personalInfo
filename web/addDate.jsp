<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
    <link rel="stylesheet" href="css/normalize.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <sb:head/>
    <s:head/>
</head>
<body>
<div class="container"
     style="width: 400px; margin: auto; position:absolute; z-index: 3; left: 0;right: 0;top: 140px; bottom: 0; ">
	<s:form action="InsertDateAction" method="post" theme="bootstrap" cssClass="form-horizontal">
    <s:textfield label="用户名" name="username" value="%{#session.username}"></s:textfield>
    <s:textfield label="日期" name="date"></s:textfield>
    <s:textfield label="事情安排" name="thing"></s:textfield>
    <s:submit value="添加"></s:submit>
</s:form>
</div>
</body>
</html>