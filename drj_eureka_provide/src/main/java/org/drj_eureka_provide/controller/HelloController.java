package org.drj_eureka_provide.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName: HelloController
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: drj
 * @date: 2019年5月13日 下午1:57:11
 * 
 * @Copyright: 2019
 *
 */
@RestController
@RequestMapping("/drjClient")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "8887 HelloWorld";
    }
}
