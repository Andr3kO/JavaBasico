
package javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Andre
 */
public class EstructuraDatos {
    public void array(){
        String apellido = "Zaga";
        
        Object[] datos = {"Diana","Nicol","Andrian",22,false,23.12,9,"Senati","Merula","Sharon","Batman"};
        
        //OBTENER LA CANTIDAD DE DATOS
        int cantidad = datos.length;
        System.out.println("Cantidad de datos de mi array "+cantidad);
        
        for (int i = 0; i <=cantidad-1; i++) {
            System.out.println("Dato: " + datos[i]);
            
             if (datos[i] == (Object) 9) {
                System.out.println("Se encontró la palabra '" + datos[i] + "' en la posición: " + i);
                break;
                
                
            }
                
        }
           
    }
        public void list (){
            List<Object> nombre = new ArrayList<>();
            nombre.add("Marco");
            nombre.add("Polo");
            
            
            List<Object> nombrenuevo = new ArrayList<>();
            nombrenuevo.add("Marca");
            nombrenuevo.add("Pala");
            
            
            nombre.addAll(nombrenuevo);
            
            
            int cantidad2 = nombre.size();
            System.out.println("Cantidad de datos:" +cantidad2);
            
            //OBTENER UN DATO
            for (int e = 0; e <=cantidad2-1; e+=1) {
            nombre.get(e);
            System.out.println("Nombre:"+nombre.get(e));
            
            
           if (nombre.get(e)== (Object) "Polo") {
        System.out.println("Se encontró la palabra '" + nombre.get(e) + "' en la posición: " + e);
        break;
        
              
        }
        
        
        
    }
            
            
            //REMOVER
            nombre.remove("Pala");
            
            //ENCONTRAR
            
            nombre.contains("Marco");
            
            //INDICE DE DATO
            
            nombre.indexOf("Polo");
                        
            //ORDENAR 
            
            ///Collections.sort(nombre);
            
            // REVERTIR 
            Collections.reverse(nombre);
            
            // REMPLAZAR 
            
            nombre.set(1, "Polos");
            
            
            //FOR ICH
            System.out.println("------------------------------------------------");
            for(Object item: nombre){
                System.out.println("El dato es : "+nombre);
            }
            
            //Limpiar 
            nombre.clear();
            
}
        public void map(){
            Map<Object,Integer> edades = new HashMap<>();
            edades.put("Diana",777);
            edades.put("Dennis",666);
            edades.put("Raul",555);
            edades.put("Rafaela",20);
            edades.put("Rafaelo",8);
        
            ///Remover
            edades.remove("Raul");
            
            // Cantidad de datos
            
            edades.size();
            
            for(Object item : edades.keySet()){
            System.out.println("LAS KEYS: "+ item + " VALOR: " +edades.get(item));
                
            if (edades.get(item) >= 18) {
                System.out.println("Mayor de edad");
            } else {
                System.out.println("Menor de edad");
            }
             }
        }
        
}

