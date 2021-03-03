package cn.fan.nacosfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nacos-provide")
public interface RemoteClient {
    @GetMapping("/hello")
    String helloNacos();

    @GetMapping("/relevance")
    String testRe();
}
