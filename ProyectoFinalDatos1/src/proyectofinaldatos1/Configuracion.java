package proyectofinaldatos1;
import javax.swing.JOptionPane;

public class Configuracion {
    public static String nombreE = "AzzaCar";
    public static String telefonoE = "8888-8888";
    public static String direccionE = "Cartago, Cartago, Occidental";

    public static void InfoEmpreza() {

    JOptionPane.showMessageDialog(null, "Bienvenido! " +"\n"+"Empresa: " + nombreE+"\n"+ "Telefono: " + telefonoE+"\n"+"Direccion: "+ direccionE);
    }


}
