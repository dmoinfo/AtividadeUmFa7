package br.edu.fa7.empresa;

public class Funcionario implements Trabalhador{
	
	private String nome;
	private int matricula;

	@Override
	public void receberSalario() {
		System.out.println("Salário recebido");
	}
	
	public Funcionario(int matricula) {
		this.matricula = matricula;
	}
	
	public Funcionario(String nome, int matricula) {
		this(matricula);
		this.nome = nome;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
