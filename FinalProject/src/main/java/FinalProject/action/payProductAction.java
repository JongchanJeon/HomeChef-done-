package FinalProject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.DTO;

public class payProductAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		DAO dao = new DAO();
		DTO dto = new DTO();
		
		String loginUser_id = (String) session.getAttribute("login_id");
		
		dto.setUser_id(loginUser_id);
		dao.readUserInfo(dto);
		System.out.println(dto.getUser_address());
		session.setAttribute("loginUser_pw", dto.getUser_pw());
		session.setAttribute("loginUser_number", dto.getUser_number());
		session.setAttribute("loginUser_name", dto.getUser_name());
		session.setAttribute("loginUser_address", dto.getUser_address());
		session.setAttribute("login_point", dto.getPoint());
		String id = request.getParameter("id");
		String login_id = (String) session.getAttribute("login_id");
		
		dto.setUser_id(login_id);
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		
		forward.setPath("/com/yju/2wda/2101198/controller/view/product/buyProduct.jsp?id=" + id);
		
		return forward;
	}

}
