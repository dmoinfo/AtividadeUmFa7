package br.edu.fa7.exception;

public class MultiplosDe3 {
	
	public static void testarMultiplosDe3(int [][] matriz) 
			throws NaoMultiploDe3Exception{
		
		for(int i=0; i < matriz.length; i++){
			for(int j=0; j < matriz[i].length; j++){
				if(matriz[i][j] % 3 != 0){
					throw new NaoMultiploDe3Exception(i,j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int matriz[][] = {{9,15,21},{18,33,23}};
		
		
		try {
			testarMultiplosDe3(matriz);
		} catch (NaoMultiploDe3Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Linha: "+e.getLinha());
			System.out.println("Coluna: "+e.getColuna());
		}
	}

}
