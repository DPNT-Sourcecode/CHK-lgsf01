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
  public void checkout_shouldReturn20_whenGivenProductC() {
    assertThat(solution.checkout("C")).isEqualTo(20);
  }

  @Test
  public void checkout_shouldReturn15_whenGivenProductD() {
    assertThat(solution.checkout("D")).isEqualTo(15);
  }

  @Test
  public void checkout_shouldReturn40_whenGivenProductE() {
    assertThat(solution.checkout("E")).isEqualTo(40);
  }

  @Test
  public void checkout_shouldReturn10_whenGivenProductF() {
    assertThat(solution.checkout("F")).isEqualTo(10);
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
    assertThat(solution.checkout("@")).isEqualTo(-1);
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

  @Test
  public void checkout_shouldReturn20_whenTwoFsAreGiven() {
    assertThat(solution.checkout("FF")).isEqualTo(20);
  }

  @Test
  public void checkout_shouldReturn20_whenThreeFsAreGiven() {
    assertThat(solution.checkout("FFF")).isEqualTo(20);
  }

  @Test
  public void checkout_shouldApplyTenHsPromotion() {
    assertThat(solution.checkout("HHHHHHHHHH")).isEqualTo(80);

  }

  @Test
  public void checkout_shouldApplyFiveHsPromotion() {
    assertThat(solution.checkout("HHHHH")).isEqualTo(45);
  }

  @Test
  public void checkout_shouldApplyTwoKsPromotion() {
    assertThat(solution.checkout("KK")).isEqualTo(120);
  }

  @Test
  public void checkout_shouldApplyTwoNsGetAFreeMPromotion() {
    assertThat(solution.checkout("NNNM")).isEqualTo(120);
  }

  @Test
  public void checkout_shouldReturn120_whenGivenThreeNs() {
    assertThat(solution.checkout("NNN")).isEqualTo(120);
  }

  @Test
  public void checkout_shouldApplyFivePsPromotion() {
    assertThat(solution.checkout("PPPPP")).isEqualTo(200);
  }

  @Test
  public void checkout_shouldApplyThreeQsPromotion() {
    assertThat(solution.checkout("QQQ")).isEqualTo(80);
  }

  @Test
  public void checkout_shouldApplyThreeRsOneFreeQPromotion() {
    assertThat(solution.checkout("RRRQ")).isEqualTo(150);
  }

  @Test
  public void checkout_shouldApplyThreeUsGetOneFreePromotion() {
    assertThat(solution.checkout("UUUU")).isEqualTo(120);
  }

  @Test
  public void checkout_shouldReturn120_forThreeUs() {
    assertThat(solution.checkout("UUU")).isEqualTo(120);
  }

  @Test
  public void checkout_shouldApplyThreeVsPromotion() {
    assertThat(solution.checkout("VVV")).isEqualTo(130);
  }

  @Test
  public void checkout_shouldApplyTwoVsPromotion() {
    assertThat(solution.checkout("VV")).isEqualTo(90);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForThreeS() {
    assertThat(solution.checkout("SSS")).isEqualTo(45);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForThreeTs() {
    assertThat(solution.checkout("TTT")).isEqualTo(45);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForThreeXs() {
    assertThat(solution.checkout("XXX")).isEqualTo(45);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForThreeYs() {
    assertThat(solution.checkout("YYY")).isEqualTo(45);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForThreeZs() {
    assertThat(solution.checkout("ZZZ")).isEqualTo(45);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForSTX() {
    assertThat(solution.checkout("STX")).isEqualTo(45);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForTZZ() {
    assertThat(solution.checkout("TZZ")).isEqualTo(45);
  }

  //

  @Test
  public void checkout_shouldApplyGroupDiscount_ForSSSZ() {
    assertThat(solution.checkout("SSSZ")).isEqualTo(65);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForZZZS() {
    assertThat(solution.checkout("ZZZS")).isEqualTo(65);
  }

  @Test
  public void checkout_shouldApplyGroupDiscount_ForSTXZ() {
    assertThat(solution.checkout("STXZ")).isEqualTo(62);
  }
}
