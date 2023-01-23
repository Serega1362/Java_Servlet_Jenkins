<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.01.2023
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>The publisher has published a new post!</h1>
<h1>Testing JSP</h1>
<p>
    <%@ page import="publisher.Publisher,subcriber.Subscriber" %>

    <% Publisher publisher = new Publisher();
       Subscriber subscriber = new Subscriber();
       publisher.addSubscribers(subscriber);
       publisher.createNewMessage("New post!");
    %>
</p>
</body>
</html>
