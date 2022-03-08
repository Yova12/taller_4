import javax.swing.JOptionPane;

import java.util.Arrays;
public class ClassMain {
/**
 * @author Yovanny Arley Valderrama Figueroa - Valderrama1858@gmail.com
 *  
 * la clase "classMain" contiene toda la estructura del programa
 * donde se instancia el arreglo que contendra los numeros que se
 * ordenaran atraves del metodo elegido por el usuario
 */
    
    public static void main(String[] args) throws Exception {
/**
 * Funcion "size()" 
 * el usuario ingresa el tamaño del arreglo que se llena automaticamente
 */
        size();
    }
        static void size(){
            ClassificationMethods.arraySize = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la lista"));
            menu();
        }
/**
 * Funcion "menu()" 
 * almacena todas las opciones que tendra el programa y atraves de 
 * y con uso de la funcion Math.random generamos numeros aleatorios
 * que seran almacenados en nuestro arreglo
 * 
 */
        static void menu(){
            ClassificationMethods.numberList = new int [ClassificationMethods.arraySize];
            for (int i = 0; i < ClassificationMethods.numberList.length; i++) {
                ClassificationMethods.numberList[i] = (int)(Math.random()*ClassificationMethods.arraySize)+1;
            }
            ClassificationMethods.numberList1 = Arrays.copyOf(ClassificationMethods.numberList,ClassificationMethods.numberList.length);
            ClassificationMethods.option = JOptionPane.showOptionDialog(null, Arrays.toString(ClassificationMethods.numberList1) + "\n- elegir metodo para ordenar\n" + 
                "- cambiar el tamaño del arreglo", "Ordenar arreglo", 0, JOptionPane.QUESTION_MESSAGE,
                null, ClassificationMethods.option1, 1);
            switch (ClassificationMethods.option) {
                case 0:
                    ClassificationMethods.bubbleMethod();
                    menu();
                    break;
                case 1:
                    ClassificationMethods.quickSort(ClassificationMethods.numberList,
                    0, ClassificationMethods.numberList.length -1);
                    menu();
                    break;
                case 2:
                size();
                    break;
                default:
                    break;
            }
        }
}

