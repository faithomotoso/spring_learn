package com.exmp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloFormController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "hello-form-processed";
    }

    @RequestMapping("/processFormV2")
    public String processFormV2(HttpServletRequest request, Model model) {
        String nameUpper = request.getParameter("studentName").toUpperCase();

        model.addAttribute("message", nameUpper);

        return "hello-form-processed";
    }

    @RequestMapping("/processFormV3")
    public String processFormV3(
            @RequestParam("studentName") String theName,
            Model model) {
        theName = theName.toUpperCase();

        String message = "Ahoy! " + theName;

        model.addAttribute("message", message);

        return "hello-form-processed";
    }
}
