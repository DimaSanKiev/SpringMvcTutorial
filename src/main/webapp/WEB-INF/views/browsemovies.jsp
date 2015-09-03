<%-- Use this for the 'form' tag --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%-- This is the JSTL tag --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page session="false" %>
<html>
<head>
    <title>Browse Movies</title>
    <link rel="stylesheet" href="<c:url value='/resources/style.css'/> " type="text/css" media="screen, projection"/>
    <script type="text/javascript" src="<c:url value='/resources/jquery-1.9.1.js'/> "></script>
    <script type="text/javascript" src="<c:url value='/resources/vidrental.js'/> "></script>
</head>
<body>
<table id="hor-minimalist-a" border="0">
    <div class="container">
        <thead>
        <tr>
            <th colspan="4">
                <div class="span-17 append-7">
                    <h2>Browse Movies</h2>
                </div>
            </th>
        </tr>
        <tr>
            <th>
                <div class="span-4 border">
                    <p>Item</p>
                </div>
            </th>
            <th>
                <div class="span-8 border">
                    <p>Description</p>
                </div>
            </th>
            <th>
                <div class="span-4 border">
                    <p>Price</p>
                </div>
            </th>
            <th>
                <div class="span-4 append-4 last">
                    <p>&nbsp;</p>
                </div>
            </th>
            <th>
                <div class="span-17 append-7">

                </div>
            </th>
        </tr>
        </thead>
        <tbody>
        <form:form id="moviesForm" modelAttribute="userSelections" action="confirm" method="post">
            <c:forEach items="${items}" var="item">
                <tr>
                    <td>
                        <div class="span-4 border">
                            <p><c:out value="${item.name}"/></p>
                        </div>
                    </td>
                    <td>
                        <div class="span-8 border">
                            <p><c:out value="${item.description}"/></p>
                        </div>
                    </td>
                    <td>
                        <div class="span-4 border">
                            <p>&#36<c:out value="${item.price}"/></p>
                        </div>
                    </td>
                    <td>
                        <div class="span-4 append-4 last">
                            <p><form:checkbox path="selection" value="${item.id}"/></p>
                        </div>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="4">
                    <div class="prepend-12 span-4 append-12">
                        <a id="add-to-cart-link" href="#">Add to Cart</a>
                    </div>
                </td>
            </tr>
        </form:form>
        <tr>
            <td colspan="4">
                <div class="span-17 append-7">

                </div>
            </td>
        </tr>
        </tbody>
    </div>
</table>
<div id="info" class="success"></div>
<div id="error" class="error"></div>
<div id="results" style="display: inline-block"></div>
</body>
</html>