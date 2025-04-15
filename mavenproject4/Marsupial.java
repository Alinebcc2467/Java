package com.mycompany.mavenproject4;

public class Marsupial extends Mamifero{
    private boolean marsupio;
    private String locomocao;
    
    public Marsupial(
            String nome, 
            String especie,
            String alimentacao,
            String habitat,
            boolean glandulasMamarias,
            String pelos,
            boolean marsupio,
            String locomocao)
    {
        super(nome,especie,alimentacao,habitat,marsupio,pelos);
        this.marsupio=true;
        this.locomocao=locomocao;      
    }
    public Marsupial(){
        super();
        this.marsupio=true;
        this.locomocao="";
    }
    public boolean getMarsupio(){
        return marsupio;    
    }
    public void setMarsupio(boolean Marsupio){
        this.marsupio = marsupio;
    }
    public String getLocomocao(){
        return this.locomocao;
    }
    public void setLocomocao(String habitat){
        this.locomocao=locomocao;
    }
    public String informacoesMarsupial(){
        return(" Nome:"+super.getNome()+" /"+
                " Especie:"+super.getEspecie()+" /"+
                " Alimentacao:"+getAlimentacao()+" /"+
                " Habitat:"+getHabitat()+" /"+
                " Glandulas Mamarias:"+getGlandulasMamarias()+"/"+
                "Pelos:"+getPelos()+"/"+
                " Marsupio:"+getMarsupio()+" /"+
                " Locomocao:"+getLocomocao());
    }
}
