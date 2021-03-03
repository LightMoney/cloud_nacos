package cn.fan.nacosfeign.hystrix;

import cn.fan.nacosfeign.api.RemoteClient;
import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements RemoteClient {

    public String helloNacos() {
        return "请求超时了";
    }
}