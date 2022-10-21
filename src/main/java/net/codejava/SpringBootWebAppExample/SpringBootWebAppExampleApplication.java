package net.codejava.SpringBootWebAppExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringBootWebAppExampleApplication {
	@RequestMapping("/")
	public String welcome() {

		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppExampleApplication.class, args);
	}

}
