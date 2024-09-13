import java.util.Scanner;
public class Store {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Anàlisis: Venta de productos en una tienda.
        //Diseño: Mejorar las variables, eliminar los valores magicos y crear constantes para ellas, almacenar precio y cantidades de productos, uso de bubles para calcular totales

        //Cambiar las variables p1, p2, p3 eliminando estos valores magicos por constantes que aclaren su funcionalidad dentro del codigo
        //Constantes para eliminar valores magicos
        final int PRECIO_PRODUCTO_UNO = 15;
        final int PRECIO__PRODUCTO_DOS = 10;
        final int PRECIO__PRODUCTO_TRES = 5;
        final int PRODUCTOS_EXISTENTES = 3;
        final int INDICADOR_GOODSALES = 50;
        int suma = 0;

        //Creaciòn de array para la cantidad de productos
        int [] productos  = { 1, 2, 3};

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese la cantidad que desea del producto " + productos[i]);
            productos[i] = scanner.nextInt();

            int total1 = PRECIO_PRODUCTO_UNO * productos[0];
            int total2 = PRECIO__PRODUCTO_DOS * productos[1];
            int total3 = PRECIO__PRODUCTO_TRES * productos[3];
            suma = suma + total1 + total2 + total3;
        }

        System.out.println("Las ventas totales son: " + suma);

        if (suma > INDICADOR_GOODSALES) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
