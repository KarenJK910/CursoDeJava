import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Elija una opcion: ");
        System.out.println("1. Mujer");
        System.out.println("2. Hombre");
        int opc = s.nextInt();
        System.out.println("Ingrese su altura: ");
        float alt = s.nextFloat();
        if(opc == 1){
            float peso = alt - 120;
            System.out.println("El peso ideal es: " + peso);
        } else {
            float peso = alt - 110;
            System.out.println("El peso ideal es: " + peso);
        }
    }
}
