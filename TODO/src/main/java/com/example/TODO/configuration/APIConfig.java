package com.example.TODO.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class APIConfig {

    @Bean
    public Docket TodoAPIDocumentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfo("a","b","c","d",new Contact("name", "url", "skm@gmail.com"),"S K Mathur","Shubham license Url", Collections.emptyList()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }

}
