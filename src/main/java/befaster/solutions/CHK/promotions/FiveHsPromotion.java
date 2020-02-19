package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class FiveHsPromotion extends MultibuyPromotion implements Promotion {
  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "H", 5, 5);
  }
}
