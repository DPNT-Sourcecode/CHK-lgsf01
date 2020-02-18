package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckoutSolution {

    @Autowired private Basket basket;

//    private static final Map<String, Integer> prices = new HashMap<>();
//
//    static {
//        prices.put("A", 50);
//        prices.put("B", 30);
//        prices.put("C", 20);
//        prices.put("D", 15);
//    }

    public Integer checkout(String skus) {
        String[] products = skus.split(",");
        Arrays.stream(products).forEach(basket::addItem);
        return basket.getTotal();
    }
}
