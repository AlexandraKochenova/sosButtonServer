package com.kochenovaas.sosbutton.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sosbutton")
public class CallController {


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getCaller(ModelMap model){
        return "hy";
    }
}
