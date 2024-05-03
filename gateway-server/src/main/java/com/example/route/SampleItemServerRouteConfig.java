package com.example.route;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class SampleItemServerRouteConfig {

    @Bean
    public RouterFunction<ServerResponse> getUserServerRoute() {
        return GatewayRouterFunctions.route("item-server")
                .route(
                        RequestPredicates.path("/item-api/**"),
                        HandlerFunctions.http("http://localhost:8081"))
                .build();
    }
}
