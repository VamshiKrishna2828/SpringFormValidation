<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Registration Form</title>
	<style>
 
    .error {
        color: #ff0000;
    }
</style>
</head>
<body>
	<h2 align="center">Registration Form</h2>
	<form:form modelAttribute="employee" method="POST">
	<form:input type="hidden" path="id" id="id"/>
	<table align="center">
		<tr>
			<td><label for="name"> Name : </label></td>
			<td><form:input path="name" id="name"/></td>
			<td><form:errors path="name" cssClass="error"/></td>
		</tr>
		<tr>
			<td><label for="joiningDate">Joining Date : </label></td>
			<td><form:input path="joiningDate" id="joiningDate"/></td>
			<td><form:errors path="joiningDate" cssClass="error"/></td>
		</tr>
		<tr>
			<td><label for="salary">Salary : </label></td>
			<td><form:input path="salary" id="salary"/></td>
			<td><form:errors path="salary" cssClass="error"/></td>			
		</tr>
		<tr>
			<td><label for="ssn"> SSN : </label></td>
			<td><form:input path="ssn" id="ssn"/></td>
			<td><form:errors path="ssn" cssClass="error"/></td>
		</tr>
		 <tr>
                <td colspan="3">
                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" value="Update"/>
                        </c:when>
                        <c:otherwise>
                            <input type="submit" value="Register"/>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
	</table>
	</form:form>
	
</body>
</html>