package HomeWork1;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is impossible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0) {
            throw new ArithmeticException("The discount amount cannot be negative");
        }

        double discount = purchaseAmount * discountAmount / 100;
        return purchaseAmount - discount;
    }
}