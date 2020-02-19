package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import befaster.solutions.CHK.PriceList;
import java.util.Map;

public class ThreeRsGetOneFreeQPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    int total = basket.getTotal();
    Map<String, Integer> quantities = basket.getQuantities();

    int tempQuantity = quantities.get("R");
    while(tempQuantity >= 3) {

      int numberOfBs = quantities.get("Q");
      if(numberOfBs > 0) {
        quantities.put("Q", numberOfBs - 1);
        total -= PriceList.getInstance().getProduct("Q").getPrice();
      }

      tempQuantity -= 3;
    }

    basket.setQuantities(quantities);
    basket.setTotal(total);
  }

}
