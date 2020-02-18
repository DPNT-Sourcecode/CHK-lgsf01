package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class ThreeAsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "A", 3, 20);
  }

}
