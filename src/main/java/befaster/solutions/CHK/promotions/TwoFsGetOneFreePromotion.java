package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import befaster.solutions.CHK.PriceList;

public class TwoFsGetOneFreePromotion extends MultibuyPromotion implements Promotion {
  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "F", 3, PriceList.getInstance().getProduct("F").getPrice());
  }
}

