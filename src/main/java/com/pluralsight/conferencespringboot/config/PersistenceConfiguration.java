package com.pluralsight.conferencespringboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    @Bean
    public DataSource dataSource() {
        final DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(dbUrl);
        builder.username(dbUsername);
        builder.password(dbPassword);
        System.out.println("My custom data source bean has been initialized and set!");
        return builder.build();
    }
}
