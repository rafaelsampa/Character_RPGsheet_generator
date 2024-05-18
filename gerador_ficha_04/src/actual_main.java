import java.util.Random;
import java.io.Console;

import java.util.Scanner; // Scanner é menos eficiente que o Buffered aparentemente
import java.util.ArrayList;

import view.FichaGUI;
import controller.FichaController;
import model.Ficha;
import model.FichaModeL;

public class actual_main {

    public static void main(String args[]) {

        Ficha FichaModel = new Ficha();
        FichaGUI InterfaceView = new FichaGUI();
        FichaController CentralController = new FichaController(FichaModel, InterfaceView);

        InterfaceView.setControllerInfos(CentralController); // Estabeleci a conectao do view para ouvir as acoes do controller
        InterfaceView.setControllerAtributos(CentralController); // Estabeleci a conectao do view para ouvir as acoes do controller

        InterfaceView.setVisible(true);
    }
    
}
