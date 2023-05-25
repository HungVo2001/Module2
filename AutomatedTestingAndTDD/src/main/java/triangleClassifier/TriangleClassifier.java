package triangleClassifier;

public class TriangleClassifier {
    private double sideA;
    private double sideB;
    private double sideC;
    public TriangleClassifier(){

    }

    public TriangleClassifier(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public boolean isOscelesTriangle() {
        return sideA == sideB || sideB == sideC || sideC == sideA;
    }
    public boolean isEquilateralTriangle() {
        return sideA == sideB && sideB == sideC;
    }
    public boolean isScalene() {
        return sideA != sideB && sideB != sideC && sideC != sideA;
    }
    public boolean isTriangle() {
        return (sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA;
    }
}
