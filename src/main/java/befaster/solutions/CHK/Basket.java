package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Basket {

  @Autowired private PriceList priceList;
  private Map<String, Integer> quantities = new HashMap<>();


  public void addItem(String item) {
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
        while(tempQuantity > discount.getQualifyingQuantity()) {
          total += discount.getPrice();
          tempQuantity = tempQuantity - discount.getQualifyingQuantity();
        }
      }

      total = total + (tempQuantity * product.getPrice());
    }

    return total;
  }


}



