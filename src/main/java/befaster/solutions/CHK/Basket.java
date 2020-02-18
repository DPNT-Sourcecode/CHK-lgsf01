package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class Basket {

  private PriceList priceList = PriceList.getInstance();
  private Map<String, Integer> quantities = new HashMap<>();

  public Basket() {
    quantities.put("A", 0);
    quantities.put("B", 0);
    quantities.put("C", 0);
    quantities.put("D", 0);
  }

  public void addItem(String item) {
    if(quantities.get(item) == null) {
      throw new IllegalInputException(String.format("%s is not a valid product code", item));
    }

    quantities.put(item,
        quantities.get(item)+1
    );
  }

  public int getTotal() {
    int total = 0;

    for(Map.Entry<String, Integer> entry : quantities.entrySet()) {
      int tempQuantity = entry.getValue();
      Product product = priceList.getProduct(entry.getKey());

      if(product.getDiscount().isPresent()) {
        Discount discount = product.getDiscount().get();
        while(tempQuantity >= discount.getQualifyingQuantity()) {
          total += discount.getPrice();
          tempQuantity = tempQuantity - discount.getQualifyingQuantity();
        }
      }

      total = total + (tempQuantity * product.getPrice());
    }

    return total;
  }


}
