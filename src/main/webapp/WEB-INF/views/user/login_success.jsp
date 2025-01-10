<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath}/"/>  <!--절대경로를 설정해둔거임-->

<script>
    alert("로그인 되었습니다");
    location.href='${root}main?user_idx=${loginProBean.user_idx+1}'

    console.log(loginProBean.user_idx)
    console.log(loginBean.user_idx)
    console.log(loginProBean.user_idx)

</script>