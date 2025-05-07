//10 - Anacleto tem 1,50m e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10m e cresce 3 centímetros por ano. Construa um programa que calcule e apresente quantos anos serão necessários para que Felisberto seja maior que Anacleto.

public class Main {
    public static void main(String[] args) {
        System.out.println("Anacleto tem 1,50m e cresce 2 centímetros por ano");
        System.out.println("Felisberto tem 1,10m e cresce 3 centímetros por ano.");
        int anos=0;
        double A = 1.50;
        double F = 1.10;
        while (F<=A){
            A +=0.02;
            F +=0.03;
            anos=anos+1;
        }
        System.out.println("Serão nescessários "+anos+" anos para Felisbeto alcançar Anacleto");
    }
}