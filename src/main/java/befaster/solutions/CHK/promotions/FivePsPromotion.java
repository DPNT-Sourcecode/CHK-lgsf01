package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;

public class FivePsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "P", 5, 50);
  }

}
