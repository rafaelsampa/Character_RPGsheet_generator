package Projeto_POO_RPG.gerador_ficharpg_03;

import java.util.Random;
import java.io.Console;

import java.util.Scanner; // Scanner é menos eficiente que o Buffered aparentemente
import java.util.ArrayList;


public class mainCode {
    public static void main(String[] args) {
        int FOR, DES, CON, INT, SAB, CAR;
        int optRacas, optClasses;
        String nomeDoJogador, nomeDoPersonagem;
        String classe, raca, antecedentes;

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

                    System.out.println("Digite o nome do jogador: "); nomeDoJogador = leitor.nextLine();
                    System.out.println("Digite o nome do personagem: "); nomeDoPersonagem = leitor.nextLine();

                    boolean valida;
                    do{  // loop para fazer a escolha de raça, COM UMA VALIDACAO
                        System.out.println("Qual Raca vai ser seu personagem? ");
                        System.out.println("Racas disponiveis: ");
                        System.out.println("1- Anão\n- Elfo\n3- Halfling\n4- Humano\n5- Draconato\n6- Gnomo\n7- Meio-ELfo\n8- Meio-Orc\n9- Tiefling"); // As nove racas possiveis
                        optRacas = leitor.nextInt();
                        valida = validarRaca(optRacas);
                        if(valida == true){
                            System.err.println("Raca invalida, digite um numero entre 1 e 9!");
                        }else{
                            System.out.println("Raca valida!");;
                        }
                    }while(valida);
                    switch (optRacas) {
                        case 1:
                            raca = "Anão";

                            break;
                        case 2:
                            raca = "Elfo";

                            break;
                        case 3:
                            raca = "Halfling";

                            break;
                        case 4: 
                            raca = "Humano";

                            break;
                        case 5: 
                            raca = "Draconato";

                            break;
                        case 6: 
                            raca = "Gnomo";

                            break;
                        case 7: 
                            raca = "Meio-Elfo";

                            break;
                        case 8: 
                            raca = "Meio-Orc";

                            break;
                        case 9: 
                            raca = "Tiefling";

                            break;
                    }
                    
                    do{  // loop para fazer a escolha de classe, COM UMA VALIDACAO
                        System.out.println("Qual Classe vai ser seu personagem? ");
                        System.out.println("Classes disponiveis: ");
                        System.out.println("1- Bárbaro\n2- Bardo\n3- Bruxo\n4- Clérigo\n5- Druida\n6- Feiticeiro\n7- Guerreiro\n8- Ladino\n9- Mago\n10- Monge\n11- Paladino\n12- Patrulheiro");
                        optClasses = leitor.nextInt();
                        valida = validarClasse(optClasses);
                        if(valida == true){
                            System.err.println("Classe invalida, digite um numero entre 1 e 12!");
                        }else{
                            System.out.println("Classe valida!");;
                        }
                    }while(valida);
                    switch (optClasses) {
                        case 1:
                            classe = "Bárbaro";

                            break;
                        case 2:
                            classe = "Bardo";

                            break;
                        case 3:
                            classe = "Bruxo";

                            break;
                        case 4:
                            classe = "Clérigo";

                            break;
                        case 5:
                            classe = "Druida";

                            break;
                        case 6:
                            classe = "Feiticeiro";

                            break;
                        case 7:
                            classe = "Guerreiro";

                            break;
                        case 8:
                            classe = "Ladino";

                            break;
                        case 9:
                            classe = "Mago";

                            break;
                        case 10:
                            classe = "Monge";
                            
                            break;
                        case 11:
                            classe = "Paladino";

                            break;
                        case 12:
                            classe = "Patrulheiro";

                            break;
                    }
                    do{ 
                        System.out.println("Qual Antecedente do seu personagem? ");
                        System.out.println("Antecedentes disponiveis: ");
                        System.out.println("1- Acólito\n2- Artesão de Guilda\n3- Artista\n4- Charlatão\n5- Criminoso\n6- Eremita\n7- Forasteiro\n8- Herói do Povo\n9- Marinheiro\n10- Nobre\n11- Orfão\n12- Sábio\n13- Soldado");
                        optClasses = leitor.nextInt();
                        valida = validarClasse(optClasses);
                        if(valida == true){
                            System.err.println("Antecedente invalido, digite um numero entre 1 e 12!");
                        }else{
                            System.out.println("Antecedente valido!");;
                        }
                    }while(valida);
                    switch (optClasses) {
                        case 1:
                            antecedentes = "Acólito";

                            break;
                        case 2:
                            antecedentes = "Artesão de Guilda";
                            break;
                        case 3:
                            antecedentes = "Artista";

                            break;
                        case 4:
                            antecedentes = "Charlatão";

                            break;
                        case 5:
                            antecedentes = "Criminoso"; 

                            break;
                        case 6: 
                            antecedentes = "Eremita";

                            break;
                        case 7: 
                            antecedentes = "Forasteiro";
                            break;
                        case 8:
                            antecedentes = "Herói do Povo";

                            break;
                        case 9: 
                            antecedentes = "marinheiro";

                            break;
                        case 10: 
                            classe = "Nobre";
                            
                            break;
                        case 11: 
                            classe = "Orfão";

                            break;
                        case 12: 
                            classe = "Sábio";

                            break;
                        case 13:
                            antecedentes = "Soldado";

                            break;
                    }

                    ficha.setInfoDoPersonagem(nomeDoJogador, nomeDoPersonagem, classe, raca, antecedentes); // PARA MEU PAPAIZINHO MARTINS: nao to entendendo porque aqui ta cheio de erro CARALHO
                    System.out.println("\n\nAs Informações do personagem foram salvas com sucesso!");

                    
                    
                    // Escolher a raca e classe
                    System.out.println("\n\n\n");

                    System.out.println("Para os Atributos, voce gostaria de usar os Atributos Padrões:\n\t 1. Padrão: 15, 14, 13, 12, 10, 8");
                    System.out.println("\nOu, \n\t2. Determinar pelos dados ");
                    System.out.println("Digite o número da opção que deseja:");
                    int optAtrib = leitor.nextInt();
                    switch (optAtrib) { // Atribuicao dos atributos do Personagem
                        case 1: // Atributos pre definidos.
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
    public static boolean validarRaca(int controle){
        if(controle > 9 || controle < 1){
            return true;
        }else{
            return false;
        }
    }
    public static boolean validarClasse(int controle){
        if(controle > 12 || controle < 1){
            return true;
        }else{
            return false;
        }
    }
    public static void clearMacTerminal(){
        System.out.print("\033[H\033[2J"); // Limpa a tela no mac
        System.out.flush();
    }
    public static void clearWindowsTerminal(){
        //Pesquisei mas nao achei nenhuma forma elegante, nada alem disso:
        //Runtime.getRuntime().exec("cls");
        // Que eu nem sei se funciona.
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
