package befaster.solutions.CHK;

import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class PriceList {

  private Map<String, Product> products = new HashMap<>();

  public PriceList() {
    products.put("A", new Product("A", 50, new Discount(3, 130)));
    products.put("B", new Product("B", 30, new Discount(2, 45)));
    products.put("C", new Product("C", 20));
    products.put("D", new Product("D", 15));
  }

  public Product getProduct(String productCode) {
    return products.get(productCode);
  }
}
