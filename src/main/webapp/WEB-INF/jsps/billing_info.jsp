<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file ="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill info</title>
</head>
<body><h1>Bill Info</h1>
Id :${bill.id}<br>
First Name : ${bill.firstName}<br/>
Last  Name : ${bill.lastName}<br/>
email : ${bill.email}<br/>
Mobile :${bill.mobile}<br/>
Product Name :${bill.productName}<br/>
Amount :${bill.amount}<br/>

<a href="billing"> Billing</a>
 </body>
</html>