import java.util.UUID;

public class Planets {
/**
 * @author Yovanny Arley Valderrama figueroa - Valderrama1858@gmail.com
 * 
 * calse "Planets" es la clase que contiene los atributos
 * de los cuerpos celestes con sus constructores
 * 
 */
    String name;
    double mass;
    double diameter;
    double distanceFromSum;
    String idPlanet = UUID.randomUUID().toString().substring(0, 6);

    public Planets(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    public Planets(String name, double mass, double diameter, double distanceFromSum) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceFromSum = distanceFromSum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getDistanceFromSum() {
        return distanceFromSum;
    }
    public void setDistanceFromSum(double distanceFromSum) {
        this.distanceFromSum = distanceFromSum;
    }
    @Override
    public String toString() {
        return "Cuerpos Celestes" + "\nNombre: " + name + "\nMasa: " + mass + "Kg" +
            "\nDistancia hasta el sol: " + distanceFromSum + " Millones Km" +
            "\nDiametro: " + diameter + "Km" +  "\nID del cuerpo celeste: " + idPlanet;
    }

    
}
