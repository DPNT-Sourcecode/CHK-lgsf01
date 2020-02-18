package befaster.solutions.CHK;

import java.util.Optional;

public class Product {

  private final String name;
  private final int price;
  private final Optional<Discount> discount;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
    this.discount = Optional.empty();
  }

  public Product(String name, int price, Discount discount) {
    this.name = name;
    this.price = price;
    this.discount = Optional.ofNullable(discount);
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public Optional<Discount> getDiscount() {
    return discount;
  }
}

