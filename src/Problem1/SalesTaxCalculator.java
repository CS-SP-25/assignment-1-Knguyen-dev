package Problem1;

import Problem1.SalesTaxBehavior.FourPointFivePercent;
import Problem1.SalesTaxBehavior.NoTax;
import Problem1.SalesTaxBehavior.SevenPercent;
import Problem1.State.Alaska;
import Problem1.State.Hawaii;
import Problem1.State.Indiana;
import Problem1.State.State;

public class SalesTaxCalculator {
    public static void main(String[] args) {

        // Ensure there are two environment variables
        if (args.length != 2) {
            System.out.println("Please provide state name and sale amount as command line args");
            return;
        }

        // Obtain the sale amount from the command line arguments e
        String stateName = args[0].toLowerCase();
        float saleAmount = 0.0f;
        State state;
        try {
            saleAmount = Float.parseFloat(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid sale amount. Please provide a valid number.");
            return;
        }

        switch (stateName.toLowerCase()) {
            case "hawaii":
                // Create state and then we're assigning the value of the SalesTaxBehavior at runtime.
                state = new Hawaii();
                state.setSalesTaxBehavior(new FourPointFivePercent());
                break;
            case "indiana":
                state = new Indiana();
                state.setSalesTaxBehavior(new SevenPercent());
                break;
            case "alaska":
                state = new Alaska();
                state.setSalesTaxBehavior(new NoTax());
                break;
            default:
                System.out.println("Unknown state: " + stateName);
                return;
        }

        state.showTax(saleAmount);
    }
}
