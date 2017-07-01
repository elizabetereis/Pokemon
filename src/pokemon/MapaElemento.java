package pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.CelulaMapa;
import util.TipoElemento;
import util.Vector;

public class MapaElemento {
	
	public final static int NUM_CENTROS = 20;
	public final static int NUM_POKEMONS = 150;
	public final static int NUM_LOJAS = 15;
	public final static int NUM_TREINADOR = 50;
	public final static int TAM_MAPA = 42;
	private CelulaMapa [][] mapa = new CelulaMapa[TAM_MAPA][TAM_MAPA];
	private int[][] terrenoMapa = new int[TAM_MAPA][TAM_MAPA]; 
	
	
	public MapaElemento(){
		terrenoMapa = new util.Matriz().getMatriz(); //pega terrenos vindos do arquivo de texto
		criaMapa();
	}
	
	public List<Elemento> geraElementos(){
		
		int iPos = 0;
		List<Elemento> elementos = new ArrayList<Elemento>();
		ArrayList<Vector> posicoes = geraPosicaoAleatorias();
	
		for(int i = 0; i < NUM_CENTROS; i++){
			elementos.add(new Elemento(TipoElemento.CENTRO_POKEMON, posicoes.get(iPos), "centro"));
			iPos++;
		}
		
		for(int i = 0; i < NUM_LOJAS; i++){
			elementos.add(new Elemento(TipoElemento.LOJAS_POKEMON, posicoes.get(iPos), "loja"));
			iPos++;
		}
		
		for(int i = 0; i < NUM_TREINADOR; i++){
			elementos.add(new Elemento(TipoElemento.TREINADOR_POKEMON, posicoes.get(iPos), "treinador"));
			iPos++;
		}
		
		for(int i = 0; i < NUM_POKEMONS; i++){
			elementos.add(new Elemento(TipoElemento.AGUA, posicoes.get(iPos), "pokemon"));
			iPos++;
		}
		
		return elementos;
	}
	
	public ArrayList<Vector> geraPosicaoAleatorias(){
		
		ArrayList<Vector> posicoes = new ArrayList<>();
		
		for(int l = 0; l < TAM_MAPA; l++) { //combina linha X coluna
			for(int c = 0; c < TAM_MAPA; c++)
			{
				posicoes.add(new Vector(l, c));
			}
		}
		
		Collections.shuffle(posicoes);//Embaralha os números:
		
		return posicoes;
	}
	
	public void criaMapa(){
		
		List<Elemento> elementos = geraElementos();
		
		for(int i = 0; i < TAM_MAPA; i++){ //preenche celulas com terreno correspondente
			for(int j = 0; j < TAM_MAPA; j++){
				mapa[i][j] = new CelulaMapa(terrenoMapa[i][j]);
			}
		}
		
		for(int i = 0; i < elementos.size(); i++){ //preenche celulas com elemento correspondente
			Elemento e = elementos.get(i);
			int x = e.getPosicao().getX();
			int y = e.getPosicao().getY();
			mapa[x][y].setElemento(e);
		}
		
		for(int i = 0; i < TAM_MAPA; i++){
			for(int j = 0; j < TAM_MAPA; j++){
				System.out.println(mapa[i][j].toString());
			}
		}
	}
	
	public int[][] getTerrenoMapa(){
		return terrenoMapa;
	}
	
	 public static void main(String[] args) {

		 new MapaElemento();
	 }
	

}
