package Projeto_POO_RPG.gerador_ficharpg_03.Todas_as_Magias;

import Projeto_POO_RPG.gerador_ficharpg_03.Magias;

/*
    boolean truque; // Se for true é truque, se for false é magia de alguma escola.
    String escolaDaMagia; // Exemplo: 'Necromancia', 'Encantamento', 'Conjuracao', 'Transmutacao', 'Advinhacão', 'Abjuracão', 'Evocacão', 'Ilusão'
    String nomeMagia;
    int nivelMagia;
    int TempoDeConjuracao; // Exemplo: 1 acão, 1 acão bonus
    boolean acaoBonus; // Se for true é acao bonus, se for false é acao normal
    double Alcance; // Exemplo: 60 metros, 3 metros, ao Toque ( Zero '0' )
    int Duracao; // Exemplo: 1 minuto, 24 horas, instantanea ( Zero '0' )

    // Exemplo: 'V,S' //   V significa Verbal, S significa Somatico(Gesticucacão, gestos) e M significa Material(Componentes)   
    boolean verbal;
    boolean somatico;
    boolean material;
    
    String descricao; // Um textao que descreve a magia.
*/

public class Alarme extends Magias{

    public String getEscola(){
        return "Abjuracao";
    }
    public String getNome(){
        return "Alarme";
    }
    public int getNivel(){
        return 1;
    }
    public int getTempo(){
        return 1;
    }

}
