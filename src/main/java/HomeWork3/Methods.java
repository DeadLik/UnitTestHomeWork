package HomeWork3;

public class Methods {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        int lowerBound = 25;
        int upperBound = 100;

        if (n > lowerBound && n < upperBound) {
            return true;
        } else {
            return false;
        }
    }
}
