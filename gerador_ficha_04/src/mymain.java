import java.util.Random;
import java.io.Console;

import java.util.Scanner; // Scanner é menos eficiente que o Buffered aparentemente
import java.util.ArrayList;

import view.FichaGUI;
import controller.FichaController;
import model.Ficha;
import model.FichaModeL;

public class mymain {

    public static void main(String args[]){

        // FichaGUI janela = new FichaGUI();
        // janela.show();

        Ficha FichaModel = new Ficha();

        FichaGUI InterfaceView = new FichaGUI();
        
        FichaController CentralController = new FichaController(FichaModel, InterfaceView);


        
        InterfaceView.setVisible(true);
    }
    
}
