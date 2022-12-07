package FinalProject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;

public class readProductAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		return null;
	}

}
