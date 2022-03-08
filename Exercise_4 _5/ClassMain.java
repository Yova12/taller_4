import javax.swing.JOptionPane;

public class ClassMain {
/**
 * @author Yovanny Arley Valderrama Figueroa - Valderrama1858@gmail.com
 * 
 * clase "ClassMain"
 * esta clase vemos el menu, el cual contiene las opciones
 * con las que puede interactuar el usuario
 * 
 */
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        int option = 0;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n1. Crear vehiculo\n2. Vehiculos creados\n Enter para salir"));
            switch (option) {
                case 1:
                    CreateVehicle.createVehicle();
                    break;
                case 2:
                    CreateVehicle.printFile();
                    break;
                case 3:
                    System.exit(0);
                    break;
            
                default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
                menu();
                    break;
            }
        } while (option != 3);
    }
    
}

