package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class TwoVsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "V", 2, 10);
  }

}
