<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file ="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead  | Create</title>
</head>
<body>
<h1>Lead | Create</h1>
<form action="generate" method="post">
 <pre>
 First Name   :   <input type="text" name="firstName" placeholder="Firstname" value="${contact.firstName}"/>
 Last Name    :   <input type="text" name="lastName"  placeholder="lastname" value="${contact.lastName}"/>
 Email        :   <input type="text" name="email"  placeholder="email" value="${contact.email}"/>
 Mobile       :   <input type="text" name="mobile" placeholder="mobile" value="${contact.mobile}"/>
 Product Name :   <input type="text" name="productName" />
 Amount Paid  :   <input type="text" name="amount"  />

                  <input type="submit" value="generate bill"/>
                   
 </pre>
</form>


</body>
</html>