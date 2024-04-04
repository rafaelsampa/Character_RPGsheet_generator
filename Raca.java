package GeradorDeFicha;

import java.util.Date;


public class Raca {
    public String nomeRaca;
    int modFor, modDes, modCon, modInt, modSab, modCar;

    int checkRaca(String racaIn){

        if(racaIn.equalsIgnoreCase("Anão")){
    
        }else if(racaIn.equalsIgnoreCase("Elfo")){
            
        }else if(racaIn.equalsIgnoreCase("Meio-Elfo")){
            
        }else if(racaIn.equalsIgnoreCase("Humano")){

        }else if(racaIn.equalsIgnoreCase("Meio-Orc")){
            
        }else if(racaIn.equalsIgnoreCase("Tiefling")){

        }else{
            return 0;
        }
        return 1;
    }

}
