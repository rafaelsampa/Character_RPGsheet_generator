package Projeto_POO_RPG.gerador_ficharpg_03;



public class Magias {
    public boolean truque; // Se for true é truque, se for false é magia de alguma escola.
    public String escolaDaMagia; // Exemplo: 'Necromancia', 'Encantamento', 'Conjuracao', 'Transmutacao', 'Advinhacão', 'Abjuracão', 'Evocacão', 'Ilusão'
    public String nomeMagia;
    public int nivelMagia;
    public int TempoDeConjuracao; // Exemplo: 1 acão, 1 acão bonus
    public boolean acaoBonus; // Se for true é acao bonus, se for false é acao normal
    public double Alcance; // Exemplo: 60 metros, 3 metros, ao Toque ( Zero '0' )
    public int Duracao; // Exemplo: 1 minuto, 24 horas, instantanea ( Zero '0' )

    // Exemplo: 'V,S' //   V significa Verbal, S significa Somatico(Gesticucacão, gestos) e M significa Material(Componentes)   
    public boolean verbal;
    public boolean somatico;
    public boolean material;
    
    String descricao; // Um textao que descreve a magia.


    public void setEscola(){
        this.escolaDaMagia = Alarme.getEscola();
    }
    
}