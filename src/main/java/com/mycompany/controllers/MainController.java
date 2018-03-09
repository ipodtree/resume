package com.mycompany.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("email", "mailto:dqclement@gmail.com");
        model.put("facebook", "https://www.facebook.com/china.dq");
        model.put("weibo", "https://www.weibo.com/1671635441");
        model.put("linkedin", "https://www.linkedin.com/in/qiading");
        model.put("github", "https://www.github.com/ipodtree");
        return "index";
    }

}
