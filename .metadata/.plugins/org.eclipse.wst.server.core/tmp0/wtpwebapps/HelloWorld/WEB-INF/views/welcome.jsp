<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>hello from spring framework</h1>
<h3>${message}</h3>

 <c:if test="${!empty emplist}">
                        <br />
                        <center>
                                <table width="90%">
                                        <tr style="background-color: gray;">
                                                <th>Name</th>
                                                <th>Standard</th>
                                                <th>Age</th>
                                                <th>Sex</th>                                    
                                                 </tr>
                                        <c:forEach items="${emplist}" var="user">

                                                <tr style="background-color: silver;" >

                                                        <td><c:out value="${emplist.employeeId}"/></td>
                                                        <td><c:out value="${emplist.employeeName}"/></td>
                                                        <td><c:out value="${emplist.address}"/></td>
                                                        <td><c:out value="${emplist.city}"/></td>
                                                </tr>

                                        </c:forEach>

                                </table>
                                </center>

                        <br />

 

                </c:if>


</body>
</html>