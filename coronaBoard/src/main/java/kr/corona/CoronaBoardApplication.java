package kr.corona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@PropertySource(value = {"classpath:application.naver.properties"})
public class CoronaBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaBoardApplication.class, args);
	}

}
