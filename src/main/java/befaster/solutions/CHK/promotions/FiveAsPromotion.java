package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import java.util.Map;

public class FiveAsPromotion extends MultibuyPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    applyMultibuy(basket, "A", 5, 50);
  }

}

