public class Pokemon extends Elemento{

    protected String nome;

    protected int numero;
    
    protected int tipo2;

    public Pokemon(String nome, String identificador, int numero, Vector posicao, int tipo1, int tipo2) 
    {
    	super(tipo1, posicao, identificador);
        this.nome = nome;
        this.numero = numero;
        this.tipo2 = tipo2;
    }
    
    public Pokemon(String nome, String identificador, int numero, int tipo1, int tipo2) 
    {
    	super(tipo1, new Vector(-1,-1),identificador);
        this.nome = nome;
        this.numero = numero;
        this.tipo2 = tipo2;
    }
    
    public Pokemon(String nome, String identificador, int numero, int tipo1) 
    {
    	super(tipo1, identificador);
        this.nome = nome;
        this.numero = numero;
        this.tipo2 = -1;
    }
	
	public int getTipo2()
	{
		return tipo2;
	}

	public void setTipo2(int tipo) 
	{
		this.tipo2 = tipo;
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

	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", numero=" + numero + ", tipo2=" + tipo2 + ", tipo=" + tipo + ", posicao="
				+ posicao + ", identificador=" + identificador + "]";
	}
    
}
