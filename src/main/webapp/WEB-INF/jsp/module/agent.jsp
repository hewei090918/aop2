<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/common.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
    <title>机票预订系统-代理商</title>
    <script type="text/javascript">
        $(document).ready(function () {
            toastr.success("欢迎来到这里");
        });
    </script>
</head>
<body>
Hello: ${actionBean.name} ,这里是代理商管理页面
</body>
</html>
