package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Basket {

  @Autowired private PriceList priceList;


  private Map<String, Integer> quantities = new HashMap<>();


  public void addItem(String item) {

  }



  public void getTotal() {

  }



}

