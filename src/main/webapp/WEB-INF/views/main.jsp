<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}/" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>수강신청</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-4">
    <div class="card">
        <div class="card-header">
            <h4 align="center">강의 목록</h4>
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
                    <th>수강신청</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="subject" items="${subjects}">
                    <tr>
                        <td>${subject.subject_idx}</td>
                        <td>${subject.subject_name}</td>
                        <td>${subject.subject_grade}</td>
                        <td>${subject.subject_count}/20</td>
                        <td>${subject.subject_day}</td>
                        <td>${subject.subject_time}</td>
                        <c:if test="${subject.subject_count lt 20}">
                        <td>
                            <a class="btn btn-primary" href="${root}add?subject_idx=${subject.subject_idx}&user_idx=${param.user_idx}">신청
                            </a>
                        </td>
                        </c:if>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <div class="card mt-4">
        <div class="card-header">
            <h4 align="center">내 강의 목록</h4>
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
                    <th>수강신청</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="subject" items="${select_courses}">
                    <tr>
                        <td>${subject.subject_idx}</td>
                        <td>${subject.subject_name}</td>
                        <td>${subject.subject_grade}</td>
                        <td>${subject.subject_count}/20</td>
                        <td>${subject.subject_day}</td>
                        <td>${subject.subject_time}</td>
                        <td>
                            <a class="btn btn-danger"
                               href="${root}delete?subject_idx=${subject.subject_idx}&user_idx=${param.user_idx}"
                            >취소</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>