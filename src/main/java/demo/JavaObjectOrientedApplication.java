package demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JavaObjectOrientedApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(JavaObjectOrientedApplication.class)
				.web(WebApplicationType.SERVLET)
				.run(args);
	}
}
