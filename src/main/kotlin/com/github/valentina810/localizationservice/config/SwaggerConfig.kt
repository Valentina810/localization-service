package com.github.valentina810.localizationservice.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class SwaggerConfig {
    @Bean
    open fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("localization-service api")
                    .version("2025")
                    .contact(
                        Contact()
                            .email("valentinavasileva34@gmail.com")
                            .url("https://github.com/Valentina810")
                            .name("Valentina Kolesnikova")
                    )
            )
    }
}