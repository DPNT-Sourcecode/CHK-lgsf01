package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import befaster.solutions.CHK.PriceList;
import java.util.Map;

public class ThreeNsGetOneFreeMPromotion implements Promotion {

  @Override
  public void apply(Basket basket) {
    int total = basket.getTotal();
    Map<String, Integer> quantities = basket.getQuantities();

    int tempQuantity = quantities.get("N");
    while(tempQuantity >= 3) {

      int numberOfBs = quantities.get("M");
      if(numberOfBs > 0) {
        quantities.put("M", numberOfBs - 1);
        total -= PriceList.getInstance().getProduct("M").getPrice();
      }

      tempQuantity -= 3;
    }

    basket.setQuantities(quantities);
    basket.setTotal(total);
  }

}
