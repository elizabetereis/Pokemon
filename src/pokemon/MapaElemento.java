package pokemon;

import java.util.ArrayList;
import java.util.List;

public class MapaElemento {
	
	private List<Elemento> mElementos;
	public final static int NUM_CENTROS = 20;
	public final static int NUM_POKEMONS = 150;
	public final static int NUM_LOJAS = 15;
	public final static int NUM_TREINADOR = 50;
	
	public MapaElemento(){
		
		mElementos = new ArrayList<Elemento>();
		inicializaElementos();
	}
	
	public void inicializaElementos(){
		
		Elemento centro = new Elemento(TipoElemento.CENTRO_POKEMON, new Vector(0,0), "centro");
		Elemento pokemonAgua = new Elemento(TipoPokemon.AGUA, new Vector(0,0), "pokemon");
		Elemento pokemonEletrico = new Elemento(TipoPokemon.ELETRICO, new Vector(0,0), "pokemon");
		Elemento pokemonVoador = new Elemento(TipoPokemon.VOADOR, new Vector(0,0), "pokemon");
		Elemento pokemonFogo = new Elemento(TipoPokemon.FOGO, new Vector(0,0), "pokemon");
		Elemento lojas = new Elemento(TipoElemento.LOJAS_POKEMON, new Vector(0,0), "loja");
		Elemento treinador = new Elemento(TipoElemento.TREINADOR_POKEMON, new Vector(0,0), "treinador");
		
		
		for(int i = 0; i < NUM_CENTROS; i++){
			mElementos.add(centro);
		}
		
		for(int i = 0; i < NUM_LOJAS; i++){
			mElementos.add(lojas);
		}
		
		for(int i = 0; i < NUM_CENTROS; i++){
			mElementos.add(centro);
		}
		
		for(int i = 0; i < NUM_POKEMONS; i++){
			mElementos.add(pokemonAgua);
		}
	}
	
	public int totalElementos(){
		return NUM_CENTROS+NUM_POKEMONS+NUM_LOJAS+NUM_TREINADOR;
	}
	
	public List<Elemento> getElementos(){
		return mElementos;
	}
	

}
