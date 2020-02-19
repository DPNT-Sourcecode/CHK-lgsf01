package befaster.solutions.CHK;

import befaster.solutions.CHK.promotions.FiveAsPromotion;
import befaster.solutions.CHK.promotions.FiveHsPromotion;
import befaster.solutions.CHK.promotions.FivePsPromotion;
import befaster.solutions.CHK.promotions.GroupPromotion;
import befaster.solutions.CHK.promotions.Promotion;
import befaster.solutions.CHK.promotions.TenHsPromotion;
import befaster.solutions.CHK.promotions.ThreeAsPromotion;
import befaster.solutions.CHK.promotions.ThreeNsGetOneFreeMPromotion;
import befaster.solutions.CHK.promotions.ThreeQsPromotion;
import befaster.solutions.CHK.promotions.ThreeRsGetOneFreeQPromotion;
import befaster.solutions.CHK.promotions.ThreeUsGetOneFreePromotion;
import befaster.solutions.CHK.promotions.ThreeVsPromotion;
import befaster.solutions.CHK.promotions.TwoBsPromotion;
import befaster.solutions.CHK.promotions.TwoEsGetOneFreeBPromotion;
import befaster.solutions.CHK.promotions.TwoFsGetOneFreePromotion;
import befaster.solutions.CHK.promotions.TwoKsPromotion;
import befaster.solutions.CHK.promotions.TwoVsPromotion;
import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {

  private int total = 0;


  private List<Promotion> promotions = Lists.newArrayList();

  private PriceList priceList = PriceList.getInstance();
  private Map<String, Integer> quantities = new HashMap<>();

  public Basket() {
    priceList.getAllProducts().forEach(p -> quantities.put(p.getName(), 0));


    promotions.add(new GroupPromotion());
    promotions.add(new TenHsPromotion());
    promotions.add(new FiveHsPromotion());
    promotions.add(new FiveAsPromotion());
    promotions.add(new ThreeAsPromotion());
    promotions.add(new TwoEsGetOneFreeBPromotion());
    promotions.add(new TwoBsPromotion());
    promotions.add(new TwoFsGetOneFreePromotion());
    promotions.add(new TwoKsPromotion());
    promotions.add(new ThreeNsGetOneFreeMPromotion());
    promotions.add(new FivePsPromotion());
    promotions.add(new ThreeRsGetOneFreeQPromotion());
    promotions.add(new ThreeQsPromotion());
    promotions.add(new ThreeUsGetOneFreePromotion());
    promotions.add(new ThreeVsPromotion());
    promotions.add(new TwoVsPromotion());
  }

  public void addItem(String item) {
    if(quantities.get(item) == null) {
      throw new IllegalInputException(String.format("%s is not a valid product code", item));
    }

    quantities.put(item,
        quantities.get(item)+1
    );
  }

  public int checkout() {
    for(Map.Entry<String, Integer> entry : quantities.entrySet()) {
      Product product = priceList.getProduct(entry.getKey());
      total = total + (entry.getValue() * product.getPrice());
    }

    applyPromotions();
    return total;
  }

  public void applyPromotions() {
    promotions.forEach(promo -> promo.apply(this));
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public Map<String, Integer> getQuantities() {
    return quantities;
  }

  public void setQuantities(Map<String, Integer> quantities) {
    this.quantities = quantities;
  }
}

