package com.example.demoelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories(basePackages = "com.example.demoelasticsearch.elastic.repository")
@SpringBootApplication
public class DemoElasticsearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoElasticsearchApplication.class, args);
    }

}
