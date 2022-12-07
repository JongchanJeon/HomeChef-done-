package FinalProject.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.productDTO;

public class showProductAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DAO dao = new DAO();
		productDTO dto = new productDTO();
		
		ArrayList<Object> Products = new ArrayList();
		
		boolean result = dao.showProducts(Products);
		
		System.out.println(Products);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		if(result == true) {
			forward.setPath("/com/yju/2wda/2101198/controller/view/user/userManagement.jsp");
		}else {
			forward.setPath("/com/yju/2wda/2101198/controller/view/etc/error.jsp");
		}
		// return 값을 줘서 jsp 파일에서 어떻게 처리하는지 모름
		return Products;
	}

}
