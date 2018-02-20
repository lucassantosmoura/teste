package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {
	
	
	
	
	private int agencia;
	private int n�mero;
private Calendar dataAbertura;
protected double saldo;



public Conta() {
	super();
	
}





public Conta(int agencia, int n�mero, Calendar dataAbertura, double saldo) {
	super();
	this.agencia = agencia;
	this.n�mero = n�mero;
	this.dataAbertura = dataAbertura;
	this.saldo = saldo;
}



public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public int getN�mero() {
	return n�mero;
}
public void setN�mero(int n�mero) {
	this.n�mero = n�mero;
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


//M�TODOS SOLICITADOS
public abstract double depositar(double valor);
	
public  double retirar(double valor)throws Exception {
	return saldo+=valor;
}
}
