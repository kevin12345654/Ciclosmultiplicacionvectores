/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto14;

import java.util.Scanner;

/**
 *
 * @author A5-N1
 */
public class PROYECTO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        int num, max = 0, min = 0;
 
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " Ingrese un numero: ");
            num = in.nextInt();
            if (min != 0 && max != 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                min = num;
                max = num;
            }
        }
        System.out.println("Numero Maximo: " + max);
        System.out.println("Numero Minimo: " + min);
    }
    }
    

    
    

