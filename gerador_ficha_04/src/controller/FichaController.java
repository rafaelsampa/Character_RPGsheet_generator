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
import java.util.ArrayList;

import javax.swing.JComboBox;

public class FichaController {

    private Ficha NovaFicha; // Model object
    private FichaGUI NovaFichaGUI; // View Object
    private JComboBox combo;
    private String itemSelected;
    private String itemDeselected;
    private ArrayList<String> allItemsDeslecteds = new ArrayList<>();

    public FichaController(Ficha NovaFicha, FichaGUI NovaFichaGUI){
        this.NovaFicha = NovaFicha;
        this.NovaFichaGUI = NovaFichaGUI;
    }

    public JComboBox setCombo(JComboBox inputCombo){
        combo = inputCombo;
        return combo;
    }
    
    private void removeThisItem(JComboBox combo, String itemSel){
        // if(itemSel == "15"){
        //     combo.removeItem(itemSel);
        //     allItemsDeslecteds.add("15");
        // }else if(itemSel == "14"){
        //     combo.removeItem(itemSel);
        //     allItemsDeslecteds.add("14");
        // }else if(itemSel == "13"){
        //     combo.removeItem(itemSel);
        //     allItemsDeslecteds.add("13");
        // }else if(itemSel == "12"){
        //     combo.removeItem(itemSel);
        //     allItemsDeslecteds.add("12");
        // }else if(itemSel == "10"){
        //     combo.removeItem(itemSel);
        //     allItemsDeslecteds.add("10");
        // }else if(itemSel == "8"){
        //     combo.removeItem(itemSel);
        //     allItemsDeslecteds.add("8");
        // }
        if(itemSel == "15" || itemSel == "14" || itemSel == "13" || itemSel == "12" || itemSel == "10" || itemSel == "8"){
            combo.removeItem(itemSel);
            setCombo(combo);
        }else{
            // nao faca nada
        }
    }

    public void itemSelecionado_setCaracteristicas_dePersonagem(ItemEvent x, String[] vetor, JComboBox comb) {
        if (x.getStateChange() == ItemEvent.SELECTED) {
            itemSelected = (String) x.getItem();
            setInfos();
            removeThisItem(comb, itemSelected);

            System.out.println("\nFoi selecionado " + itemSelected);
            System.out.println( "\n__________________\n");

        }else if(x.getStateChange() == ItemEvent.DESELECTED){
            itemDeselected = (String) x.getItem();

        }else{
            System.out.println("\n\n\nSei la\n\n\n");
        }
    }

    public void setInfos(){
        switch (itemSelected) {
            // Cada metodo desse vai usar um set de acordo com as especificacoes de Raca,
            // Classe ou Antecedentes, tiradas do livro ofical de DeD

            // RACAS    
            case "Anão":
                NovaFicha.setAnao();
                break;
            case "Elfo":
                NovaFicha.setElfo();
                break;
            case "Halfling":
                NovaFicha.setHalfling();
                break;
            case "Humano":
                NovaFicha.setHumano();
                break;
            case "Draconato":
                NovaFicha.setDraconato();
                break;
            case "Gnomo":
                NovaFicha.setGnomo();
                break;
            case "Meio-Elfo":
                NovaFicha.setMeioElfo();
                break;  
            case "Meio-Orc":
                NovaFicha.setMeioOrc();
                break;
            case "Tiefling":
                NovaFicha.setTiefling();
                break;
            // CLASSES
            case "Barbaro":
                NovaFicha.setBarbaro();
                break;
            case "Bardo":
                NovaFicha.setBardo();
                break;
            case "Bruxo":
                NovaFicha.setBruxo();
                break;
            case "Clerigo":
                NovaFicha.setClerigo();
                break;
            case "Druida":
                NovaFicha.setDruida();
                break;
            case "Feiticeiro":
                NovaFicha.setFeiticeiro();
                break;
            case "Guerreiro":
                NovaFicha.setGuerreiro();
                break;
            case "Ladino":
                NovaFicha.setLadino();
                break;
            case "Mago":
                NovaFicha.setMago();
                break;
            case "Monge":
                NovaFicha.setMonge();
                break;
            case "Paladino":
                NovaFicha.setPaladino();
                break;
            case "Patrulheiro":
                NovaFicha.setPatrulheiro();
                break;
            // ANTECEDENTES
            case "Acólito":
                NovaFicha.setAcolito();
                break;
            case "Artesão de Guilda":
                NovaFicha.setArtesaoDeGuilda();
                break;
            case "Artista":
                NovaFicha.setArtista();
                break;
            case "Charlatão":
                NovaFicha.setCharlatao();
                break;
            case "Criminoso":
                NovaFicha.setCriminoso();
                break;
            case "Eremita":
                NovaFicha.setEremita();
                break;
            case "Forasteiro":
                NovaFicha.setForasteiro();
                break;
            case "Herói do Povo":
                NovaFicha.setHeroiDoPovo();
                break;
            case "Marinheiro":
                NovaFicha.setMarinheiro();
                break;
            case "Nobre":
                NovaFicha.setNobre();
                break;
            case "Orfão":
                NovaFicha.setOrfao();
                break;
            case "Sábio":
               NovaFicha.setSabio();
               break;
            case "Soldado":
                NovaFicha.setSoldado();
                break;
            default: // tratamento de Exception

                break;
        }


    }
}