package it.myspringapp.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.myspringapp.MySpringAppApplication;

@SpringBootTest
public class TestMyApp {

	@Autowired
	private MySpringAppApplication controller;

	@Test
	void contextLoads() {
		// Verifica avvio app
		assertThat(controller).isNotNull();
	}

//	@Test
//	void testMethod() {
//
//	}


}
