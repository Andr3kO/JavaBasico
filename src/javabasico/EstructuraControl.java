
package javabasico;

import java.util.Scanner;



/**
 *
 * @author Andre
 */
public class EstructuraControl {
   
    public void TablaMultiplicar(){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + numero + " = " + (i * numero));
            
         
        }
    }
}
    

