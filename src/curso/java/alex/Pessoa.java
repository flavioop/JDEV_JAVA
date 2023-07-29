package curso.java.alex;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	private int idade;
	private Date dataNascimento;
	private Date dataNascimento2;
	private String rg;
	
		
	public Date getDataNascimento2() {
		return dataNascimento2;
	}

	public void setDataNascimento2(Date dataNascimento2) {
		this.dataNascimento2 = dataNascimento2;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	

}
