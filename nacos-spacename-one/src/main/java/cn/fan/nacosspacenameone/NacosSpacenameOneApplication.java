package cn.fan.nacosspacenameone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@RefreshScope//动态更新
@SpringBootApplication
public class NacosSpacenameOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpacenameOneApplication.class, args);
    }

    @Value("${nacos.config}")
    private String config;

    @GetMapping("/getValue")
    public String getValue() {
        return config;
    }
}
