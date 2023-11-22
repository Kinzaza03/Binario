
package exam;

import java.util.Scanner;


public class Exam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=0;   
	int i=0;
        do {
        System.out.print("Introduzca un número que sea mayor que 0: ");                                                           
            n = sc.nextInt();
        } while (n <= 0); //here I have change the i for the n, because n is the variable im working with, not i

        System.out.print("\nBinario: ");
        decBin(n); //Here I change the name of the method because it was wrong, so it didn't recognize the mothod before
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n < 2) { //I have change the if because if n is <= 0 it will end the bucle before it has to
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2); //here I have change the operation too for print all the numbers correctly
        }
    }
}

