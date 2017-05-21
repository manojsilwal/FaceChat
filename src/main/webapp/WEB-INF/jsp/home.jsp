<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

    <head>

        <title>Hello World!</title>

    </head>

    <body>

        <h1>Hello <b><c:out value="${pageContext.request.remoteUser}"/></b> </h1>

        <form action="/logout" method="post">

            <input type="submit" value="Sign Out"/>

            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        </form>

    </body>

</html>