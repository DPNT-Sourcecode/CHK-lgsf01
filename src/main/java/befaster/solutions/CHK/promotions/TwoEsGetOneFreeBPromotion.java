package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import java.util.Map;

public class TwoEsGetOneFreeBPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    int total = basket.getTotal();
    Map<String, Integer> quantities = basket.getQuantities();

    int tempQuantity = quantities.get("E");
    while(tempQuantity >= 2) {

      int numberOfBs = quantities.get("B");
      if(numberOfBs > 0) {
        quantities.put("B", numberOfBs - 1);
        total -= 30;
      }

      tempQuantity -= 2;
    }

    basket.setQuantities(quantities);
    basket.setTotal(total);
  }

}
