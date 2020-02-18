package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {


    private static final Map<String, Integer> prices = new HashMap<>();

    static {
        prices.put("A", 50);
        prices.put("B", 30);
        prices.put("C", 20);
        prices.put("D", 15);
    }

    public Integer checkout(String skus) {
        String[] products = skus.split(",");
        return Arrays.stream(products).mapToInt(prices::get).sum();
    }
}
