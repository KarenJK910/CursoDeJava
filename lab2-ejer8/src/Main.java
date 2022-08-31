import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double num2 = s.nextDouble();
        System.out.println("La raiz cuadrada de " + num2 + " es :" + Math.sqrt(num2));
    }
}
