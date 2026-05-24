import java.util.Scanner;
import java.util.LinkedList;
public class Metodo {
Scanner sc = new Scanner(System.in);
    public LinkedList<EstudianteIngenieria> LlenarEstudianteIg(LinkedList<EstudianteIngenieria> l){
        boolean pedir= true;
        while(pedir){
        EstudianteIngenieria o = new EstudianteIngenieria();
        System.out.println("ingrese la cedula  del estudiante: ");
        o.setCedula(sc.nextInt());
        System.out.println("ingrese el nombre del estudiante: ");
        o.setNombre(sc.next());
        System.out.println("ingrese el apellido del estudiante: ");
        o.setApellido(sc.next());
        System.out.println("ingrese el telefono del estudiante: ");
        o.setTelefono(sc.nextInt());
        System.out.println("ingrese el numero de semestre del estudiante: ");
        o.setNumero_semestre(sc.nextInt());
        System.out.println("el promedio del estudiante es: ");
        o.setPromedio(sc.nextFloat());
        System.out.println("el serial del equipo es: ");
        o.setSerial_Equipo(sc.next());
        l.add(o);
        System.out.println("¿ingrsar otro estudiante?, 1.Si, 2.No");
        int opt = sc.nextInt();
            if (opt == 2) {
                pedir = false;
                break;
                }
}
    return l;
}
public LinkedList<EstudianteDiseño> LlenarEstudianteDi(LinkedList<EstudianteDiseño> l){
        boolean pedir= true;
        while(pedir){
        EstudianteDiseño e = new EstudianteDiseño();
        System.out.println("ingrese el nombre del estudiante: ");
        e.setCedula(sc.nextInt());
        System.out.println("ingrese el nombre del estudiante: ");
        e.setNombre(sc.next());
        System.out.println("ingrese el apellido del estudiante: ");
        e.setApellido(sc.next());
        System.out.println("ingrese el telefono del estudiante: ");
        e.setTelefono(sc.nextInt());
        System.out.println("La modalidad es virtual o presencial? 1.Presencial, 2.Virtual ");
        e.setModalidad(sc.nextBoolean());
        int opc = sc.nextInt();
        if (opc == 1)
            System.out.println("La modalidad es presencial");
            else if (opc == 2)
            System.out.println("la modalidad es virtual");

        
        
        System.out.println("La cantidad de asignaturas que ve el estudiante son:  ");
        e.setCantidad_asignaturas(sc.nextInt());
        System.out.println("el serial del equipo es: ");
        e.setSerial_equipo(sc.next());
        l.add(e);
        System.out.println("¿ingrsar otro estudiante?, 1.Si, 2.No");
        int opt = sc.nextInt();
            if (opt == 2) {
                pedir = false;
                break;
                }
}
    return l;
}
public LinkedList<TabletaGrafica> LlenarTableta(LinkedList<TabletaGrafica> l){
    boolean pedir = true;
    while (pedir){
        TabletaGrafica t = new TabletaGrafica();
        System.out.println("el serial de la tableta es: ");
        t.setSerial(sc.next());
        System.out.println("La marca de la tableta es: ");
        t.setMarca(sc.next());
        System.out.println("el tamaño de la tableta es: ");
        t.setTamaño(sc.nextFloat());
        System.out.println("El precio de la tableta es: ");
        t.setPrecio(sc.nextFloat());
        System.out.println("El almacenamiento de la tableta es: 1.256GB, 2.512GB, 3.1TB");
        int opc = sc.nextInt();
        if (opc == 1)            System.out.println("el almacenamiento de la tableta es de 256GB");
            else if (opc == 2)
            System.out.println("el almacenamiento de la tableta es de 512GB");
            else if (opc == 3)
            System.out.println("el almacenamiento de la tableta es de 1TB");
        System.out.println("El peso de la tableta es: ");
        t.setPeso(sc.nextFloat());
        System.out.println("¿desea registrar otra tableta? 1.Si, 2.No");
        int opt = sc.nextInt();
        if(opt==2){
            pedir = false;
            break;
        }
    }
    return l;
}
public LinkedList<ComputadoraPortatil> LlenarCompu(LinkedList<ComputadoraPortatil> l){
    boolean pedir = true;
    while (pedir){
        ComputadoraPortatil u= new ComputadoraPortatil();
        System.out.println("el serial del computador es: ");
        u.setSerial(sc.next());
        System.out.println("La marca del computador es: ");
        u.setMarca(sc.next());
        System.out.println("el tamaño del compuatdor es: ");
        u.setTamaño(sc.nextFloat());
        System.out.println("El precio del computador es: ");
        u.setPrecio(sc.nextFloat());
        System.out.println("El sistema operativo del computador es: 1.Windows 7, 2.Windows 10, 3.Windows 11");
        int opc = sc.nextInt();
        if (opc == 1)            
            System.out.println("El sistema operativo del computador es Windows 7");
            else if (opc == 2)
            System.out.println("El sistema operativo del computador es Windows 10");
            else if (opc == 3)
            System.out.println("El sistema operativo del computador es Windows 11");
        System.out.println("El procesador del computador es: 1.Intel Core i5, 2.AMD Ryzen");
        int opc2 = sc.nextInt();
        if (opc2 == 1)
            System.out.println("El procesador del computador es Intel Core i5");
        else if (opc2 == 2)
            System.out.println("El procesador del computador es AMD Ryzen");
        System.out.println("¿desea registrar otro computador? 1.Si, 2.No");
        int opt = sc.nextInt();
        if(opt==2){
            pedir = false;
            break;
        }
    }
    return l;
}
public void MostrarEstudianteIng(LinkedList<EstudianteIngenieria> l){
    for ( EstudianteIngenieria o : l ) {
        System.out.println("Nombre"+ o.getNombre());
        System.out.println("Apellido"+o.getApellido());
        System.out.println("Cedula"+o.getCedula());
        System.out.println("telefono"+o.getTelefono());
        System.out.println("numero de semestre"+o.getNumero_semestre());
        System.out.println("promedio"+o.getPromedio());
        System.out.println("serial del equipo"+o.getSerial_Equipo());
    }
}
public void MostrarEstudianteDis(LinkedList<EstudianteDiseño> l){
    for (EstudianteDiseño o : l) {
        System.out.println("Nombre"+o.getNombre());
        System.out.println("Apellido"+o.getApellido());
        System.out.println("Cedula"+o.getCedula());
        System.out.println("Telefono"+o.getTelefono());
        System.out.println("Cantidad de asignaturas"+o.getCantidad_asignaturas());
        System.out.println("Serial del equipo"+o.getSerial_equipo());
        }
}
public void MostrarTableta(LinkedList<TabletaGrafica> l){
    for ( TabletaGrafica o : l) {
        System.out.println("Serial"+o.getSerial());
        System.out.println("Marca"+o.getMarca());
        System.out.println("Precio"+o.getPrecio());
        System.out.println("Tamaño"+o.getTamaño());
        System.out.println("Almacenamiento"+o.isAlmacenamiento());
        System.out.println("Peso"+o.getPeso());
        
        
    }
}
public void MostrarComputador(LinkedList<ComputadoraPortatil> l){
    for ( ComputadoraPortatil o : l) {
        System.out.println("Serial"+o.getSerial());
        System.out.println("Marca"+o.getMarca());
        System.out.println("Precio"+o.getPrecio());
        System.out.println("Tamaño"+o.getTamaño());
        System.out.println("Sistema operativo"+o.isSistema_operativo());
        System.out.println("Procesador"+o.isProcesador());
        
        
    }
}


public LinkedList<EstudianteIngenieria> modificEstudianteIngenierias(int Cedula, LinkedList<EstudianteIngenieria> l){
    for (EstudianteIngenieria o : l) {
        if(o.getCedula()==Cedula){
            System.out.println("ingrese el nombre");
            o.setNombre(sc.next());
            System.out.println("Ingrese el apellido");
            o.setApellido(sc.next());
            System.out.println("ingrese el telefono");
            o.setTelefono(sc.nextInt());
            System.out.println("ingrese el numero de semestre");
            o.setNumero_semestre(sc.nextInt());
            System.out.println("ingrese el promedio");
            o.setPromedio(sc.nextFloat());
            System.out.println("ingrese el serial del equipo");
            o.setSerial_Equipo(sc.next());

        }else{
            System.out.println("Estudiante no encontrado");

        }
        
    }
return l;
}
public LinkedList<EstudianteDiseño> modificEstudianteDiseño(int Cedula, LinkedList<EstudianteDiseño> l){
    for (EstudianteDiseño o : l) {
        if(o.getCedula()==Cedula){
            System.out.println("ingrese el nombre");
            o.setNombre(sc.next());
            System.out.println("Ingrese el apellido");
            o.setApellido(sc.next());
            System.out.println("ingrese el telefono");
            o.setTelefono(sc.nextInt());
            System.out.println("La modalidad es virtual o presencial? 1.Presencial, 2.Virtual ");
            o.setModalidad(sc.nextBoolean());
            int opc = sc.nextInt();
        if (opc == 1)
            System.out.println("La modalidad es presencial");
            else if (opc == 2)
            System.out.println("la modalidad es virtual");
            System.out.println("ingrese la cantidad de asignaturas");
            o.setCantidad_asignaturas(sc.nextInt());
            System.out.println("ingrese el serial del equipo");
            o.setSerial_equipo(sc.next());

        }else{
            System.out.println("Estudiante no encontrado");

        }
        
    }
    return l;
 
}
public LinkedList<TabletaGrafica> modificTableta(String Serial, LinkedList<TabletaGrafica> l){
    for (TabletaGrafica o : l) {
        if(o.getSerial().equals(Serial)){
            System.out.println("ingrese la marca");
            o.setMarca(sc.next());
            System.out.println("ingrese el tamaño");
            o.setTamaño(sc.nextFloat());
            System.out.println("ingrese el precio");
            o.setPrecio(sc.nextFloat());
            System.out.println("cual es el almacenamiento de la tableta? 1.256GB, 2.512GB, 3.1TB");
            int opc = sc.nextInt();
            if (opc == 1) {
                o.setAlmacenamiento(true);
            } else if (opc == 2) {
                o.setAlmacenamiento(true);
            } else if (opc == 3) {
                o.setAlmacenamiento(true);
            }
            System.out.println("ingrese el peso de la tableta: ");
            o.setPeso(sc.nextFloat());

        }else{
            System.out.println("Tableta no encontrada");

        }
        
    }
    return l;
}
public LinkedList<ComputadoraPortatil> modificComputador(String Serial, LinkedList<ComputadoraPortatil> l){
    for (ComputadoraPortatil o : l) {
        if(o.getSerial().equals(Serial)){
            System.out.println("ingrese la marca");
            o.setMarca(sc.next());
            System.out.println("ingrese el tamaño");
            o.setTamaño(sc.nextFloat());
            System.out.println("ingrese el precio");
            o.setPrecio(sc.nextFloat());
            System.out.println("El sistema operativo del computador es: 1.Windows 7, 2.Windows 10, 3.Windows 11");
            int opc = sc.nextInt();
            if (opc == 1) {
                o.setSistema_operativo(true);
            } else if (opc == 2) {
                o.setSistema_operativo(true);
            } else if (opc == 3) {
                o.setSistema_operativo(true);
            }
            System.out.println("El procesador del computador es: 1.Intel Core i5, 2.AMD Ryzen");
            int opc2 = sc.nextInt();
            if (opc2 == 1) {
                o.setProcesador(true);
            } else if (opc2 == 2) {
                o.setProcesador(true);
            }

        }else{
            System.out.println("Computador no encontrado");

        }
        
    }
    return l;
}
public LinkedList<EstudianteIngenieria> eliminarEstudianteIngenieria(int Cedula, LinkedList<EstudianteIngenieria> l){
    for (EstudianteIngenieria o : l) {
        if(o.getCedula()==Cedula){
            l.remove(o);
            System.out.println("Estudiante eliminado");
            break;
        }else{
            System.out.println("Estudiante no encontrado");
        }
        
    }
    return l;
}
public LinkedList<EstudianteDiseño> eliminarEstudianteDiseño(int Cedula, LinkedList<EstudianteDiseño> l){
    for (EstudianteDiseño o : l) {
        if(o.getCedula()==Cedula){
            l.remove(o);
            System.out.println("Estudiante eliminado");
            break;
        }else{
            System.out.println("Estudiante no encontrado");
        }
        
    }
    return l;
}
public LinkedList<TabletaGrafica> eliminarTableta(String Serial, LinkedList<TabletaGrafica> l){
    for (TabletaGrafica o : l) {
        if(o.getSerial().equals(Serial)){
            l.remove(o);
            System.out.println("Tableta eliminada");
            break;
        }else{
            System.out.println("Tableta no encontrada");
        }
        
    }
    return l;
}
public LinkedList<ComputadoraPortatil> eliminarComputador(String Serial, LinkedList<ComputadoraPortatil> l){
    for (ComputadoraPortatil o : l) {
        if(o.getSerial().equals(Serial)){
            l.remove(o);
            System.out.println("Computador eliminado");
            break;
        }else{
            System.out.println("Computador no encontrado");
        }
        
    }
    return l;
}
public LinkedList<EstudianteIngenieria> RegistrarPrestramoEI(int Cedula, LinkedList<EstudianteIngenieria> l){
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
                System.out.println("ingrese el serial del computador a prestar");
                o.setSerial_Equipo(sc.next());
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
public LinkedList<EstudianteDiseño> RegistrarPrestramoED(int Cedula, LinkedList<EstudianteDiseño> D){
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
                o.setSerial_equipo(sc.next());
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
public LinkedList<EstudianteIngenieria> ModificarPrestamoEI(int Cedula, LinkedList<EstudianteIngenieria> l){
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
public LinkedList<EstudianteDiseño> ModificarPrestamoED(int Cedula, LinkedList<EstudianteDiseño> D){
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
public LinkedList<EstudianteIngenieria> DevolverEquipoEI(int Cedula, LinkedList<EstudianteIngenieria> l){
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
public LinkedList<EstudianteDiseño> DevolverEquipoED(int Cedula, LinkedList<EstudianteDiseño> D){
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