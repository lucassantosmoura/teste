package br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta {

	private  TipoConta tipo;
	


	
public TipoConta getTipo() {
		return tipo;
	}
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	


public double retirar(double valor) throws Exception {
	if(tipo==TipoConta.COMUM && saldo<=valor ) {
	throw new Exception("Imposível realizar retirada! Seu saldo ficará negativo!");
	}else {
		saldo = saldo-valor;
	}return saldo;
	
	}


public ContaCorrente() {
	super();
	// TODO Auto-generated constructor stub
}
public ContaCorrente(int agencia, int número, Calendar dataAbertura, double saldo) {
	super(agencia, número, dataAbertura, saldo);
	// TODO Auto-generated constructor stub
}
public ContaCorrente(int agencia, int número, Calendar dataAbertura, double saldo, TipoConta tipo) {
	super(agencia, número, dataAbertura, saldo);
	this.tipo = tipo;
}
@Override
public double depositar(double valor) {
	// TODO Auto-generated method stub
	return 0;
}

}

