package Problem1.SalesTaxBehavior;

/*
SalesTax percentage and how it's computed is the only thing that varies throughout different states.
Pull this out and we'll use the strategy pattern to implement different classes for different sales tax.
This makes the sales tax calculation not tied to a certain state, but in its own class.
*/
public interface SalesTaxBehavior {
    public double compute(double value);
}
