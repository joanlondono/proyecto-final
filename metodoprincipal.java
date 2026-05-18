import java.util.Scanner;
public class metodoprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        while (continuar==true) {
            System.out.println("1. Estudiante de ingenieria");
            System.out.println("2. Estudiante de Diseño");
            System.out.println("3. Mostrar inventario total");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    // Lógica para mostrar inventario total
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println("por favor ingresar una opcion valida del 1 al 4");
                    break;
            }
        }
    }
}