package HomeWork1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountWithValidArguments() {
        double purchaseAmount = 100.0;
        int discountAmount = 20;

        double expectedAmount = 80.0;
        double actualAmount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(actualAmount).isEqualTo(expectedAmount);
    }

    @Test
    public void testCalculateDiscountWithZeroDiscount() {
        double purchaseAmount = 100.0;
        int discountAmount = 0;

        double expectedAmount = 100.0;
        double actualAmount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(actualAmount).isEqualTo(expectedAmount);
    }

    @Test
    public void testCalculateDiscountWithNegativeDiscount() {
        double purchaseAmount = 100.0;
        int discountAmount = -20;

        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The discount amount cannot be negative");
    }
}