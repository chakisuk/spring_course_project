<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath}/" />

<head>
    <title>수강신청 시스템</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <style>
        .login-container {
            max-width: 400px;
            margin: 100px auto;
        }
        .login-card {
            background-color: #f8f9fa;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            padding: 20px;
        }
        .login-title {
            text-align: center;
            color: #495057;
            margin-bottom: 30px;
            font-weight: 600;
        }
        .error-message {
            color: #dc3545;
            font-size: 80%;
            margin-top: 0.25rem;
        }
        .form-group label {
            color: #495057;
            font-weight: 500;
        }
        .btn-login {
            width: 100%;
            padding: 10px;
            margin-top: 20px;
        }
        .alert {
            margin-bottom: 20px;
        }
    </style>
</head>
<body class="bg-light">

<div class="login-container">
    <div class="login-card">
        <h2 class="login-title">수강신청 시스템</h2>


        <c:if test="${not empty loginFailMessage}">
            <div class="alert alert-danger">
                    ${loginFailMessage}
            </div>
        </c:if>

        <form:form method="post" action="${root}user/login_pro" modelAttribute="loginProBean">
            <div class="form-group">
                <form:label path="user_id">아이디</form:label>
                <form:input path="user_id" class="form-control" placeholder="아이디를 입력하세요"/>
                <form:errors path="user_id" cssClass="error-message"/>
            </div>

            <div class="form-group">
                <form:label path="user_pw">비밀번호</form:label>
                <form:password path="user_pw" class="form-control" placeholder="비밀번호를 입력하세요"/>
                <form:errors path="user_pw" cssClass="error-message"/>
            </div>

            <div class="form-group">
                <form:button class="btn btn-primary btn-login">로그인</form:button>
            </div>
        </form:form>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>