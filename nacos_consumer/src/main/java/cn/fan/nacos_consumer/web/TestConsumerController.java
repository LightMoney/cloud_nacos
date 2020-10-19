package cn.fan.nacos_consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 使用ribbon实现负载均衡的时候，服务名称不能用下划线，换成中划线
     * @return
     */
    @GetMapping("/consumer")
    public String test1() {
        return restTemplate.getForObject("http://nacos-provide/hello",String.class);
    }
}
