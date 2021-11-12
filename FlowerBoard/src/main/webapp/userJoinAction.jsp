<%@ page language="java" contentType="text/html;
 charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.UserDTO"%>
<%@ page import="user.UserDAO"%>
<%@ page import="java.io.printWriter"%>
<!-- 자바스크립트 같은 걸 출력하고자 할 때 많이 사용하는 방식 -->

<%
	request.setCharacterEncoding("UTF-8");
	String userID = null;
	String userPW = null;
	if(request.getParameter("userID") != null)
%>