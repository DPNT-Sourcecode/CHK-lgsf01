package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class ThreeAsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
//    int total = basket.getTotal();
//
//    Map<String, Integer> quantities = basket.getQuantities();
//
//    int quantity = quantities.get("A");
//    while(quantity >= 3) {
//      total = total - 20;
//      quantity = quantity - 3;
//    }
//
//    quantities.put("A", quantity);
//    basket.setQuantities(quantities);
//    basket.setTotal(total);

    applyMultibuy(basket, "A", 3, 20);
  }

}
