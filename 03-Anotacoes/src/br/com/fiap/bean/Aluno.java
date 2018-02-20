package br.com.fiap.bean;

import br.com.fiap.anotation.Coluna;
import br.com.fiap.anotation.Tabela;

@Tabela(nome="TB_ALUNO")
public class Aluno {

	
	@Coluna(nome="cd_aluno")
	private int codigo;
	
	
	@Coluna(nome="nm_aluno")
	private String aluno;
	
	
	
	
	public Aluno() {
		super();
		
	}
	public Aluno(int codigo, String aluno) {
		super();
		this.codigo = codigo;
		this.aluno = aluno;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	
	
	
}
