package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class TwoKsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "K", 2, 20);
  }

}

