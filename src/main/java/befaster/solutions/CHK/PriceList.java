package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceList {

  private static PriceList instance;

  private Map<String, Product> products = new HashMap<>();

  private PriceList() {
    products.put("A", new Product("A", 50));
    products.put("B", new Product("B", 30));
    products.put("C", new Product("C", 20));
    products.put("D", new Product("D", 15));
    products.put("E", new Product("E", 40));
    products.put("F", new Product("F", 10));
  }

  public static PriceList getInstance() {
    if(instance == null) {
      instance = new PriceList();
    }
    return instance;
  }

  public Product getProduct(String productCode) {
    return products.get(productCode);
  }

  public List<Product> getAllProducts() {
    return new ArrayList<>(products.values());
  }
}

