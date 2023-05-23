package Refactoring;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculator(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return sum(firstOperand,secondOperand);
            case SUBTRACTION:
                return sub(firstOperand,secondOperand);
            case MULTIPLICATION:
                return mul(firstOperand, secondOperand);
            case DIVISION:
                return div(firstOperand, secondOperand);
            default:
                throw new RuntimeException("Vui lòng nhập đúng toán tử");
        }
    }
    public static int sum(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }
    public static int sub(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }
    public static int mul(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }
    public static int div(int firstOperand, int secondOperand) {
        if (secondOperand != 0) {
            return firstOperand / secondOperand;
        } else {
            throw new RuntimeException("Không thể chia cho 0 ");
        }
    }

}
