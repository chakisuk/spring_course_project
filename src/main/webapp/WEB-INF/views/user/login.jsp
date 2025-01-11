<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath}/" />

<!DOCTYPE html>
<html>
<head>
    <title>수강신청 시스템</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        body {
            background: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .login-container {
            background-color: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0,0,0,0.1);
            width: 100%;
            max-width: 400px;
        }

        .login-title {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
            font-weight: bold;
        }

        .form-control {
            border-radius: 20px;
            padding: 12px 20px;
            height: auto;
            margin-bottom: 20px;
            border: 1px solid #ddd;
        }

        .form-control:focus {
            box-shadow: 0 0 5px rgba(161,196,253,0.5);
            border-color: #a1c4fd;
        }

        .btn-login {
            background: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);
            border: none;
            border-radius: 20px;
            padding: 12px;
            font-weight: bold;
            width: 100%;
            color: white;
            margin-top: 20px;
            transition: all 0.3s ease;
        }

        .btn-login:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(161,196,253,0.4);
        }

        .input-group {
            position: relative;
            margin-bottom: 20px;
        }

        .input-icon {
            position: absolute;
            left: 15px;
            top: 50%;
            transform: translateY(-50%);
            color: #aaa;
            z-index: 10;
        }

        .input-with-icon {
            padding-left: 45px;
        }
    </style>
</head>
<body>

<div class="login-container">
    <h2 class="login-title">수강신청 시스템</h2>

    <form:form method="post" action="${root}user/login_pro" modelAttribute="loginProBean">
        <form:hidden path="user_idx"/>

        <div class="input-group">
            <i class="fas fa-user input-icon"></i>
            <form:input type="text" path="user_id" class="form-control input-with-icon" placeholder="아이디를 입력하세요"/>
        </div>

        <div class="input-group">
            <i class="fas fa-lock input-icon"></i>
            <form:input type="password" path="user_pw" class="form-control input-with-icon" placeholder="비밀번호를 입력하세요"/>
        </div>


        <div class="form-group">
            <form:button class="btn btn-login">로그인</form:button>
        </div>
    </form:form>

</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>