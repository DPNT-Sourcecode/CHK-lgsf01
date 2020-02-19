package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class ThreeVsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "V", 3, 20);
  }

}
