public class ImprimirDiamante {
    public static void main(String[] args) {
        int n = 3; // Altura de la mitad del rombo

        //*imrpimo la primra mitad  */
        for (int i = 1; i <= n; i++) {/*siclo for creamos una variable entera llamada i que contiene 1, si i es menor o igual
                                        a la altura i va a crecer en uno se va a guardar en si mismo hace una vuelta  */
            for (int j = n; j > i; j--) {/* aca con j le estamos dando los espacios iniciales si j es menor que i va a disminuir
                                            en uno  */
                System.out.print(" "); // Imprimir espacios
            }  
            for (int j = 1; j <= (2 * i - 1); j++) { /* igualamos j a 1  */
                System.out.printf("*"); // Imprimir asteriscos
            }
            System.out.printf("%n"); // Nueva línea
        }

        // Parte inferior del rombo
       for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Imprimir espacios
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Imprimir asteriscos
            }
            System.out.println(); // Nueva línea
        }
    }
}
