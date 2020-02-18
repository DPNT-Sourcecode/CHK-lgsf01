package befaster.solutions.CHK;

public class Discount {

  private final int qualifyingQuantity;
  private final int price;

  public Discount(int qualifyingQuantity, int price) {
    this.qualifyingQuantity = qualifyingQuantity;
    this.price = price;
  }

  public int getQualifyingQuantity() {
    return qualifyingQuantity;
  }

  public int getPrice() {
    return price;
  }
}

