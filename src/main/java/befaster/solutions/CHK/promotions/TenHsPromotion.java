package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class TenHsPromotion extends MultibuyPromotion implements Promotion {
  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "H", 10, 20);
  }
}
