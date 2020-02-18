package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Basket {

  @Autowired private PriceList priceList;
  private Map<String, Integer> quantities = new HashMap<String, Integer>();


  public void addItem(String item) {
    quantities.put(item,
        quantities.get(item)+1
    );
  }


  public void getTotal() {

  }



}


