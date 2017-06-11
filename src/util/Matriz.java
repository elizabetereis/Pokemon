package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Matriz {

	private int matriz[][];
	public int N = 42, M = 42;
	
//	public static void main (String args[]){
//		
//		new Matriz();
//	}
	
	public Matriz(){
		
		matriz = new int[N][M];
		
		for(int i = 0; i < N; i++)
			for(int j = 0; j < M; j++){
				matriz[i][j] = 0;
			}
		
		leArquivoEImprimeInstancias();	
	}	
	
	public void leArquivoEImprimeInstancias() {
		
		BufferedReader leArquivo;
		StringTokenizer leLinhaArquivo;
		int i = -1, j = 0;
		String nomeArquivo = "src/util/matriz.txt";
		
		try 
		{

			leArquivo = new BufferedReader( new FileReader( nomeArquivo ) );
			String linhaArquivo;	
			
			while( (linhaArquivo = leArquivo.readLine()) != null ) 
			{	
				
				if(linhaArquivo.startsWith("#"))
					continue;
				
				if(i >= N) break;
				
				i++;
				
				leLinhaArquivo = new StringTokenizer(linhaArquivo);	

				for(j = 0; j < M; j++){
					matriz[i][j] = Integer.parseInt( leLinhaArquivo.nextToken());
				}
				
			}
			
//			for(i = 0; i < N; i++, System.out.println("\n") )
//				for(j = 0; j < M; j++)
//					System.out.print(matriz[i][j]+" ");
//			
//			System.out.println("Fim de execucao.");
		
		} catch( Exception erro ) {
			System.out.println("ERRO : " + erro.toString());
		}
	}
	
	public int[][] getMatriz(){
		return matriz;
	}
}
