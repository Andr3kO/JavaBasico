
package javabasico;

/**
 *
 * @author Andre
 */

public class TipoDeDato {
    
    public void dato (){
        
        String texto = "Hola";
        int numero = 99;
        double decimal = 16.5;
        char letra = 'Z';
        boolean esVerdad = true;
        Object Cualquiera = 5;
        
        System.out.println("El tipo de dato es: " + texto.getClass().getSimpleName()); 
        System.out.println("El tipo de dato es: " + ((Object) numero).getClass().getSimpleName()); 
        System.out.println("El tipo de dato es: " + ((Object) decimal).getClass().getSimpleName());
        System.out.println("El tipo de dato es: " + ((Object) letra).getClass().getSimpleName()); 
        System.out.println("El tipo de dato es: " + ((Object) esVerdad).getClass().getSimpleName());
        System.out.println("El tipo de dato es: " + ((Object) Cualquiera).getClass().getSimpleName());
    }
}


