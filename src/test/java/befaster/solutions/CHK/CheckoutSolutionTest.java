package befaster.solutions.CHK;
import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Before;
import org.junit.Test;

public class CheckoutSolutionTest {

  private CheckoutSolution solution;

  @Before
  public void before(){
    solution = new CheckoutSolution();
  }

  @Test
  public void checkout_shouldReturn0_whenGivenEmptyString() {
    assertThat(solution.checkout("")).isEqualTo(0);
  }

  @Test
  public void checkout_shouldReturn50_whenGivenProductA() {
    assertThat(solution.checkout("A")).isEqualTo(50);
  }

  @Test
  public void checkout_shouldReturn30_whenGivenProductB() {
    assertThat(solution.checkout("B")).isEqualTo(30);
  }

  @Test
  public void checkout_shouldReturn20_whenGivenProductB() {
    assertThat(solution.checkout("C")).isEqualTo(20);
  }

  @Test
  public void checkout_shouldReturn15_whenGivenProductB() {
    assertThat(solution.checkout("D")).isEqualTo(15);
  }

  @Test
  public void checkout_shouldReturn40_whenGivenProductB() {
    assertThat(solution.checkout("E")).isEqualTo(40);
  }

  @Test
  public void checkout_shouldReturn80_whenGivenProductAAndB() {
    assertThat(solution.checkout("AB")).isEqualTo(80);

  }

  @Test
  public void checkout_shouldReturn35_whenGivenProductCAndD() {
    assertThat(solution.checkout("CD")).isEqualTo(35);
  }

  @Test
  public void checkout_shouldReturn130AndApplyDiscount_whenGivenThreeAs() {
    assertThat(solution.checkout("AAA")).isEqualTo(130);
  }

  @Test
  public void checkout_shouldReturnExpectedValue_whenThereIsADiscountAndAdditionalItems() {
    assertThat(solution.checkout("AAAA")).isEqualTo(180);
  }

  @Test
  public void checkout_shouldReturn45AndApplyDiscount_whenGivenTwoBs() {
    assertThat(solution.checkout("BB")).isEqualTo(45);
  }

  @Test
  public void checkout_shouldReturn175_whenDiscountsForMultipleItemsApply() {
    assertThat(solution.checkout("AAABB")).isEqualTo(175);
  }

  @Test
  public void checkout_shouldReturnMinusOne_whenIllegalInputIsSupplied() {
    assertThat(solution.checkout("AZ")).isEqualTo(-1);
  }

  @Test
  public void checkout_shouldReturn200_whenGiven5As() {
    assertThat(solution.checkout("AAAAA")).isEqualTo(200);
  }

  @Test
  public void checkout_shouldApplyDiscountsInCorrectOrderAndReturn330_whenGiven8As() {
    assertThat(solution.checkout("AAAAAAAA")).isEqualTo(330);
  }

  @Test
  public void checkout_shouldNotChargeForBProductAndReturn80_whenTwoEsAreGiven() {
    assertThat(solution.checkout("EEB")).isEqualTo(80);
  }

  @Test
  public void checkout_shouldReturn80_whenTwoEsAreGiven() {
    assertThat(solution.checkout("EE")).isEqualTo(80);

  }
}


