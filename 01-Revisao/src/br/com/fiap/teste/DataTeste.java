package br.com.fiap.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataTeste {

	public static void main(String[] args) {
		//Criar uma data
		Calendar hoje = Calendar.getInstance();//método estático
		//Criar um formatador de data
		SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
		//Imprimir a data
		System.out.println(fm.format(hoje.getTime()));
//Quando formata vira String
		
		
		//String => Data
		String carnaval = "13/02/2018";
		try {
		System.out.println(fm.parse(carnaval));
		
	}catch(ParseException e){
		e.printStackTrace();
	}

		
		//Criar um objeto com uma data específica
		Calendar formatura = new GregorianCalendar(2018,Calendar.DECEMBER,2);
		//Imprimir a Data
		System.out.println(fm.format(formatura.getTime()));
		
}
}
