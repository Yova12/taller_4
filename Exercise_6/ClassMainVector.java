import java.util.Vector;
import javax.swing.JOptionPane;

public class ClassMainVector {
/** 
 * 
 * @author Yovanny Arley valderrama - Valderrama1858@gmail.com
 * 
 * En esta clase vemos una de las muchas funcionalidades de la clase "Vector" 
 * 
 * Incializamos un Vector vacio y atraves de un doWhile
 * vamos a ingresar numeros con un jOptionPane hasta 
 * que el numero se repita y ya finaliza el programa
 * 
 * 
 **/ 
    public static void main(String[] args) throws Exception {
        Vector  numbers = new Vector<>();
        boolean checker = false;
        int auxiliary = 0;

        do {
            auxiliary = Integer.parseInt(JOptionPane.showInputDialog("ingresar numero"));
            if (numbers.contains(auxiliary)) {
                JOptionPane.showMessageDialog(null, numbers + "\nelemento encontrado en la posicion " + numbers.indexOf(auxiliary));
                break;    
            } else {
                numbers.addElement(auxiliary);
            }
        } while (checker == false);
    }
}
