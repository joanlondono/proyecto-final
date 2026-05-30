import java.util.Scanner;
import java.util.LinkedList;

public class validacionesT {  
    Scanner sc = new Scanner(System.in);

        public String validarSerialdeEquipo(String serial) {
        String patron = "^(?=.{15,20}$)[A-Za-z0-9]+(?:-[A-Za-z0-9]+)*$";
        System.out.println("ingrese el serial de la tableta grafica:");
        while (true) {
            if (serial == null || serial.isEmpty()) {
                serial = sc.nextLine().trim();
            }

        if (serial.matches(patron)) {
            return serial;
        }

        System.out.println("Serial inválido. Debe tener letras/números y guiones, y medir entre 15 y 20 caracteres. Ej: ABC12-DEF34-GHI56");
        System.out.print("Intenta de nuevo: ");
        serial = sc.nextLine().trim();
    }
}

    public String validarSerialdeEquipo(String serial, LinkedList<TabletaGrafica> lista) {
        while (true) {
            serial = validarSerialdeEquipo(serial);
            if (!serialRepetido(serial, lista)) {
                return serial;
            }
            System.out.println("Serial repetido. Ya existe una tableta con ese serial.");
            System.out.print("Ingrese un serial distinto: ");
            serial = "";
        }
    }

    private boolean serialRepetido(String serial, LinkedList<TabletaGrafica> lista) {
        if (lista == null) {
            return false;
        }
        for (TabletaGrafica tab : lista) {
            if (tab.getSerial().equalsIgnoreCase(serial)) {
                return true;
            }
        }
        return false;
    }

    public float validarPrecio(Scanner sc) {
        float precio;
        while (true) {
            System.out.println("ingrese el precio de la tableta grafica:");
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


public boolean validarAlmacenamiento(Scanner sc) {
    while (true) {
        System.out.println("cual es el almacenamiento de la tableta:");
        System.out.println("1. 256 GB, 2. 512 GB, 3. 1 TB");

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
public float validarPeso(Scanner sc) {
    float peso;
    while (true) {
        System.out.println("ingrese el peso de la tableta grafica:");
        while (!sc.hasNextFloat()) {
            System.out.println("Entrada no válida. Ingrese un número (0-10):");
                sc.next(); 
            }
            peso = sc.nextFloat();
        sc.nextLine(); 

        if (peso >= 0 && peso <= 10) {
            return peso;
        }

        System.out.println("Peso inválido. Debe estar entre 0 y 10. Intenta de nuevo:");
    }
}
}
