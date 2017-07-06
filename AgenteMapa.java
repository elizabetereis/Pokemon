
public class AgenteMapa
{
	protected Agente agente;
	
	protected CelulaMapa[][] mapa;
	
	protected MapaElemento mapaElemento;

	public AgenteMapa(Agente agente, MapaElemento mapaElemento) {
		super();
		this.agente = agente;
		this.mapaElemento = mapaElemento;
		this.mapa = mapaElemento.getMapa();
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public CelulaMapa[][] getMapa() {
		return mapa;
	}

	public void setMapa(CelulaMapa[][] mapa) {
		this.mapa = mapa;
	}
	
	public MapaElemento getMapaElemento() {
		return mapaElemento;
	}
	
}
