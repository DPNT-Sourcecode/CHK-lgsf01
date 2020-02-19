package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class ThreeQsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "Q", 3, 10);
  }

}
