<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
    <head>
        <title>Sample form</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <style>
            body { background-color: #eee; font : helvetica}
            #container {width: 500px; background-color: #fff; margin: 30px auto; padding: 30px; border: 10px}
            .green { font-weight: bold; color: green}
            .message { margin-bottom: 10px}
            label { width: 70px; display: inline-block}
            form { line-height: 160%}
            .hide { display: none}
            .error { color: red; font-size: 0.9em; font-weight: bold}
        </style>
    </head>
    <body>

        <div id="container">
            <h2>Subscribe to Group buying</h2>
            <c:if test="${not empty message}"><div class="message green">${message}</div> </c:if>

            <form:form action="/" modelAttribute="subscriber">
                <label for="nameInput">Name: </label>
                <form:input path="name" id="nameInput"/>
                <form:errors path="name" cssClass="error"/>
                <br/>

                <label for="ageInput">Age: </label>
                <form:input path="age" id="ageInput"/>
                <form:errors path="age" cssClass="error"/>
                <br/>

                <label for="phoneInput">Phone: </label>
                <form:input path="phone" id="phoneInput"/>
                <form:errors path="phone" cssClass="error"/>
                <br/>

                <label for="emailInput">Email: </label>
                <form:input path="email" id="emailInput"/>
                <form:errors path="email" cssClass="error"/>
                <br/>

                <label for="birthdayInput">Birthday: </label>
                <form:input path="birthday" id="birthdayInput" placeholder="DD.MM.YYY"/>
                <form:errors path="birthday" cssClass="error"/>
                <br/>

                <label for="genderOptions">Gender: </label>
                <form:select path="gender" id="genderOptions">
                    <form:option value="">Select Gender</form:option>
                    <form:option value="MALE">Male</form:option>
                    <form:option value="FEMALE">Female</form:option>
                </form:select>
                <form:errors path="gender" cssClass="error"/>

                <label for="discountCheckbox">Discount Alerts? </label>
                <form:checkbox path="discountAlerts" id="discountCheckbox"/>
                <form:errors path="discountAlerts" cssClass="error"/>

                <br/>
                <input type="submit" value="Submit"/>
            </form:form>
        </div>

        <script type="text/javascript">
            ${document}.ready(function() {
                toggleFrequencySelectBox();     // show/hide box on page load
                ${'#discountCheckBox'}.change(function() {
                    toggleFrequencySelectBox();
                })
            });

            function toggleFrequencySelectBox() {
                if(!$('#discountCheckBox').is(':checked')) {
                    $('#frequencySelect').val('');
                    $('#frequencySelect').prop('disabled', true);
                } else {
                    $('#frequencySelect').prop('disabled', false);
                }
            }
        </script>

    </body>
</html>