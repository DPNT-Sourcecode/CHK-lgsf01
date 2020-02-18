package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import java.util.Map;

public class TwoBsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
//    int total = basket.getTotal();
//
//    Map<String, Integer> quantities = basket.getQuantities();
//
//    int quantity = quantities.get("B");
//    while(quantity >= 2) {
//      total = total - 15;
//      quantity = quantity - 2;
//    }
//
//    quantities.put("B", quantity);
//    basket.setQuantities(quantities);
//    basket.setTotal(total);

    applyMultibuy(basket, "B", 2, 15);
  }

}
