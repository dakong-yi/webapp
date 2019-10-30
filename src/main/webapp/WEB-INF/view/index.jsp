<%@page import="admin.User" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
<body>
<h2>Hello World!</h2>
<%
    User user = new User();
    out.println(user.getUserInfo());
%>
<form action="${pageContext.request.contextPath }/User/add" method="post">
    name:<input type="text" name="name" value="">
    password:<input type="password" name="psw" value="">
    <input type="submit" value="提交">
</form>
<button onclick="requestJSON()">提交</button>
<script>
    function requestJSON(){
        // alert(1);
        $.ajax({
            type:'post',
            url:'${pageContext.request.contextPath }/User/add',
            contentType :'application/json;charset=utf-8',
            //数据是JSON
            data:'{"name":"123","psw":9999}',
            success:function(data){
                alert(123);
            }
        });
    }
</script>
</body>
</html>
