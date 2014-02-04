package br.edu.fa7.thread;

public class EmpregadoRunnable implements Runnable{

	/**
	 * 
	 */
	 static Empregado empregados[] = new Empregado[6];
	
	/**
	 * 
	 */
	int numArray = 0;
	
	/**
	 * 
	 */
	int numFuncComissao = 0;
	
	/**
	 * 
	 */
	 double salarioBrutoTemp;
	
	 /**
	  * M�todo run
	  */
	public void run()
	{
		
//		while ( true)
//		{
			int numeroFuncionarios = verificaComissao();
			System.out.println("NUMERO DE FUNCIONARIOS QUE GANHAM MENOS QUE 20% DO SALARIO LIQUIDO : "+numeroFuncionarios);
//		}
	} 
	
	/**
	 * Preenchimento de array
	 * @param e
	 */
	public void preencheArray(Empregado e){
		
		empregados[numArray] = e;
		empregados[numArray].setSalarioBruto(e.getSalarioLiquido()+e.getComissao());
		numArray++;
		
	}
	
	/**
	 * Verifica quantos empregados ganham menos de 20% no salario liquido
	 * @return
	 */
	public int verificaComissao(){
		
		for (int i = 0; i < 6; i++) {
			double valorTemp = empregados[i].getSalarioLiquido() * 0.2;
			
			if(empregados[i].getComissao() < valorTemp){
				numFuncComissao = numFuncComissao+1;
			}
		}
		return numFuncComissao;
	}
	
	/**
	 * Calcula sal�rio bruto total
	 */
	void calculaTotalSalarioBruto(){
		for(int i = 0; i< 6;i++)
		{
			salarioBrutoTemp = empregados[i].getSalarioBruto()+salarioBrutoTemp;
		}
		System.out.println("SALARIO BRUTO TOTAL : "+salarioBrutoTemp);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmpregadoRunnable empRun = new EmpregadoRunnable();
		
		empRun.preencheArray(new Empregado("FELIPE",10,800));
		empRun.preencheArray(new Empregado("DANIEL",300,400));
		empRun.preencheArray(new Empregado("GLAISON",100,250));
		empRun.preencheArray(new Empregado("TAVARES",50,1000));
		empRun.preencheArray(new Empregado("MARCELO",50,100));
		empRun.preencheArray(new Empregado("JULIANA",40,100));
		
		
		EmpregadoRunnable runner = new EmpregadoRunnable();
		Thread t = new Thread( runner );
		t.start();
	
//		while(true){
			empRun.calculaTotalSalarioBruto();
//		}
	}
	
	
}
