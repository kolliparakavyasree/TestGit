package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sangeeta
 */
public class LoginRegisterController extends MultiActionController{
    public ModelAndView login(HttpServletRequest req, HttpServletResponse res){
        String uname=req.getParameter("uname");
       
        ModelAndView mv=new ModelAndView("welcome");
        mv.addObject("uname",uname);
        return mv;
        
                
    } 
    public ModelAndView register(HttpServletRequest req, HttpServletResponse res){
        String city =req.getParameter("city");
        
        ModelAndView mv=new ModelAndView("success");
        mv.addObject("city",city);
        return mv;
                
                
    }
}
