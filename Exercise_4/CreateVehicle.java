
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
public class CreateVehicle extends Vehicles {
    public static File vehicleFile;
    static void createVehicle(){
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
    static void printFile(){
        FileReader read;
        BufferedReader storage;
        String nameOfVehicle;
        String numberOfWheels;
        String motors;
        String numberOfPassengers;
        String dateOfEnrollment;
        String textString;
        try {
            read = new FileReader(vehicleFile);
            storage = new BufferedReader(read);
            textString = "";
            while (textString != null) {
                try {
                    textString = storage.readLine();
                    nameOfVehicle = textString;
                    textString = storage.readLine();
                    numberOfWheels = textString;
                    textString = storage.readLine();
                    motors = textString;
                    textString = storage.readLine();
                    numberOfPassengers = textString;
                    textString = storage.readLine();
                    dateOfEnrollment = textString;
                    if (textString != null) {
                        JOptionPane.showMessageDialog(null, "Nombre del vehiculo: " + nameOfVehicle + 
                        "\nCatidad de llantas: " + numberOfWheels +
                        "\nCantidad de motores: " + motors +
                        "\nFecha de matricula: " + dateOfEnrollment +
                        "\nCantidad de pasajeros: " + numberOfPassengers);
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
