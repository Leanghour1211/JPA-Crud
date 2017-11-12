/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author Leanghour
 */
@Configuration
@EnableSwagger2
public class swaggerConfig extends WebMvcConfigurerAdapter{
    @Bean
	public Docket api(){
		return new Docket(DocumentationType.SPRING_WEB)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.jpa.crud"))
                                .paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	public ApiInfo apiInfo(){
		ApiInfo apiInfo=new ApiInfo(
				"Spring RestFull Service", 
				"Book Management", 
				"API Spring", 
				"All of Service", 
				"Leanghour", 
				"Homework", 
				"leang.hour.tang@outlook.com");
		return  apiInfo;
	}
        @Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/swagger/**").setViewName("swagger/swagger");
	}
}
