package br.com.apiRedis.APIREDIS.applications;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

public class OpenApiConfig {
	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI().info(new Info().title("Api para criar e buscar info no Redis").description("API para criar e buscar funcionario")
				.contact(new Contact().name("Gabriel Watanabe Pereira").email("gabrielpereira569@hotmail.com")

				).version("1.0.0"));
	}
}
