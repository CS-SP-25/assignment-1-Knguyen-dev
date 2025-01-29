package Problem1.SalesTaxBehavior;

// Implementation of what varies. This is reusable
// for other states with no sales tax.
public class NoTax implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return 0.0;
    }
}
