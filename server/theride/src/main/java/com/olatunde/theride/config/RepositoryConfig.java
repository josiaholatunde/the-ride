package com.olatunde.theride.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class RepositoryConfig {

    @Value("${datasource.url}")
    private String dataSourceUrl;

    @Value("${datasource.user-name}")
    private String dataSourceUserName;

    @Value("${datasource.password}")
    private String dataSourcePassword;

    @Value("${datasource.driver-class-name}")
    private String dataSourceDriverClassName;

    @Value("${migrations.liquibase.change-log}")
    private String liquibaseChangelogPath;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(dataSourceUrl);
        dataSourceBuilder.username(dataSourceUserName);
        dataSourceBuilder.password(dataSourcePassword);
        dataSourceBuilder.driverClassName(dataSourceDriverClassName);
        return dataSourceBuilder.build();
    }

    @Bean
    public SpringLiquibase springLiquiBase() {
        SpringLiquibase springLiquibase = new SpringLiquibase();
        springLiquibase.setShouldRun(true);
        springLiquibase.setDataSource(dataSource());
        springLiquibase.setChangeLog(liquibaseChangelogPath);
        return springLiquibase;
    }
}