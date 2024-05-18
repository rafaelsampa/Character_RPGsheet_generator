package controller;

import view.FichaGUI;
import model.Ficha;
import model.FichaModeL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FichaController {

    private Ficha NovaFicha; // Model object
    private FichaGUI NovaFichaGUI; // View Object

    public FichaController(Ficha NovaFicha, FichaGUI NovaFichaGUI){
        this.NovaFicha = NovaFicha;
        this.NovaFichaGUI = NovaFichaGUI;
    }

    public void itemSelecionado_setCaracteristicas_dePersonagem(ItemEvent x){
        if(x.getStateChange() == ItemEvent.SELECTED){

            String itemSelecionado = (String) x.getItem();
            // System.out.println("\nFoi selecionado " + itemSelecionado);
            // System.out.println( "\n__________________\n");

            switch (itemSelecionado) {
                // Cada metodo desse vai usar um set de acordo com as especificacoes de Raca, Classe ou Antecedentes, tiradas do livro ofical de DeD
                case "Anão":
                    
                    break;
                case "Elfo":
                    
                    break;
                case "Halfling":

                    break;
                case "Humano": 
                    
                    break;
                case "Draconato":

                    break;
                case "Gnomo":

                    break;
                case "Meio-Elfo":

                    break;
                case "Meio-Orc":

                    break;
                case "Tiefling":

                    break;
            }
        }
    }
    
}