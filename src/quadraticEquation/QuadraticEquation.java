package quadraticEquation;

public class QuadraticEquation {
    private double a, b, c;
    QuadraticEquation (){
    }
    QuadraticEquation (double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant () {
        return b*b -4*a*c;
    }
    public double getRoot () {
        return -b/(a*2);
    }
    public double getRoot1 () {
        return (-b + Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public double getRoot2 () {
        return (-b - Math.pow(getDiscriminant(),0.5))/(2*a);
    }
}
