package IllegalTriangleException;

public class Triangle {
    public void triangleException(double side1, double side2, double side3){
        try {
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
                double perimeter = side1 + side2 + side3;
                double s = (side1 + side2 +side3) / 2;
                double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
                System.out.println("Perimeter : " + perimeter);
                System.out.println(" Area : " + area);
            }else {
                System.out.println("Đầu vào k hợp lệ, tổng 2 cạnh bất kì của 1 tam giác phải lớn hơn cạnh thứ 3: ");
            }
        }catch (Exception e){
            System.out.println("Đầu vào k hợp lệ. Vui lòng nhập số! ");
        }
    }
}
