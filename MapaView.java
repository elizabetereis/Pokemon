

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MapaView extends JFrame{
    
	private JButton[][] mapa = new JButton[42][42];
	private final int AGUA = 1;
    private final int GRAMA = 2;
    private final int MONTANHA = 3;
    private final int CAVERNA = 4;
    private final int VULCAO = 5;
    JPanel panelTab;

    MapaView(){
        
    	super("Jogo Pokemon");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setSize(1000,500); 
        confPanelTab();
        this.setVisible(true);
    }
    
    private void confPanelTab(){
        panelTab = new JPanel(new GridLayout(42,42)); 
        criaMapaTerrenos();
        this.add(panelTab); 
    }
    
    private void criaMapaTerrenos(){
        
        int[][] terrenoMapa = new MapaElemento().getTerrenoMapa(); 
        
    	for(int i=0; i<mapa.length; i++){ 
            for(int j=0;j<mapa[i].length; j++){ 
                mapa[i][j] = new JButton();
                
                switch (terrenoMapa[i][j]) {
				case GRAMA:
					mapa[i][j].setBackground(Color.GREEN);
					break;
				case AGUA:
					mapa[i][j].setBackground(Color.BLUE);
					break;
				case MONTANHA:
					mapa[i][j].setBackground(new java.awt.Color(83, 54, 54));
					break;
				case CAVERNA:
					mapa[i][j].setBackground(Color.GRAY);
					break;
				case VULCAO:
					mapa[i][j].setBackground(Color.ORANGE);
					break;
				default:
					mapa[i][j].setBackground(Color.WHITE);
					break;
				}

                panelTab.add(mapa[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
    	new MapaView();
    }
    
}