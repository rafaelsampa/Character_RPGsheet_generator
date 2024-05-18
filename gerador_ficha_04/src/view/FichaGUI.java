package view;


import controller.FichaController;
import model.Ficha;
import model.FichaModeL;

import java.util.Scanner;
import java.util.Date;

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
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;

public class FichaGUI extends JFrame{

    private JComboBox combo;
    private JComboBox combo2;
    private JComboBox combo3;
    private JPanel infoInput;
    private JLabel blocoEscrita;
    private JTextField campoTexto;
    private JLabel bloco1;
    private JButton confirmbotao;
    private JCheckBox checkboxPericia;

    private FichaController controller;
    String[] pericias = { "Acrobacia", "Arcanismo", "Atletismo", "Atuação", "Blefar", "Furtividade", "História", "Intimidação", "Intuição", "Investigação", 
    "Lidar com os Animais", "Medicina", "Natureza", "Percepção","Persuasão", "Prestidigitação", "Religião", "Sobrevivência" };
    String[] Racas = { "Anão", "Elfo", "Hafling", "Humano", "Draconato", "Gnomo", "Meio-Elfo", "Meio-Orc", "Tiefling" };
    String[] classes = { "Bárbaro", "Bardo", "Bruxo", "Clérigo", "Druida", "Feiticeiro", "Guerreiro", "Ladino","Mago", "Monge", "Paladino", "Patrulheiro" };
    String[] antecendentes = { "Acólito", "Artesão de Guilda", "Artista", "Artista", "Charlatão", "Criminoso","Eremita", "Forasteiro", "Herói do Povo", 
    "Marinheiro", "Nobre", "Orfão", "Nobre", "Soldado" };

    public FichaGUI() {
        super();
        this.setTitle("GERADOR DE FICHA DE D&D 5e");
        this.setSize(1000, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);

        infoInput = new JPanel();
        infoInput.setLayout(new GridLayout(8, 1));
        infoInput.setBounds(10, 10, 260, 200);
        infoInput.setBackground(Color.LIGHT_GRAY);
        this.getContentPane().add(infoInput);

            blocoEscrita = new JLabel();
            blocoEscrita.setText("Escolha um nome para seu personagem: ");
            blocoEscrita.setBounds(20, 20, 260, 22);
            infoInput.add(blocoEscrita);

            campoTexto = new JTextField();
            campoTexto.setBounds(280, 20, 150, 22);
            campoTexto.setText("       Digite Aqui");
            infoInput.add(campoTexto);

            bloco1 = new JLabel();
            bloco1.setText("Raca do seu personagem: ");
            bloco1.setBounds(20, 60, 250, 16);
            infoInput.add(bloco1);


            combo = new JComboBox(Racas);
            combo.setBounds(240, 60, 150, 20);
            infoInput.add(combo);

            JLabel bloco2 = new JLabel();
            bloco2.setText("Classe do seu personagem: ");
            bloco2.setBounds(20, 90, 250, 16);
            infoInput.add(bloco2);


            combo2 = new JComboBox(classes);
            combo2.setBounds(250, 90, 150, 20);
            infoInput.add(combo2);

            JLabel bloco3 = new JLabel();
            bloco3.setText("Antecendente do seu personagem: ");
            bloco3.setBounds(20, 120, 250, 16);
            infoInput.add(bloco3);


            combo3 = new JComboBox(antecendentes);
            combo3.setBounds(250, 120, 150, 20);
            infoInput.add(combo3);


            JLabel periciasLabel = new JLabel();
            periciasLabel.setText("<html>Com base nas caracteristicas a esquerda, escolha suas perícias:<br>Dentre elas escolha X entre as de: X, Y, Z");
            periciasLabel.setBounds(450, 20, 540, 16);
            this.getContentPane().add(periciasLabel);
            
        JPanel periciasPanel = new JPanel();
        periciasPanel.setLayout(new GridLayout(6, 3));
        periciasPanel.setBounds(450, 50, 540, 200);
        periciasPanel.setBackground(Color.CYAN);
        this.getContentPane().add(periciasPanel);



            for (String pericia : pericias) {
                JCheckBox checkboxPericia = new JCheckBox(pericia);
                periciasPanel.add(checkboxPericia);
            }

        confirmbotao = new JButton();
        confirmbotao.setText("Confirmar");
        confirmbotao.setBounds(780, 640, 85, 20);
        this.getContentPane().add(confirmbotao);
    }

    public void setController(FichaController controller) {
        this.controller = controller;
        combo.addItemListener(e2 -> controller.itemSelecionado(e2));
        combo2.addItemListener(e3 -> controller.itemSelecionado(e3));
        combo3.addItemListener(e4 -> controller.itemSelecionado(e4));
        confirmbotao.addItemListener(e5 -> controller.itemSelecionado(e5));
    }
    
}