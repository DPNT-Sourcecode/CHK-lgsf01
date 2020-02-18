package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import java.util.Map;

public abstract class MultibuyPromotion {

  public void applyMultibuy(Basket basket, String product, int qualifyingQuantity, int discount) {
    int total = basket.getTotal();

    Map<String, Integer> quantities = basket.getQuantities();

    int quantity = quantities.get(product);
    while(quantity >= qualifyingQuantity) {
      total = total - discount;
      quantity = quantity - qualifyingQuantity;
    }

    quantities.put(product, quantity);
    basket.setQuantities(quantities);
    basket.setTotal(total);
  }



}
