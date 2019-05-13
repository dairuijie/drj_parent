package org.drj_eureka_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @ClassName:  ConsumerController   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: drj 
 * @date:   2019年5月13日 上午10:42:13   
 *     
 * @Copyright: 2019 
 *
 */
@RestController
@RequestMapping("drjConsumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/hello")
    public ResponseEntity<String> hello() {
       return restTemplate.getForEntity("http://eureka-client/drjClient/hello", String.class);
    }
    
}
