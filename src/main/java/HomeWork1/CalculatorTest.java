package HomeWork1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    public static void main(String[] args) {

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-1000, 50))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(1000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(1000, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");

        assertThat(Calculator.calculatingDiscount(1000, 25)).isEqualTo(750);
        assertThat(Calculator.calculatingDiscount(1000, 100)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(1000, 0)).isEqualTo(1000);
    }
}