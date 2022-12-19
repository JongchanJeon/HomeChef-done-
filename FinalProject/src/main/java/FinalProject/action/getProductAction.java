package FinalProject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.productDTO;
//상품 수정페이지에 자동으로 상품 정보가 담김
public class getProductAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DAO dao = new DAO();
		productDTO dto = new productDTO();
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		productDTO getDTO = dao.getProduct(id, dto);
		session.setAttribute("getProduct", getDTO);

		ActionForward forward = new ActionForward();
		
		boolean result = true;
		forward.setRedirect(false);
		if(result == true) {
			forward.setPath("/com/yju/2wda/2101198/controller/view/product/updateItem.jsp");
		}else {
			forward.setPath("/com/yju/2wda/2101198/controller/view/etc/error.jsp");
		}
		
		return forward;
	}

}
