import java.util.Scanner;

public class validacionesR {
    Scanner sc = new Scanner(System.in);

    public boolean validarSolicitudPrestamo(Scanner sc) {
        while (true) {
            System.out.println("¿Desea solicitar un préstamo? (Sí/No)");
            String respuesta = sc.nextLine().trim();

            if (respuesta.equalsIgnoreCase("Sí") || respuesta.equalsIgnoreCase("Si")) {
                return true;
            }
            if (respuesta.equalsIgnoreCase("No")) {
                return false;
            }

            System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No'.");
        }
    }

    public int validarTipoEstudiante(Scanner sc) {
        while (true) {
            System.out.println("Seleccione el tipo de estudiante: 1. Ingeniería, 2. Diseño");

            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese 1 o 2.");
                sc.nextLine();
                continue;
            }

            int opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 1 || opcion == 2) {
                return opcion;
            }

            System.out.println("Opción inválida. Ingrese 1 o 2.");
        }
    }

    public int validarTipoEquipo(Scanner sc) {
        while (true) {
            System.out.println("Seleccione el tipo de equipo a prestar: 1. Computadora, 2. Tableta");

            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese 1 o 2.");
                sc.nextLine();
                continue;
            }

            int opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 1 || opcion == 2) {
                return opcion;
            }

            System.out.println("Opción inválida. Ingrese 1 o 2.");
        }
    }

    public String validarCedulaPrestamo(Scanner sc) {
        while (true) {
            System.out.println("Ingrese la cédula del estudiante (8-11 dígitos):");
            String cedula = sc.nextLine().trim();

            if (cedula.length() >= 8 && cedula.length() <= 11) {
                boolean soloDigitos = true;
                for (int i = 0; i < cedula.length(); i++) {
                    if (!Character.isDigit(cedula.charAt(i))) {
                        soloDigitos = false;
                        break;
                    }
                }
                if (soloDigitos) {
                    return cedula;
                }
            }

            System.out.println("Cédula no válida. Debe tener entre 8 y 11 dígitos numéricos.");
        }
    }

    public String validarSerialEquipo(Scanner sc) {
        String patron = "^(?=.{15,20}$)[A-Za-z0-9]+(?:-[A-Za-z0-9]+)*$";
        while (true) {
            System.out.println("Ingrese el serial del equipo a prestar:");
            String serial = sc.nextLine().trim();

            if (serial.matches(patron)) {
                return serial;
            }

            System.out.println("Serial inválido. Debe tener letras/números y guiones, y medir entre 15 y 20 caracteres. Ej: ABC12-DEF34-GHI56");
        }
    }
}

