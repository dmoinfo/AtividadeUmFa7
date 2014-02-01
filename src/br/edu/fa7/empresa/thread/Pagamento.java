package br.edu.fa7.empresa.thread;

import java.util.ArrayList;

public class Pagamento implements Runnable{
 	
	ArrayList<Empregado> empregados = new ArrayList<>();
	
	public void preencheArray() {
		empregados.add(new Empregado("Daniel", 1000, 250));
		empregados.add(new Empregado("Joao", 3500, 350));
		empregados.add(new Empregado("Ivna", 1000, 100));
		empregados.add(new Empregado("Jose", 7500, 500));
		empregados.add(new Empregado("Paula", 2000, 150));
		empregados.add(new Empregado("Joana", 2500, 350));
		empregados.add(new Empregado("Miguel", 3000, 450));
		empregados.add(new Empregado("Leonardo", 500, 150));
	}
	
	public void getSalarioBruto(){
		double salBruto = 0;
		for (Empregado empregado : empregados) {
			salBruto = (empregado.getSalarioLiquido() + empregado.getComissao());
			StringBuilder s = new StringBuilder();
			s.append("O funcionário: ");
			s.append(empregado.getNome());
			s.append(" tem o salário bruto de: ");
			s.append(salBruto);
			System.out.println(s);
		}
	}
	

	@Override
	public void run() {
		Empregado emp = new Empregado();
		double total = emp.getComissao(empregados);
		System.out.println("Total de empregrados que recebem comissao: " + total);
	}
	
	public static void main(String[] args) {
		Pagamento p = new Pagamento();
		p.preencheArray();
		Thread tFilha = new Thread(p);
		tFilha.start();
		p.getSalarioBruto();
	}

}
