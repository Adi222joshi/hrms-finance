package com.offerLeter3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;

@Configuration
@EnableSwagger2
public class EmployeeConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Hrms").apiInfo(apiInfo()).select()
				.paths(regex("/employee.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Employee Service")
				.description("Sample Documentation Generateed Using SWAGGER2 for our Hrms Rest API")
				.version("1.0").build();
	}
}
