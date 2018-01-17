<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/11/19
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<s:i18n name="nuc.sw.i18n.login">
<html>
<head>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
    <link rel="stylesheet" href="css/normalize.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <sb:head/>

    <base href="<%=basePath%>">
    <title><s:text name="title"></s:text></title>
    <s:head></s:head>
</head>
<body>

<div class="container"
     style="width: 400px; margin: auto; position:absolute; z-index: 3; left: 0;right: 0;top: 140px; bottom: 0; ">
    <s:fielderror></s:fielderror>
<s:form action="loginAction" method="POST" theme="bootstrap" cssClass="form-horizontal">
        <s:textfield key="user" name="username"></s:textfield>
        <s:password key="password" name="password"></s:password>
        <s:textfield key="code" name="code" maxlength="4" class="chknumber_input"> </s:textfield>
        <s:text name="refresh"></s:text><img src="randomCode.action" onclick="this.src='randomCode.action?'+ Math.random()" title="点击图片刷新验证码"/>
        <s:submit key="submit" cssClass="btn btn-primary btn-lg"></s:submit>
        <s:a href="registe.jsp" cssClass="btn btn-primary btn-lg"><s:text name="registe"/></s:a>
    </s:form>

    <a href="loginAction?request_locale=zh_CN"><s:text name="language.zh"/></a>
    <a href="loginAction?request_locale=en_US"><s:text name="language.en"/></a>
</div>
</body>
</html>
</s:i18n>
