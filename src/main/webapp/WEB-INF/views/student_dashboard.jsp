<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Dashboard</title>
</head>
<body>
    <h1>Welcome, Student!</h1>
    <p>This is your dashboard.</p>
    
    <h2>Your Information:</h2>
    <ul>
        <li>Name: ${student.name}</li>
        <li>Class: ${student.className}</li>
        <li>Grade: ${student.grade}</li>
        <!-- Add more student-related information here -->
    </ul>
    
    <!-- You can loop through a list of subjects or other student-specific data here -->
    <h2>Your Subjects:</h2>
    <ul>
        <c:forEach items="${student.subjects}" var="subject">
            <li>${subject.name}</li>
        </c:forEach>
    </ul>
    
    <!-- Add more content specific to the student dashboard -->
</body>
</html>
