package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    // @Bean
    // public GroupedOpenApi publicApi() {
    //     return GroupedOpenApi.builder()
    //             .group("springshop-public")
    //             .pathsToMatch("/public/**")
    //             .build();
    // }

    // @Bean
    // public GroupedOpenApi adminApi() {
    //     return GroupedOpenApi.builder()
    //             .group("springshop-admin")
    //             .pathsToMatch("/admin/**")
    //             .build();
    // }

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("SpringShop API")
                        .description("Spring shop sample application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringShop Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }


    // @Bean
    // public Docket api() {
    //   return new Docket(DocumentationType.OAS_30)
    //     .select()
    //     .apis(RequestHandlerSelectors.any())
    //     .paths(PathSelectors.any())
    //     .build()
    //     .pathMapping("/")
    //     .tags(new Tag("customers", "Swagger Customer Controller"))
    //     .apiInfo(metaData());
    // }

    // private ApiInfo metaData() {
    //   Contact contact = new Contact("Pilseong Heo", "", "heops79@gmail.com");

    //   return new ApiInfo(
    //     "Spring REST demo",
    //     "Spring Boot REST Demo",
    //     "1.0",
    //     "Terms of Service",
    //     contact,
    //     "Nothing",
    //     "No limitation",
    //     new ArrayList<>());
    // }
}
