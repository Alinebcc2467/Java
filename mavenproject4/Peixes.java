package com.mycompany.mavenproject4;

public class Peixes extends Animal{
    private boolean escamas;
    private String cor;
    private String tamanho;

    public Peixes(String nome, 
            String especie, 
            String alimentacao,
            String habitat,
            boolean escamas,
            String cor,
            String tamanho){
        super(nome, especie,alimentacao,habitat);
        this.escamas = true;
        this.cor=cor;
        this.tamanho=tamanho;
    }
    public boolean getEscamas(){
        return escamas;
    }
    public void setEscamas(boolean escamas){
        this.escamas=escamas;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String habitat){
        this.cor=cor;
    }
        public String getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho=tamanho;
    }
    public String informacoesPeixes(){
        return(" Nome:"+super.getNome()+" /"+
                " Especie:"+super.getEspecie()+" /"+
                " Alimentacao:"+getAlimentacao()+" /"+
                " Habitat:"+getHabitat()+" /"+
                " Escamas:"+getEscamas()+"/"+
                " Cor:"+getCor()+"/"+
                " Tamanho:"+getTamanho());
    }
}