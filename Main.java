
public class Main {
	
	public static void main(String args[]) {
	
		RegrasPokemon pokemonBase = new RegrasPokemon();
		
		Vector posInicial = new Vector(24,19);
		int qtdInicialBolas = 25;
		
		AgenteMapa agenteMapa = new AgenteMapa(new Agente("jogador", posInicial, qtdInicialBolas), 
				new MapaElemento());
		
		pokemonBase.tell(agenteMapa); //tomada de decisão primeiro
		pokemonBase.run();
		
		System.out.println("DecisaoBase "+agenteMapa.getAgente().getDecisao());
		
//		pokebolaBase.tell(agenteMapa);
//		pokebolaBase.run();
//		
//		System.out.println("PokebolaBase "+agenteMapa.getAgente().getDecisao());
		
//		if(agente.getDecisao() == agente.ANDAR)
//		{
//			andarBase.tell(agenteMapa);
//			andarBase.run();
//		}
//		else if(agente.getDecisao() == agente.BATALHAR){
//			batalhaBase.tell(agente);
//			batalhaBase.run();
//		}
//		else if(agente.getDecisao() == agente.COMPRAR){
//			batalhaBase.tell(agente);
//			batalhaBase.run();
//		}
//		else if(agente.getDecisao() == agente.RECUPERAR_POKEMONS){
//			batalhaBase.tell(agente);
//		}
//		else if(agente.getDecisao() == agente.USAR_POKEBOLA){

//		}
		
	}

}
