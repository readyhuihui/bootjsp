package com.readyhuihui.testjsp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2019/9/2 9:38
 */
@Controller
public class HelloController {


    @GetMapping({"/", "/sayhello"})
    public String sayhello(Model model) {
        model.addAttribute("name", "你好boot jsp");
        return "hello";
    }
}
