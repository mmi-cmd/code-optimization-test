import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        final int MAYOR_VENTA = 50; //Se elimina el magic number por una constante 

        //Cambiamos las variables p1=15, p2=10, p3=5 por arrays
        
        int [] prices = {15, 10, 5}; //creacion de array que guarda precios
        int [] amount = new int [3]; //creacion de array que guarda cantidades

        for (int i = 0; i < amount.length; i++) { //for que llena el array para las cantidades de productos
            System.out.println("Ingrese la cantidad del producto " + (i+1));
            amount[i] = scanner.nextInt();
        }

        //Creamos un for para calcular los totales, con un sumador qu comienza en cero y cambia segun la iteración
        int totalSales=0;
        for (int i=0; i < prices.length; i++){
            totalSales += (prices[i]*amount[i]);
        }

        if (totalSales > MAYOR_VENTA) {
            System.out.println("Good sales performance: " + totalSales ); //If-else que verifica la venta
        } else {
            System.out.println("Low sales performance " + totalSales);
        }
        scanner.close();
    }
}

