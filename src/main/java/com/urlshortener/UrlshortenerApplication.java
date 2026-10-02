package com.urlshortener;

import com.urlshortener.config.AppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class UrlshortenerApplication {
    private static final Logger log = LoggerFactory.getLogger(UrlshortenerApplication.class);

    public static void main(String[] args) {
        log.info("Starting URL shortener application");
        SpringApplication.run(UrlshortenerApplication.class, args);
    }
}
