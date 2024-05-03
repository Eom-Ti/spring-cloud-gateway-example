package com.example.route;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class SampleUserServerRouteConfig {

    @Bean
    public RouterFunction<ServerResponse> getUserServerRoute() {
        return GatewayRouterFunctions.route("user-server")
                .route(
                        RequestPredicates.path("/user-api/**"),
                        HandlerFunctions.http("http://localhost:8083"))
                .build();
    }
}
