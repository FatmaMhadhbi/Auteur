package Auteur.ms.Auteur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuteurApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuteurApplication.class, args);
	}

}
