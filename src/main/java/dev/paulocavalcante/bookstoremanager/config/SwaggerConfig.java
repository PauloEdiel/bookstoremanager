package dev.paulocavalcante.bookstoremanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "dev.paulocavalcante.bookstoremanager";
    private static final String API_TITLE = "Book Store Manager";
    private static final String API_DESCRIPTION = "API do Curso de Spring BookStoreMAnager";
    private static final String API_VERSION = "1.0.0";
    private static final String API_CONTACT_NAME = "Paulo Cavalcante";
    private static final String API_CONTACT_GITHUB = "https://github.com/PauloEdiel";
    private static final String API_CONTACT_EMAIL = "pauloediel.cavalcante@gmail.com";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(BuildApiInfo());
    }

    private ApiInfo BuildApiInfo() {
        return new ApiInfoBuilder()
            .title(API_TITLE)
            .description(API_DESCRIPTION)
            .version(API_VERSION)
            .contact(new Contact(API_CONTACT_NAME, API_CONTACT_GITHUB, API_CONTACT_EMAIL))
            .build();
    }
}
