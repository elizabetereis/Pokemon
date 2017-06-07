package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MapaView extends JFrame{
    
	private JButton[][] btosTab = new JButton[42][42]; //no caso de um tabuleiro de 5 por 5
    JPanel panelTab;
    
    MapaView(){
        super("Jogo Pokemon");
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
                btosTab[i][j].setText("x");
                btosTab[i][j].setBackground(Color.BLACK);
                btosTab[i][j].setForeground(Color.WHITE);
                panelTab.add(btosTab[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        new MapaView();
    }
}
