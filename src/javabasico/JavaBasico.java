
package javabasico;

import java.util.Scanner;

/**
 *
 * @author Andre
 */

public class JavaBasico {
    public void principal(){
        System.out.println("Bienvenido Java Basico");
        System.out.println("1.Operadores Logicos");
        System.out.println("2.Tipo de datos");
        System.out.println("3.Estructuras de control");
        System.out.println("4.Expecciones");
        System.out.println("5.Estructura de datos");
         System.out.print("Escoge: ");
        Scanner an = new Scanner(System.in);
        int Data = an.nextInt();
        
          switch(Data){
            case 1:
                OperadoresLogicos ol = new OperadoresLogicos();
                ol.operador();
                
                break;
            case 2:
                TipoDeDato al = new TipoDeDato();
                al.dato();
                
                break;
            case 3:
                
                EstructuraControl il = new EstructuraControl();
                //il.estructura();
                il.TablaMultiplicar();
                break;
          }
                                  
    }
 
    public static void main(String[] args) {

        
        JavaBasico jv = new JavaBasico();
        jv.principal();
        
    }
    
}


