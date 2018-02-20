package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	
	
	private float taxa;
	
	public static final float RENDIMENTO = 0.005f;
	
	
	
	//MÉTODOS SOLICITADOS
	public static String depositar(double valor, double saldo) {
		saldo = saldo+valor;
		return"Valor depositado com sucesso!";
	}

	public static double calculaRetornoInvestimento(double rendimento, double saldo) {
	
		return saldo*rendimento;
		
	
	}
	
	public double  retirar(double valor)throws Exception {
		if(valor>saldo) {
			throw new Exception("Saldo Insulficiente");
		}
		return saldo -= valor + taxa;
	
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public static float getRendimento() {
		return RENDIMENTO;
	}

	public ContaPoupanca(float taxa) {
		super();
		this.taxa = taxa;
	}

	public ContaPoupanca(int agencia, int número, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, número, dataAbertura, saldo);
		this.taxa = taxa;
	}

	@Override
	public double calculaRetornoInvestimento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
