package GeradorDeFicha;
import java.util.Scanner; // Scanner é menos eficiente que o Buffered aparentemente
import java.util.Date;
// Bibliotecas importantes para criacão de interface grafica em java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class mainCode {

    public static void GUI(){
        JFrame janela = new JFrame();
        JButton butao = new JButton("Criar uma nova ficha de personagem");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout());
        
        janela.add(panel, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Gerador de Fichas");
        janela.pack();
        janela.setVisible(true);
        janela.getContentPane().setBackground(new Color(0,0,0));
    }
    public static void main(String[] args) {

        // new GUI();

        System.out.println("\n\n_______GERADOR DE FICHAS DE PERSONAGENS_______\nDungeons & Dragons 5e!\n\n\n");
        System.out.println("Bem vindo ao gerador de fichas de personagem para D&D 5e!\n");

        int opt = 0;
        do{
            System.out.println("Digite o número da opção que deseja:");
            System.out.println("\t1 - Criar uma nova ficha de personagem");
            System.out.println("\t2 - Carregar e/ou Alterar uma ficha de personagem");
            System.out.println("\t3 - Mostrar uma ficha de personagem");
            System.out.println("\t0 - Sair");

            Scanner leitor = new Scanner(System.in);
            opt = leitor.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("\n\n\n--->Voce escolheu: Criar uma nova ficha de personagem !");
                    fichaDePersonagem ficha = new fichaDePersonagem();
                    ficha.setInfoDoPersonagem();
                    System.out.println("\n\nAs Informações do personagem foram salvas com sucesso!");
                    ficha.setAtributos();
                    

                    
                    
                    break;
                case 2:
                    System.out.println("\n\n\n--->Voce escolheu: Carregar uma ficha de personagem!");
                    
                    break;
                case 3:
                    System.out.println("\n\n\n--->Voce escolheu: Display uma ficha de personagem!");

                    break;
                case 0:
                    System.out.println("\n\n\n--->Voce escolheu: Sair!");

                    break;
            }
            leitor.close();
        } while (opt != 0);

    }
}
