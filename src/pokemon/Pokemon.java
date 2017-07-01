package pokemon;

import util.Vector;

public class Pokemon
{

    protected String nome;

    protected int numero;
    
    protected int tipo;

    protected Vector posicao;

    public Pokemon(String nome, int numero, Vector posicao, int tipo) 
    {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
        this.tipo = tipo;
    }

    public int getTipo() 
    {
		return tipo;
	}

	public void setTipo(int tipo) 
	{
		this.tipo = tipo;
	}

	public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public Vector getPosicao() 
    {
        return posicao;
    }

    public void setPosicao(Vector posicao)
    {
        this.posicao = posicao;
    }
}
