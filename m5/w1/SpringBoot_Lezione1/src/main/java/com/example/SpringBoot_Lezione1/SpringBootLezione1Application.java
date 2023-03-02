package com.example.SpringBoot_Lezione1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import component.TestComponent;
import config_bean_XML.TestXml;
import config_bean_configuration.ConfigurationTest;
import config_bean_configuration.Test;

@SpringBootApplication
public class SpringBootLezione1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLezione1Application.class, args);
		
		configWithComponent();
	}
	
	public static void configWithBeans() {
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationTest.class);//vado a prendere il file di config per avere il contenitore di spring e dentro ci passo la classe di configurazione
		
		
		//recupero il bean
		
		Test t1 = (Test)appCtx.getBean("test");
		System.out.println((t1.saluta()));
		
		Test t2 = (Test)appCtx.getBean("test");
		t2.setNome("Luigi");
		System.out.println((t2.saluta()));
		
		((AbstractApplicationContext) appCtx).close();
	}
	
	public static void configWithXml() {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");
		
		//recupero il bean
		
				TestXml t1 = (TestXml)appCtx.getBean("TestXml");
				System.out.println((t1.saluta()));
				
				((AbstractApplicationContext) appCtx).close();
	}
	
	public static void configWithComponent() {
		
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		
		appCtx.scan("config_bean_component");
		appCtx.refresh();
		
		//recupero il bean
		
				TestComponent t1 = (TestComponent)appCtx.getBean("TestComponent");
				System.out.println((t1.saluta()));
		
	}

}
