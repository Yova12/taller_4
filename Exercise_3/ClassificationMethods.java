import java.util.Arrays;
import javax.swing.JOptionPane;

public class ClassificationMethods {
/**
 * @author Yovanny Arley Valderrama Figueroa - Valderrama1858@gmail.com
 * 
 * esta clase contiene los 2 tipos de metodos por los cuales
 * se podra organizar el arreglo
 * 
 */
    public static int arraySize = 0;
    public static int [] numberList;
    public static int [] numberList1;
    public static int option;
    public static int organizer;
    public static String[] option1 = {new String("Burbuja"),
    new String("Quick Sort"), new String("Tamaño")};
/**
 * Funcion "bubbleMethod()" 
 * esta funcion es la encargada de organizar el arrelgo atrabes del 
 * metodo conocido como burbuaja
 */
    static void bubbleMethod(){
        for (int i = 0; i < arraySize-1; i++) {
            for (int j = 0; j < arraySize-1; j++) {
                if (numberList[j] > numberList[j + 1]) {
                    organizer = numberList[j];
                    numberList[j] = numberList[j+1];
                    numberList[j+1] = organizer;
                }
            }
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(numberList1) +
            "\nArreglo ordenado por metodo Burbuja\n"+ Arrays.toString(numberList));
    }
/**
 * Funcion "quicksort()"
 * funcion considera una de las mejor opcion  la hora de organizar una
 * lista o arreglo
 * 
 * @param array1 Arrelgo que contiene los valores desordenados
 * @param left posicion en la que inicia a recorrer el arreglo de izquierda a derecha
 *             normalmente inicia en "0"
 * @param right posicion en la que inicia a recorrer el arreglo de derecha a izquierda
 *              normalmene inicia en la ultima posiscion "-1"
 */
    static void quickSort(int array1[], int left, int right){
        
        int i = left;
        int j = right;
        int auxiliary;
        int pivote = array1[(left + right)/2];
    
        do {
            while (array1[i]<pivote) {
                i++;
            }
            while (array1[i]>pivote) {
                j--;
            }
            if (i <= j) {
                auxiliary = array1[i];
                array1[i] = array1[j];
                array1[j] = auxiliary;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) {
            quickSort(array1, left, j);
        }
        if (i < right ) {
            quickSort(array1, i, right);
        }

            System.out.println(Arrays.toString(array1)); 
        
        
    }
}
