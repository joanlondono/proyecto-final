import java.util.Scanner;

public class validacionesD {
    Scanner sc = new Scanner(System.in);
    public String validarCedula(String cedula) {
       
        boolean isValid = false;
        do {
            isValid = true;
           
        if (cedula.length() < 8 || cedula.length() > 11) {
            isValid = false;
        } else {
            for (int i = 0; i < cedula.length(); i++) {
                if (!Character.isDigit(cedula.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }
        if (!isValid) {
            System.out.println("Cédula no válida. Por favor, ingrese una cédula válida de 8 a 11 dígitos.");
            cedula = sc.nextLine();
        }
    }while (!isValid);
    return cedula;
}
    
public String validarNombre(String nombre) {
    boolean isValid = false;

    while (!isValid) {
        isValid = true;

        if (nombre.isEmpty() || nombre.length() > 15) {
            isValid = false;
        } else {
            for (int i = 0; i < nombre.length(); i++) {
                if (!Character.isLetter(nombre.charAt(i)) && !Character.isWhitespace(nombre.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }

        if (!isValid) {
            System.out.println("Nombre inválido. Solo letras y espacios permitidos, con un máximo de 15 caracteres.");
           
            nombre = sc.nextLine();
        }
    }
    return nombre;
}
    public String validarApellido(String apellido) {
        boolean isValid = false;

    while (!isValid) {
        isValid = true;

        if (apellido.isEmpty() || apellido.length() > 15) {
            isValid = false;
        } else {
            for (int i = 0; i < apellido.length(); i++) {
                if (!Character.isLetter(apellido.charAt(i)) && !Character.isWhitespace(apellido.charAt(i))) {
                    isValid = false;
                    break;
                }
            } 
        }

        if (!isValid) {
            System.out.println("Apellido inválido. Solo letras y espacios permitidos, con un máximo de 15 caracteres.");
            
            apellido = sc.nextLine();
        }
    }
    return apellido;
}
        
    
    public String validarTelefono(String telefono) {
       
        boolean isValid = false;
        do {
            isValid = true;
           
        if (telefono.length() != 10) {
            isValid = false;
        } else {
            for (int i = 0; i < telefono.length(); i++) {
                if (!Character.isDigit(telefono.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }
        if (!isValid) {
            System.out.println("Teléfono no válido. Por favor, ingrese un teléfono válido de 10 dígitos.");
            telefono = sc.nextLine();
        }
    }while (!isValid);
    return telefono;
}
    public int validarNumerodesemestre(Scanner sc) {
    int semestre;

    while (true) {

        
        while (!sc.hasNextInt()) {
            System.out.println("Entrada no válida. Ingrese un número entero (1-15):");
            sc.next(); 
        }

        
        semestre = sc.nextInt();
        sc.nextLine(); 

        if (semestre >= 1 && semestre <= 15) {
            return semestre;
        }

        System.out.println("Número de semestre inválido. Debe estar entre 1 y 15. Intenta de nuevo:");
    }
}

    public float validarPromedio(Scanner sc) {
    float promedio;

    while (true) {

        
        while (!sc.hasNextFloat()) {
            System.out.println("Entrada no válida. Ingrese un número (0-5):");
            sc.next(); 
        }

        
        promedio = sc.nextFloat();
        sc.nextLine(); 

        if (promedio >= 0 && promedio <= 5) {
            return promedio;
        }

        System.out.println("Promedio inválido. Debe estar entre 0 y 5. Intenta de nuevo:");
    }
}
public String validarSerialdeEquipo(Scanner sc) {
    String serial;
    String patron = "^(?=.{15,20}$)[A-Za-z0-9]+(?:-[A-Za-z0-9]+)*$";

    while (true) {
        serial = sc.nextLine().trim();

        if (serial.matches(patron)) {
            return serial;
        }

        System.out.println("Serial inválido. Debe tener letras/números y guiones, y medir entre 15 y 20 caracteres. Ej: ABC12-DEF34-GHI56");
        System.out.print("Intenta de nuevo: ");
    }
}



    
    public boolean validarModalidad(Scanner sc) {
    while (true) {
        System.out.print("Ingrese modalidad (1=Presencial, 2=Virtual): ");
        String txt = sc.nextLine().trim();

        if (txt.equals("1")) return true;   // Presencial
        if (txt.equals("2")) return false;  // Virtual

        System.out.println("Entrada inválida. Escriba 1 (Presencial) o 2 (Virtual).");
    }
}
    
    public int validarCantidaddeasignatura(Scanner sc) {
        int cantidad;

    while (true) {

        
        while (!sc.hasNextInt()) {
            System.out.println("Entrada no válida. Ingrese un número entero (1-10):");
            sc.next(); 
        }

        
        cantidad = sc.nextInt();
        sc.nextLine(); 

        if (cantidad >= 1 && cantidad <= 10) {
            return cantidad;
        }

        System.out.println("Cantidad de asignaturas inválida. Debe estar entre 1 y 10. Intenta de nuevo:");
    }
}
    
}
