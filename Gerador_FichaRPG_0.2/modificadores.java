package Gerador_FichaRPG_0.2;

public class modificadores {
    String racaHuman = "Humano";
    String racaAnao = "Anão";
    String racaElfo = "Elfo";
    String racaHalfling = "Halfling";
    String racaMeioElfo = "Meio-Elfo";
    String racaMeioOrc = "Meio-Orc";
    String racaTiefling = "Tiefling";
    String racaHalfling = "Halfling";
    int modFor, modDes, modCon, modInt, modSab, modCar;
    int nivel, FOR, DES, CON, INT, SAB, CAR;

    class checkRaca(){
        this.nivel = fichaIn.nivel;
        this.FOR = fichaIn.FOR;
        this.DES = fichaIn.DES;
        this.CON = fichaIn.CON;
        this.INT = fichaIn.INT;
        this.SAB = fichaIn.SAB;
        this.CAR = fichaIn.CAR;
        this.raca = fichaIn.raca;

        if(racaIn.equalsIgnoreCase("Anão")){
            this.modCon = 2;
            this.CON += this.modCon;
            
        }else if(racaIn.equalsIgnoreCase("Elfo")){
            this.modDes = 2;

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
        return fichaIn;
    }
}
