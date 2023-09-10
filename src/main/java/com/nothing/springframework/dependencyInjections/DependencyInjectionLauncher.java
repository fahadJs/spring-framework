package com.nothing.springframework.dependencyInjections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionLauncher {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher.class)) {

//			Arrays.stream(context.getBeanDefinitionNames())
//					.forEach(System.out::println);

			System.out.print(context.getBean(BusinessCalculationService.class).findMax());
        }
	}

}
