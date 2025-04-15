package com.mycompany.mavenproject4;

public class Mamifero extends Animal{
    private boolean glandulasMamarias;
    private String pelos;
   
        public Mamifero(
            String nome, 
            String especie,
            String alimentacao,
            String habitat,
            boolean glandulasMamarias,
            String pelos)
    {
        super(nome,especie,alimentacao,habitat);
        this.glandulasMamarias=true;
        this.pelos=pelos;      
    }
    public Mamifero(){
        super();
        this.glandulasMamarias=true;
        this.pelos=pelos;
    }
    public boolean getGlandulasMamarias(){
        return glandulasMamarias;    
    }
    public void setGlandulasMamarias(boolean glandulasMamarias){
        this.glandulasMamarias = glandulasMamarias;
    }
    public String getPelos(){
        return this.pelos;
    }
    public void setPelos(String pelos){
        this.pelos=pelos;
    }
    public String informacoesMamifero(){
        return(" Nome:"+super.getNome()+" /"+
                " Especie:"+super.getEspecie()+" /"+
                " Alimentacao:"+getAlimentacao()+" /"+
                " Habitat:"+getHabitat()+" /"+
                " Glandulas Mamarias:"+getGlandulasMamarias()+" /"+
                " Pelos:"+getPelos());
    }
}
