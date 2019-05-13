package org.drj_eureka_consumer.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @ClassName:  RestConfig   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: drj 
 * @date:   2019年5月13日 上午11:07:08   
 *     
 * @Copyright: 2019 
 *
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
