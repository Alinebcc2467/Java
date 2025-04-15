package com.mycompany.mavenproject4;

public class Reptil extends Animal{
    private String pele;
    private boolean ovos;
    private String locomocao;

    public Reptil(String nome, 
            String especie,            
            String habitat,
            String alimentacao,
            String pele,
            boolean ovos,
            String locomocao)
    {
        super(nome, especie,alimentacao,habitat);
        this.pele = pele;
        this.ovos= true;
        this.locomocao= locomocao;
    }
    public Reptil(){
    }
    public String getPele(){
        return pele;
    }
    public void setPele(String pele){
        this.pele=pele;
    }
    public boolean getOvos(){
        return this.ovos;
    }
    public void setOvos(boolean ovos){
        this.ovos=ovos;
    }
        public String getLocomocao(){
        return this.locomocao;
    }
    public void setLocomocao(String habitat){
        this.locomocao=locomocao;
    }
    public String informacoesReptil(){
        return(" Nome:"+super.getNome()+" /"+
                " Especie:"+super.getEspecie()+" /"+
                " Alimentacao:"+getAlimentacao()+" /"+
                " Habitat:"+getHabitat()+" /"+
                " Pele:"+getPele()+" /"+
                " Ovos:"+getOvos()+"/"+
                " Locomocao:"+getLocomocao());
    }
}
