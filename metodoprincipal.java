import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
public class metodoprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        Metodo m = new Metodo();
        EstudianteIngenieria EI = new EstudianteIngenieria();
        EstudianteDiseño ED = new EstudianteDiseño();
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

      

     {
        
        LinkedList<EstudianteIngenieria> estudiantesIngenieria = new LinkedList<>();
        
        
        while (continuar==true) {
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Devolver de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                   m.RegistrarPrestramoEI(opcion, estudiantesIngenieria);
                    break;
                case 2:
                    m.ModificarPrestamoEI(opcion, estudiantesIngenieria);
                    break;
                case 3:
                    m.DevolverEquipoEI(opcion, estudiantesIngenieria);
                    break;
                case 4:
                    m.BuscarEquipoEI(null, estudiantesIngenieria);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println("por favor ingresar una opcion valida del 1 al 5");
                    break;
            }
        }
    }
    LinkedList<EstudianteDiseño> estudiantesDiseno = new LinkedList<>();
       
       
        while (continuar==true) {
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Devolver de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                m.RegistrarPrestramoED(opcion, estudiantesDiseno);
                    break;
                case 2:
                    m.ModificarPrestamoED(opcion, estudiantesDiseno);
                    break;
                case 3:
                    m.DevolverEquipoED(opcion, estudiantesDiseno);
                    break;
                case 4:
                    m.BuscarEquipoED(null, estudiantesDiseno);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println("por favor ingresar una opcion valida del 1 al 5");
                    break;
            }
        }
        
    }
}


  


