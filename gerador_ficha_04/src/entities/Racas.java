package entities;



public class Racas { // Ja to comecando a desistir dessa tbm, sera queé realmente util? (martins se n entender do que eu to falando vai para a "classes.java")
    private String nomeRaca;
    private int pontosdevida, dadoVida, modAtributos;
    private boolean[] pericias; // Numero possiveis(a depender da raca) para escolher pericias.
    private boolean profArmasSimples;
    private boolean profArmasMarciais;
    private boolean profArmaduras;
    private boolean profEscudos;
    private boolean profFerramentas;
    private boolean tstFOR, tstCON; // Porque?

    public void setAnao() {
        modAtributos = 2;
        //setCON(modAtributos);

        

    }
    public void setHumano() {
        modAtributos = 1;
        pontosdevida = 10; // BASE: um 1d10 + modCON
        profArmasSimples = true; // todo true = todas, e false = nenhuma.
        profArmasMarciais = true;
        profArmaduras = true;
        profEscudos = true;
        profFerramentas = false;
    }
    public void setElfo() {

    }
    public void setMeioElfo() {

    }
    public void setTiefling() {

    }
    public void setDraconato() {

    }
    public void setMeioOrc() {

    }
    public void setHalfling() {

    }
    public void setGnomo() {

    }

}
