package ejerciciosDebug;

/*
 * Mediante el uso de puntos de interrupcion e inspeccion de variables descubre que 
 * hace el siguiente programa y explica como lo hace.
 * 
 * 
 */

//El programa coge los números del array y los va comparando para saber cual es el mayor y así ordenarlos ascendentemente
public class d8Bonus {
 
    public static void main(String args[])
    {

        int numeros[] = { 52, 11, 41, 5, 33, 27, 9 };
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                   
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
       
        muestraPorPantalla(numeros);
    }
    
    public static void muestraPorPantalla(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
