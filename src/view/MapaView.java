package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MapaView extends JFrame{
    
	private JButton[][] btosTab = new JButton[42][42]; //no caso de um tabuleiro de 5 por 5
    private int[][] coresMapa = new int[42][42]; 
	private final int AZUL = 1;
    private final int VERDE = 2;
    private final int MARROM = 3;
    private final int CINZA = 4;
    private final int LARANJA = 5;
    private final int BRANCO = 0;
    
	JPanel panelTab;

    MapaView(){
        super("Jogo Pokemon");
        
        for(int i = 0; i < 42; i++){
        	for(int j = 0; j < 42; j++)
        		coresMapa[i][j] = BRANCO; 	
        }
        
        for(int c = 0; c < 42; c++){
        	
        	switch (c) {
				case 1:
				{
					break;
				}
				case 2:
				{
					break;
				}
				case 3:
				{
					break;
				}
				case 4:
				{
					break;
				}
		        case 5:
				{
					coresMapa[5][c] = AZUL;
					break;
				}
		        case 6:
				{
					break;
				}
		        case 7:
				{	
	        		for(int l = 0; l <= 5; l++)
	        			coresMapa[l][c] = AZUL;
	
					break;
				}
		        case 8:
				{
					coresMapa[5][c] = AZUL;
					for(int l = 29; l <= 32; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 34; l <= 38; l++)
	        			coresMapa[l][c] = AZUL;
					
					
					break;
				}
		        case 9:
				{
					coresMapa[5][c] = AZUL;
					coresMapa[29][c] = AZUL;
					coresMapa[38][c] = AZUL;
					break;
				}
		        case 10:
				{
					coresMapa[5][c] = AZUL;
					coresMapa[29][c] = AZUL;
					coresMapa[38][c] = AZUL;
					for(int l = 17; l <= 21; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 11:
				{
					coresMapa[29][c] = AZUL;
					for(int l = 5; l <= 7; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 9; l <= 12; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 16; l <= 22; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 38; l <= 41; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 12:
				{
					coresMapa[12][c] = AZUL;
					coresMapa[29][c] = AZUL;
					for(int l = 15; l <= 23; l++)
	        			coresMapa[l][c] = AZUL;
				}
		        case 13:
				{
					coresMapa[12][c] = AZUL;
					coresMapa[29][c] = AZUL;
					for(int l = 15; l <= 17; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 21; l <= 23; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 14:
				{
					for(int l = 12; l <= 17; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 21; l <= 29; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 15:
				{
					for(int l = 15; l <= 17; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 21; l <= 23; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 16:
				{
					for(int l = 15; l <= 23; l++)
	        			coresMapa[l][c] = AZUL;
					
					break;
				}
		        case 17:
				{
					for(int l = 16; l <= 22; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 18:
				{
					for(int l = 17; l <= 21; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 25:
				{
					for(int l = 13; l <= 20; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 26:
				{
	        		coresMapa[20][c] = AZUL;
					break;
				}
		        case 27:
				{
					coresMapa[20][c] = AZUL;
					coresMapa[28][c] = AZUL;
					for(int l = 39; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 28:
				{
					coresMapa[20][c] = AZUL;
					for(int l = 27; l <= 29; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 37; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 29:
				{
					coresMapa[20][c] = AZUL;
					coresMapa[28][c] = AZUL;
					for(int l = 26; l <= 30; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 37; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 30:
				{
					for(int l = 20; l <= 30; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 36; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 31:
				{
					for(int l = 26; l <= 30; l++)
	        			coresMapa[l][c] = AZUL;
					
					for(int l = 36; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 32:
				{
					coresMapa[41][c] = LARANJA;
					for(int l = 27; l <= 29; l++)
	        			coresMapa[l][c] = AZUL;
					break;
				}
		        case 33:
				{
	        		coresMapa[28][c] = AZUL;
	        		for(int l = 36; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 34:
				{
					coresMapa[4][c] = LARANJA;
					for(int l = 36; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 35:
				{
					for(int l = 37; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					
					for(int l = 3; l <= 5; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 36:
				{
					for(int l = 37; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					
					for(int l = 2; l <= 6; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 37:
				{
					for(int l = 39; l <= 41; l++)
	        			coresMapa[l][c] = LARANJA;
					
					for(int l = 3; l <= 5; l++)
	        			coresMapa[l][c] = LARANJA;
					break;
				}
		        case 38:
				{
	        		coresMapa[4][c] = LARANJA;
					break;
				}
		        default:
					break;
        	}
        	
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
     }
        
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
                
                switch (coresMapa[i][j]) {
				case VERDE:
					btosTab[i][j].setBackground(Color.GREEN);
					break;
				case AZUL:
					btosTab[i][j].setBackground(Color.BLUE);
					break;
				case MARROM:
					btosTab[i][j].setBackground(new java.awt.Color(83, 54, 54));
					break;
				case CINZA:
					btosTab[i][j].setBackground(Color.GRAY);
					break;
				case LARANJA:
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
