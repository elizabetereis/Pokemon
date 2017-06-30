package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import pokemon.Elemento;
import pokemon.MapaElemento;
import pokemon.TipoElemento;
import pokemon.TipoPokemon;
import util.Matriz;

public class MapaView extends JFrame{
    
	private JButton[][] mapa = new JButton[42][42];
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
        criamapa();
        adicionaElementos();
        this.add(panelTab); 
    }
    
    private void criamapa(){
        
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
    
    private void adicionaElementos(){
    	
    	ArrayList<Elemento> elementos = (ArrayList<Elemento>) new MapaElemento().getElementos();
    	int e = 0;
    	
    	 for(int i = 0; i < mapa.length; i++){ 
             for(int j = 0;j < mapa[i].length; j++){ 
            	 
            	switch (elementos.get(e).getTipo()) {
					case TipoElemento.CENTRO_POKEMON:
//						mapa[i][j].setText("c");
						break;
					case TipoElemento.LOJAS_POKEMON:
//						mapa[i][j].setText("l");
						break;
					case TipoElemento.TREINADOR_POKEMON:
//						mapa[i][j].setText("t");
						break;
					case TipoPokemon.AGUA:
//						mapa[i][j].setText("a");
						break;
					case TipoPokemon.ELETRICO:
//						mapa[i][j].setText("e");
						break;
					case TipoPokemon.FOGO:
//						mapa[i][j].setText("f");
						break;
					case TipoPokemon.VOADOR:
//						mapa[i][j].setText("v");
						break;
					default:
//						mapa[i][j].setText("n");
						break;
					}
//            	mapa[i][j].setHorizontalTextPosition(javax.swing.SwingConstants.CENTER); 
//            	mapa[i][j].setVerticalAlignment(javax.swing.SwingConstants.TOP); 
//            	mapa[i][j].setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            	mapa[i][j].setIcon(new ImageIcon(getClass().getResource("/imagem.png")));
            	panelTab.add(mapa[i][j]);
             }
  
    	 }
    	
    	
    }
    
    public static void main(String[] args) {
        new MapaView();
    }
}
