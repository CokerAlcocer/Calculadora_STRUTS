<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Calculadora</title>
</head>
<body bgcolor="#FFFFCC">
<h1>Calculadora aritmética</h1>
<s:form action="Calculate">
    Primer número:<s:textfield name="num1"/>
    <span style="color: red; ">
        <s:property value="errors['num1'][0]" />
    </span><br>
    Segundo numero:<s:textfield name="num2"/>
    <span style="color: red; ">
        <s:property value="errors['num2'][0]" />
    </span><br>
    <s:submit value="mas"  name="operation"/>
    <s:submit value="menos"  name="operation"/>
    <s:submit value="multi"  name="operation"/>
    <s:submit value="div"  name="operation"/>
</s:form>
</body>
</html>