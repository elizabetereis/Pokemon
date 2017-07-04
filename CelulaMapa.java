

public class CelulaMapa {
	
	private Elemento mElemento;
	private int mTerreno;
	private boolean temElemento;
	
	public CelulaMapa(Elemento e, int t){
		mElemento = e;
		mTerreno = t;
		temElemento = true;
	}
	
	public CelulaMapa(int t){
		mTerreno = t;
		temElemento = false;
	}
	
	public CelulaMapa(){
		temElemento = false;
	}

	public Elemento getElemento() {
		return mElemento;
	}

	public void setElemento(Elemento mElemento) {
		temElemento = true;
		this.mElemento = mElemento;
	}

	public int getTerreno() {
		return mTerreno;
	}

	public void setTerreno(int mTerreno) {
		this.mTerreno = mTerreno;
	}
	
	public String toString(){
		
		if(temElemento)
			return "CelulaMapa\n"
				+mElemento.toString()
				+"\nTerreno: "+mTerreno;
		else
			return "Sem elemento"
				+"\nTerreno: "+mTerreno;
			
	}
	
	public boolean temElemento(){
		return temElemento;
	}
		
}
