package befaster.solutions.CHK;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CheckoutSolutionTest {

  @Autowired
  private CheckoutSolution solution;

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

  @Test
  public void checkout_shouldReturn35_whenGivenProductCAndD() {
    assertThat(solution.checkout("C,D")).isEqualTo(35);
  }

  @Test
  public void checkout_shouldReturn130AndApplyDiscount_whenGivenThreeAs() {
    assertThat(solution.checkout("A,A,A")).isEqualTo(130);

  }

}

