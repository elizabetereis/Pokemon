
public class AgenteMapa
{
	protected Agente agente;
	
	protected CelulaMapa[][] mapa;
	
	protected MapaElemento mapaElemento;
	
	private MapaView mapaView;

	public AgenteMapa(Agente agente, MapaElemento mapaElemento) {
		super();
		mapaView = new MapaView();
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
	
	public void atualizaMapa(){ 
		mapaView.alteraPosAgente(agente.getPosicao());
	}
	
}
