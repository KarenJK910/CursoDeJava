import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio;
        int intento;
        int contador = 10;

        numeroAleatorio = (int) (Math.random()*100+1);
        System.out.println("Intenta adivinar un numero aleatorio entre el 1 y 100.");

        do {
            System.out.print("Introduce el numero que creas posible: ");
            intento = scanner.nextInt();
            if (intento > numeroAleatorio) {
                System.out.println("El numero que buscas es menor");
            } else if (intento < numeroAleatorio){
                System.out.println("El numero que buscas es mayor");
            } else {
                System.out.print("CORRECTO!! "+ numeroAleatorio + " era el numero que estabas "
                        + "buscando, lo has intentado " + (10 - (contador-1)) +" veces.");
            }
            contador--;
        } while (intento != numeroAleatorio && contador > 0);
        if (contador == 0) {
            System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
        }
    }
}



