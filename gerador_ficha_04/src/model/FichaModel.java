package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;


public class FichaModeL implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String FILENAME = "FICHA_DE_PERSONAGEM.txt";

    public void saveUserData(Ficha usuario) {
        // try {
        //     FileWriter writer = new FileWriter(FILENAME, true);
        //     writer.write(Ficha.getNomeDoPersonagem());
        //     writer.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }

}


