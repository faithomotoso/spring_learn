package com.exmp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloFormController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "hello-form-processed";
    }
}
