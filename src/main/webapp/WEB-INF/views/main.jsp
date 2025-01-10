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
<body>


<div class="container" style="margin-top: 100px">
    <div class="card-header">
        <h4>강의 목록</h4>
    </div>
    <div class="card-body">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>과목번호</th>
                <th>과목명</th>
                <th>학점</th>
                <th>수강인원</th>
                <th>강의요일</th>
                <th>강의시간</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var ="subject" items="${availableSubjects}">
                <tr>
                    <td class="text-center d-md-table-cell">${subject.subject_idx}</td>
                    <td class="text-center d-md-table-cell">${subject.subject_name}</td>
                    <td class="text-center d-md-table-cell">${subject.subject_grade}</td>
                    <td class="text-center d-md-table-cell">${subject.subject_num}/20</td>
                    <td class="text-center d-md-table-cell">${subject.subject_day}</td>
                    <td class="text-center d-md-table-cell">${subject.subject_time}</td>
                    <form action="${root}subject/register" method="post">
                        <input type="hidden" name="subject_idx" value="${subject.subject_idx}">
                        <button type="submit" class="btn btn-primary btn-sm">신청</button>
                    </form>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<div class="card mt-4">
    <div class="card-header">
        <h4>내 강의 목록</h4>
    </div>
    <div class="card-body">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>과목번호</th>
                <th>과목명</th>
                <th>학점</th>
                <th>수강인원</th>
                <th>강의요일</th>
                <th>강의시간</th>
            </tr>
            </thead>
            <tbody
            <c:forEach var="subject" items="{registeredSubjects}">
                <tr>
                    <td class="text-center d-md-table-cell">${subject.subject_idx}</td>
                    <td class="text-center d-md-table-cell">${subject.subject_name}</td>
                    <td class="text-center d-md-table-cell">${subject.subject_grade}</td>
                    <td class="text-center d-md-table-cell">${subject.subject_num}/20</td>
                    <td class="text-center d-md-table-cell">${subject.subject_day}</td>
                    <td class="text-center d-md-table-cell">${subject.subject_time}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>

</body>
</html>