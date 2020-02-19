package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import befaster.solutions.CHK.PriceList;

public class ThreeUsGetOneFreePromotion extends MultibuyPromotion implements Promotion {
  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "U", 4, PriceList.getInstance().getProduct("U").getPrice());
  }
}
