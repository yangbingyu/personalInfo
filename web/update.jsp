<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
		  integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		  crossorigin="anonymous">
	<link rel="stylesheet" href="css/normalize.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<sb:head/>
<title>Insert title here</title>

<s:head></s:head>
</head>
<body>
<div class="container"
	 style="width: 400px; margin: auto; position:absolute; z-index: 3; left: 0;right: 0;top: 140px; bottom: 0; ">
	<s:form action="UpdateAction" method="post" theme="bootstrap" cssClass="form-horizontal">
     			<s:textfield label="用户名" name="username" value="%{#session.username}"/>
				<s:textfield label="密码" name="password" value="%{#session.password}"/>
				<s:textfield label="电子邮箱" name="email" value="%{#session.email}"/>
				<s:textfield label="手机号码" name="telphone" value="%{#session.telphone}"/>
				<s:textfield label="固定电话" name="tel" value="%{#session.tel}"/>
				<s:textfield label="住址" name="address" value="%{#session.address}"/>
			<s:submit value="提交修改"/>
     		</s:form>
</div>
</body>
</html>