package FinalProject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.DTO;

public class pointAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DAO dao = new DAO();
		DTO dto = new DTO();
		
		HttpSession session = request.getSession();
		String login_id = (String)session.getAttribute("login_id");
		
		dto.setLogin_id(login_id);
		dao.getPoint(login_id, dto);
		int point = dto.getPoint();
		session.setAttribute("user_point", point);
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);

		forward.setPath("/com/yju/2wda/2101198/controller/view/user/point.jsp");

		return forward;
	}

}
