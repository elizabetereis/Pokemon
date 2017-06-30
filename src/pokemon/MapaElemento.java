package pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import util.Vector;

public class MapaElemento {
	
	private List<Elemento> mElementos;
	ArrayList<Vector> posicoes;
	public final static int NUM_CENTROS = 20;
	public final static int NUM_POKEMONS = 150;
	public final static int NUM_LOJAS = 15;
	public final static int NUM_TREINADOR = 50;
	public final static int TAM_MAPA = 42;
	
	public MapaElemento(){
		
		mElementos = new ArrayList<Elemento>();
		posicoes = new ArrayList<>();
		geraPosicaoAleatorias();
		inicializaElementos();
	}
	
	public void inicializaElementos(){
		
		Elemento centro = new Elemento(TipoElemento.CENTRO_POKEMON, new Vector(0,0), "centro");
		Elemento pokemon = new Elemento(-1, new Vector(0,0), "pokemon");
		Elemento pokemonAgua = new Elemento(TipoPokemon.AGUA, new Vector(0,0), "pokemon");
		Elemento pokemonEletrico = new Elemento(TipoPokemon.ELETRICO, new Vector(0,0), "pokemon");
		Elemento pokemonVoador = new Elemento(TipoPokemon.VOADOR, new Vector(0,0), "pokemon");
		Elemento pokemonFogo = new Elemento(TipoPokemon.FOGO, new Vector(0,0), "pokemon");
		Elemento loja = new Elemento(TipoElemento.LOJAS_POKEMON, new Vector(0,0), "loja");
		Elemento treinador = new Elemento(TipoElemento.TREINADOR_POKEMON, new Vector(0,0), "treinador");
		int iPos = 0;
		
//		for(int i = 0; i < posicoes.size(); i++)
//			System.out.println("EPos: "+posicoes.get(i).toString());
	
		for(int i = 0; i < NUM_CENTROS; i++){
			centro.setPosicao(posicoes.get(iPos));
			iPos++;
			mElementos.add(centro);
//			System.out.println("ipos "+iPos);
		}
		
		for(int i = 0; i < NUM_LOJAS; i++){
			loja.setPosicao(posicoes.get(iPos));
			iPos++;
			mElementos.add(loja);
//			System.out.println("ipos "+iPos);
		}
		
		for(int i = 0; i < NUM_TREINADOR; i++){
			treinador.setPosicao(posicoes.get(iPos));
			iPos++;
			mElementos.add(treinador);
//			System.out.println("ipos "+iPos);
		}
		
		for(int i = 0; i < NUM_POKEMONS; i++){
			pokemon.setPosicao(posicoes.get(iPos));
			iPos++;
			mElementos.add(pokemon);
//			System.out.println("ipos "+iPos);
		}
		
//		for(int i = 0; i < mElementos.size(); i++)
//			System.out.println("EPos: "+mElementos.get(i).getPosicao().toString());
	}
	
	public ArrayList<Vector> geraPosicaoAleatorias(){
		
		List<Integer> linhas = new ArrayList<>();
		List<Integer> colunas = new ArrayList<>();
		
		for (int i = 0; i < TAM_MAPA; i++) { //inicializa números
		    linhas.add(i);
		    colunas.add(i);
		}
		
		Collections.shuffle(linhas);//Embaralha os números:
		Collections.shuffle(colunas);
		
		for(int l = 0; l < TAM_MAPA; l++) { //combina linha X coluna
			for(int c = 0; c < TAM_MAPA; c++)
			{
				posicoes.add(new Vector(linhas.get(l), colunas.get(c)));
				
			}
		}
		
		for(int i = 0; i < posicoes.size(); i++)
			System.out.println("pos "+posicoes.get(i).toString());
		
		return posicoes;
	}
	
	
	public int totalElementos(){
		return NUM_CENTROS+NUM_POKEMONS+NUM_LOJAS+NUM_TREINADOR;
	}
	
	
	public List<Elemento> getElementos(){
		return mElementos;
	}
	
//	 public static void main(String[] args) {
//		 
//		 int[][]mega = new int[42][42];
//		 Random gerador = new Random();
//		 for(int x=0; x<42; x++) {
//		     for(int y=0; y<42; y++) {
//		         int n = gerador.nextInt(42) + 1;
//		         int z = 0;
//		         while(z < 42){
//		             if(mega[x][z] == n){
//		                 n = gerador.nextInt(42) + 1;    
//		                 z = 0;
//		             }
//		             z++;
//		         }
//		         mega[x][y] = n;
//		     }   
//		 }
//		 for(int x=0; x<7; x++) {
//		     for(int y=0; y<6; y++) {
//		         System.out.print(mega[x][y] + " ");
//		     }
//		     System.out.println();
//		 }
//
//	 }
//	

}
