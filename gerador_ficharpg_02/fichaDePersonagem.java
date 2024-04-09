package gerador_ficharpg_02;

import java.util.Scanner;
import java.util.Random;

public class fichaDePersonagem {
    String nomeDoJogador, nomeDoPersonagem, classe, raca, antecedentes;
    int nivel, FOR, DES, CON, INT, SAB, CAR;
    int PVs; // Pontos de vida
    
    public fichaDePersonagem(){
        
    }

    public void setInfoDoPersonagem(String nomeDoJogador, String nomeDoPersonagem, String classe, String raca, String antecedentes){
        this.nomeDoJogador = nomeDoJogador;
        this.nomeDoPersonagem = nomeDoPersonagem;
        this.classe = classe;
        this.raca = raca;
        this.antecedentes = antecedentes;
    }

    public void setAtributosPadrao(int FOR, int DES, int CON, int INT, int SAB, int CAR){
        this.FOR = FOR;
        this.DES = DES;
        this.CON = CON;
        this.INT = INT;
        this.SAB = SAB;
        this.CAR = CAR;
    }  

    public fichaDePersonagem getAtributos(){
        return this; // na teoria eu so preciso mandar os valores dos atributos em vez do objeto inteiro, mas eu nao sei como...
    }

    void setAtributosDados(){
        int d6;
        Random number = new Random();
        int[] numbers;
        int[] d6i; // inicial
        int[] d6f; // final
        int nivel, FOR, DES, CON, INT, SAB, CAR;
        int aux, aux2;
        
        System.out.println("Usando funcao em Java para gerar numeros pseudo-aleatorios");
        System.out.println("\nGerando 6 valores baseados nos padroes D&D 5e, e um hipotetico d6(dado de 6 lados)");
        
        // Criar um Stack e fazer o processo padrao dos 4d6 tirando o menor valor =============
    }
    public String getRaca(){
        return this.raca;
    }   
    void diplayFicha(){
        System.out.print("\nNome do Personagem: "+ nomeDoPersonagem); System.out.print("\tNome do Jogador: "+ nomeDoJogador);
        System.out.print("Classe & Nivel: "+ classe); System.out.print(", "+ nivel); System.out.print("\tAntecedentes: "+ antecedentes+"\n");
        System.out.print("Raca: "+ raca);
    }  
}