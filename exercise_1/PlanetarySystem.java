
import javax.swing.JOptionPane;

public class PlanetarySystem {
/**
 * @author Yovanny Arley Valderrama Figueroa - Valderrama1858@gmail.com
 * 
 * calse principal PlanetarySystem
 * esta clase contiene la instacia de todos los cuerpos
 * celestes incluidos en el programa junto con un menu de opciones
 * 
 */
    Planets planets[] = null;
    public static void main(String[] args) throws Exception {
        Planets planets[] = {
            new Planets("Sol", 1.989, 1.3927, 0),
            new Planets("Luna", 7.349, 3.474, 149),
            new Planets("Mercurio", 3.285, 4.879, 46),
            new Planets("Venus", 5.35, 7.624, 66),
            new Planets("Tierra", 6.39, 8.260, 96),
            new Planets("Marte", 4.36, 5.248, 108),
            new Planets("Jupiter", 3.35, 16.408, 234),
            new Planets("Saturno", 5.23, 14.692, 290),
            new Planets("Urano", 6.25, 12.484, 340),
            new Planets("Neptuno", 3.64, 11.985, 457)};

        int option = 0;
            do {
                option = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"+
                "1: Planetas del sistema solar\n"+
                "2: Calcular atraccion gravitatoria\n"+
                "3: salir del programa\n"+
                "Elija una opcion"));
                switch (option) {
                    case 1: 
                        JOptionPane.showMessageDialog(null, planets[0]);
                        JOptionPane.showMessageDialog(null, planets[1]);
                        JOptionPane.showMessageDialog(null, planets[2]);
                        JOptionPane.showMessageDialog(null, planets[3]);
                        JOptionPane.showMessageDialog(null, planets[4]);
                        JOptionPane.showMessageDialog(null, planets[5]);
                        JOptionPane.showMessageDialog(null, planets[6]);
                        JOptionPane.showMessageDialog(null, planets[7]);
                        JOptionPane.showMessageDialog(null, planets[8]);
                        JOptionPane.showMessageDialog(null, planets[9]);
                        
                        
                        break;
                    case 2:
                        double gravity = 6.673;
                        int celestialBody1;
                        int celestialBody2;  
                        double distance;
                        double gravitationalAttraction; 
                        celestialBody1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el 1mer Cuerpos celestes a calcular\n"+ 
                        "\n0: " + planets[0].name + "\n1: " + planets[1].name + "\n2: " + planets[2].name + "\n3: " + planets[3].name + 
                        "\n4: " + planets[4].name + "\n5: " + planets[5].name + "\n6: " + planets[6].name + "\n7: " + planets[7].name + 
                        "\n8: " + planets[8].name + "\n9: " + planets[9].name));

                        celestialBody2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el 1mer Cuerpos celestes a calcular\n"+ 
                        "\n0: " + planets[0].name + "\n1: " + planets[1].name + "\n2: " + planets[2].name + "\n3: " + planets[3].name + 
                        "\n4: " + planets[4].name + "\n5: " + planets[5].name + "\n6: " + planets[6].name + "\n7: " + planets[7].name + 
                        "\n8: " + planets[8].name + "\n9: " + planets[9].name));
                        distance = planets[celestialBody1].distanceFromSum-planets[celestialBody2].distanceFromSum;
                            if (distance < 0) {distance = distance * -1;}
                        double mass1 = planets[celestialBody1].mass;
                        double mass2 = planets[celestialBody2].mass;
                        distance = Math.pow(distance, 2);

                        gravitationalAttraction = gravity * ((mass1 * mass2) / distance);

                        JOptionPane.showMessageDialog(null, "La atraccion gravitatoria entre:\n"+
                        planets[celestialBody1].name + " y " + planets[celestialBody2].name + "\nEs: " + gravitationalAttraction + "Newtons");
                        
                        break;
                    case 3:
                        System.exit(0);
                        break;
    
                    default:
                        break;
                }
            } while (option != 3);
   
   
    }

}
