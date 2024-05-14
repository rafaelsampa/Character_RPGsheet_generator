package view;

import controller.FichaController;
import model.FichaModel;
import entities.*;

import java.util.Scanner;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;

public class FichaGUI extends JFrame{
    public FichaGUI(){
        super();   
        this.getContentPane().setLayout(null);
        this.setSize(500, 700);          
        this.setTitle("GERADOR DE FICHA DE D&D 5e");

        JLabel rotulo = new JLabel();
        rotulo.setText("Qual Raca vai ser seu personagem? ");
        rotulo.setBounds(20, 60, 250, 16);
        this.getContentPane().add(rotulo);
        

        JComboBox combo = new JComboBox();
        combo.addItem("Humano");
        combo.addItem("Elfo");
        combo.addItem("Anão");
        combo.addItem("Meio-Elfo");
        combo.addItem("Hafling");
        combo.addItem("Tiefling");
        combo.addItem("Meio-Orc");
        combo.addItem("Draconato");
        combo.setBounds(240,60, 150, 20);
        combo.addItemListener(e -> itemSelecionado(e));

        // JButton botao = new JButton();
        // botao.setText("OK");
        // //botao.setBounds(181, 48, 85, 20);
        // this.getContentPane().add(botao);

        
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(20, 20, 220, 22);
        campoTexto.setText("Digite o nome do Personagem");
        this.getContentPane().add(campoTexto);

        this.getContentPane().add(combo);
    }
    private void itemSelecionado(ItemEvent e){

        if(e.getStateChange() == ItemEvent.SELECTED){

            String itemSelecionado = (String) e.getItem();
            System.out.println("\nFoi selecionado " + itemSelecionado);

        }
    }
    
}