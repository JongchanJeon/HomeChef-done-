package FinalProject.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.DTO;

public class userManagementAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		DAO dao = new DAO();
		DTO dto = new DTO();
		
//		ArrayList<Object> users = new ArrayList();
		ArrayList<DTO> users = (ArrayList<DTO>)dao.userManagement();
		
		
		HttpSession session = request.getSession();
		session.setAttribute("usersManagement", users);
		
		ActionForward forward = new ActionForward();
		
		boolean result = true;
		forward.setRedirect(false);
		if(result == true) {
			forward.setPath("/com/yju/2wda/2101198/controller/view/user/userManagement.jsp");
		}else {
			forward.setPath("/com/yju/2wda/2101198/controller/view/etc/error.jsp");
		}
		
		return forward;
	}

}
