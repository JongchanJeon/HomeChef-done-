package FinalProject.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.productDTO;

public class getCartAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DAO dao = new DAO();
		productDTO dto = new productDTO();
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		
		if(session.getAttribute("cart") == null){
			ArrayList<String> products = new ArrayList();
			session.setAttribute("cart", products);
		}
		
		ArrayList realCart = (ArrayList) session.getAttribute("cart");
		realCart.add(id);
		session.setAttribute("cart", realCart);
		System.out.println("cart size : " + realCart.size());
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


