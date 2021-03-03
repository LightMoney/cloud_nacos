package cn.fan.security1.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SecurityTestController {
    @GetMapping("/getLogin")
    public String test1(){
        log.info("登陆成功");
        return "success";
    }
}
