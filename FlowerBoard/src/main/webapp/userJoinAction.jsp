<%@ page language="java"
 contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="user.UserDTO"
		 import="user.UserDAO"
		 import="java.io.PrintWriter" %>
<!-- 자바스크립트 같은 걸 출력하고자 할 때 많이 사용하는 방식 -->

<%
	request.setCharacterEncoding("UTF-8");
	String userID = (String)request.getParameter("userID");
	String userPW = (String)request.getParameter("userPW");
	
	if(userID == null || userPW == null) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('사용할 아이디, 패스워드를 입력하세요.');");
		script.println("history.back();"); //이전 화면으로 복귀
		script.println("</script>");
		script.close();
		return;
	}
	UserDAO userDAO = new UserDAO();
	int result = userDAO.join(userID, userPW);
	if (result == 1) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('회원가입을 완료하였습니다.');");
		script.println("location.href = 'index.jsp';"); //메인으로
		script.println("</script>");
		script.close();
		return;
	}
%>