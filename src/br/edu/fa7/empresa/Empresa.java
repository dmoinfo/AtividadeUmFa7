package br.edu.fa7.empresa;

import java.util.ArrayList;

public class Empresa {

	private String nome;
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	double percentTerceirizadosPermitidos = 0.3;
	int terceirizadosPermitidos = 0;
	int vagasUtilizadas = 0;
	
	public Empresa(String nome) {
		this.nome = nome;
	}

	public void admitirFuncionario(Funcionario f) {
		calculaNumFuncionarios();
		if ( ( f instanceof Funcionario ) && !( f instanceof Terceirizado ) ) {
			funcionarios.add(f);
			System.out.println("Funcionário " + f.getNome() + ": " + f.getMatricula() + " contratado");
		}else if ( terceirizadosPermitidos > 0 ) {
			funcionarios.add(f);
			vagasUtilizadas++;
			System.out.println("Terceirizado " + f.getNome() + ": " + f.getMatricula() + " contratado");
		}else {
			System.out.println("Terceirizado " + f.getNome() + " não pode ser contratado");
		}
	}


	public void demitirFuncionario(int matricula) {
		for (Funcionario f : funcionarios) {
			if (f.getMatricula() == matricula) {
				funcionarios.remove(f);
				System.out.println("Funcionário demitido");
				break;
			}
		}
	}

	public void pagarFuncionarios() {
		for (Funcionario funcionario : funcionarios) {
			funcionario.receberSalario(funcionario.getNome());
		}
	}

	/*
	 * Verifica a quantidade de vagas para a admissão de terceirizados
	 */
	private void calculaNumFuncionarios() {
		int totalFuncionarios = 0;
		for (Funcionario f : funcionarios) {
			if (!(f instanceof Terceirizado)) {
				totalFuncionarios++;
			}
		}
		terceirizadosPermitidos = (int) Math.round(totalFuncionarios
				* percentTerceirizadosPermitidos)
				- vagasUtilizadas;
	}
}
