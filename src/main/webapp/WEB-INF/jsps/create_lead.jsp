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
<form action="savelead" method="post">
 <pre>
 First Name   :   <input type="text" name="firstName" placeholder="Firstname"/>
 Last Name    :   <input type="text" name="lastName"  placeholder="lastname"/>
 Email        :   <input type="text" name="email"  placeholder="email"/>
 Lead Source  :   <select name="leadSource" >
                      <option value="TV ">TV</option>
                      <option value="Radio">Radio</option>
                      <option value="Newapaper">Newspaper</option>
                      <option value="Online">Online</option>
                  </select>
 Mobile       :   <input type="text" name="mobile"/ placeholder="mobile">
                  <input type="submit" value="save"/>
                   
 </pre>
</form>


</body>
</html>