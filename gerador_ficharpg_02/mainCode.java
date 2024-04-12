package gerador_ficharpg_02;
import java.util.Scanner; // Scanner é menos eficiente que o Buffered aparentemente
import java.util.ArrayList;


public class mainCode {
    public static void main(String[] args) {
        int FOR, DES, CON, INT, SAB, CAR;

        ArrayList listaDeTudo = new ArrayList();

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
                    System.out.println("Digite o nome do jogador: "); String nomeDoJogador = leitor.nextLine();
                    System.out.println("Digite o nome do personagem: "); String nomeDoPersonagem = leitor.nextLine();
                    System.out.println("\n\n\nClasses disponiveis: \n\t- Guerreiro"); // Adicionar depois de futuras implementacoes
                    System.out.println("Digite a classe do personagem: ");String classe = leitor.nextLine();
                    System.out.println("\n\n\nRacas disponiveis: \n\t- Humano\n\t- Anão\n\t- Elfo"); // Adicionar depois de futuras implementacoes
                    System.out.println("Digite a raça do personagem: "); String raca = leitor.nextLine();
                    System.out.println("Antededentes disponiveis: \n\t- Nenhum");
                    System.out.println("Digite o antecedente do personagem: "); String antecedentes = leitor.nextLine();   
                    ficha.setInfoDoPersonagem(nomeDoJogador, nomeDoPersonagem, classe, raca, antecedentes);
                    System.out.println("\n\nAs Informações do personagem foram salvas com sucesso!");

                    switch (raca) {
                        case "Humano":
                        
                            break;
                        case "Mago":
                        
                            break;
                        default:
                            break;
                    }

                    switch (classe) {
                        case "Guerreiro":
                        
                            break;
                        case "Mago":

                            break;
                        case "Ladino":
                            
                            break;
                        default:
                            break;
                    }
                    // Escolher a raca e classe
                    System.out.println("\n\n\n");

                    System.out.println("Para os Atributos, voce gostaria de usar os Atributos Padrões:\n\t 1. Padrão: 15, 14, 13, 12, 10, 8");
                    System.out.println("\nOu, \n\t2. Determinar pelos dados ");
                    System.out.println("Digite o número da opção que deseja:");
                    int optAtrib = leitor.nextInt();
                    switch (optAtrib) { // Atribuicao dos atributos do Personagem
                        case 1: // Padrão
                            int[] numbers = {15,14,13,12,10,8};
                            System.out.println("\n\n\n--->Voce escolheu: Padrão!");
                            boolean value;
                            boolean erroSN = true;
                            char optSN;
                            do{
                                System.out.println("Para ABORTAR ou RECOMECAR:");
                                System.out.println("\t- Durante o preenchimento, digite um dos Atributos como 0(Zero).");
                                System.out.println("\t- Preencha tudo, ao finalizar ira aparecer 'Tem certeza? S ou N '.");
                                System.out.println("\n\n\nAtributos possiveis:\n\t FOR, DES, CON, INT, SAB, CAR");
                                System.out.println("Valores possiveis:\n\t" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4] + ", " + numbers[5]);
                                System.out.println("\nFOR ->"); FOR = leitor.nextInt();
                                System.out.println("DES ->"); DES = leitor.nextInt();
                                System.out.println("CON ->"); CON = leitor.nextInt();
                                System.out.println("INT ->"); INT = leitor.nextInt();
                                System.out.println("SAB ->"); SAB = leitor.nextInt();
                                System.out.println("CAR ->"); CAR = leitor.nextInt();

                                value = ValidarAtributos(FOR, DES, CON, INT, SAB, CAR);
                                if(value==false){
                                    System.out.println("Atributos invalidos, REPETIDOS ou FORA DO PADRAO, digite novamente!");
                                }else{
                                    System.out.println("\n\n\n\n\nAtributos validos! Veja seus Atributos: ");
                                    while(erroSN){
                                        displayAributos(FOR, DES, CON, INT, SAB, CAR);
                                        System.out.println("Olhe a como ficou a alocacao dos valores acima.\n Tem certezada sua escolha? ' S ' ou ' N '");
                                        optSN = leitor.next().charAt(0);
                                        if((optSN != 'S' || optSN != 's') && (optSN != 'N' || optSN != 'n')){
                                            System.out.println("Digite 'S' ou 'N'!");
                                            erroSN = true;
                                        }else if(optSN == 'S'){
                                            erroSN = false;
                                            value = true;
                                        }else if(optSN == 'N'){
                                            erroSN = false;
                                            value = false;
                                        }
                                    }
                                }
                            }while(!value);
                            ficha.setAtributosPadrao(FOR, DES, CON, INT, SAB, CAR);
                            break;
                        case 2: // Radando dados Pseudo Randomicos
                            ficha.setAtributosComDados(); // Ainda nao implementada
                            break;
                    }
                    break;
                case 0:
                    System.out.println("\n\n\n--->Voce escolheu: Sair!");
                    break;
            }
            leitor.close();
        } while (opt != 0);
        // acabou
    }
    public static void displayAributos(int FOR, int DES, int CON, int INT, int SAB, int CAR){
        System.out.print("FOR -> " + FOR);
        System.out.print("\tDES -> " + DES);
        System.out.print("\tCON -> " + CON);
        System.out.print("\nINT -> " + INT);
        System.out.print("\tSAB -> " + SAB);
        System.out.print("\tCAR -> " + CAR);
    }
    public static boolean ValidarAtributos(int FOR, int DES, int CON, int INT, int SAB, int CAR){
        Scanner leitor = new Scanner(System.in);
        boolean erro; // Loop principal
        do{
            if(FOR == DES || FOR == CON || FOR == INT || FOR == SAB || FOR == CAR ||
                DES == CON || DES == INT || DES == SAB || DES == CAR ||
                CON == INT || CON == SAB || CON == CAR ||
                INT == SAB || INT == CAR){ // Isso significa que repetiu o numero em outro atributo
                erro = true; return false;
            }else if (FOR > 15 || FOR == 11 || FOR == 9 || FOR < 8){
                erro = true; return false;
            }else if (DES > 15 || DES == 11 || DES == 9 || DES < 8){
                erro = true; return false;
            }else if (CON > 15 || CON == 11 || CON == 9 || CON < 8){
                erro = true; return false;
            }else if (INT > 15 || INT == 11 || INT == 9 || INT < 8){
                erro = true; return false;
            }else if (SAB > 15 || SAB == 11 || SAB == 9 || SAB < 8){
                erro = true; return false;
            }else if (CAR > 15 || CAR == 11 || CAR == 9 || CAR < 8){
                erro = true; return false;
            }else{
                erro = false;
            }
        }while(erro);
        leitor.close();
        return true;
    }
}
