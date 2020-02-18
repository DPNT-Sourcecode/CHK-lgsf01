package befaster.solutions.CHK;

public class Discount {

  private final int quantity;
  private final int price;

  public Discount(int quantity, int price) {
    this.quantity = quantity;
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getPrice() {
    return price;
  }
}

