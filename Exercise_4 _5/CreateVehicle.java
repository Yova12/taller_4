import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
public class CreateVehicle extends Vehicles {
/**
 * La clasr "CreateVehicle"
 * contiene las funciones de crear vehiculos
 * y Imprimir lista de vehiculos
 */
    public static File vehicleFile;
/**
 * la funcion "createVehicle"
 * es la encargada de crear vehiculos iniciando un archivo txt
 * para almacenar los vehiculos que se lleguen a crear
 * 
 */
    static void createVehicle(){
        // File vehicleFile;
        FileWriter writer;
        PrintWriter line;

        vehicleFile = new File("ArchivoVehiculos.txt");
        if (!vehicleFile.exists()) {
            try {
                vehicleFile.createNewFile();
                Vehicles newVehicles = new Vehicles();
                writer = new FileWriter(vehicleFile, true);
                line = new PrintWriter(writer);
                line.println(newVehicles.getNameOfVehicle());
                line.println(newVehicles.getNumberOfWheels());
                line.println(newVehicles.getMotors());
                line.println(newVehicles.getNumberOfPassengers());
                line.println(newVehicles.getDateOfEnrollment());
                line.close();
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Problemas con el archivo" + e);
            }
        } else {
            try {
                Vehicles newVehicles = new Vehicles();
                writer = new FileWriter(vehicleFile, true);
                line = new PrintWriter(writer);
                line.println(newVehicles.getNameOfVehicle());
                line.println(newVehicles.getNumberOfWheels());
                line.println(newVehicles.getMotors());
                line.println(newVehicles.getNumberOfPassengers());
                line.println(newVehicles.getDateOfEnrollment());
                line.close();
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Problemas con el archivo" + e);
            }
            
        }
            
    }
/**
 * Funcion "printFile"
 * esta funcion me toma el archivo ya existente
 * y me lo imprime 
 */
    static void printFile(){
        FileReader read;
        BufferedReader storage;
        String nameOfVehicle;
        String numberOfWheels;
        String motors;
        String numberOfPassengers;
        String dateOfEnrollment;
        String textSting;
        try {
            read = new FileReader(vehicleFile);
            storage = new BufferedReader(read);
            textSting = "";
            while (textSting != null) {
                try {
                    textSting = storage.readLine();
                    nameOfVehicle = textSting;
                    textSting = storage.readLine();
                    numberOfWheels = textSting;
                    textSting = storage.readLine();
                    motors = textSting;
                    textSting = storage.readLine();
                    numberOfPassengers = textSting;
                    textSting = storage.readLine();
                    dateOfEnrollment = textSting;
                    if (textSting != null) {
                        JOptionPane.showMessageDialog(null, "Nombre del vehiculo " + nameOfVehicle + 
                        "\nCatidad de llantas " + numberOfWheels +
                        "\nCantidad de motores " + motors +
                        "\nFecha de matricula " + dateOfEnrollment +
                        "\nCantidad de pasajeros " + numberOfPassengers);
                    }

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Problemas con el archivo" + e);

                }
            }
            try {
                storage.close();
                read.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Problemas con el archivo" + e);

            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Problemas con el archivo" + e);
        }
    }

}
