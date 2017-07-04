

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class RegistroPokemon {
	
	ArrayList<Pokemon> listaPokemon;
	
	public RegistroPokemon(){
		
		listaPokemon = new ArrayList<Pokemon>();
		leArquivo();	
	}	
	
	public ArrayList<Pokemon> getListaPokemons(){
		
		return listaPokemon;
	}
	
	public void leArquivo() {
		
		BufferedReader leArquivo;
		String nomeArquivo = "listaPokemons.txt";
		
		try 
		{

			leArquivo = new BufferedReader( new FileReader( nomeArquivo ) );
			String linhaArquivo;	
			
			while( (linhaArquivo = leArquivo.readLine()) != null ) 
			{	
				
				if(linhaArquivo.startsWith("#"))
					continue;
				
				String elementosLinha[];
				elementosLinha = linhaArquivo.split(";");
				converteStringPokemon(elementosLinha);
			}
		
		} catch( Exception erro ) {
			System.out.println("ERRO : " + erro.toString());
		}
	}
	
	public int tipoStringToInt(String tipo){
		
		if(tipo.equals("Water"))
			return TipoElemento.AGUA;
		else if(tipo.equals("Fire"))
			return TipoElemento.FOGO;
		else if(tipo.equals("Flying"))
			return TipoElemento.VOADOR;
		else if(tipo.equals("Electric"))
			return TipoElemento.ELETRICO;
		else if(tipo.equals("Grass"))
			return TipoElemento.GRASS;
		else if(tipo.equals("Poison"))
			return TipoElemento.POISON;
		else if(tipo.equals("Bug"))
			return TipoElemento.BUG;
		else if(tipo.equals("Normal"))
			return TipoElemento.NORMAL;
		else if(tipo.equals("Ground"))
			return TipoElemento.GROUND;
		else if(tipo.equals("Fighting"))
			return TipoElemento.FIGHTING;
		else if(tipo.equals("Psychic"))
			return TipoElemento.PSYCHIC;
		else if(tipo.equals("Rock"))
			return TipoElemento.ROCK;
		else if(tipo.equals("Steel"))
			return TipoElemento.STEEL;
		else if(tipo.equals("Ice"))
			return TipoElemento.ICE;
		else if(tipo.equals("Ghost"))
			return TipoElemento.GHOST;
		else if(tipo.equals("Dragon"))
			return TipoElemento.DRAGON;
		
		return TipoElemento.NENHUM;
		
	}
	
	private void converteStringPokemon(String elementosLinha[]){
		
		int iTipo1 = TipoElemento.NENHUM, iTipo2 = TipoElemento.NENHUM;
		String sTipo2, nome;
		int numero = -1;
		
		numero = Integer.parseInt(elementosLinha[0]);
		nome =  elementosLinha[1];
		iTipo1 = tipoStringToInt(elementosLinha[2]);
		
		if(elementosLinha.length > 3)
		{
			sTipo2 = elementosLinha[3];
			iTipo2 = tipoStringToInt(sTipo2);
		}
	
		if(iTipo1 != TipoElemento.NENHUM || iTipo2 != TipoElemento.NENHUM){
			listaPokemon.add(new Pokemon(nome,"pokemon", numero, iTipo1, iTipo2));
		}
	}
	
}
