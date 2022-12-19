package FinalProject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FinalProject.controller.Action;
import FinalProject.controller.ActionForward;
import FinalProject.model.DAO;
import FinalProject.model.productDTO;

public class productUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DAO dao = new DAO();
		productDTO dto = new productDTO();
		String id = request.getParameter("id");
		dto.setProduct_id(id);
		dto.setProduct_name(request.getParameter("product_name"));
		dto.setProduct_price(Integer.parseInt(request.getParameter("product_price")));
		dto.setProduct_description(request.getParameter("product_description"));
		System.out.println("reach1");
		//file 수정은 어떻게 하는 지 모름....
		
		boolean result = dao.productUpdate(id, dto);
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
