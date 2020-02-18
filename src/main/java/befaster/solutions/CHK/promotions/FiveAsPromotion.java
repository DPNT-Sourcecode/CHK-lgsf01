package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import java.util.Map;

public class FiveAsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
//    int total = basket.getTotal();
//
//    Map<String, Integer> quantities = basket.getQuantities();
//
//    int quantity = quantities.get("A");
//    while(quantity >= 5) {
//      total = total - 50;
//      quantity = quantity - 5;
//    }
//
//    quantities.put("A", quantity);
//    basket.setQuantities(quantities);
//    basket.setTotal(total);

    applyMultibuy(basket, "A", 5, 50);
  }

}
