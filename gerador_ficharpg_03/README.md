# Projeto_POO_GeradorRpg

Um construtor de personagem de D&D usando dados baseados no Livro de Jogador de D&D 5a edição.

## Qual o objetivo do projeto?
Usar nosso contrutor para facilitar o processo de criacão de personagem para jogadores de RPG.
(D&D 5a edicao)


## TO DO

- Implementar as Perícias: 
    Alguma forma de organizalas, como um array boolean para dizer quais pericias o personagem tem.

- ADD as especificacões de cada Raca, ou seja: 
    Ir no livro de jogador e indentificar cada uma das caracteristicas raca e adicionar seus 
    respectivos modficadores de **atributo**.
    https://bibliotecaelfica.org/2023/01/15/dd-5e-livro-do-jogador-fundo-branco/

- ADD alguma forma de adicionar as especificacões das Classes:
    Nas classes exitem momentos que ele pede para escolher itens e equipamentos para o personagem
    precisamos fazer alguma forma de dar essa escolha ao usuário.

- Opcões de Pericias:
    Em momentos como a atribuicao da raca, classe ou antecedentes o jogador ganha pontos para 
    distribuir em pericias. Precisamos achar uma forma de dar esse poder de escolha ao jogador.
    Como um simples switch case, com validacao.

- hm







_________-


package Projeto_POO_RPG.gerador_ficharpg_03;


//import java.util.Random;

public class fichaDePersonagem {
    String nomeDoJogador, nomeDoPersonagem, classe, raca, antecedentes;
    int nivel, FOR, DES, CON, INT, SAB, CAR;
    boolean[] pericias = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    // 0 - Acrobacia(DES)
    // 1 - Arcanismo(INT)
    // 2 - Atletismo(FOR)
    // 3 - Atuacão(CAR)
    // 4 - Blefar(CAR)
    // 5 - Furtividade(DES)
    // 6 - História(INT)
    // 7 - Intimidação(CAR)
    // 8 - Intuicão(SAB)
    // 9 - Investigação(INT)
    // 10 - Lidar com os animais(SAB)
    // 11 - Medicina(SAB)
    // 12 - Natureza(INT)
    // 13 - Percepção(SAB)
    // 14 - Persuasão(CAR)
    // 15 - Prestidigitação(DES)
    // 16 - Religião(INT)
    // 17 - Sobrevivência(SAB)

    int PVs; // Pontos de vida
    
    
    public fichaDePersonagem(){ // Construtor padrão, com todas as variaveis.
        
    }

    // Metodos SET -----------------------
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
    public void setAtributosComDados(){
        // Gerar 4 valores pseudo-randomicos, pegar os 3 maiores e soma-los
        // podemos até usar uma stack para fazer essa operacao
        // repetir isso 6 vezes e armazenar esses valores
        // Distribuir esses valores para cada atributo
    }

    // Metodos GET -----------------------
    public fichaDePersonagem getAtributos(){
        return this; // na teoria eu so preciso mandar os valores dos atributos em vez do objeto inteiro, mas eu nao sei como...
    }
    public String getRaca(){
        return this.raca;
    } 
  
    // Metodos Auxiliares
    public void diplayFicha(){
        System.out.print("\nNome do Personagem: "+ nomeDoPersonagem); System.out.print("\tNome do Jogador: "+ nomeDoJogador);
        System.out.print("Classe & Nivel: "+ classe); System.out.print(", "+ nivel); System.out.print("\tAntecedentes: "+ antecedentes+"\n");
        System.out.print("Raca: "+ raca);
    }  
}