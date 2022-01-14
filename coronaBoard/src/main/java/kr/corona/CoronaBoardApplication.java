package kr.corona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CoronaBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaBoardApplication.class, args);
	}

}
