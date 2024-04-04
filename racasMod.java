package GeradorDeFicha;

public class racasMod {
    String racaHuman = "Humano";
    String racaAnao = "Anão";
    String racaElfo = "Elfo";
    String racaHalfling = "Halfling";
    String racaMeioElfo = "Meio-Elfo";
    String racaMeioOrc = "Meio-Orc";

    /* HUMANO
        - Aumento no Valor de Habilidade: 
        Todos os seus valores de habilidade aumentam em 1.

        - Idiomas:
        Você pode falar, ler e escrever Comum e outro idioma adicional, à sua escolha.
        Os humanos normalmente aprendem os idiomas dos povos que convivem, incluindo dialetos obscuros. 
        Eles gostam de rechear seu discurso com palavras emprestadas de outras línguas:
        xingamentos orcs, expressões musicais élficas, frases militares anãs e outros.
     
    */

    void setAumentoHumano(int[] atributos){
        for(int i = 0; i < 7; i++){
            atributos[i] += 1;
        }
    }
}
