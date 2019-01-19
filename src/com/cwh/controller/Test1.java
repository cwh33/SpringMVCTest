package com.cwh.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Test1 implements Controller {
    private  static Log logger = LogFactory.getLog(Test1.class);
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        if (logger!=null){
            System.out.println("heandleRepuest被调用!!!");
        }
        logger.info("heandleRepuest被调用!!!");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Spring MVC is a great things!");
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
