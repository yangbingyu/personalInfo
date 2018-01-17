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


<div class="container"
     style="width: 800px; margin: auto; position:absolute; z-index: 3; left: 0;right: 0;top: 140px; bottom: 0; ">

    <table class="table table-striped">
	
      <tr>
      	<td height="38" colspan="3" align="center" valign="middle">您的日程信息</td>
      </tr>
      <tr>
      		<th>用户名</th>
      		<th>日期</th>
      		<th>事情安排</th>
      </tr>
      <s:iterator value="list1" var="i">
      <tr>
      	<td valign="middle"><s:property value="#session.username"/></td>
      	<td valign="middle"><s:property value="#i.date"/></td>
      	<td valign="middle"><s:property value="#i.thing"/></td>
      </tr>
      </s:iterator>
	</table>
    <a href="addDate.jsp">添加日程</a>
</div>
</body>
</html>
