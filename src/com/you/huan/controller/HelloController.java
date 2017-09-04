package com.you.huan.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;

/**
 * 基于注解的控制器，可以同时处理多个请求动作，并且无需实现任何接口
 */
@Controller
@RequestMapping(value = "/Hello")
public class HelloController{
    private static final Log logger = LogFactory.getLog(HelloController.class);

    /**
     * 基于注解的请求动作，此动作响应 /hello
     * RequestMapping 是映射属性，
     * 1、value是默认属性，也就是映射URL；
     * 2、其还可以设置method属性，来处理请求方式，例如：
     * @RequestMapping(value = "/hello",method=RequestMethod.POST)
     * 3、其实它还支持多个请求方式，只需这样写：method={RequestMethod.POST,RequestMethod.GET}
     * 4、consumes属性
     * 指定处理请求的提交内容类型（Content-Type）。@RequestMapping(value = "/hello",method=RequestMethod.POST,consumes="application/json")
     * 5、produces属性
     * 指定返回的内容类型，返回的内容类型必须是request请求头中所包含的类型
     * @RequestMapping(value = "/hello",method=RequestMethod.POST,produces="application/json")
     * 6、params属性
     * 指定请求中必须包含某些参数才会让方法处理
     * @RequestMapping(value = "/hello",method=RequestMethod.POST,params="mayParam=myParam")
     * 7、headers属性
     * 指定请求中必须包含某些指定的header值，才让方法处理
     *
     *
     * 请求处理方法中，需要访问HttpServletRequest  HttpSession，就只需把这些当做方法的参数即可
     *
     * @return
     */
    @RequestMapping(value = "/hello")
    public ModelAndView hello(){
        logger.info("handleRequest 被调用啦！");
        ModelAndView view = new ModelAndView();
        view.addObject("message","Hello JavaEE World!");
        view.setViewName("/WEB-INF/views/welcome.jsp");
        return view;
    }


}
