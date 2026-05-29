import java.util.LinkedList;
import java.util.Scanner;

public class metodoprincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        validacionesI vI = new validacionesI();
        validacionesD vD = new validacionesD();
        validacionesC vC = new validacionesC();
        validacionesT vT = new validacionesT();

        LinkedList<EstudianteIngenieria> EI = new LinkedList<>();
        LinkedList<EstudianteDiseño> ED = new LinkedList<>();
        LinkedList<TabletaGrafica> t = new LinkedList<>();
        LinkedList<ComputadoraPortatil> c = new LinkedList<>();
        

        Metodo m = new Metodo();

        boolean menuPrincipal = true;

        while (menuPrincipal) {
            System.out.println(" MENÚ PRINCIPAL");
            System.out.println("1. Estudiante de ingeniería");
            System.out.println("2. Estudiante de diseño");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    menuIngenieria(sc, EI, t, c, m, vI, vC, vT);
                    break;

                case 2:
                    menuDiseno(sc, ED, t, c, m, vD, vC, vT);
                    break;

                case 3:
                    System.out.println("Mostrando inventario...");
                    m.MostrarTableta(t);
                    m.MostrarComputador(c);
                    break;

                case 4:
                    menuPrincipal = false;
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    
    static void menuIngenieria(Scanner sc,
                              LinkedList<EstudianteIngenieria> EI,
                              LinkedList<TabletaGrafica> t,
                              LinkedList<ComputadoraPortatil> c,
                              Metodo m,
                              validacionesI vI,
                              validacionesC vC,
                              validacionesT vT) {

        boolean menuIng = true;

        while (menuIng) {
            System.out.println("bienvenido estudiante de ingenieria");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Ir a préstamos");
            System.out.println("6. exportar estudiantes a archivo");
            System.out.println("7. importar estudiantes desde archivo");
            System.out.println("8. Volver al menú principal");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    EI = m.LlenarEstudianteIg(EI, vI);
                    break;

                case 2:
                    m.MostrarEstudianteIng(EI);
                    break;

                case 3:
                    
                    EI=m.modificEstudianteIngenierias(vI.validarCedula(sc.next()), EI, vI);
                    break;

                case 4:
                    
                    EI=m.eliminarEstudianteIngenieria(vI.validarCedula(sc.next()), EI);
                    break;

                case 5:
                    menuPrestamosEI(sc, t, c, m, vC, vT,EI);
                    break;

                case 6:
                    Exportar e = new Exportar();
                    e.exportarArchivoEI(EI);
                    break;

                case 7:
                    importar i = new importar();
                    EI = i.ImportarArchivoEI(); 
                    break;

                case 8:
                    menuIng = false; 
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    
    static void menuDiseno(Scanner sc,
                           LinkedList<EstudianteDiseño> ED,
                           LinkedList<TabletaGrafica> t,
                           LinkedList<ComputadoraPortatil> c,
                           Metodo m,
                           validacionesD vD,
                           validacionesC vC,
                           validacionesT vT) {

        boolean menuDis = true;

        while (menuDis) {
            System.out.println(" bienvenido estudiante de diseño");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Ir a préstamos");
            System.out.println("6. exportar estudiantes a archivo");
            System.out.println("7. importar estudiantes desde archivo");
            System.out.println("8. Volver al menú principal");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    ED = m.LlenarEstudianteDi(ED, vD);
                    break;

                case 2:
                    m.MostrarEstudianteDis(ED);
                    break;

                case 3:
                    
                    ED=m.modificEstudianteDiseño(vD.validarCedula(sc.next()), ED, vD);
                    break;

                case 4:
                    
                    ED = m.eliminarEstudianteDiseño(vD.validarCedula(sc.next()), ED);
                    break;

                case 5:
                    menuPrestamosED(sc, t, c, m, vC, vT);
                    break;

                case 6:
                    Exportar e = new Exportar();
                    e.exportarArchivoED(ED);
                    break;

                case 7:
                    
                    break;

                case 8:
                    menuDis = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // ===== Submenú Préstamos =====
    static void menuPrestamosEI(Scanner sc,
                              LinkedList<TabletaGrafica> t,
                              LinkedList<ComputadoraPortatil> c,
                              Metodo m,
                              validacionesC vC,
                              validacionesT vT,
                            LinkedList<EstudianteIngenieria> EI) {

        boolean menuPrestamosEI = true;

        while (menuPrestamosEI) {
            System.out.println("\n Bienvenido estudiante de ingeniería, aquí puedes gestionar tus préstamos");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Mostrar préstamos");
            System.out.println("4. Eliminar préstamo");
            System.out.println("5. Volver atrás");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                   
                    
                System.out.println("Ingrese la cédula del estudiante:");
                String cedula = sc.next();
                EI = m.RegistrarPrestramoEI(cedula, EI);

                    break;

                case 2:
                    // m.modificarPrestamo(...);
                    System.out.println("Modificar préstamo (conecta tu método aquí).");
                    break;

                case 3:
                    // m.mostrarPrestamos(...);
                    System.out.println("Mostrar préstamos (conecta tu método aquí).");
                    break;

                case 4:
                    // m.eliminarPrestamo(...);
                    System.out.println("Eliminar préstamo (conecta tu método aquí).");
                    break;

                case 5:
                    menuPrestamosEI = false; // vuelve al submenú anterior
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    static void menuPrestamosED(Scanner sc,
                              LinkedList<TabletaGrafica> t,
                              LinkedList<ComputadoraPortatil> c,
                              Metodo m,
                              validacionesC vC,
                              validacionesT vT) {

        boolean menuPrestamosED = true;

        while (menuPrestamosED) {
            System.out.println("\n Bienvenido estudiante de diseño, aquí puedes gestionar tus préstamos");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Mostrar préstamos");
            System.out.println("4. Eliminar préstamo");
            System.out.println("5. Volver atrás");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Registrar préstamo (conecta tu método aquí).");

                    break;

                case 2:
                    // m.modificarPrestamo(...);
                    System.out.println("Modificar préstamo (conecta tu método aquí).");
                    break;

                case 3:
                    // m.mostrarPrestamos(...);
                    System.out.println("Mostrar préstamos (conecta tu método aquí).");
                    break;

                case 4:
                    // m.eliminarPrestamo(...);
                    System.out.println("Eliminar préstamo (conecta tu método aquí).");
                    break;

                case 5:
                    menuPrestamosED = false; // vuelve al submenú anterior
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

   
}
