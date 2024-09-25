
package javabasico;

/**
 *
 * @author Andre
 */
public class OperadoresLogicos {
    
    public void operador (){
        boolean esVerdadero = true;
        boolean esFalso = false;
        //OPERADOR AND (&&)
        boolean resultado = esVerdadero && esFalso;
        System.out.println("Resultado and:  "+ resultado);
        
    //OPERADOR OR (||)
        
        boolean resultado2= esVerdadero || esFalso; 
        System.out.println("Resultado or: "+ resultado2);
    //OPERADOR NOT (||)
        boolean resultado3= !(esVerdadero); 
        System.out.println("Resultado not: "+ resultado3);
     }
     
 }
     
     
        
