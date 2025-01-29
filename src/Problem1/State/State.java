package Problem1.State;

import Problem1.SalesTaxBehavior.SalesTaxBehavior;

/**
 * First create an abstract class. This is going to be inherited by specific states Indiana and Alaska.
 * All states will have names, and a SalesTaxBehavior which will be an implementation of an interface. The
 * sales tax behavior is the only thing that's variable and changes.
 */
public abstract class State {
    protected String name;
    protected SalesTaxBehavior salesTaxBehavior;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * showTax doesn't need to be abstract. You know that for any instance of a subclass that it will
     * have some implementation of the SalesTaxBehavior interface, and by doing this.salesTaxBehavior, we are referencing
     * the specific implementation given to the class.
     *
     * While traditionally for this pattern you would abstract this, we can tell that
     * all implementations of showTax will have the same format or algorithm, just with
     * different behaviors.
     */
    public void showTax(double value) {
        double salesTax = this.salesTaxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.", value, this.getName(), salesTax);
    };

    /**
     * This allows for flexibility to change the SalesTaxBehavior at runtime.
     * This can be helpful when a state has one sales tax value, but then acts differently at other parts
     * of the program.
     */
    public void setSalesTaxBehavior(SalesTaxBehavior salesTaxBehavior) {
        this.salesTaxBehavior = salesTaxBehavior;
    }
}
