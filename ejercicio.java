package probas;

import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pos = 0, contPosiciones = 0;

        System.out.print("Introduce una cadena: ");
        String texto = teclado.nextLine();
        System.out.print("Introduce un caracter: ");
        char caracter = teclado.next().charAt(0);

        do {
            pos = texto.indexOf(caracter, pos);
            if (pos != -1) {
                contPosiciones++;
                pos++; 
            }						
        } while (pos != -1);			  

        System.out.print("El caracter aparece " + contPosiciones + " veces");
    }
}
