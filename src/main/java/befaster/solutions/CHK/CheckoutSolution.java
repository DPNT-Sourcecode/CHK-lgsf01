package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    public Integer checkout(String skus) {
        Basket basket = new Basket();

        String[] products = skus.split(",");

        for(String product : products) {
            try {
                basket.addItem(product);
            } catch (IllegalInputException e) {
                return -1;
            }
        }

        return basket.getTotal();
    }
}



