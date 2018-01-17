<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/11/19
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<s:i18n name="nuc.sw.i18n.registe">
<html>
<head>
    <title><s:text name="title"></s:text></title>
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
<s:form action="RegisteAction" method="post" theme="bootstrap" cssClass="form-horizontal">
    <s:textfield key="email" name="email"></s:textfield>
    <s:password key="pass" name="password"></s:password>
    <s:password key="confirm" name="confirmpsw"></s:password>
    <s:textfield key="user" name="username"></s:textfield>
    <s:textfield key="name" name="name"></s:textfield>
    <s:textfield key="telphone" name="telphone"></s:textfield>
    <s:textfield key="tel" name="tel"></s:textfield>
    <s:textfield key="address" name="address"></s:textfield>
    <%--<s:textfield key="city" name="address"></s:textfield>--%>
    <%--<s:textfield key="area" name="address"></s:textfield>--%>
    <%--<s:textfield key="street" name="address"></s:textfield>--%>
    <s:submit key="submit"></s:submit>
</s:form>
<a href="RegisteAction?request_locale=zh_CN"><s:text name="language.zh"/></a>
<a href="RegisteAction?request_locale=en_US"><s:text name="language.en"/></a>
</div>
</body>
</html>
</s:i18n>
