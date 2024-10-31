/**
 * saludopersonal
 */

import java.util.Scanner;

public class saludopersonal {

    public static void main(String[] args) {
        System.out.printf("¡HOLA!");
            var entradaDeTeclado = new Scanner(System.in);
                System.out.println("como te llamas: ");
                var LoQueMeEscribeElUsuario = entradaDeTeclado.nextLine();
                System.out.printf("UN GUSTO %s",LoQueMeEscribeElUsuario);
                
                entradaDeTeclado.close();

    }
    

    
}