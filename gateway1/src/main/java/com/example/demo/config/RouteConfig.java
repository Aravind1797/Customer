package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes()
                .route("CustomerApp", rt -> rt.path("/DashBoard/AddingCustomer/**")
                        .uri("http://localhost:8082/"))
                .route("acc", rt -> rt.path("/EntryPoint/**")
                        .uri("http://localhost:8068/"))
                .route("Account", rt -> rt.path("/DashBoard/CustomerDetails/**")
                        .uri("http://localhost:8082/"))
                .build();

    }
}