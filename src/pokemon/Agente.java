package pokemon;

import java.util.ArrayList;

public class Agente 
{
	protected String nome;
	
	protected ArrayList<Pokemon> pokemonsList;
	
	protected Vector posicao;
	
	protected boolean pokemonsRecuperados;
	
	protected int custoAcao;
	
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

	public boolean isPokemonsRecuperados() {
		return pokemonsRecuperados;
	}

	public void setPokemonsRecuperados(boolean pokemonsRecuperados) {
		this.pokemonsRecuperados = pokemonsRecuperados;
	}

	public int getCustoAcao() {
		return custoAcao;
	}

	public void setCustoAcao(int custoAcao) {
		this.custoAcao = custoAcao;
	}
	
	
	
	
}
