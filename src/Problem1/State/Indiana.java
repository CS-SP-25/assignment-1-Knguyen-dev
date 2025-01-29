package Problem1.State;

import Problem1.SalesTaxBehavior.SevenPercent;

public class Indiana extends State {
    public Indiana() {
        /*
        Indiana is the subclass of State, and it will initialize a specific implementation
        of SalesTaxBehavior.
         */
        this.name = "Indiana";
        this.salesTaxBehavior = new SevenPercent();
    }

    // The specific implementation of the abstract function
//    @Override
//    public void showTax(double value) {
//        // The sales tax on $[SALE] in [STATE] is $[TAX].”
//        double salesTax = this.salesTaxBehavior.compute(value);
//        System.out.printf("The sales tax on $%.2f in %s is $%.2f.", value, this.getName(), salesTax);
//    }
}
