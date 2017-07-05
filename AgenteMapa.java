
public class AgenteMapa
{
	protected Agente agente;
	
	protected MapaElemento mapa;

	public AgenteMapa(Agente agente, MapaElemento mapa) {
		super();
		this.agente = agente;
		this.mapa = mapa;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public MapaElemento getMapa() {
		return mapa;
	}

	public void setMapa(MapaElemento mapa) {
		this.mapa = mapa;
	}
	
}
