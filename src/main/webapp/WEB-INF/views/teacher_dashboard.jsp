<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Teacher Dashboard</title>
</head>
<body>
    <h1>Welcome, Teacher!</h1>
    <p>This is your dashboard.</p>
    
    <h2>Your Information:</h2>
    <ul>
        <li>Name: ${teacher.name}</li>
        <li>Classes: ${teacher.classes}</li>
        <!-- Add more teacher-related information here -->
    </ul>
    
    <!-- You can loop through a list of subjects or other teacher-specific data here -->
    <h2>Your Subjects:</h2>
    <ul>
        <c:forEach items="${teacher.subjects}" var="subject">
            <li>${subject.name}</li>
        </c:forEach>
    </ul>
    
    <!-- Add more content specific to the teacher dashboard -->
</body>
</html>
