package pokemon;

public class Elemento 
{
	protected TipoElemento tipo;
	
	protected Vector posicao;
	
	protected String identificador;	

	public Elemento(TipoElemento tipo, Vector posicao, String identificador)
	{
		this.tipo = tipo;
		this.posicao = posicao;
		this.identificador = identificador;
	}

	public TipoElemento getTipo()
	{
		return tipo;
	}

	public void setTipo(TipoElemento tipo) 
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
