<%--
  Created by IntelliJ IDEA.
  User: DarkAngel
  Date: 2018/3/24
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<%
    String path = request.getContextPath();
    String bathPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <script type="text/javascript" src="<%=bathPath %>/dwr/engine.js"></script>
    <script type="text/javascript" src="<%=bathPath %>/dwr/util.js"></script>
    <script type="text/javascript" src="<%=bathPath %>/dwr/interface/SendMessage.js"></script>
    <script type="text/javascript" src="<%=bathPath %>/js/imp/jquery-3.3.1.js"></script>
    <title>Title</title>
</head>
<body>
接收到的消息: <input type="text" id="msg" />
</body>
<script>
    function init() {
        dwr.engine.setActiveReverseAjax(true);//激活反转
        dwr.engine.setNotifyServerOnPageUnload(true);
        SendMessage.onPageLoad("1");
    }
    window.onload = init;
    function receiveMsg(msg) {
        $('#msg').val(msg);
    }
</script>
</html>
