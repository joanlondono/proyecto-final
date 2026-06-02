import java.util.LinkedList;
import java.util.Scanner;

public class metodoprincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        validacionesI vI = new validacionesI();
        validacionesD vD = new validacionesD();
        validacionesC vC = new validacionesC();
        validacionesT vT = new validacionesT();
        validacionesR vR = new validacionesR();

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
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    menuIngenieria(sc, EI, t, c, m, vI, vC, vT, vR, ED);
                    break;

                case 2:
                    menuDiseno(sc, ED, t, c, m, vD, vC, vT, vR, EI);
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
                              validacionesT vT
                              ,validacionesR vR,
                              LinkedList<EstudianteDiseño> ED) {

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
                    menuPrestamosEI(sc, t, c, m, vI, vC, vT,EI, ED, vR);
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
                           validacionesT vT
                           ,validacionesR vR,
                           LinkedList<EstudianteIngenieria> EI) {

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
                    menuPrestamosED(sc, t, c, m, vC, vT,vD, ED, vR, EI);
                    break;

                case 6:
                    Exportar e = new Exportar();
                    e.exportarArchivoED(ED);
                    break;

                case 7:
                    importar i = new importar();
                    ED = i.importarArchivoED();
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
                              validacionesI vI,
                              validacionesC vC,
                              validacionesT vT,
                            LinkedList<EstudianteIngenieria> EI
                            ,LinkedList<EstudianteDiseño> ED,
                            validacionesR vR) {

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
                menuPrestamos(sc, t, c, m, vC, vT, EI, ED, vR);
                    break;
                case 2:
                    m.ModificarPrestamoEI(vI.validarCedula(sc.next()), EI);
                    break;
                case 3:
                    m.MostrarPrestamosEI(EI);
                    break;
                case 4:
                    m.EliminarPrestamoEI(null, EI);
                    break;

                case 5:
                    menuPrestamosEI = false; 
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
                              validacionesT vT,
                              validacionesD vD,
                              LinkedList<EstudianteDiseño> ED,
                              validacionesR vR,
                              LinkedList<EstudianteIngenieria> EI) {

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
                    menuPrestamos(sc, t, c, m, vC, vT, EI, ED, vR);
                    break;
                case 2:
                    m.ModificarPrestamoED(vD.validarCedula(sc.next()), ED);
                    break;
                case 3:
                    m.MostrarPrestamosED(ED);
                    break;
                case 4:
                    m.EliminarPrestamoED(null, ED);
                    break;

                case 5:
                    menuPrestamosED = false; 
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    static void menuPrestamos(Scanner sc,
                              LinkedList<TabletaGrafica> t,
                              LinkedList<ComputadoraPortatil> c,
                              Metodo m,
                              validacionesC vC,
                              validacionesT vT,
                              LinkedList<EstudianteIngenieria> EI,
                              LinkedList<EstudianteDiseño> ED,
                              validacionesR vR) {

        boolean menuPrestamos = true;
while (menuPrestamos){
    System.out.println("bienvenido a tu registro de prestamos");
    System.out.println("¿que equipo quiere registrar para prestar?");
    System.out.println("1. Computadora portatil");
    System.out.println("2. Tableta grafica");
    System.out.println("3. Volver atrás");
    int opcion = sc.nextInt();
    sc.nextLine();
    switch (opcion) {
        case 1:
            menuComputadora(sc, c, m, vC, vT, EI, ED, vR, t);
                break;
        case 2:
            menuTableta(sc, t, m, vT, vR, EI, ED, c, vC);
                break;

        case 3:
            menuPrestamos = false; 
            break;

        default:
            System.out.println("Opción no válida.");
    }

}
    }
    static void menuComputadora(Scanner sc,
                              LinkedList<ComputadoraPortatil> c,
                              Metodo m,
                              validacionesC vC,
                              validacionesT vT,
                              LinkedList<EstudianteIngenieria> EI,
                              LinkedList<EstudianteDiseño> ED,
                              validacionesR vR,
                              LinkedList<TabletaGrafica> t) {
    boolean menuComputadora = true;
    while (menuComputadora) {
        System.out.println("bienvenido a tu registro de computadora portatil");
        System.out.println("1. Registrar computadora portatil");
        System.out.println("2. Mostrar computadoras portatiles disponibles");
        System.out.println("3. Modificar computadora portatil");
        System.out.println("4. Eliminar computadora portatil");
        System.out.println("5. Exportar computadoras a archivo");
        System.out.println("6. Importar computadoras desde archivo");
        System.out.println("7. Hacer préstamo");
        System.out.println("8. Volver atrás");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                c=m.LlenarCompu(c, vC);
                break;

            case 2:
                m.MostrarComputador(c);
               
                break;
            case 3:
                c=m.modificComputador(vC.validarSerialdeEquipo(sc.next()), c, vC);
                break;
            case 4:
                c=m.eliminarComputador(vC.validarSerialdeEquipo(sc.next()), c);
                break;
            case 5:
                Exportar e = new Exportar();
                e.exportarArchivoC(c);
                break;
            case 6:
                importar i = new importar();
                c = i.importarArchivoC();
                break;
            case 7:
                m.registrarPrestamo(sc, EI, ED, c, t, vR, vC, vT);
                break;
            case 8:
                menuComputadora = false; 
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
   
}
static void menuTableta(Scanner sc,
                        LinkedList<TabletaGrafica> t,
                        Metodo m,
                        validacionesT vT,
                        validacionesR vR,
                        LinkedList<EstudianteIngenieria> EI
                        ,LinkedList<EstudianteDiseño> ED,
                        LinkedList<ComputadoraPortatil> c,
                        validacionesC vC) {
    boolean menuTableta = true;
    while (menuTableta) {
        System.out.println("bienvenido a tu registro de tableta grafica");
        System.out.println("1. Registrar tableta grafica");
        System.out.println("2. Mostrar tabletas graficas disponibles");
        System.out.println("3. Modificar tableta grafica");
        System.out.println("4. Eliminar tableta grafica");
        System.out.println("5. Exportar tabletas a archivo");
        System.out.println("6. Importar tabletas desde archivo");
        System.out.println("7. Hacer préstamo");
        System.out.println("8. Volver atrás");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                t=m.LlenarTableta(t, vT);
                break;
                case 2:
                m.MostrarTableta(t);
                break;
            case 3:
                t=m.modificTableta(vT.validarSerialdeEquipo(sc.next()), t, vT);
                break;
            case 4:
                t=m.eliminarTableta(vT.validarSerialdeEquipo(sc.next()), t);
                break;
            case 5:
                Exportar e = new Exportar();
                e.exportarArchivoT(t);
                break;
            case 6:
                importar i = new importar();
                t = i.importarArchivoT();
                break;
            case 7:
                m.registrarPrestamo(sc, EI, ED, c, t, vR, vC, vT);
                break;
            
            case 8:
                menuTableta = false; 
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
} 
}
                            