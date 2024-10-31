
import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola como te llamas: ");
        String userName = scanner.nextLine();

        System.out.println("A que te dedicas: ");
        String profecion = scanner.nextLine();

        System.out.println("Que adad tienes: ");
        int edad = scanner.nextInt();

        System.out.printf("%s espero estes bien, en tu labor de %s, a tus %d años.", userName, profecion, edad);

        scanner.close();





    }


    
}
