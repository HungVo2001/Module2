package NumberFormatException;

public class CalculationExample {
    public void caculate(int x, int y){
        try {
            double a = x + y;
            double b = x - y;
            double c = x * y;
            double d = x / y;
            System.out.println("Phép cộng: x + y = " + a);
            System.out.println("Phép trừ: x - y = " + b);
            System.out.println("Phép nhân: x * y = " + c);
            System.out.println("Phép chia: x / y = " + d);

        }catch (Exception e){
            System.out.println("Xảy ra ngoai lệ: " + e.getMessage());
        }

    }
}
