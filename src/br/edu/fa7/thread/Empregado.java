package br.edu.fa7.thread;

public class Empregado {

	public String nome;;
	
	private double salarioLiquido;
	
	private double salarioBruto;
	
	private double comissao;
	
	public Empregado(String nome,double Comissao,double salLiquido)
	{
		this.comissao = Comissao;
		this.salarioLiquido = salLiquido; 
	}
	
	public double getSalarioLiquido(){
		return this.salarioLiquido;
	}
	public double getComissao(){
		return this.comissao;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
