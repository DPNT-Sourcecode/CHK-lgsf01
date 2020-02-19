package befaster.solutions.CHK.promotions;

import befaster.solutions.CHK.Basket;
import befaster.solutions.CHK.PriceList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

public class GroupPromotion implements Promotion {


  @Override
  public void apply(Basket basket) {
    String[] group = {"Z", "S", "T", "Y", "X"};
    int total = basket.getTotal();
    Map<String, Integer> quantities = basket.getQuantities();

    int totalDiscount = 0;

    List<String> tempStore = Lists.newArrayList();
    Map<String, Integer> tempQuantities = basket.getQuantities();
    for(String productCode : group) {
      while(tempQuantities.get(productCode) > 0){
        int tempQuantity = tempQuantities.get(productCode);
        tempQuantities.put(productCode, tempQuantity-1);
        tempStore.add(productCode);

        if(tempStore.size() == 3) {
          totalDiscount += calculateDiscount(tempStore);
          quantities = tempQuantities;
          tempStore.clear();
        }
      }
    }

    basket.setTotal(total - totalDiscount);
    basket.setQuantities(quantities);

  }



  private int calculateDiscount(List<String> codes) {
    int fullPrice = 0;
    for(String code : codes) {
      fullPrice += PriceList.getInstance().getProduct(code).getPrice();
    }

    return fullPrice - 45;
  }
}




