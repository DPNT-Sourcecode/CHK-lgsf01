package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import java.util.Map;

public class TwoBsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "B", 2, 15);
  }

}

