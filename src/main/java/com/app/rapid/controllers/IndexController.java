package com.app.rapid.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 06-03-2020
 * Time: 12:26
 * inside the package - com.app.rapid.controllers
 * To change this template use File | Settings | File and Code Templates.
 */
@Controller
public class IndexController {
    @RequestMapping({"/", ""})
    public String index(){
        return "index";
    }
}
