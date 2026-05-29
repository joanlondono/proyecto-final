import java.util.LinkedList;
import java.util.Scanner;

public class metodoPrestamo {
    Metodo m = new Metodo();
    
    Scanner sc = new Scanner(System.in);
    public LinkedList<EstudianteIngenieria> RegistrarPrestramoEI(String Cedula, LinkedList<EstudianteIngenieria> l){
    for (EstudianteIngenieria o : l) {
        if(o.getCedula()==Cedula){
            boolean prestar = true;
             if (prestar) {
                 System.out.println("El estudiante ya tiene un equipo prestado");
                 return l;
             }
             System.out.println("Que equipo desea prestar? 1.Computadora, 2.Tableta");
            int opt = sc.nextInt();
            if (opt == 1) {
                System.out.println("Ingrese los datos del computador a prestar");
                
                System.out.println("Prestamo registrado");
            } else if (opt == 2) {
                System.out.println("ingrese el serial de la tableta a prestar");
                o.setSerial_Equipo(sc.next());
                System.out.println("Prestamo registrado");
            }

            break;
        }else{
            System.out.println("Estudiante no encontrado");
        }
        
    }
    return l;

}
public LinkedList<EstudianteDiseño> RegistrarPrestramoED(String Cedula, LinkedList<EstudianteDiseño> D){
    for (EstudianteDiseño o : D) {
        if(o.getCedula()==Cedula){
            boolean prestar = true;
             if (prestar) {
                 System.out.println("El estudiante ya tiene un equipo prestado");
                 return D;
             }
             System.out.println("Que equipo desea prestar? 1.Computadora, 2.Tableta");
            int opt = sc.nextInt();
            if (opt == 1) {
                System.out.println("ingrese el serial del computador a prestar");
                
                System.out.println("Prestamo registrado");
            } else if (opt == 2) {
                System.out.println("ingrese el serial de la tableta a prestar");
                o.setSerial_equipo(sc.next());
                System.out.println("Prestamo registrado");
            }

            break;
        }else{
            System.out.println("Estudiante no encontrado");
        }
        
    }
    return D;
}
public LinkedList<EstudianteIngenieria> ModificarPrestamoEI(String Cedula, LinkedList<EstudianteIngenieria> l){
    for (EstudianteIngenieria o : l) {
        if(o.getCedula()==Cedula){
            System.out.println("Que equipo desea modificar? 1.Computadora, 2.Tableta");
            int opt = sc.nextInt();
            if (opt == 1) {
                System.out.println("ingrese el serial del computador a modificar");
                o.setSerial_Equipo(sc.next());
                System.out.println("Prestamo modificado");
            } else if (opt == 2) {
                System.out.println("ingrese el serial de la tableta a modificar");
                o.setSerial_Equipo(sc.next());
                System.out.println("Prestamo modificado");
            }

            break;
        }else{
            System.out.println("Estudiante no encontrado");
        }
        
    }
    return l;
}
public LinkedList<EstudianteDiseño> ModificarPrestamoED(String Cedula, LinkedList<EstudianteDiseño> D){
    for (EstudianteDiseño o : D) {
        if(o.getCedula()==Cedula){
            System.out.println("Que equipo desea modificar? 1.Computadora, 2.Tableta");
            int opt = sc.nextInt();
            if (opt == 1) {
                System.out.println("ingrese el serial del computador a modificar");
                o.setSerial_equipo(sc.next());
                System.out.println("Prestamo modificado");
            } else if (opt == 2) {
                System.out.println("ingrese el serial de la tableta a modificar");
                o.setSerial_equipo(sc.next());
                System.out.println("Prestamo modificado");
            }

            break;
        }else{
            System.out.println("Estudiante no encontrado");
        }
        
    }
    return D;
}
public LinkedList<EstudianteIngenieria> DevolverEquipoEI(String Cedula, LinkedList<EstudianteIngenieria> l){
    for (EstudianteIngenieria o : l) {
        if(o.getCedula()==Cedula){
            o.setSerial_Equipo(null);
            System.out.println("Equipo devuelto");
            break;
        }else{
            System.out.println("Estudiante no encontrado");
        }
        
    }
    return l;
}
public LinkedList<EstudianteDiseño> DevolverEquipoED(String Cedula, LinkedList<EstudianteDiseño> D){
    for (EstudianteDiseño o : D) {
        if(o.getCedula()==Cedula){
            o.setSerial_equipo(null);
            System.out.println("Equipo devuelto");
            break;
        }else{
            System.out.println("Estudiante no encontrado");
        }
        
    }
    return D;
}
public void BuscarEquipo(String Serial, LinkedList<ComputadoraPortatil> l1, LinkedList<TabletaGrafica> l2){
    boolean encontrado = false;
    for (ComputadoraPortatil o : l1) {
        if(o.getSerial().equals(Serial)){
            System.out.println("Equipo encontrado en computadoras portatiles");
            System.out.println("Serial"+o.getSerial());
            System.out.println("Marca"+o.getMarca());
            System.out.println("Precio"+o.getPrecio());
            System.out.println("Tamaño"+o.getTamaño());
            System.out.println("Sistema operativo"+o.isSistema_operativo());
            System.out.println("Procesador"+o.isProcesador());
            encontrado = true;
            break;
        }
        
    }
    if (!encontrado) {
        for (TabletaGrafica o : l2) {
            if(o.getSerial().equals(Serial)){
                System.out.println("Equipo encontrado en tabletas graficas");
                System.out.println("Serial"+o.getSerial());
                System.out.println("Marca"+o.getMarca());
                System.out.println("Precio"+o.getPrecio());
                System.out.println("Tamaño"+o.getTamaño());
                System.out.println("Almacenamiento"+o.isAlmacenamiento());
                System.out.println("Peso"+o.getPeso());
                encontrado = true;
                break;
            }
            
        }
    }
    if (!encontrado) {
        System.out.println("Equipo no encontrado");
    }
}
public void BuscarEquipoEI(String Serial, LinkedList<EstudianteIngenieria> l){
    boolean encontrado = false;
    for (EstudianteIngenieria o : l) {
        if(o.getSerial_Equipo().equals(Serial)){
            System.out.println("Equipo encontrado en estudiante de ingenieria");
            System.out.println("Nombre"+ o.getNombre());
            System.out.println("Apellido"+o.getApellido());
            System.out.println("Cedula"+o.getCedula());
            System.out.println("telefono"+o.getTelefono());
        
            System.out.println("serial del equipo"+o.getSerial_Equipo());

            encontrado = true;
            break;
        }
        
    }
    if (!encontrado) {
        System.out.println("Equipo no encontrado en estudiantes de ingenieria");
    }
}
public void BuscarEquipoED(String Serial, LinkedList<EstudianteDiseño> D){
    boolean encontrado = false;
    for (EstudianteDiseño o : D) {
        if(o.getSerial_equipo().equals(Serial)){
            System.out.println("Equipo encontrado en estudiante de diseño");
            System.out.println("Nombre"+o.getNombre());
            System.out.println("Apellido"+o.getApellido());
            System.out.println("Cedula"+o.getCedula());
            System.out.println("Telefono"+o.getTelefono());
            System.out.println("Cantidad de asignaturas"+o.getCantidad_asignaturas());
            System.out.println("Serial del equipo"+o.getSerial_equipo());
            encontrado = true;
            break;
        }
        
    }
    if (!encontrado) {
        System.out.println("Equipo no encontrado en estudiantes de diseño");
    }
}
}
    
