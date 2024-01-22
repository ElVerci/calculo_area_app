// Triangle.java
package figuras;

import java.util.Scanner;

public class Triangle {
    public static Scanner calculateArea(Scanner scanner) {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("El área del triángulo es: " + area);
        return scanner;
    }
}