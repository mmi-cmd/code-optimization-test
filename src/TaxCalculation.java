public class TaxCalculation {

    
    public static void main(String[] args) {

        //Asigancion de variables para eliminar valores magicos
        
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW = 0.19;
        final int MAXIMO_IMPUESTO =50;
        double productPrice1 = 100;
        double productPrice2 = 200;
        double tax1 = productPrice1 * TAX_RATE_HIGH;
        double tax2 = productPrice2 * TAX_RATE_LOW;
        double totalTax = tax1 + tax2;
        
        if (totalTax > MAXIMO_IMPUESTO) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
