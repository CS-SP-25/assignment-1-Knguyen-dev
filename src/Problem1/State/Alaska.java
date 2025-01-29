package Problem1.State;

import Problem1.SalesTaxBehavior.NoTax;

public class Alaska extends State {
    /*
    In the subclass we will initialize the inherited attributes from the
    base class. Here we had it as Alaska, and then we select the specific SalesTaxBehavior
    that we want.
    */
    public Alaska() {
        this.name = "Alaska";
        this.salesTaxBehavior = new NoTax();
    }

}
