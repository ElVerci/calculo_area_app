// Square.java
package figuras;

import java.util.Scanner;

public class Square {
    public static Scanner calculateArea(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.println("El área del cuadrado es: " + area);
        return scanner;
    }
}