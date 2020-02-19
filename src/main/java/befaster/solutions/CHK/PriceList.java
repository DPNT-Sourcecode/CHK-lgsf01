package befaster.solutions.CHK;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceList {

  private static PriceList instance;

  private Map<String, Product> products = new HashMap<>();

  private PriceList() {
    List<Product> productsToAdd = Lists.newArrayList(
        new Product("A", 50),
        new Product("B", 30),
        new Product("C", 20),
        new Product("D", 15),
        new Product("E", 40),
        new Product("F", 10),
        new Product("G", 20),
        new Product("H", 10),
        new Product("I", 35),
        new Product("J", 60),
        new Product("K", 80),
        new Product("L", 90),
        new Product("M", 15),
        new Product("N", 40),
        new Product("O", 10),
        new Product("P", 50),
        new Product("Q", 30),
        new Product("R", 50),
        new Product("S", 30),
        new Product("T", 20),
        new Product("U", 40),
        new Product("V", 50),
        new Product("W", 20),
        new Product("X", 90),
        new Product("Y", 10),
        new Product("Z", 50)
    );

    productsToAdd.forEach(p -> products.put(p.getName(), p));
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
