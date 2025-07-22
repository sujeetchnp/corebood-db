/*
	Q. How SpringBoot Application works internally?

	Steps:

	1. pom.xml --
		- Spring will not read pom.xml directly
		- maven will be responsible to add dependencies from pom.xml to classpath
	2. classpath (where all jar files are stored) - jar will be added to classpath
		- Spring will read jar file from classpath

	3. @SpringbootApplication
			Combination of :
				@EnableAutoConfiguration --> auto configuration trigger

				@Configuration --> beans are created inside this annotation

				@ComponentScan --. scans the package level
		// main function of the Class wil execute
 */


package com.spring.coreboot2;

import com.spring.coreboot2.controller.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class,
		JdbcTemplateAutoConfiguration.class
})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		MainController bean = context.getBean(MainController.class);
		bean.useTable();
	}

}
