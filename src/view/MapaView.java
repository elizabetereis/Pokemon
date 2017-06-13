package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import util.Matriz;

public class MapaView extends JFrame{
    
	private JButton[][] btosTab = new JButton[42][42];
    private int[][] terrenoMapa = new int[42][42]; 
	private final int AGUA = 1;
    private final int GRAMA = 2;
    private final int MONTANHA = 3;
    private final int CAVERNA = 4;
    private final int VULCAO = 5;
    JPanel panelTab;

    MapaView(){
        
    	super("Jogo Pokemon");
        terrenoMapa = new util.Matriz().getMatriz();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setSize(1000,500); 
        confPanelTab();
        this.setVisible(true);
    }
    
    private void confPanelTab(){
        panelTab = new JPanel(new GridLayout(42,42)); 
        criaBtosTab();
        this.add(panelTab); 
    }
    
    private void criaBtosTab(){
        for(int i=0; i<btosTab.length; i++){ 
            for(int j=0;j<btosTab[i].length; j++){ 
                btosTab[i][j] = new JButton();
                
                switch (terrenoMapa[i][j]) {
				case GRAMA:
					btosTab[i][j].setBackground(Color.GREEN);
					break;
				case AGUA:
					btosTab[i][j].setBackground(Color.BLUE);
					break;
				case MONTANHA:
					btosTab[i][j].setBackground(new java.awt.Color(83, 54, 54));
					break;
				case CAVERNA:
					btosTab[i][j].setBackground(Color.GRAY);
					break;
				case VULCAO:
					btosTab[i][j].setBackground(Color.ORANGE);
					break;
				default:
					btosTab[i][j].setBackground(Color.WHITE);
					break;
				}

                panelTab.add(btosTab[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        new MapaView();
    }
}
