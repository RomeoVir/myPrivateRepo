package it.myspringapp.scope;

import org.springframework.context.annotation.*;

public class Container {

	@Bean
	@Scope("singleton")
	public Persona personaSingleton() {
		return new Persona();
	}

	@Bean
	@Scope("prorotype")
	public Persona personaPrororype() {
		return new Persona();
	}

//	@Bean
//	@RequestScope
//	public Persona requestScopedBean() {
//		return new Persona();
//	}
	
//	@Bean
//	@sessioScope
//	public Persona sessionScopedBean() {
//		return new Persona();
//	}
	
//	@Bean
//	@ApplicationScope
//	public Persona rapplicationScopedBean() {
//		return new Persona();
//	}
}
