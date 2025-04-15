package com.mycompany.mavenproject4;

public class Animal {
    private String nome;
    private String especie;
    private String alimentacao;
    private String habitat;
   
    public Animal(String nome, 
            String especie,
            String alimentacao, 
            String habitat)
    {
        this.nome = nome;
        this.especie = especie;
        this.habitat=habitat;
        this.alimentacao=alimentacao;
    }
    public Animal(){
    }
    public String getNome(){
        return nome;
    }
    public String getEspecie(){
        return especie;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEspecie(String especie){
        this.especie=especie;          
    }
        public String getAlimentacao(){
        return alimentacao;
    }
    public void setAlimentacao(String alimentacao){
        this.alimentacao=alimentacao;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
}
