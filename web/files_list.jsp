<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/11/21
  Time: 8:31
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

	<%--<a href="download.jsp">下载文件</a>--%>
	<div class="container"
	style="width: 800px; margin: auto; position:absolute; z-index: 3; left: 0;right: 0;top: 140px; bottom: 0; ">

	<table class="table table-striped">


	<tr>
      	<td height="38" colspan="7" align="center" valign="middle">您的文件信息</td>
      </tr>
      <tr>
		    <th>id</th>
      		<th>用户</th>
      		<th>主题</th>
      		<th>文件名</th>
      		<th>存放地址</th>
      		<th>类型</th>
		  	<th>下载</th>
      </tr>
      <s:iterator value="list2" var="s">
      <tr>
		  <td valign="middle"><s:property value="#s.id"/></td>
      	  <td valign="middle"><s:property value="#s.username"/></td>
      	  <td valign="middle"><s:property value="#s.title"/></td>
      	  <td valign="middle"><s:property value="#s.filename"/></td>
      	  <td valign="middle"><s:property value="#s.path"/></td>
      	  <td valign="middle"><s:property value="#s.uploadContentType"/></td>
		  <td><a href="downloadAction.action?inputPath=<s:property value="#s.fullPath"/>&downFileName=<s:property value="#s.filename"/>&contentType=<s:property value="#s.uploadContentType"/>">点击下载</a></td>
      </tr>
      </s:iterator>
	</table>
		<a href="upload.jsp">上传文件</a>
	<s:debug></s:debug>
	</div>
</body>
</html>
