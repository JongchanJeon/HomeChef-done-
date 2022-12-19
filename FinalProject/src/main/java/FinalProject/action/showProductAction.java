package FinalProject.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.DTO;
import FinalProject.model.productDTO;

public class showProductAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		DAO dao = new DAO();
		productDTO dto = new productDTO();


		ArrayList<productDTO> products = (ArrayList<productDTO>) dao.showProducts();

		
		HttpSession session = request.getSession();

		session.setAttribute("Products", products);
		
		ActionForward forward = new ActionForward();
		
		boolean result = true;
		forward.setRedirect(false);
		if(result == true) {
			forward.setPath("/com/yju/2wda/2101198/controller/view/product/productList.jsp");
		}else {
			forward.setPath("/com/yju/2wda/2101198/controller/view/etc/error.jsp");
		}
		
		return forward;
	}

}
