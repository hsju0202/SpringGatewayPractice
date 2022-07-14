package com.example.demoserver1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo1")
@RestController
public class DemoServer1Controller {

    @GetMapping("")
    public String demo1() {
        return "demo1";
    }
}
