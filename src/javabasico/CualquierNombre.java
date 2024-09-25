
package javabasico;
import java.util.Scanner;
public class CualquierNombre {
    public void menu(){
        System.out.println("Tenemos esto:");
        System.out.println("1. Desyuno");
        System.out.println("2. Almuerzon");
        System.out.println("3. Cena");
        System.out.println("4. Estras");
        System.out.println("5. Salir");
        
        System.out.print("Escoge: ");
        Scanner an = new Scanner(System.in);
        int Dato = an.nextInt();
        

        switch(Dato){
            case 1:
                System.out.println("Jugo Mango");
                System.out.println("Lomo Saltado");
                System.out.println("Pan sin queso");
                break;
            case 2:
                System.out.println("Sopa sin presa");
                System.out.println("Pastel de papa sin papa");
                break;
            case 3:
                System.out.println("Capuchino sin leche");
                break;
            case 4:
                System.out.println("Extra hamburguesa sin pan");
                break;
            case 5:
                System.out.println("Vete que ocupas sitio");
                break;
            default:
                System.out.println("Come y vete");
                break;
        }
        
    }
    
    
}
