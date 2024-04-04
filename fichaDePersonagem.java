package GeradorDeFicha;

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
        System.out.println("Digite a classe do personagem: ");
        classe = leitor.nextLine();
        System.out.println("Digite a raça do personagem: ");
        raca = leitor.nextLine();
        System.out.println("Digite o antecedente do personagem: ");
        antecedentes = leitor.nextLine();        
        System.out.println("Digite o nivel do personagem: ");
        nivel = leitor.nextInt();
        leitor.close();
    }
    void setAtributos(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do atributo Força(FOR): ");
        FOR = leitor.nextInt();
        System.out.println("Digite o valor do atributo Destreza(DES): ");
        DES = leitor.nextInt();
        System.out.println("Digite o valor do atributo Constituição(CON): ");
        CON = leitor.nextInt();
        System.out.println("Digite o valor do atributo Inteligência(INT): ");
        INT = leitor.nextInt();
        System.out.println("Digite o valor do atributo Sabedoria(SAB): ");
        SAB = leitor.nextInt();
        System.out.println("Digite o valor do atributo Carisma(CAR): ");
        CAR = leitor.nextInt();
        leitor.close();
    }
    
    public String getRaca(){
        return this.raca;
    }
        
}

