
import javax.swing.JOptionPane;

public class Vehicles {
/**
 * @author Yovanny Arley valderrama Figueroa - Valderrama1858@gamil.com
 * Clase "Vehicles"
 * esta clase contiene los atributos y constructor
 * de los vehiculos para una posterior instancia
 */
    private String nameOfVehicle;
    private int numberOfWheels;
    private int motors;
    private int numberOfPassengers;
    private String dateOfEnrollment;
    private String vehicleType;
/**
 * Funcion "Vehicles()"
 * es el constructor vacio en el cual ingresaremos los atributos 
 * atraves de la funcion JOptionPane.
 */
    public Vehicles() {
        nameOfVehicle = JOptionPane.showInputDialog("Nombre del vehiculo");
        numberOfWheels = Integer.parseInt(JOptionPane.showInputDialog("Catidad de llantas"));
        motors = Integer.parseInt(JOptionPane.showInputDialog("Catidad de motores"));
        vehicleType = JOptionPane.showInputDialog("¿Que vehiculo es?");
        numberOfPassengers = Integer.parseInt(JOptionPane.showInputDialog("Catidad de pasajeros"));
        dateOfEnrollment = JOptionPane.showInputDialog("Fecha de matricula dd-mm-yyyy");
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getMotors() {
        return motors;
    }

    public void setMotors(int motors) {
        this.motors = motors;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }


}
