package net.mvc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mvc.model.BuserDto;
import net.mvc.model.GogekDto;
import net.mvc.model.SawonDto;
import net.mvc.model.UserManaget;

public class ViewAction implements Controller{
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		String userid = request.getParameter("userid");
	
		
	    ArrayList<SawonDto> dto = UserManaget.instance().findUser(userid);
		request.setAttribute("user", dto);
		
		ArrayList<GogekDto> dto2 = UserManaget.instance().findUser2();
		request.setAttribute("user2", dto2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setPath("userview.jsp");
		modelAndView.setRedirect(false);
		return modelAndView;
	}
}
