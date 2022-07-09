package project.janbarry.cacheservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI createOpenApi() {
        return new OpenAPI().info(new Info()
                .title("Cache API")
                .description("cache service")
                .version("v0.0.1"));
    }

}
