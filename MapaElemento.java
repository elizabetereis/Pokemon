

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class MapaElemento {
	
	public final static int NUM_CENTROS = 20;
	public final static int NUM_POKEMONS = 150;
	public final static int NUM_LOJAS = 15;
	public final static int NUM_TREINADOR = 50;
	public final static int TAM_MAPA = 42;
	
	public int CIMA = 30;
	public int BAIXO = 31;
	public int ESQUERDA = 32;
	public int DIREITA = 33;
	
	private CelulaMapa [][] mapa = new CelulaMapa[TAM_MAPA][TAM_MAPA];
	private int[][] terrenoMapa = new int[TAM_MAPA][TAM_MAPA];
	private int celulaComElemento;
	
	
	public MapaElemento(){
		celulaComElemento = -1;
		terrenoMapa = new Matriz().getMatriz(); //pega terrenos vindos do arquivo de texto
		criaMapa();
		printMapa();
	}
	
	public List<Elemento> geraElementos(){
		
		int iPos = 0;
		ArrayList<Elemento> elementos = new ArrayList<Elemento>();
		ArrayList<Pokemon> pokemons = new RegistroPokemon().getListaPokemons();
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
		
		Elemento e = new Elemento(TipoElemento.AGUA, new Vector(24, 19), "pokemon");
		for(int i = 0; i < NUM_POKEMONS; i++){
			Pokemon pokemonAux = pokemons.get(i);
			pokemonAux.setPosicao(posicoes.get(iPos));
			if(i == NUM_POKEMONS-1)
				elementos.add(e);//int tipo, Vector posicao, String identificador
			else 
				elementos.add(pokemonAux);
			iPos++;
		}
		
	 new Elemento(TipoElemento.AGUA, new Vector(25, 19), "pokemon");
		
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
				mapa[i][j].setElemento(new Elemento());
			}
		}
		
		for(int i = 0; i < elementos.size(); i++){ //preenche celulas com elemento correspondente
			Elemento e = elementos.get(i);
			int x = e.getPosicao().getX();
			int y = e.getPosicao().getY();
			mapa[x][y].setElemento(e);
		}
	}
	
	public int[][] getTerrenoMapa(){
		return terrenoMapa;
	}
	
	public CelulaMapa[][] getMapa(){
		return mapa;
	}
	
	public int existemElementosCima(Vector posicao){
		int col = posicao.getX();
		int lin = posicao.getY();		
		//Cima
		if( (lin > 0)  && (this.mapa[col][lin-1].temElemento())){
			return this.mapa[col][lin-1].getElemento().getTipo();
		}
		
		return -1;
	}
	
	public int existemElementosBaixo(Vector posicao){
		int col = posicao.getX();
		int lin = posicao.getY();
		
		//Baixo
		if( (lin < TAM_MAPA)  && (this.mapa[col][lin+1].temElemento())){
			return this.mapa[col][lin+1].getElemento().getTipo();
		}
		
		return -1;
	}
	
	public int existemElementosDireita(Vector posicao){
		int col = posicao.getX();
		int lin = posicao.getY();
		
		//Direita
		if( (col < TAM_MAPA)  && (this.mapa[col+1][lin].temElemento())){
			return this.mapa[col+1][lin].getElemento().getTipo();
		}
		
		return -1;
	}
	
	public int existemElementosEsquerda(Vector posicao){
		int col = posicao.getX();
		int lin = posicao.getY();
	
		//Esquerda
		if( (col > 0)  && (this.mapa[col-1][lin].temElemento())){
			return this.mapa[col-1][lin].getElemento().getTipo();
		}
		
		return -1;
	}
	
	public int existeElementoPosAtual(Vector posicao){
		int col = posicao.getX();
		int lin = posicao.getY();
	
		
		if( (col > 0)  && (this.mapa[col][lin].temElemento())){
			return this.mapa[col][lin].getElemento().getTipo();
		}
		
		return -1;
	}
	
	public boolean existePokemonProximo(Vector posicao){
		
		if(existeElementoPosAtual(posicao) >= 4 
			|| existemElementosCima(posicao) >= 4 
			|| existemElementosBaixo(posicao) >= 4 
			|| existemElementosEsquerda(posicao) >= 4 
			|| existemElementosDireita(posicao) >= 4)
			
			return true;
		
    	return false;
	}
	
	public boolean existeElementoProximo(Vector posicao){
		
		if(existemElementosCima(posicao) > TipoElemento.NENHUM
			|| existemElementosBaixo(posicao) > TipoElemento.NENHUM
			|| existemElementosEsquerda(posicao) > TipoElemento.NENHUM
			|| existemElementosDireita(posicao) > TipoElemento.NENHUM )
			
			return true;
		
    	return false;
	}
	
	public boolean temElementoProximo(Vector posicao){
		
		if(existemElementosCima(posicao) != -1)
			celulaComElemento = CIMA;
		else if(existemElementosBaixo(posicao) != -1)
			celulaComElemento =  BAIXO;
		else if(existemElementosEsquerda(posicao) != -1)
			celulaComElemento =  ESQUERDA;
		else if(existemElementosDireita(posicao) != -1)
			celulaComElemento =  DIREITA;
		
		if(celulaComElemento != -1)
			return true;
		
		return false;
	}
	
	public int getCelulaDirecao(){
		return celulaComElemento;
	}
	
	public void printMapa(){
		
		for(int i = 0; i < TAM_MAPA; i++){
			for(int j = 0; j < TAM_MAPA; j++){
				if(i == 24 && j == 19)
					System.out.print("***"+mapa[i][j].getElemento().getTipo()+"***");
				System.out.print(mapa[i][j].getElemento().getTipo()+" ");
			}
			System.out.println();
		}
	}


}
