package cn.fan.nacosfeign.web;

import cn.fan.nacosfeign.api.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private RemoteClient remoteClient;

    @GetMapping("/feign")
    public String test() {
        return remoteClient.helloNacos();
    }

    @GetMapping("/rele")
    public  String testRe(){
        return remoteClient.testRe();
    }
}
