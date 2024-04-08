package Gerador_FichaRPG_0.1;

import java.util.Date;


public class Raca {
    public String nomeRaca;
    int modFor, modDes, modCon, modInt, modSab, modCar;

    int checkRaca(String racaIn){

        if(racaIn.equalsIgnoreCase("Anão")){
            modCon = 2;
        }else if(racaIn.equalsIgnoreCase("Elfo")){
            modDes = 2;
        }else if(racaIn.equalsIgnoreCase("Meio-Elfo")){
            modSab = 2;// * outros dois valores a sua escolha mais 1
        }else if(racaIn.equalsIgnoreCase("Humano")){
            modFor = 1; modDes = 1; modCon = 1; modInt = 1; modSab = 1; modCar = 1;
        }else if(racaIn.equalsIgnoreCase("Meio-Orc")){
            
        }else if(racaIn.equalsIgnoreCase("Tiefling")){

        }else if(racaIn.equalsIgnoreCase("Halfling")){
            modDes = 2;
        }else{
            return 0;
        }
        return 1;
    }

}
