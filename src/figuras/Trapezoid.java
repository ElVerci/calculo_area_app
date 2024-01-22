//Trapezoid.java
package figuras;

import java.util.Scanner;

public class Trapezoid {
    public static Scanner calculateArea(Scanner scanner) {
        System.out.print("Ingrese la primera base del trapecio: ");
        double baseOne = scanner.nextDouble();
        System.out.print("Ingrese la segunda base del trapecio: ");
        double baseTwo = scanner.nextDouble();
        System.out.print("Ingrese la altura del trapecio: ");
        double height = scanner.nextDouble();
        double area = ((baseOne + baseTwo) * height)/2;
        System.out.println("El área del trapecio es: " + area);
        return scanner;
    }
}
