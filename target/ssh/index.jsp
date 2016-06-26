<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>添加图书</h2>
<form action="addBookAction.do" method="post">
    图书名称<input type="text" name="bname">
    <input type="submit" value="添加">
</form>

<br/>
<table border="1">
    <tr>
        <td>图书编号</td>
        <td>图书名称</td>
    </tr>
    <s:iterator id="book" value="list">
        <tr>
            <td><s:property value="#book.bid"/></td>
            <td><s:property value="#book.bname"/></td>
            <td>删除</td>
        </tr>
    </s:iterator>
</table>
</body>
</html>