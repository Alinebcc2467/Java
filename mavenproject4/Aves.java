package com.mycompany.mavenproject4;

public class Aves extends Animal {
    private String voa;
    private boolean penas;

    public Aves(String nome, 
            String especie,
            String alimentacao,
            String habitat,
            String voa, 
            boolean penas)
    {
        super(nome, especie,alimentacao,habitat);
        this.voa = voa;
        this.penas=true;
    }
    public Aves(){
    }
    public String getVoa(){
        return voa;
    }
    public void setVoa(String voa){
        this.voa=voa;
    }
    public boolean getPenas(){
        return this.penas;
    }
    public void setPenas(String habitat){
        this.penas=penas;
    }
    public String informacoesAves(){
        return(" Nome:"+super.getNome()+" /"+
                " Especie:"+super.getEspecie()+" /"+
                " Alimentacao:"+getAlimentacao()+" /"+
                " Habitat:"+getHabitat()+" /"+
                " Voa:"+getVoa()+" /"+
                " Penas:"+getPenas());
    }
}
