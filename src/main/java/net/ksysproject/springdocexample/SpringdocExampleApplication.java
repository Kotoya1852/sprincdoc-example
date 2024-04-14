package net.ksysproject.springdocexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "KsysProject API",
		description = "KsysProject API IF仕様書",
		license = @License(identifier = "MIT License", url = "https://github.com/Kotoya1852/springdoc-example/blob/latest/LICENSE"),
		summary = "KsysProject API IF仕様書",
		version = "1.0.0"
	),
	servers = {
		@Server(
			url = "http://localhost:8080",
			description = "ローカル環境"
		)
	}
)
public class SpringdocExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdocExampleApplication.class, args);
	}

}
