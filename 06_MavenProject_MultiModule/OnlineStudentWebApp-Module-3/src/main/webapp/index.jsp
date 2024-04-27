<%@page import="com.mea.service.*" %>
<html>
<body>
<h2>Hello World!</h2>

<%
 ArithmeticOperations op=new ArithmeticOperations();
int result=op.sum(101, 202);
%>
<h1>From Module-3: Sum is::<%=result %> </h1>
</body>
</html>
