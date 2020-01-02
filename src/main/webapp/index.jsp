<html>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $(function () {
        $("#but").click(function () {


            var user = {};
            user.userName = $("#username").val();
            user.userPwd = $("#userpwd").val();
            var formData = new FormData();
            formData.append("userStr",JSON.stringify(user));
            alert("喜喜");
           $.ajax({
               url:"/maven_web_war/hello/xixihello",
               type:"POST",
               data:formData,
               dataType:"json",
               contentType: false,// 注意这里应设为false
               processData: false,
               cache: false,
               success:function (data) {
                   if (data.success){
                       alert('提交成功')
                   }else {
                       alert("提交失败"+data.errMsg)
                   }
               }
           })

        });
    });

</script>
<body>
<input type="text" id="username" name="username"/>账号
<input type="password" id="userpwd" name="userpwd">密码
<input type="button" id="but">测试
<h2>Hello World!</h2><br>
<a href="/mavenweb_war/hello/test" name="testStr"/>测试<br>
</body>


</html>
