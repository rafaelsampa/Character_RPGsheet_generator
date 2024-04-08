package Gerador_FichaRPG_0.2;
import java.util.Scanner; // Scanner é menos eficiente que o Buffered aparentemente

public class mainCode {

    public static void main(String[] args) {

        System.out.println("\n\n_______GERADOR DE FICHAS DE PERSONAGENS_______\nDungeons & Dragons 5e!\n\n\n");
        System.out.println("Bem vindo ao gerador de fichas de personagem para D&D 5e!\n");

        int opt = 0;
        do{
            System.out.println("Digite o número da opção que deseja:");
            System.out.println("\t1 - Criar uma nova ficha de personagem");
            System.out.println("\t0 - Sair");

            Scanner leitor = new Scanner(System.in);
            opt = leitor.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("\n\n\n--->Voce escolheu: Criar uma nova ficha de personagem !");
                    fichaDePersonagem ficha = new fichaDePersonagem();
                    ficha.setInfoDoPersonagem();
                    System.out.println("\n\nAs Informações do personagem foram salvas com sucesso!");

                    System.out.println("Para os Atributos, voce gostaria de usar os Atributos Padrões:\n\t 1. Padrão: 15, 14, 13, 12, 10, 8");
                    System.out.println("\nOu, \n\t2. Determinar pelos dados ");
                    
                    
                    
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("\n\n\n--->Voce escolheu: Sair!");
                    break;
            }
            leitor.close();
        } while (opt != 0);

    }
}
