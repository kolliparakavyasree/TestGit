package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MathsController extends MultiActionController {
	
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("ans",n1+n2);
		return mv;
	}
	
	public ModelAndView sub(HttpServletRequest request,HttpServletResponse response) {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("ans",n1-n2);
		return mv;
	}
	
}
