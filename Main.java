
public class Main {
	
	Andar andarBase = new Andar();
	Batalha batalhaBase = new Batalha();
	Decisao decisaoBase = new Decisao();
	UsarPokebola pokebolaBase = new UsarPokebola();
	
	Vector posInicial = new Vector(24,19);
	int qtdInicialBolas = 25;
	
	Agente agente = new Agente("jogador", posInicial, qtdInicialBolas);
	MapaElemento mapa = new MapaElemento();
	
	decisaoBase.tell(agente);

}
