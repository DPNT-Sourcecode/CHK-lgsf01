package befaster.solutions.CHK;

import static org.hamcrest.MatcherAssert.assertThat;


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
    assertThat()
    solution.checkout("A");
  }



}
