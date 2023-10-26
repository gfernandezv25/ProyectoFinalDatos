package proyectofinaldatos1;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

public class Login {
    public void crearUsuario() {
        try {
            FileWriter txt = new FileWriter("usuarios.txt", true);

            String nombre = JOptionPane.showInputDialog("Nombre:");
            String apellidos = JOptionPane.showInputDialog("Apellidos:");
            String identificacion = JOptionPane.showInputDialog("Identificacion:");
            String correoElectronico = JOptionPane.showInputDialog("Correo Electronico:");
            String numeroTelefono = JOptionPane.showInputDialog("Numero de Telefono:");
            String contrasena = JOptionPane.showInputDialog("Contraseña:");

            Usuario nuevoUsuario = new Usuario(nombre, apellidos, identificacion, correoElectronico, numeroTelefono, contrasena);

    
            String usuarioDato = "Nombre: " + nuevoUsuario.getNombre() + "\n" +
                    "Apellidos: " + nuevoUsuario.getApellidos() + "\n" +
                    "Identificacion: " + nuevoUsuario.getIdentificacion() + "\n" +
                    "Correo Electronico: " + nuevoUsuario.getCorreoElectronico() + "\n" +
                    "Numero de Telefono: " + nuevoUsuario.getNumeroTelefono() + "\n" +
                    "Contraseña: " + nuevoUsuario.getContrasena() + "\n\n";

          txt.write(usuarioDato);
            txt.write("\n");

          
            txt.close();

            JOptionPane.showMessageDialog(null, "Gracias! "+nombre+ " tu usuario fue creado exitosamente.");
        } catch (IOException i) {
            JOptionPane.showMessageDialog(null, "Error al crear el usuario.");
        }
    }
}
