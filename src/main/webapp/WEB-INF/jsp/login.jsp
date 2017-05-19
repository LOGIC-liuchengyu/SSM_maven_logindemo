<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript">  
    //添加用户  
    function addUser() {  
        var form = document.forms[0];  
        form.action = "${pageContext.request.contextPath}/user/loginconfirm";  
        //form.action = "${pageContext.request.contextPath}/user/addUser2";  
        //form.action = "${pageContext.request.contextPath}/user/addUser3";  
        form.method = "post";  
        form.submit();  
    }  
</script>  



  </head>
  
  <body>
  
  
  密码错误请重新登陆 </br>
  
    <form>  
        <table>  
            <tr>  
                <td>账号</td>  
                <td>  
                    <input type="text" name="id">  
                </td>  
            </tr>  
            <tr>  
                <td>密码</td>  
                <td>  
                    <input type="password" name="password">  
                </td>  
            </tr>  
            <tr>  
                <td> </td>  
                <td>  
                    <input type="button" value="提交" onclick="addUser()">  
                </td>  
            </tr>  
        </table>  
    </form>  
  </body>
</html>
