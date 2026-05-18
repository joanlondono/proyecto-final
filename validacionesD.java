import java.util.Scanner;

public class validacionesD {
    public boolean validarCedula(String cedula) {
        if (cedula.length() != 10) {
            return false;
        }
        for (int i = 0; i < cedula.length(); i++) {
            if (!Character.isDigit(cedula.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public boolean validarNombre(String nombre) {
        if (nombre.isEmpty()) {
            return false;
        }
        for (int i = 0; i < nombre.length(); i++) {
            if (!Character.isLetter(nombre.charAt(i)) && !Character.isWhitespace(nombre.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public boolean validarTelefono(String telefono) {
        if (telefono.length() != 10) {
            return false;
        }
        for (int i = 0; i < telefono.length(); i++) {
            if (!Character.isDigit(telefono.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public boolean validarModalidaddeestudio(String modalidaddeestudio) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        while (isValid==false) {
        if (modalidaddeestudio.equalsIgnoreCase("presencial") || modalidaddeestudio.equalsIgnoreCase("virtual") || modalidaddeestudio.equalsIgnoreCase("híbrida")) {
            isValid = true;
            return true;
        }else {
            System.out.println("Modalidad de estudio no válida.");
            System.out.println("Por favor, ingrese una modalidad de estudio válida: presencial, virtual o híbrida.");
            sc.nextLine();
            isValid = false;
        }
    }
        return false;
    }
    public boolean validarCantidaddeasignatura(String cantidaddeasignatura) {
        try {
            int cantidad = Integer.parseInt(cantidaddeasignatura);
            return cantidad > 0 && cantidad <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean validarserialdelequipo(String serialdelequipo) {
        if (serialdelequipo.isEmpty()) {
            return false;
        }
        for (int i = 0; i < serialdelequipo.length(); i++) {
            if (!Character.isLetterOrDigit(serialdelequipo.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
