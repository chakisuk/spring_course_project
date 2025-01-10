<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}/" />
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery-3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
<center>
<h1>강의목록</h1>
</center>

<div class="container">
    <div class="card-body">
        <h3 class="card-title"></h3>
        <table class="table table-hover">
            <thead>
            <tr>
                <th class="text-center d-md-table-cell">글번호</th>
                <th class="text-center d-md-table-cell">과목명</th>
                <th class="text-center d-md-table-cell">학점</th>
                <th class="text-center d-md-table-cell">수강인원</th>
                <th class="text-center d-md-table-cell">강의요일</th>
                <th class="text-center d-md-table-cell">강의시간</th>
                <th class="text-center d-md-table-cell">수강신청</th>
            </tr>
            </thead>

            <tbody>
            <%--<c:forEach var="obj" items="${contentList}"> --%>
                <tr>
                    <td class="text-center d-md-table-cell">글번호</td>
                    <td class="text-center d-md-table-cell">과목명</td>
                    <td class="text-center d-md-table-cell">학점</td>
                    <td class="text-center d-md-table-cell">수강인원</td>
                    <td class="text-center d-md-table-cell">강의요일</td>
                    <td class="text-center d-md-table-cell">강의시간</td>
                    <td class="text-center d-md-table-cell">수강신청</td>
                </tr>
<%--</c:forEach>--%>
</tbody>
</table>
    </div>
</div>

<center>
<h1>내 강의 목록</h1>
</center>
<div class="container">
    <div class="card-body">
        <h3 class="card-title"></h3>
        <table class="table table-hover">
            <thead>
            <tr>
                <th class="text-center d-md-table-cell">과목번호</th>
                <th class="text-center d-md-table-cell">과목명</th>
                <th class="text-center d-md-table-cell">학점</th>
                <th class="text-center d-md-table-cell">수강인원</th>
                <th class="text-center d-md-table-cell">강의요일</th>
                <th class="text-center d-md-table-cell">강의시간</th>
                <th class="text-center d-md-table-cell">수강신청</th>
            </tr>
            </thead>

            <tbody>
            <%--<c:forEach var="obj" items="${contentList}"> --%>
            <tr>
                <td class="text-center d-md-table-cell">글번호</td>
                <td class="text-center d-md-table-cell">과목명</td>
                <td class="text-center d-md-table-cell">학점</td>
                <td class="text-center d-md-table-cell">수강인원</td>
                <td class="text-center d-md-table-cell">강의요일</td>
                <td class="text-center d-md-table-cell">강의시간</td>
                <td class="text-center d-md-table-cell">수강신청</td>
            </tr>
            <%--</c:forEach>--%>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>