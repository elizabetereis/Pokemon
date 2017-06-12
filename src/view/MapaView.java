package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import util.Matriz;

public class MapaView extends JFrame{
    
	private JButton[][] btosTab = new JButton[42][42]; //no caso de um tabuleiro de 5 por 5
    private int[][] terrenoMapa = new int[42][42]; 
	private final int AGUA = 1;
    private final int GRAMA = 2;
    private final int MONTANHA = 3;
    private final int CAVERNA = 4;
    private final int VULCAO = 5;
    private final int VAZIO = 0;
    
	JPanel panelTab;

    MapaView(){
        
    	super("Jogo Pokemon");
        terrenoMapa = new util.Matriz().getMatriz();
    	
//        for(int i = 0; i < 42; i++){
//        	for(int j = 0; j < 42; j++)
//        		terrenoMapa[i][j] = VAZIO; 	
//        }
        
//        for(int c = 0; c < 42; c++){
//        	
//        	switch (c) {
//				case 1:
//				{
//					break;
//				}
//				case 2:
//				{
//					break;
//				}
//				case 3:
//				{
//					break;
//				}
//				case 4:
//				{
//					break;
//				}
//		        case 5:
//				{
//					terrenoMapa[5][c] = AGUA;
//					break;
//				}
//		        case 6:
//				{
//					break;
//				}
//		        case 7:
//				{	
//	        		for(int l = 0; l <= 5; l++)
//	        			terrenoMapa[l][c] = AGUA;
//	
//					break;
//				}
//		        case 8:
//				{
//					terrenoMapa[5][c] = AGUA;
//					for(int l = 29; l <= 32; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 34; l <= 38; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					
//					break;
//				}
//		        case 9:
//				{
//					terrenoMapa[5][c] = AGUA;
//					terrenoMapa[29][c] = AGUA;
//					terrenoMapa[38][c] = AGUA;
//					break;
//				}
//		        case 10:
//				{
//					terrenoMapa[5][c] = AGUA;
//					terrenoMapa[29][c] = AGUA;
//					terrenoMapa[38][c] = AGUA;
//					for(int l = 17; l <= 21; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 11:
//				{
//					terrenoMapa[29][c] = AGUA;
//					for(int l = 5; l <= 7; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 9; l <= 12; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 16; l <= 22; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 38; l <= 41; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 12:
//				{
//					terrenoMapa[12][c] = AGUA;
//					terrenoMapa[29][c] = AGUA;
//					for(int l = 15; l <= 23; l++)
//	        			terrenoMapa[l][c] = AGUA;
//				}
//		        case 13:
//				{
//					terrenoMapa[12][c] = AGUA;
//					terrenoMapa[29][c] = AGUA;
//					for(int l = 15; l <= 17; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 21; l <= 23; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 14:
//				{
//					for(int l = 12; l <= 17; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 21; l <= 29; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 15:
//				{
//					for(int l = 15; l <= 17; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 21; l <= 23; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 16:
//				{
//					for(int l = 15; l <= 23; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					break;
//				}
//		        case 17:
//				{
//					for(int l = 16; l <= 22; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 18:
//				{
//					for(int l = 17; l <= 21; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 25:
//				{
//					for(int l = 13; l <= 20; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 26:
//				{
//	        		terrenoMapa[20][c] = AGUA;
//					break;
//				}
//		        case 27:
//				{
//					terrenoMapa[20][c] = AGUA;
//					terrenoMapa[28][c] = AGUA;
//					for(int l = 39; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 28:
//				{
//					terrenoMapa[20][c] = AGUA;
//					for(int l = 27; l <= 29; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 37; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 29:
//				{
//					terrenoMapa[20][c] = AGUA;
//					terrenoMapa[28][c] = AGUA;
//					for(int l = 26; l <= 30; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 37; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 30:
//				{
//					for(int l = 20; l <= 30; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 36; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 31:
//				{
//					for(int l = 26; l <= 30; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					
//					for(int l = 36; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 32:
//				{
//					terrenoMapa[41][c] = VULCAO;
//					for(int l = 27; l <= 29; l++)
//	        			terrenoMapa[l][c] = AGUA;
//					break;
//				}
//		        case 33:
//				{
//	        		terrenoMapa[28][c] = AGUA;
//	        		for(int l = 36; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 34:
//				{
//					terrenoMapa[4][c] = VULCAO;
//					for(int l = 36; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 35:
//				{
//					for(int l = 37; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					
//					for(int l = 3; l <= 5; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 36:
//				{
//					for(int l = 37; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					
//					for(int l = 2; l <= 6; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 37:
//				{
//					for(int l = 39; l <= 41; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					
//					for(int l = 3; l <= 5; l++)
//	        			terrenoMapa[l][c] = VULCAO;
//					break;
//				}
//		        case 38:
//				{
//	        		terrenoMapa[4][c] = VULCAO;
//					break;
//				}
//		        default:
//					break;
//        	}
        	
//        	
//        	if(c == 11){
//        		for(int l = 5; l <= 7; l++)
//        			coresMapa[l][c] = AZUL;
//        		
//        		for(int l = 9; l <= 12; l++)
//        			coresMapa[l][c] = AZUL;
//        		
//        		for(int l = 16; l <= 22; l++)
//        			coresMapa[l][c] = AZUL;
//        		
//        		for(int l = 38; l <= 41; l++)
//        			coresMapa[l][c] = AZUL;
//        	}
//        	
//        	if(c == 12){
//        		for(int l = 15; l <= 23; l++)
//        			coresMapa[l][c] = AZUL;
//        	}
//        	
//        	if(c == 13){
//        		for(int l = 15; l <= 17; l++)
//        			coresMapa[l][c] = AZUL;
//        	}
//        	
//        	if(c == 14){
//        		for(int l = 16; l <= 22; l++)
//        			coresMapa[l][c] = AZUL;
//        	}
//        	
//        	if(c == 14){
//		    	for(int l = 12; l <= 17; l++)
//					coresMapa[l][c] = AZUL;
//		    	
//		    	for(int l = 21; l <= 29; l++)
//					coresMapa[l][c] = AZUL;
//        	}
//        	
//     }
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setSize(1000,500); 
        confPanelTab();
        this.setVisible(true);
    }
    
    private void confPanelTab(){
        panelTab = new JPanel(new GridLayout(42,42)); // crio o JPanel que servira de tabuleiro; 
        criaBtosTab();
        this.add(panelTab); // adiciono ele na janela;
    }
    
    private void criaBtosTab(){
        for(int i=0; i<btosTab.length; i++){ // loop que percorre as linhas do tabuleiro
            for(int j=0;j<btosTab[i].length; j++){ //loop que percorre as colunas do tabuleiro
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
