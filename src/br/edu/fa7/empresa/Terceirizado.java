package br.edu.fa7.empresa;

public class Terceirizado extends Funcionario {

	private String empresaTerceirizadora;
	
	/**
	 * chama o construtor de Funcionário para inicializar adequadamente as 
	 * propriedades herdadas, adicionalmente inicializando empresaTerceirizadora.
	 * @param nome
	 * @param matricula
	 * @param nomeEmpresaTerceirizada
	 */
	public Terceirizado(String nome, int matricula,	String nomeEmpresa) {
		super(nome, matricula);
		this.empresaTerceirizadora = nomeEmpresa;
	}

	public void receberVales() {
		System.out.println("Pagamento dos vales efetuado com sucesso");
	}
	
	@Override
	public void receberSalario(String nome) {
		super.receberSalario(nome);
		receberVales();
	}
}
