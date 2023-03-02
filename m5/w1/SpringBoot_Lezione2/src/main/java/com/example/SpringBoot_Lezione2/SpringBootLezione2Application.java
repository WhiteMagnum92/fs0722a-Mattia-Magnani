package com.example.SpringBoot_Lezione2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.SpringBoot_Lezione2.classes.Box;
import com.example.SpringBoot_Lezione2.configuration.ConfigurationBox;

@SpringBootApplication
public class SpringBootLezione2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLezione2Application.class, args);
		
		appBeanBox();
	}

	public static void appBeanBox() {
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationBox.class);
		
		Box b1 = (Box) appCtx.getBean("box");
		System.out.println(b1.getArea());
		System.out.println(b1.getPerimeter());
		
		Box b2 = (Box) appCtx.getBean("boxProp");
		System.out.println(b2.getArea());
		System.out.println(b2.getPerimeter());
		
		((ConfigurableApplicationContext) appCtx).close();
	}
	
}
