package com.iocc.mvc.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iocc.mvc.entity.Information;
import com.iocc.mvc.util.HttpServletRequestUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorld {

    private static final String HAHA = "test";
    @RequestMapping(value = "/gethello", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> getHello() {
        Map<String, Object> modleMap = new HashMap<String, Object>();
        System.out.println("成功");


        return modleMap;
    }

    @RequestMapping(value = "/xixihello",method = RequestMethod.POST)
    @ResponseBody
    private Map<String,Object> testModel(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        String userStr = HttpServletRequestUtil.getString(request, "userStr");
        ObjectMapper mapper = new ObjectMapper();
        try {
            Information information = mapper.readValue(userStr,Information.class);
            System.out.println(information);
            modelMap.put("success",false);
            modelMap.put("errMsg","错误");
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }

        return modelMap;
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    private String test(HttpServletRequest request){
        request.setAttribute("name","张三");
        request.setAttribute("role","管理员");
        return HAHA;
    }
}
