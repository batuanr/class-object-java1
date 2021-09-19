package quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        else {
            if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x1 = " + quadraticEquation.getRoot());
            }
            else {
                System.out.printf(
                        "Phương trình có 2 nghiệm x1 = %f và x2 = %f",
                        quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
            }
        }
    }
}
