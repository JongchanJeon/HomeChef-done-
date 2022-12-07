package FinalProject.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.DTO;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		DAO dao = new DAO();
		DTO dto = new DTO();
		
		//js alert 창을 위함
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		System.out.println("로그인 시도!");
		System.out.println("로그인 아이디" + request.getParameter("user_id"));
		System.out.println("로그인 비밀번호" + request.getParameter("user_pw"));
		
		String login_id = request.getParameter("user_id");
		String login_pw = request.getParameter("user_pw");
		dto.setUser_id(login_id);
		dto.setUser_pw(login_pw);
		
		boolean result = false;
		dao.tryLogin(dto, login_id, login_pw);
		System.out.println(dto.isCorrect_login());
		System.out.println(dto.getLogin_id());
		System.out.println(dto.getLogin_pw());
		if (dto.isCorrect_login()) {
			result = true;
			session.setAttribute("login_id", login_id);
			session.setAttribute("login_pw", login_pw);
			session.setAttribute("login_now", "true");
			System.out.println("세션등록" + dto.getLogin_type());
			session.setAttribute("login_type", dto.getLogin_type());
			System.out.println("세션등록 완료 로그인");
			System.out.println(session.getAttribute("login_id"));
			System.out.println(session.getAttribute("login_pw"));
			

			out.write("<script language='javascript'>");
			out.write("alert('로그인이 되었습니다.');");
			out.write("location.href='/FinalProject/index.jsp';");
			out.write("</script>");
			out.flush();
			out.close();
		}else {
			System.out.println("로그인 실패");
			out.write("<script language='javascript'>");
			out.write("alert('로그인을 실패하였습니다..');");
			out.write("location.href='/FinalProject/com/yju/2wda/2101198/controller/view/user/login.jsp';");
			out.write("</script>");
			out.flush();
			out.close();
		}
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		if(result == true) {
			forward.setPath("/index.jsp");
		}else {
			forward.setPath("/com/yju/2wda/2101198/controller/view/etc/error.jsp");
		}
		return forward;
	}

}
