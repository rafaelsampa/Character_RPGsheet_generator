package Gerador_FichaRPG_0.2;

import java.util.Scanner;

public class fichaDePersonagem {
    String nomeDoJogador, nomeDoPersonagem, classe, raca, antecedentes;
    int nivel, FOR, DES, CON, INT, SAB, CAR;
    
    public fichaDePersonagem(){
        
    }
    void diplayFicha(){
        System.out.print("\nNome do Personagem: "+ nomeDoPersonagem); System.out.print("\tNome do Jogador: "+ nomeDoJogador);
        System.out.print("Classe & Nivel: "+ classe); System.out.print(", "+ nivel); System.out.print("\tAntecedentes: "+ antecedentes+"\n");
        System.out.print("Raca: "+ raca);
    }
    void setInfoDoPersonagem(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do jogador: ");
        nomeDoJogador = leitor.nextLine();
        System.out.println("Digite o nome do personagem: ");
        nomeDoPersonagem = leitor.nextLine();
        System.out.println("\n\n\nClasses disponiveis: \n\t- Guerreiro"); // Adicionar depois de futuras implementacoes
        System.out.println("Digite a classe do personagem: ");
        classe = leitor.nextLine();
        System.out.println("\n\n\nRacas disponiveis: \n\t- Humano\n\t- Anão\n\t- Elfo"); // Adicionar depois de futuras implementacoes
        System.out.println("Digite a raça do personagem: ");
        raca = leitor.nextLine();
        System.out.println("\n\n\nAntecedente disponiveis: \n\t- Orfão\n\t- Nobre"); // Adicionar depois de futuras implementacoes
        System.out.println("Digite o antecedente do personagem: ");
        antecedentes = leitor.nextLine();        
        System.out.println("Digite o nivel do personagem: "); // isso vai ditar os PVs e...muita coisa, vou assumir primeiramente que é nivel 1
        nivel = leitor.nextInt();
        leitor.close();
    }

    void setAtributosDados(){
        int d6;
        Random number = new Random();
        int number;
        int[6] numbers;
        int[4] d6i; // inicial
        int[4] d6f; // final
        int nivel, FOR, DES, CON, INT, SAB, CAR;
        int aux, aux2;
        

        System.out.println("Usando funcao em Java para gerar numeros pseudo-aleatorios");
        System.out.println("\nGerando 6 valores baseados nos padroes D&D 5e, e um hipotetico d6(dado de 6 lados)");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                d6[i] = randomInt(1,6);
                for(int k = 0; k < 3; k++){
                    // FAZER UMA STACK 
                        aux = d6[k];
                        aux2 = aux;
                        if(aux2 > aux){
                            
                        }
                }
            }
        }
    }

    void setAtributosPadrão(){
        Scanner leitor = new Scanner(System.in);
        int FOR, DES, CON, INT, SAB, CAR; // temporarios 
        int[6] numbers = {15,14,13,12,10,8};
        char opt;
        boolean erro;

        System.out.println("Para ABORTAR ou RECOMECAR:");
        System.out.println("\t- Durante o preenchimento, digite um dos Atributos como 0(Zero).");
        System.out.println("\t- Preencha tudo, ao finalizar ira aparecer 'Tem certeza? S ou N '.");

        Scanner leitor = new Scanner(System.in);
        do{
            do(){
                System.out.println("Atributos possiveis:\n\t FOR, DES, CON, INT, SAB, CAR");
                System.out.println("Valores possiveis:\n\t" num1, num2, num3, num4, num5, num6);
                System.out.println("\nFOR ->"); FOR = leitor.nextInt();
                System.out.println("DES ->"); DES = leitor.nextInt();
                System.out.println("CON ->"); CON = leitor.nextInt();
                System.out.println("INT ->"); INT = leitor.nextInt();
                System.out.println("SAB ->"); SAB = leitor.nextInt();
                System.out.println("CAR ->"); CAR = leitor.nextInt();

                if(FOR == DES || FOR == CON || FOR == INT || FOR == SAB || FOR == CAR ||
                    DES == CON || DES == INT || DES == SAB || DES == CAR ||
                    CON == INT || CON == SAB || CON == CAR ||
                    INT == SAB || INT == CAR){ // Isso significa que repetiu o numero em outro atributo
                    erro = true;
                }else if (FOR > 15 || FOR == 11 || FOR == 9 || FOR < 8){
                    erro = true;
                }else if (DES > 15 || DES == 11 || DES == 9 || DES < 8){
                    erro = true;
                }else if (CON > 15 || CON == 11 || CON == 9 || CON < 8){
                    erro = true;
                }else if (INT > 15 || INT == 11 || INT == 9 || INT < 8){
                    erro = true;
                }else if (SAB > 15 || SAB == 11 || SAB == 9 || SAB < 8){
                    erro = true;
                }else if (CAR > 15 || CAR == 11 || CAR == 9 || CAR < 8){
                    erro = true;
                }else{
                    erro = false;
                }
                 
                if(erro == true){
                    System.out.println("Algum valor esta fora do PADRAO ou REPETIDO, Tente novamente!");
                }
            }while(erro);
            do{
                System.out.println("Tem certeza?\n ' S ' ou ' N '");
                opt = leitor.nextChar();
                if(opt != 'S' && opt != 'N'){
                    System.out.println("Digite 'S' ou 'N'!");
                    erro = true;
                }else if(opt == 'S'){
                    this.FOR = FOR;
                    this.DES = DES;
                    this.CON = CON;
                    this.INT = INT;
                    this.SAB = SAB;
                    this.CAR = CAR;
                    erro = false;
                }else if(opt == 'N'){
                    erro = false;
                }
            }while(erro);
            // Validar o digito que nao é nem S nem N.
        }while(opt == 'N');
        leitor.close();
    }
    public String getRaca(){
        return this.raca;
    }     
}