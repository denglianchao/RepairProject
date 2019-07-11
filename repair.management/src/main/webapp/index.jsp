<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <script type="text/javascript" src="webapps/jquery/jquery-1.8.0.min.js"></script>
    <script>
        $(function () {
            $.ajax({
                url: "/adminuser/userinfo",
                type: "POST",
                dataType: "JSON",
                success: function (result) {
                    if (result != null) {
                        $("#test").html(result.data.users[0].username);
                    } else {
                        alert("未查询到数据！尾插大我的唯一");
                    }
                }
            })
        })
    </script>
</head>
<body>
<a>你不是我的唯一你不是我的已使我，哈哈哈已不是我的以前</a>
<h2>Hello World!0000000<span id="test"></span></h2>
</body>
</html>
