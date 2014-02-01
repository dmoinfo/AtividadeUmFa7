package br.edu.fa7.empresa.thread;

import java.util.ArrayList;

public class Empregado {
	
	private String nome;
	private double salarioLiquido;
	private double comissao;
	
	public Empregado(String nome, double salario, double comissao) {
		this.nome = nome;
		this.salarioLiquido = salario;
		this.comissao = comissao;
	}
	
	public Empregado() {
		
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
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

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	/**
	 * Método sobrecarregado para receber um ArrayList de Empregrados
	 * @param empregados
	 * @return
	 */
	public double getComissao(ArrayList<Empregado> empregados) {
		int quantidade = 0;
		for (Empregado empregado : empregados) {
			if (calculaComissao(empregado.getSalarioLiquido(), empregado.getComissao())) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	private boolean calculaComissao(double salario, double comissao) {
		
		double porcentagem = (comissao * 100) / salario;
		
		return porcentagem < 20 ? true : false;
	}
}
