package ThemePark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"controller", "setup"})
@EnableJpaRepositories(basePackages = {"dal"})
@EntityScan(basePackages = {"model"})
public class ThemeParkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThemeParkApplication.class, args);
	}

}
