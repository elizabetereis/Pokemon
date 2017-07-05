
public class Main {
	
	public static void main(String args[]) {
	
		Andar andarBase = new Andar();
		Batalha batalhaBase = new Batalha();
		Decisao decisaoBase = new Decisao();
		UsarPokebola pokebolaBase = new UsarPokebola();
		
		Vector posInicial = new Vector(24,19);
		int qtdInicialBolas = 25;
		
		Agente agente = new Agente("jogador", posInicial, qtdInicialBolas);
		MapaElemento mapa = new MapaElemento();
		
		decisaoBase.tell(agente);
		decisaoBase.tell(mapa);
		decisaoBase.run();
		
//		if(agente.getDecisao() == agente.ANDAR)
//		{
//			andarBase.tell(agente);
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
//			pokebolaBase.tell(agente);
//			pokebolaBase.run();
//		}
		
	}

}
