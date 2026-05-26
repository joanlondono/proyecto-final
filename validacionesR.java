import java.util.Scanner;
public class validacionesR {
    Scanner sc = new Scanner(System.in);
    public String validarPrestamo(Scanner sc) {
        boolean isValid = false;

        while (!isValid) {
            isValid = true;

            System.out.println("¿Desea solicitar un préstamo? (Sí/No)");
            String respuesta = sc.nextLine().trim();

            if (!respuesta.equalsIgnoreCase("Sí") && !respuesta.equalsIgnoreCase("No")) {
                isValid = false;
                System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No'.");
            }
        }
        return sc.nextLine();
    }
}
