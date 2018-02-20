package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {
	
	
	
	
	private int agencia;
	private int número;
private Calendar dataAbertura;
protected double saldo;



public Conta() {
	super();
	
}





public Conta(int agencia, int número, Calendar dataAbertura, double saldo) {
	super();
	this.agencia = agencia;
	this.número = número;
	this.dataAbertura = dataAbertura;
	this.saldo = saldo;
}



public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public int getNúmero() {
	return número;
}
public void setNúmero(int número) {
	this.número = número;
}
public Calendar getDataAbertura() {
	return dataAbertura;
}
public void setDataAbertura(Calendar dataAbertura) {
	this.dataAbertura = dataAbertura;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}


//MÉTODOS SOLICITADOS
public abstract double depositar(double valor);
	
public  double retirar(double valor)throws Exception {
	return saldo+=valor;
}
}
