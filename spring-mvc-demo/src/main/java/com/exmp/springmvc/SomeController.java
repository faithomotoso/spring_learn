package com.exmp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {

    @RequestMapping("/show-form")
    public String displayForm() {
        return "hello-form";
    }
}
