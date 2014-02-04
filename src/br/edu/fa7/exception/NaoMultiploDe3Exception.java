package br.edu.fa7.exception;

public class NaoMultiploDe3Exception extends Exception{
	
	private int linha;
	private int coluna;
	
	private static final String MENSAGEM = "Erro: elemento nao eh multiplo de 3!";
	
	public NaoMultiploDe3Exception(int linha, int coluna) {
		super(MENSAGEM);
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public static String getMensagem() {
		return MENSAGEM;
	}
	
	

}
