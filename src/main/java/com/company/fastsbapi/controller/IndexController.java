package com.company.fastsbapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author medal
 * @create 2020-05-03 15:34
 **/
@Controller
public class IndexController {

    @RequestMapping("layuiIndex")
    public String layuiIndex(){
        return "layuiDemo/index";
    }

    @RequestMapping("bootstrapIndex")
    public String bootstrapIndex(){
        return "bootstrapDemo/index";
    }
}
