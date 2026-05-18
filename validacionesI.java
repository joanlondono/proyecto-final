import java.util.Scanner;
public class validacionesI {
    public String validarCedula(String cedula) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        while (isValid==true) {
            cedula = sc.nextLine();
        if (cedula.length() != 10) {
            isValid = false;
        } else {
            for (int i = 0; i < cedula.length(); i++) {
                if (!Character.isDigit(cedula.charAt(i))) {
                    isValid = false;
                }
            }
        }
    }
    return cedula;
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
    public boolean validarApellido(String apellido) {
        if (apellido.isEmpty()) {
            return false;
        }
        for (int i = 0; i < apellido.length(); i++) {
            if (!Character.isLetter(apellido.charAt(i)) && !Character.isWhitespace(apellido.charAt(i))) {
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
    public boolean validarNumerodesemestre(String numerodesemestre) {
        try {
            int semestre = Integer.parseInt(numerodesemestre);
            return semestre > 0 && semestre <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean validarPromedioacumulado(String promedioacumulado) {
        try {
            double promedio = Double.parseDouble(promedioacumulado);
            return promedio >= 0 && promedio <= 5;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean validarSerialdelequipo(String serialdelequipo) {
        return !serialdelequipo.isEmpty();
    }   
}
