package befaster.solutions.CHK;



import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Before;
import org.junit.Test;

public class CheckoutSolutionTest {

  private CheckoutSolution solution;

  @Before
  public void beforeEach() {
    solution = new CheckoutSolution();
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
  public void checkout_shouldReturn80_whenGivenProductAAndB() {
    assertThat(solution.checkout("A,B")).isEqualTo(80);

  }

}


