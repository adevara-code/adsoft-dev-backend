package com.adsoft.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

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
@ComponentScan("com.adsoft")
public class SwagerConfiguration {

	public static final Contact DEFAULT_CONTACT = new Contact(

			"ADSOFT", "https://twitter.com/ashoka_devara", "ashoka.devara89@gmail.com");

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(Predicates.not(PathSelectors.regex("/error"))).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		String description = "REST API Demo";
		return new ApiInfoBuilder().title("<h1>spring-boot-oracle-rest-crud-example</h1>").description(description).termsOfServiceUrl("github")
				.license("ADSOFT").licenseUrl("").version("1.0")
				// .contact(new Contact("ashoka"))
				.build();
	}
}