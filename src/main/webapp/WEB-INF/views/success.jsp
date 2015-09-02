<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML Transactionsl//EN" "http://www.w3.org/TR/xhtml/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type"/>
    <title>Registration Confirmation Page</title>
</head>
<body>
    <h1>Registration has been completed with following details:</h1> <br>
    Name: ${USER.username}
    Password: ${USER.password}
    Age: ${USER.age}
    Gender: ${USER.gender}
</body>
</html>