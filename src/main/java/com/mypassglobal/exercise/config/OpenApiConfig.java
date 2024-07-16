package com.mypassglobal.exercise.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.utils.SpringDocUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    static {
        SpringDocUtils.getConfig().addAnnotationsToIgnore(
                org.springframework.context.annotation.Configuration.class,
                org.springframework.boot.autoconfigure.SpringBootApplication.class
        );
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("api")
                .pathsToMatch("/mypass/v1/projects/**") // Adjust the path as per your API endpoints
                .build();
    }
}
