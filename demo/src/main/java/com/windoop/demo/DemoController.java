package com.windoop.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {
    @RequestMapping("/demo")
    public String get(String id){
        if(id==null) id = "!";
        return "Hello" + id;
    }

}
