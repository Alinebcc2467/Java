package com.mycompany.mavenproject4;

public class Mavenproject4 {

    public static void main(String[] args) {
        Mamifero ligre= new Mamifero("Ligre","Hibrido-Mamifero","Carnivoro","Zoologico",true,"Toda a vida");
        System.out.println(ligre.informacoesMamifero());
        Marsupial coala= new Marsupial("Coala","Marsupial-Mamifero","Herbivoro","Australia",true,"Todas a vida",true,"Escalador de arvores");
        System.out.println(coala.informacoesMarsupial());
        Peixes palhaco= new Peixes("Palhaco","Peixe","Onivoro","Oceano",true,"Laranja-Branco-Preto","Pequeno");
        System.out.println(palhaco.informacoesPeixes());
        Aves gaviao= new Aves("Gaviao","Ave","Carnivoro","Todos os continentes menos Australia","Sim",true);
        System.out.println(gaviao.informacoesAves());
        Reptil jacare= new Reptil("Jacare","Reptil","Carnivoro","Aquaticos","Escamas",true,"Nado");
        System.out.println(jacare.informacoesReptil());
        
    }
}
