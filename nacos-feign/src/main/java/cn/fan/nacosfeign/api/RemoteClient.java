package cn.fan.nacosfeign.api;

import cn.fan.nacosfeign.hystrix.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nacos-provide",fallback = RemoteHystrix.class)
public interface RemoteClient {
    @GetMapping("/hello")
    String helloNacos();
}
