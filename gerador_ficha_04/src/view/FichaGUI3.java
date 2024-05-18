// package view;


// import controller.FichaController;
// import model.Ficha;
// import model.FichaModeL;

// import java.util.Scanner;
// import java.util.Date;

// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.BorderFactory;
// import javax.swing.JButton;
// import javax.swing.JLabel;
// import javax.swing.JComboBox;
// import javax.swing.JCheckBox;
// import javax.swing.JTextField;

// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.GridLayout;
// import java.awt.Rectangle;
// import java.awt.event.ItemEvent;

// public class FichaGUI extends JFrame{

//     private JComboBox combo;
//     private JComboBox combo2;
//     private JComboBox combo3;
//     private JPanel infoInput;
//     private JPanel nomeJogador;
//     private JPanel nomeJogadorInput;
//     private JPanel nomePerso;
//     private JPanel nomePersoInput;
//     private JPanel infoRaca;
//     private JPanel infoRacaInput;
//     private JPanel infoClasse;
//     private JPanel infoClasseInput;
//     private JPanel infoAntec;
//     private JPanel infoAntecInput;
//     private JLabel blocoEscrita1;
//     private JLabel blocoEscrita2;
//     private JTextField campoTexto;
//     private JLabel bloco1;
//     private JLabel bloco2;
//     private JLabel bloco3;
//     private JButton confirmbotao;
//     private JCheckBox checkboxPericia;
//     private JTextField campoTexto1;
//     private JTextField campoTexto2;

//     private FichaController controller;
//     String[] pericias = { "Acrobacia", "Arcanismo", "Atletismo", "Atuação", "Blefar", "Furtividade", "História", "Intimidação", "Intuição", "Investigação", 
//     "Lidar com os Animais", "Medicina", "Natureza", "Percepção","Persuasão", "Prestidigitação", "Religião", "Sobrevivência" };
//     String[] Racas = { "Anão", "Elfo", "Hafling", "Humano", "Draconato", "Gnomo", "Meio-Elfo", "Meio-Orc", "Tiefling" };
//     String[] classes = { "Bárbaro", "Bardo", "Bruxo", "Clérigo", "Druida", "Feiticeiro", "Guerreiro", "Ladino","Mago", "Monge", "Paladino", "Patrulheiro" };
//     String[] antecendentes = { "Acólito", "Artesão de Guilda", "Artista", "Artista", "Charlatão", "Criminoso","Eremita", "Forasteiro", "Herói do Povo", 
//     "Marinheiro", "Nobre", "Orfão", "Sábio", "Soldado" };

//     public FichaGUI() {
//         super();
//         this.setTitle("GERADOR DE FICHA DE D&D 5e");
//         this.setSize(1000, 700);
//         this.setResizable(false);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLocationRelativeTo(null);
//         this.getContentPane().setLayout(null);

//         infoInput = new JPanel(new GridLayout(20, 1));
//             infoInput.setBounds(10, 10, 300, 550);
//             infoInput.setBackground(Color.LIGHT_GRAY);
//             this.getContentPane().add(infoInput);
        
//         nomeJogador = new JPanel(new FlowLayout());
//             blocoEscrita1 = new JLabel();
//             blocoEscrita1.setText("Escreva o nome, ou apelido, do Jogador: ");
//             blocoEscrita1.setBounds(20, 20, 260, 16);
//             nomeJogador.add(blocoEscrita1);

//             infoInput.add(nomeJogador);

//         nomeJogadorInput = new JPanel(new FlowLayout());
//             campoTexto1 = new JTextField();
//             campoTexto1.setPreferredSize(new Dimension(250, 22));
//             campoTexto1.setText("Digite Aqui");
//             nomeJogadorInput.add(campoTexto1);

//             infoInput.add(nomeJogadorInput);    
            
//         nomePerso = new JPanel(new FlowLayout());
//             blocoEscrita2 = new JLabel();
//             blocoEscrita2.setText("Escolha um nome para seu personagem: ");
//             nomePerso.add(blocoEscrita2);

//             infoInput.add(nomePerso);

//         nomePersoInput = new JPanel(new FlowLayout());
//             campoTexto2 = new JTextField();
//             campoTexto2.setPreferredSize(new Dimension(250, 22));
//             campoTexto2.setText("Digite Aqui");
//             nomePersoInput.add(campoTexto2);

//             infoInput.add(nomePersoInput);

//         infoRaca = new JPanel(new FlowLayout());
//             bloco1 = new JLabel();
//             bloco1.setText("Escolha a Raca do seu personagem: ");
//             infoRaca.add(bloco1);

//             infoInput.add(infoRaca);

//         infoRacaInput = new JPanel(new FlowLayout());
//             combo = new JComboBox(Racas);
//             combo.setPreferredSize(new Dimension(250, 22));
//             infoRacaInput.add(combo);

//             infoInput.add(infoRacaInput);

//         infoClasse = new JPanel(new FlowLayout());
//             bloco2 = new JLabel();
//             bloco2.setText("Escolha a Classe do seu personagem: ");
//             bloco2.setBounds(20, 140, 250, 16);
//             infoClasse.add(bloco2);

//             infoInput.add(infoClasse);
        
//         infoClasseInput = new JPanel(new FlowLayout());
//             combo2 = new JComboBox(classes);
//             combo2.setPreferredSize(new Dimension(250, 22));
//             infoClasseInput.add(combo2);

//             infoInput.add(infoClasseInput);

//         infoAntec = new JPanel(new FlowLayout());
//             bloco3 = new JLabel();
//             bloco3.setText("Escolha a Antecendente do seu personagem: ");
//             bloco3.setBounds(20, 180, 250, 16);
//             infoAntec.add(bloco3);

//             infoInput.add(infoAntec);

//         infoAntecInput = new JPanel(new FlowLayout());
//             combo3 = new JComboBox(antecendentes);
//             combo3.setPreferredSize(new Dimension(250, 22));
//             infoAntecInput.add(combo3);
       
//             infoInput.add(infoAntecInput);

//         JLabel periciasLabel = new JLabel();
//         periciasLabel.setText("<html>Com base nas caracteristicas a esquerda, escolha suas perícias:<br>Dentre elas escolha X entre as de: X, Y, Z");
//         periciasLabel.setBounds(450, 20, 540, 32);
//         this.getContentPane().add(periciasLabel);
            
//         JPanel periciasPanel = new JPanel();
//         periciasPanel.setLayout(new GridLayout(6, 3));
//         periciasPanel.setBounds(450, 60, 540, 200);
//         periciasPanel.setBackground(Color.CYAN);
//         this.getContentPane().add(periciasPanel);
//             for (String pericia : pericias) {
//                 JCheckBox checkboxPericia = new JCheckBox(pericia);
//                 periciasPanel.add(checkboxPericia);
//             }

        
//         confirmbotao = new JButton();
//         confirmbotao.setText("Confirmar");
//         confirmbotao.setBounds(780, 640, 85, 20);
//         this.getContentPane().add(confirmbotao);

//     }


//     public void setController(FichaController controller) {
//         this.controller = controller;
//         combo.addItemListener(e2 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e2));
//         combo2.addItemListener(e3 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e3));
//         combo3.addItemListener(e4 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e4));
//         confirmbotao.addItemListener(e5 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e5));
//     }
    
// }