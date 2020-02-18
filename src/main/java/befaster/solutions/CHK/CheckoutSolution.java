package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    private Basket basket;

    public Integer checkout(String skus) {
        String[] products = skus.split(",");
        Arrays.stream(products).forEach(basket::addItem);
        return basket.getTotal();
    }
}

