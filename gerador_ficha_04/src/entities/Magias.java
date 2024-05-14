package entities;



public class Magias {
    private boolean truque; // Se for true é truque, se for false é magia de alguma escola.
    private String escolaDaMagia; // Exemplo: 'Necromancia', 'Encantamento', 'Conjuracao', 'Transmutacao', 'Advinhacão', 'Abjuracão', 'Evocacão', 'Ilusão'
    private String nomeMagia;
    private int nivelMagia;
    private int TempoDeConjuracao; // Exemplo: 1 acão, 1 acão bonus
    private boolean acaoBonus; // Se for true é acao bonus, se for false é acao normal
    private double Alcance; // Exemplo: 60 metros, 3 metros, ao Toque ( Zero '0' )
    private int Duracao; // Exemplo: 1 minuto, 24 horas, instantanea ( Zero '0' )

    // Exemplo: 'V,S' //   V significa Verbal, S significa Somatico(Gesticucacão, gestos) e M significa Material(Componentes)   
    private boolean verbal;
    private boolean somatico;
    private boolean material;
    
    String descricao; // Um textao que descreve a magia.


    public void setEscola(){
        //this.escolaDaMagia = Alarme.getEscola();
    }
    public void setMagiaAlarme(){
        
    } 
    
}