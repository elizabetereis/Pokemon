
public class Main {
	
	public static void main(String args[]) {
	
		RegrasPokemon pokemonBase = new RegrasPokemon();
		
		Vector posInicial = new Vector(24,19);
		int qtdInicialBolas = 25;
		
		AgenteMapa agenteMapa = new AgenteMapa(new Agente("jogador", posInicial, qtdInicialBolas), 
				new MapaElemento());
		
		System.out.println("Coluna: "+agenteMapa.getAgente().getPosicao().getX()+" Linha: "+agenteMapa.getAgente().getPosicao().getY());
		
		pokemonBase.tell(agenteMapa);
		pokemonBase.run();
	}
		
		
}
