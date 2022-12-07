package FinalProject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.DTO;

public class userDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DAO dao = new DAO();
		DTO dto = new DTO();
		HttpSession session = request.getSession();
		String loginUser_id = (String) session.getAttribute("login_id");
		
		boolean result = dao.userDelete(dto, loginUser_id);
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		if(result == true) {
			session.setAttribute("login_now", "false");
			session.setAttribute("login_id", "");
			session.setAttribute("login_pw", "");
			forward.setPath("/index.jsp");
		}else {
			forward.setPath("/com/yju/2wda/2101198/controller/view/etc/error.jsp");
		}
		return forward;

	}

}
