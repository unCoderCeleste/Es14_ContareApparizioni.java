/*
Scrivere un programma che conti il numero di volte
che una cifra appare in un numero di 10 cifre inserito in un array.
Il programma deve creare un array di dimensione 10 che
memorizzerà il conto di ogni cifra da 0 a 9
*/
import java.util.Scanner;
public class Es14_ContareApparizioni {
    public static void main(String[] args) {
        Scanner arr= new Scanner(System.in);
        System.out.println("(MEMORIZZARE NUMERI/TROVARE RIPETIZIONI) IN UN ARRAY");
        System.out.print("Inserisci la quantità di cifre dell'array: ");
        int quanCifre= arr.nextInt();
        System.out.print("Inserisci la cifra che vuoi comprovare se si ripete: ");
        int cifra= arr.nextInt();
        System.out.print("Inserisci le " +quanCifre +" cifre del numero nell'array:\n");
        int[] numero= new int[quanCifre];
        int[] pos= new int[quanCifre];
        for(int i=0; i<numero.length; i++) {
            System.out.print((i+1)+": ");
            numero[i] = arr.nextInt();
        }
        System.out.print("\nIl numero inserito è: ");
        for(int i=0; i<numero.length; i++) {
            System.out.print(numero[i]);
        }
        System.out.println();
        int ripetuta=0;
        int contPos=0;
        for(int c=0; c<numero.length; c++){
            if(numero[c]==cifra){
                ripetuta++;
                pos[contPos]=c;
                contPos++;
            }
        }
        System.out.print("La cifra: " +cifra +" si ripete " +ripetuta +" volte nell'array.\n");
        if(contPos>0) {
            System.out.print("La troviamo nelle posizioni: ");
            for (int p = 0; p < contPos; p++) {
                System.out.print((pos[p] + 1) + "\t");
            }
            System.out.print("dell'array.");
        }
    }
}