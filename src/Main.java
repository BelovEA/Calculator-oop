import Logger.Logger;
import Operations.*;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, 5);

        Calculator calculator = new Calculator();

        ComplexNumber sum = calculator.add(num1, num2);
        Logger.log("Сумма: " + sum.getReal() + " + " + sum.getImaginary() + "i");

        ComplexNumber product = calculator.multiply(num1, num2);
        Logger.log("Произведение: " + product.getReal() + " + " + product.getImaginary() + "i");

        try {
            ComplexNumber quotient = calculator.divide(num1, num2);
            Logger.log("Частное: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
        } catch (ArithmeticException e) {
            Logger.log("Ошибка: " + e.getMessage());
        }
    }
}
