<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath}/" /><head>
    <title>0110_3팀</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery-3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div class="card-body">

                                                                        <%--여기에 아이디랑 pw만 넘어감--%>
        <form:form method="post" action="${root}user/login_pro" modelAttribute="loginProBean">
            <div class="form-group">
                <form:label path="user_id">아이디</form:label>
                <form:input type="text" path="user_id" class="form-control"/>
            </div>

            <div class="form-group">
                <form:label path="user_pw">비밀번호</form:label>
                <form:input type="password" path="user_pw" class="form-control"/>
            </div>

            <div class="form-group">
                <div class="text-right">
                    <form:button class="btn btn primary">로그인</form:button>
                </div>
            </div>
        </form:form>

    </div>
</div>

</body>
</html>