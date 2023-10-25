package proyectofinaldatos1;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

public class Login {
    public void crearUsuario() {
        try {
            FileWriter fileWriter = new FileWriter("usuarios.txt", true);

            String nombre = JOptionPane.showInputDialog("Nombre:");
            String apellidos = JOptionPane.showInputDialog("Apellidos:");
            String identificacion = JOptionPane.showInputDialog("Identificación:");
            String correoElectronico = JOptionPane.showInputDialog("Correo Electrónico:");
            String numeroTelefono = JOptionPane.showInputDialog("Número de Teléfono:");
            String contrasena = JOptionPane.showInputDialog("Contraseña:");

            Usuario nuevoUsuario = new Usuario(nombre, apellidos, identificacion, correoElectronico, numeroTelefono, contrasena);

            // Construir una cadena con los datos del usuario
            String usuarioDato = "Nombre: " + nuevoUsuario.getNombre() + "\n" +
                    "Apellidos: " + nuevoUsuario.getApellidos() + "\n" +
                    "Identificación: " + nuevoUsuario.getIdentificacion() + "\n" +
                    "Correo Electrónico: " + nuevoUsuario.getCorreoElectronico() + "\n" +
                    "Número de Teléfono: " + nuevoUsuario.getNumeroTelefono() + "\n" +
                    "Contraseña: " + nuevoUsuario.getContrasena() + "\n";

            // Escribir los datos en el archivo
            fileWriter.write(usuarioDato);

            // Cerrar el FileWriter
            fileWriter.close();

            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente y almacenado en usuarios.txt.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al crear el usuario.");
        }
    }
}
