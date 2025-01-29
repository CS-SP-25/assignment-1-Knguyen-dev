package Problem1.SalesTaxBehavior;

public class FourPointFivePercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.045;
    }
}
