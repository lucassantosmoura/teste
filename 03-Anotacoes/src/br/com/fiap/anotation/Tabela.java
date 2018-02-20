package br.com.fiap.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Anota��o fica presente at� a execu��o
@Retention(RetentionPolicy.RUNTIME)
//Anota��o � aplicada somente para atributos
@Target(ElementType.TYPE)//Atributos

public @interface Tabela {

		String nome();
		
	}



