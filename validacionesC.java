import java.util.Scanner;
public class validacionesC {
    Scanner sc = new Scanner(System.in);

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

    public float validarPrecio(Scanner sc) {
    float precio;

    while (true) {

        
        while (!sc.hasNextFloat()) {
            System.out.println("Entrada no válida. Ingrese un número positivo:");
            sc.next(); 
        }

        
        precio = sc.nextFloat();
        sc.nextLine(); 

        if (precio > 1000000.00 && precio < 20000000.00) {
            return precio;
        }

        System.out.println("Precio inválido. El precio debe estar entre 1,000,000.00 y 20,000,000.00. Intenta de nuevo:");
    }

}
public String ValidarMarca(String marca) {
       boolean isValid = false;

        while (!isValid) {
        isValid = true;

        if (marca.isEmpty() || marca.length() > 20) {
            isValid = false;
        } else {
            for (int i = 0; i < marca.length(); i++) {
                if (!Character.isLetter(marca.charAt(i)) && !Character.isWhitespace(marca.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }

        if (!isValid) {
            System.out.println("Marca inválida. Solo letras y espacios permitidos, con un máximo de 20 caracteres.");
            marca = sc.nextLine();
        }
    }
    return marca;
}
public float validarTamaño(Scanner sc) {
    float tamaño;

    while (true) {

        
        while (!sc.hasNextFloat()) {
            System.out.println("Entrada no válida. Ingrese un número (0-20):");
            sc.next(); 
        }

        
        tamaño = sc.nextFloat();
        sc.nextLine(); 

        if (tamaño >= 0 && tamaño <= 20) {
            return tamaño;
        }

        System.out.println("Tamaño inválido. Debe estar entre 0 y 20. Intenta de nuevo:");
    }
}


public boolean validarSistemaOperativo(Scanner sc) {

    while (true) {
        System.out.println("Ingrese el sistema operativo de la computadora portátil:");
        System.out.println("1. Windows 7, 2. Windows 10, 3. Windows 11");

        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Solo se permiten los números 1, 2, 3");
            System.out.print("Intente de nuevo: ");
            sc.next();
        }

        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion >= 1 && opcion <= 3) {
            return true; 
        }

        System.out.println("Opción no válida. Solo se permiten los números 1, 2, 3");
    }
}


 
public boolean validarProcesador(Scanner sc) {
    while (true) {
        System.out.println("¿Qué procesador tiene el computador");
        System.out.println("1. Intel core i5, 2. AMD Ryzen ");
        

        // Evita que se caiga si escriben letras
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Solo se permiten los números 1, 2");
            System.out.print("Intente de nuevo: ");
            sc.next(); 
        }

        int opcion = sc.nextInt();
        sc.nextLine(); 

        if (opcion >= 1 && opcion <= 2) {
             return opcion == 1; // true para Intel, false para AMD
            
        }

        System.out.println("Opción no válida. Solo se permiten los números 1, 2");
    }
}
}