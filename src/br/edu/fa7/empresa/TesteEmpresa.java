package br.edu.fa7.empresa;

import java.util.ArrayList;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		int seqMatricula = 11111;
		
		Empresa empresa = new Empresa("SolucoesTI");

		Funcionario f1 = new Funcionario("Daniel", seqMatricula++);
		
		empresa.admitirFuncionario(f1);
		empresa.admitirFuncionario(new Funcionario("Joao", seqMatricula++));
		empresa.admitirFuncionario(new Funcionario("Felipe", seqMatricula++));
		empresa.admitirFuncionario(new Funcionario("Gleison", seqMatricula++));
		empresa.admitirFuncionario(new Funcionario("Patricia", seqMatricula++));
		empresa.admitirFuncionario(new Funcionario("Joana", seqMatricula++));
		empresa.admitirFuncionario(new Funcionario("Carlos", seqMatricula++));
		empresa.admitirFuncionario(new Terceirizado("Camila", seqMatricula++, "EP Solucoes"));
		empresa.admitirFuncionario(new Terceirizado("Jose", seqMatricula++, "JTI"));
		empresa.admitirFuncionario(new Terceirizado("Junior", seqMatricula++, "EP Solucoes"));
		empresa.admitirFuncionario(new Terceirizado("Cesar", seqMatricula++, "JTI"));
		empresa.admitirFuncionario(new Funcionario("Zezim", seqMatricula++));
		empresa.admitirFuncionario(new Funcionario("Carla", seqMatricula++));
		empresa.admitirFuncionario(new Terceirizado("Cesar", seqMatricula++, "JTI"));
		
		
		empresa.pagarFuncionarios();
		
		empresa.demitirFuncionario(11122);
		
		
		
		
	}
}
