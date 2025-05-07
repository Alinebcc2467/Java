//12 - Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1,5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento

public class Main {
    public static void main(String[] args) {
        System.out.println("O país tem 80.000 habitantes com uma taxa de crescimento de 3%.");
        System.out.println("O país B tem 200.000 habitantes com uma taxa de crescimento de 1,5%.");
        int anos=0;
        double A = 80000;
        double B = 200000;
        while (A <=B){
            A +=(A/100)*3;
            B += (B/100)*1.5;
            anos=anos+1;
        }
        System.out.println("Serão nescessários "+anos+" anos para o país A passar ou igualar a população do país B.");
    }
}