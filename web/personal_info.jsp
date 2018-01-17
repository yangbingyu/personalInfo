<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/11/21
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
<head>
    <title>Title</title>
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
		  integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		  crossorigin="anonymous">
	<link rel="stylesheet" href="css/normalize.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<sb:head/>
	<style>
		body {
			background-color: #eee;
			overflow: hidden;
		}

		canvas {
			background-color: #eee;
			display: block;
			margin: 0 auto;
		}
	</style>
</head>
<body>
<div class="container"
	 style="width: 800px; margin: auto; position:absolute; z-index: 3; left: 0;right: 0;top: 140px; bottom: 0; ">

	<table class="table table-striped">


	<tr>
      	<td height="38" colspan="2" align="center" valign="middle">您的个人资料</td>
      </tr>
      <tr>
      	<td align="right" valign="middle">用户名：&nbsp;</td>
      	<td valign="middle"><s:property value="#session.username"/></td>
      </tr>
      <tr>
      	<td align="right" valign="middle">密码：&nbsp;</td>
      	<td valign="middle"><s:property value="#session.password"/></td>
      </tr>
      <tr>
      	<td align="right" valign="middle">真实姓名：&nbsp;</td>
      	<td valign="middle"><s:property value="#session.name"/></td>
      </tr>
      <tr>
      	<td align="right" valign="middle">电子邮箱：&nbsp;</td>
      	<td valign="middle"><s:property value="#session.email"/></td>
      </tr>
      <tr>
      	<td align="right" valign="middle">手机号码：&nbsp;</td>
      	<td valign="middle"><s:property value="#session.telphone"/></td>
      </tr>
      <tr>
      	<td align="right" valign="middle">固定电话：&nbsp;</td>
      	<td valign="middle"><s:property value="#session.tel"/></td>
      </tr>
      <tr>
      	<td align="right" valign="middle">住址：&nbsp;</td>
      	<td valign="middle"><s:property value="#session.address"/></td>
      </tr>
	</table>

	<a href="FindByUsername.action">修改信息</a>
	<%--<a href="delete.jsp">删除信息</a>--%>

	<s:debug></s:debug>
</div>
</body>
</html>
