package tr.gov.uyap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer {
	@Bean
	Docket api() {
	// @formatter:off
	  //Register the controllers to swagger
	  //Also it is configuring the Swagger Docket
	  return new Docket(DocumentationType.SWAGGER_2).select()
			  .apis(RequestHandlerSelectors.basePackage("tr.gov.uyap"))
			  .paths(PathSelectors.any())
			  .build()
			  .apiInfo(apiInfo())
			  ;
  // @formatter:on
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("başlık").description("açıklama")
				.version("versiyon 1").termsOfServiceUrl("http://terms-of-services.url")
				.license("lisans").licenseUrl("http://url-to-license.com")
				.contact(new Contact("John Doe", "www.example.com",
						"myeaddress@company.com"))
				.build();
		// @formatter:on
	}

}
