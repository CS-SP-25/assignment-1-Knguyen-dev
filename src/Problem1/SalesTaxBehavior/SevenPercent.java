package Problem1.SalesTaxBehavior;

// Implementation of SalesTaxBehavior, which varies.
// This can then be reused for other states that have a 7 percent sales tax.
public class SevenPercent implements SalesTaxBehavior{
    @Override
    public double compute(double value) {
        return value * 0.07;
    }
}
