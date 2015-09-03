<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
    <script type="text/javascript" src="<c:url value='/resources/testajax.js'/>"></script>
    <link rel="stylesheet" href="<c:url value='/resources/style.css'/>" type="text/css" media="screen"/>
</head>
<body>
<h1>
    AJAX JSON Example
</h1>

<P>The time on server is ${serverTime}.</P>
<a href="rent-movies">Browse Movies</a>
<br>
<a id="test-ajax-link" href="#">Test Ajax</a>

<div id="save-modal" class="modal-dialog">
    <div>
        <a href="#close" title="close" class="close">X</a>

        <h2>Done</h2>

        <p>You just updated your profile.<br/>Here is your new information.</p>

        <div id="server-response"></div>
    </div>
</div>

</body>
</html>