<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
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
消息: <input type="text" id="msg" />
<button onclick="send();" >发送消息</button>
</body>
<script>
    function init() {
        dwr.engine.setActiveReverseAjax(true);//激活反转
        dwr.engine.setNotifyServerOnPageUnload(true);
        SendMessage.onPageLoad("1");
    }
    window.onload = init;
    function send() {
        var msg = $('#msg').val();
        SendMessage.sendMsg('1', msg, 'receiveMsg');
    }
    function receiveMsg(msg) {}
</script>
</html>
