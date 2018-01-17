<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/11/19
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  	当前用户:${sessionScope.username}
  <table width="100%" border="0">
    <tr>
      <td height="10" align="center" bgcolor="#FFCC33" class="font"><a href="UserInfoAction.action" target="main">个人信息管理</a></td>
      <td align="center" bgcolor="#FFCC33" class="font"><a href="FriendsInfoAction.action" target="main">通讯录管理</a></td>
      <td align="center" bgcolor="#FFCC33" class="font"><a href="DateInfoAction.action" target="main">日程安排管理</a></td>
      <td align="center" bgcolor="#FFCC33" class="font"><a href="FileInfoAction.action" target="main">个人文件管理</a></td>
      <td align="center" bgcolor="#FFCC33" class="font"><a href="login.jsp">退出系统</a></td>
    </tr>
  </table>
  <iframe name="main" width="100%" height="600"></iframe>
  </body>
</html>
