<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultados</title>
</head>
<body bgcolor="#FFFFCC">
<h1>Calculadora aritmética</h1>
<%@taglib uri="/struts-tags" prefix="s"%>
operando:<s:property value="operation"/><br>
Primer número:<s:property value="num1"/><br>
Segundo numero:<s:property value="num2"/><br>
resultado:<s:property value="result"/><br>
<a href="../index.jsp"><input type="button" value="regreso" οnclick="javascript:history.back();"></a>
</body>
</html>
