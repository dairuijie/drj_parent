package org.drj_eureka_client.controller;
/**
 * 
 * @ClassName:  HelloController   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: drj 
 * @date:   2019年5月13日 上午10:33:46   
 *     
 * @Copyright: 2019 
 *
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drjClient")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "8889 HelloWorld!";
    }

}
