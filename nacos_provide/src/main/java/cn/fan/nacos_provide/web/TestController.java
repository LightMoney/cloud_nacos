package cn.fan.nacos_provide.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public  String testProvide(){
        return "hello";
    }

    @GetMapping("/relevance")
    public  String testRe(){ return  "relevance";}
}
