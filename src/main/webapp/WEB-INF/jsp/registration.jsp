<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML Transactionsl//EN" "http://www.w3.org/TR/xhtml/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Hello World with Spring MVC</title>
        <meta content="text/html; charset=UTF-8" http-equiv="Content-Type"/>
    </head>
    <body>
        <h1>Sign Up Form</h1> <br/>
        <form:form action="/demo/registration" commandName="USER">
            <table>
                <tr><td colspan="2"><form:errors path="*" cssStyle="color: red;"/></td> </tr>
                <tr><td>User Name : </td> <td><form:input path="username"/></td></tr>
                <tr><td>Password : </td> <td><form:input path="password"/></td></tr>
                <tr><td>Age : </td> <td><form:input path="age"/></td></tr>
                <tr>
                    <td>Gender : </td>
                    <td>
                        <form:select path="gender">
                            <form:option value="Male"/>
                            <form:option value="Female"/>
                        </form:select>
                    </td>
                </tr>
                <tr><td colspan="2"><input type="submit" value="Save Changes"/></td></tr>
            </table>
        </form:form>
    </body>
</html>