package view;


import controller.FichaController;
import model.Ficha;
import model.FichaModeL;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class FichaGUI extends JFrame{

    private JComboBox combo;
    private JComboBox combo2;
    private JComboBox combo3;
    private JComboBox comboFOR;
    private JComboBox comboDES;
    private JComboBox comboCON;
    private JComboBox comboINT;
    private JComboBox comboSAB;
    private JComboBox comboCAR;



    private JPanel infoInput;
    private JPanel nomeJogador;
    private JPanel nomeJogadorInput;
    private JPanel nomePerso;
    private JPanel nomePersoInput;
    private JPanel infoRaca;
    private JPanel infoRacaInput;
    private JPanel infoClasse;
    private JPanel infoClasseInput;
    private JPanel infoAntec;
    private JPanel infoAntecInput;
    private JLabel blocoEscrita1;
    private JLabel blocoEscrita2;
    private JTextField campoTexto;
    private JLabel bloco1;
    private JLabel bloco2;
    private JLabel bloco3;
    private JButton confirmbotao;
    private JCheckBox checkboxPericia;
    private JTextField campoTexto1;
    private JTextField campoTexto2;
    private String[] atributos = {"15","14","13","12","10","8"};

    private FichaController controller;
    private String[] pericias = { "Acrobacia", "Arcanismo", "Atletismo", "Atuação", "Blefar", "Furtividade", "História", "Intimidação", "Intuição", "Investigação", 
    "Lidar com os Animais", "Medicina", "Natureza", "Percepção","Persuasão", "Prestidigitação", "Religião", "Sobrevivência" };
    private String[] Racas = { "Anão", "Elfo", "Hafling", "Humano", "Draconato", "Gnomo", "Meio-Elfo", "Meio-Orc", "Tiefling" };
    private String[] classes = { "Bárbaro", "Bardo", "Bruxo", "Clérigo", "Druida", "Feiticeiro", "Guerreiro", "Ladino","Mago", "Monge", "Paladino", "Patrulheiro" };
    private String[] antecendentes = { "Acólito", "Artesão de Guilda", "Artista", "Artista", "Charlatão", "Criminoso","Eremita", "Forasteiro", "Herói do Povo", 
    "Marinheiro", "Nobre", "Orfão", "Sábio", "Soldado" };

    public FichaGUI() {
        super();
        this.setTitle("GERADOR DE FICHA DE D&D 5e");
        this.setSize(1000, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);

        // infoInput = new JPanel(new GridLayout(20, 1));
        //     infoInput.setBounds(10, 10, 300, 550);
        //     infoInput.setBackground(Color.LIGHT_GRAY);
        //     this.getContentPane().add(infoInput);
        

        blocoEscrita1 = new JLabel();
        blocoEscrita1.setText("Escreva o nome/apelido do Jogador: ");
        blocoEscrita1.setBounds(20, 20, 250, 16);
        this.getContentPane().add(blocoEscrita1);

        campoTexto1 = new JTextField();
        campoTexto1.setBounds(20, 40, 200, 22);
        campoTexto1.setText("Digite Aqui");
        this.getContentPane().add(campoTexto1);
            
        blocoEscrita1 = new JLabel();
        blocoEscrita1.setText("Escreva o nome do seu personagem: ");
        blocoEscrita1.setBounds(20, 80, 250, 16);
        this.getContentPane().add(blocoEscrita1);

        campoTexto1 = new JTextField();
        campoTexto1.setBounds(20, 100, 200, 22);
        campoTexto1.setText("Digite Aqui");
        this.getContentPane().add(campoTexto1);


        bloco1 = new JLabel();
        bloco1.setBounds(20, 140, 240, 16);
        bloco1.setText("Escolha a Raca do seu personagem: ");
        this.getContentPane().add(bloco1);

        combo = new JComboBox(Racas);
        combo.setBounds(250, 140, 120, 22);
        combo.setPreferredSize(new Dimension(150, 22));
        combo.addItemListener(e -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e));
        this.getContentPane().add(combo);
        

        bloco2 = new JLabel();
        bloco2.setText("Escolha a Classe do seu personagem: ");
        bloco2.setBounds(20, 180, 240, 16);
        this.getContentPane().add(bloco2);

    
        combo2 = new JComboBox(classes);
        combo2.setBounds(260, 180, 120, 22);
        combo2.setPreferredSize(new Dimension(150, 22));
        combo.addItemListener(e2 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e2));
        this.getContentPane().add(combo2);

       
        bloco3 = new JLabel();
        bloco3.setText("Escolha a Antecendente do seu personagem: ");
        bloco3.setBounds(20, 220, 290, 16);
        this.getContentPane().add(bloco3);

        combo3 = new JComboBox(antecendentes);
        combo3.setBounds(300, 220, 140, 22);
        combo3.setPreferredSize(new Dimension(150, 22));
        combo3.addItemListener(e3 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e3));
        this.getContentPane().add(combo3);

        JLabel Atribs = new JLabel();
        Atribs.setText("<html>Escolha os atributos do seu personagem:<br>Destribua os 6 atributos predefinidos");
        Atribs.setBounds(20, 260, 290, 32);
        this.getContentPane().add(Atribs);


        JLabel forca = new JLabel();
        forca.setText("FORCA: ");
        forca.setBounds(20, 300, 80, 16);
        this.getContentPane().add(forca);
        comboFOR = new JComboBox(atributos);
        comboFOR.setBounds(100, 300, 100, 22);
        comboFOR.setPreferredSize(new Dimension(100, 22));
        comboFOR.addItemListener(e4 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e4));

        this.getContentPane().add(comboFOR);

        JLabel destreza = new JLabel();
        destreza.setText("DESTREZA: ");
        destreza.setBounds(20, 320, 80, 16);
        this.getContentPane().add(destreza);
        comboDES = new JComboBox(atributos);
        comboDES.setBounds(100, 320, 100, 22);
        comboDES.setPreferredSize(new Dimension(100, 22));
        comboDES.addItemListener(eDES -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eDES));
        this.getContentPane().add(comboDES);



        JLabel constituicao = new JLabel();
        constituicao.setText("CONSTITUICÃO: ");
        constituicao.setBounds(20, 340, 80, 16);
        this.getContentPane().add(constituicao);
        comboCON = new JComboBox(atributos);
        comboCON.setBounds(100, 340, 100, 22);
        comboCON.setPreferredSize(new Dimension(100, 22));
        comboCON.addItemListener(eCON -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eCON));
        this.getContentPane().add(comboCON);

        JLabel inteligencia = new JLabel();
        inteligencia.setText("INTELIGÊNCIA: ");
        inteligencia.setBounds(20, 360, 80, 16);
        this.getContentPane().add(inteligencia);
        comboINT = new JComboBox(atributos);
        comboINT.setBounds(100, 360, 100, 22);
        comboINT.setPreferredSize(new Dimension(100, 22));
        comboINT.addItemListener(eINT -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eINT));
        this.getContentPane().add(comboINT);

        JLabel sabedoria = new JLabel();
        sabedoria.setText("SABEDORIA: ");
        sabedoria.setBounds(20, 380, 80, 16);
        this.getContentPane().add(sabedoria);
        comboSAB = new JComboBox(atributos);
        comboSAB.setBounds(100, 380, 100, 22);
        comboSAB.setPreferredSize(new Dimension(100, 22));
        comboSAB.addItemListener(eSAB -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eSAB));
        this.getContentPane().add(comboSAB);

        JLabel carisma = new JLabel();
        carisma.setText("CARISMA: ");
        carisma.setBounds(20, 400, 80, 16);
        this.getContentPane().add(carisma);
        comboCAR = new JComboBox(atributos);
        comboCAR.setBounds(100, 400, 100, 22);
        comboCAR.setPreferredSize(new Dimension(100, 22));
        comboCAR.addItemListener(eCAR -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eCAR));
        this.getContentPane().add(comboCAR);



        // LADO DIREITO ---------------------------------------------
        JLabel periciasLabel = new JLabel();
        periciasLabel.setText("<html>Com base nas caracteristicas a esquerda, escolha suas perícias:<br>Dentre elas escolha X entre as de: X, Y, Z");
        periciasLabel.setBounds(450, 20, 540, 32);
        this.getContentPane().add(periciasLabel);
            
        JPanel periciasPanel = new JPanel();
        periciasPanel.setLayout(new GridLayout(6, 3));
        periciasPanel.setBounds(450, 60, 540, 200);
        periciasPanel.setBackground(Color.CYAN);
        this.getContentPane().add(periciasPanel);
            for (String pericia : pericias) {
                JCheckBox checkboxPericia = new JCheckBox(pericia);
                periciasPanel.add(checkboxPericia);
            }

        
        confirmbotao = new JButton();
        confirmbotao.setText("Confirmar");
        confirmbotao.setBounds(780, 640, 85, 20);
        confirmbotao.addItemListener(e0 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e0));
        this.getContentPane().add(confirmbotao);

    }
    

    public void setControllerAtributos(FichaController controller){
        this.controller = controller;
        comboFOR.addItemListener(eFOR -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eFOR));
        comboDES.addItemListener(eDES -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eDES));
        comboCON.addItemListener(eCON -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eCON));
        comboINT.addItemListener(eINT -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eINT));
        comboSAB.addItemListener(eSAB -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eSAB));
        comboCAR.addItemListener(eCAR -> controller.itemSelecionado_setCaracteristicas_dePersonagem(eCAR));
    }

    public void setControllerInfos(FichaController controller) {
        this.controller = controller;
        combo.addItemListener(e -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e));
        combo2.addItemListener(e2 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e2));
        combo3.addItemListener(e3 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e3));

        confirmbotao.addItemListener(e0 -> controller.itemSelecionado_setCaracteristicas_dePersonagem(e0));
    }
    
}