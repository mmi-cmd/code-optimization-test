public class TaxCalculation {
    public static void main(String[] args) {

        //Cambiamos las variables  productPrice1 = 100, productPrice1 = 200 por array

        final int TAX_THRESHOLD = 50; //Se elimina el magic number por una constante 

        double [] productPrice = {100, 200}; //creacion de array que guarda precios
        double [] percentage = {0.15, 0.10}; //creacion de array que guarda porcentaje de descuento

        double totalTax = 0; //sumador que comienza en cero para guardar el total de impuestos
        for (int i = 0; i < productPrice.length; i++) { //for para calcular los impuestos 
            totalTax+= (productPrice[i]*percentage[i]);
        }

        if (totalTax > TAX_THRESHOLD) { // if-else que verifica el tipo de impuestos
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax: " + totalTax);
        }
    }
}

