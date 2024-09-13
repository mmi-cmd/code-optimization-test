
import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Cambio de valores magicos por variables
        final int MAYORIA_EDAD = 18;
        final int TOTAL_PERSONAS = 4;

        //Creacion de array para ingrsar la edad de la persona

        int age [] = new int[TOTAL_PERSONAS];

        //Bucle para verificar cada una de las edades

        for (int i = 0; i < age.length; i++) {
            System.out.println("Ingresa la edad de la persona " + (i+1));
            age[i] = scanner.nextInt();
            if (age[i]>= MAYORIA_EDAD) {
                System.out.println("Access granted");
            }
            
            if (age[i] < MAYORIA_EDAD) {
                System.out.println("Access denied");
            }
    
        }
    

        }
       
}
