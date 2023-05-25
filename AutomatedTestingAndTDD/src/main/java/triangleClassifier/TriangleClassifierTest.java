package triangleClassifier;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TriangleClassifierTest {
    @Test
    public void tamGiacDeu() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(9,9,9);
        assertTrue(triangleClassifier.isEquilateralTriangle());
        boolean result = triangleClassifier.isEquilateralTriangle();
        System.out.println("Tam giác cân " + result);
    }
    @Test
    public void tamGiacCan() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(9,9,8);
        assertTrue(triangleClassifier.isOscelesTriangle());
        boolean result = triangleClassifier.isOscelesTriangle();
        System.out.println("Tam giác đều: " + result);
    }
    @Test
    public void tamGiacThuong() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(7,8,9);
        assertTrue(triangleClassifier.isScalene());
        boolean result = triangleClassifier.isScalene();
        System.out.println("Tam giác thường: " + result);
    }
    @Test
    public void khongPhaiTamGiac() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(8,2,3);
        assertTrue(triangleClassifier.isTriangle());
        boolean result = triangleClassifier.isTriangle();
        System.out.println("Không phải là tam giác: " + result);
    }


}
