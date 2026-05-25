import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
public class metodoprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        validacionesI vI = new validacionesI();
        validacionesD vD = new validacionesD();
        ArrayList<EstudianteIngenieria> EI = new ArrayList<>();
        LinkedList<EstudianteDiseño> ED = new LinkedList<>();
        LinkedList<TabletaGrafica> t = new LinkedList<>();
        LinkedList<ComputadoraPortatil> c = new LinkedList<>();
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar estudiante de ingeniería");
            System.out.println("2. Agregar computadora portátil");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    EstudianteIngenieria EIE = new EstudianteIngenieria();
                    System.out.println("Ingrese la cédula del estudiante:");
                    EIE.setCedula(vI.validarCedula(sc.next()));
                    System.out.println("Ingrese el nombre del estudiante:");
                    EIE.setNombre(vI.validarNombre(sc.next()));
                    System.out.println("Ingrese el apellido del estudiante:");
                    EIE.setApellido(vI.validarApellido(sc.next()));
                    System.out.println("Ingrese el teléfono del estudiante:");
                    EIE.setTelefono(vI.validarTelefono(sc.next()));
                    System.out.println("Ingrese el número de semestre del estudiante:");
                    EIE.setNumero_semestre(vI.validarNumerodesemestre(sc));
                    System.out.println("Ingrese el promedio del estudiante:");
                    EIE.setPromedio(sc.nextFloat());
                    EIE.setPromedio(vI.validarPromedio(sc));
                    System.out.println("Ingrese el serial del equipo del estudiante:");
                    EIE.setSerial_Equipo(vI.validarSerialdeEquipo(sc));
                    EI.add(EIE);
                    System.out.println("¿ingrsar otro estudiante?, 1.Si, 2.No");
                    int opt = sc.nextInt();
                    if (opt == 2) {
                    continuar = false;
                break;
                }
                    
                    break;
                case 2:
                    ComputadoraPortatil computadora = new ComputadoraPortatil();
                    System.out.println("Ingrese el serial de la computadora portátil:");
                    computadora.setSerial(sc.next());
                    System.out.println("Ingrese la marca de la computadora portátil:");
                    computadora.setMarca(sc.next());
                    System.out.println("Ingrese el tamaño de la computadora portátil:");
                    computadora.setTamaño(sc.nextFloat());
                    System.out.println("Ingrese el precio de la computadora portátil:");
                    computadora.setPrecio(sc.nextFloat());
                    c.add(computadora);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    

    }
}
     