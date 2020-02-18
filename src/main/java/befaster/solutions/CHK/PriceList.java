package befaster.solutions.CHK;

import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PriceList {

  private List<Product> products = Lists.newArrayList();

  public PriceList() {
    products.add(new Product("A", 50, new Discount(3, 130)));
    products.add(new Product("B", 30, new Discount(2, 45)));
    products.add(new Product("C", 20));
    products.add(new Product("D", 15));
  }
}

