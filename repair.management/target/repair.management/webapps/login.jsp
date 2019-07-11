<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/7/23
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/management/webapps/jquery/jquery-1.8.0.min.js"></script>
    <script>
        $(function () {
            $.ajax({
                url:"/adminuser/userinfo.mvc",
                type:"POST",
                dataType:"JSON",
                success:function (result) {
                    if(result != null){
                        $("#test").html(result.data.users[0].username);
                    }else{
                        alert("未查询到数据！");
                    }
                }

            })
        })
    </script>
</head>
<body>
<h2>Hello World!00<span id="test"></span></h2>
</body>
</html>
