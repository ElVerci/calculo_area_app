// Circle.java
package figuras;

import java.util.Scanner;

public class Circle {
    public static Scanner calculateArea(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("El área del círculo es: " + area);
        return scanner;
    }
}