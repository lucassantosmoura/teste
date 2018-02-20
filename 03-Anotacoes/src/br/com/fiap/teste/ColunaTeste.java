package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotation.Coluna;
import br.com.fiap.bean.Aluno;

public class ColunaTeste {

	
public static void main(String[] args) {
	//Vai pegar a classe e vai entender o que eu fiz com ela
	
	//Instanciar um aluno
	
	Aluno aluno = new Aluno(1,"Lucas");
	
	//API de Reflection -> estrutura da classe
	//Recuperar o nome da class
	String classe = aluno.getClass().getName(); //é possível usar getSimpleName
	System.out.println(classe);
	
//Recuperar os métodos
	Method[] metodos = aluno.getClass().getDeclaredMethods();
	
	for(Method method : metodos) {
		//Exibe os nomes dos métodos
		System.out.println(method.getName());
	}
//Recuperar os atributos
	Field[] atributos = aluno.getClass().getDeclaredFields();
	for (Field field : atributos) {
		//Exibe o nome dos atributos
		System.out.println(field.getName());
	
		//Recuperar anotação @Coluna
		Coluna anotacao = field.getAnnotation(Coluna.class);
		
		System.out.println(anotacao.nome());
		
		
		
//Selecionar Tabela Aluno que está atrelada à classe aluno
	
		
//SELECT FROM TB_ALUNO WHERE cd_aluno>3		
		
		
		
		
//SELECT*FROM TB_ALUNO		
		
	}

	
	
	
	
	
	
}
	
}
