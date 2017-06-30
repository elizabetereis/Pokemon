package pokemon;

import util.Vector;

public class Elemento 
{
	protected int tipo;
	
	protected Vector posicao;
	
	protected String identificador;	

	public Elemento(int tipo, Vector posicao, String identificador)
	{
		this.tipo = tipo;
		this.posicao = posicao;
		this.identificador = identificador;
	}
	
	public Elemento()
	{
		this.tipo = -1;
	}

	public int getTipo()
	{
		return tipo;
	}

	public void setTipo(int tipo) 
	{
		this.tipo = tipo;
	}

	public Vector getPosicao() 
	{
		return posicao;
	}

	public void setPosicao(Vector posicao) 
	{
		this.posicao = posicao;
	}

	public String getIdentificador()
	{
		return identificador;
	}

	public void setIdentificador(String identificador)
	{
		this.identificador = identificador;
	}
	
	
	
}
