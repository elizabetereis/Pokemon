package pokemon;

import java.util.ArrayList;
import java.util.Random;

import util.Vector;

public class Agente 
{
	protected String nome;
	
	protected ArrayList<Pokemon> pokemonsList;
	
	protected Vector posicao;
	
	protected boolean pokemonsRecuperados;
	
	protected int custoAcao;
	
	protected int orientacao;
	
	protected int quantidadePokebolas;

	public Agente(String nome, ArrayList<Pokemon> pokemonsList, Vector posicao)
	{
		this.nome = nome;
		this.pokemonsList = pokemonsList;
		this.posicao = posicao;
		this.pokemonsRecuperados = true;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public ArrayList<Pokemon> getPokemonsList()
	{
		return pokemonsList;
	}

	public void setPokemonsList(ArrayList<Pokemon> pokemonsList) 
	{
		this.pokemonsList = pokemonsList;
	}

	public Vector getPosicao()
	{
		return posicao;
	}

	public void setPosicao(Vector posicao)
	{
		this.posicao = posicao;
	}

	public boolean isPokemonsRecuperados() 
	{
		return pokemonsRecuperados;
	}

	public void setPokemonsRecuperados(boolean pokemonsRecuperados) 
	{
		this.pokemonsRecuperados = pokemonsRecuperados;
	}

	public int getCustoAcao() 
	{
		return custoAcao;
	}

	public void setCustoAcao(int custoAcao) 
	{
		this.custoAcao = custoAcao;
	}
	
	public int getOrientacao() {
		 Random rand = new Random();
	       
	     int n = rand.nextInt(4) + 1;
	     
	     return n;
	}
	
	public int getQuantidadePokebolas() 
	{
		return quantidadePokebolas;
	}

	public void setQuantidadePokebolas(int quantidadePokebolas) 
	{
		this.quantidadePokebolas = quantidadePokebolas;
	}
}
