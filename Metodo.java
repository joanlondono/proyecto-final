import java.util.Scanner;
import java.util.LinkedList;
public class Metodo {
Scanner sc = new Scanner(System.in);
validacionesD vD = new validacionesD();
validacionesI vI = new validacionesI();
validacionesC vC = new validacionesC();
validacionesT vT = new validacionesT();

    public LinkedList<EstudianteIngenieria> LlenarEstudianteIg(LinkedList<EstudianteIngenieria> l, validacionesI vI){
        boolean pedir= true;
        while(pedir){
        EstudianteIngenieria o = new EstudianteIngenieria();
        System.out.println("ingrese la cedula  del estudiante: ");
        //o.setCedula(sc.next());
        o.setCedula(vI.validarCedula(sc.next()));
        System.out.println("ingrese el nombre del estudiante: ");
        //o.setNombre(sc.next());
        o.setNombre(vI.validarNombre(sc.next()));
        System.out.println("ingrese el apellido del estudiante: ");
        //o.setApellido(sc.next());
        o.setApellido(vI.validarApellido(sc.next()));
        System.out.println("ingrese el telefono del estudiante: ");
        //o.setTelefono(sc.next());
        o.setTelefono(vI.validarTelefono(sc.next()));
        
        System.out.println("Ingrese el número de semestre del estudiante (1-15):  ");
        //o.setNumero_semestre(sc.nextInt());
        o.setNumero_semestre(vI.validarNumerodesemestre(sc));
        System.out.println("el promedio del estudiante es:  ");
        //o.setPromedio(sc.nextFloat());
        o.setPromedio(vI.validarPromedio(sc));
        
        System.out.println("el serial del equipo es:  ");
        o.setSerial_Equipo(sc.next());
        o.setSerial_Equipo(vI.validarSerialdeEquipo(sc));

        
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
public LinkedList<EstudianteDiseño> LlenarEstudianteDi(LinkedList<EstudianteDiseño> l, validacionesD vD){
        boolean pedir= true;
        while(pedir){
        EstudianteDiseño e = new EstudianteDiseño();
        System.out.println("ingrese la cedula del estudiante: ");
        
        e.setCedula(vD.validarCedula(sc.next()));
        System.out.println("ingrese el nombre del estudiante: ");
      
        e.setNombre(vD.validarNombre(sc.next()));
        System.out.println("ingrese el apellido del estudiante: ");
        
        e.setApellido(vD.validarApellido(sc.next()));
        System.out.println("ingrese el telefono del estudiante: ");
       
        e.setTelefono(vD.validarTelefono(sc.next()));
        System.out.println("La modalidad es virtual o presencial? 1.Presencial, 2.Virtual ");
        e.setModalidad(vD.validarModalidad(sc));

        
        System.out.println("La cantidad de asignaturas que ve el estudiante son:  ");
        
        e.setCantidad_asignaturas(vD.validarCantidaddeasignatura(sc));
        System.out.println("el serial del equipo es: ");
        
        e.setSerial_equipo(vD.validarSerialdeEquipo(sc));
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
public LinkedList<TabletaGrafica> LlenarTableta(LinkedList<TabletaGrafica> l, validacionesT vT){
    boolean pedir = true;
    while (pedir){
        TabletaGrafica t = new TabletaGrafica();
        System.out.println("el serial de la tableta es: ");
        t.setSerial(vT.validarSerialdeEquipo(sc.next(), l));
        System.out.println("La marca de la tableta es: ");
        t.setMarca(vT.ValidarMarca(sc.next()));
        System.out.println("el tamaño de la tableta es: ");
        t.setTamaño(vT.validarTamaño(sc));
        System.out.println("El precio de la tableta es: ");
        t.setPrecio(vT.validarPrecio(sc));
        System.out.println("El almacenamiento de la tableta es: 1.256GB, 2.512GB, 3.1TB");
        t.setAlmacenamiento(vT.validarAlmacenamiento(sc));
        System.out.println("El peso de la tableta es: ");
        t.setPeso(vT.validarPeso(sc));
        l.add(t);
        System.out.println("¿desea registrar otra tableta? 1.Si, 2.No");
        int opt = sc.nextInt();
        if(opt==2){
            pedir = false;
            break;
        }
    }
    return l;
}
public LinkedList<ComputadoraPortatil> LlenarCompu(LinkedList<ComputadoraPortatil> l, validacionesC vC){
    boolean pedir = true;
    while (pedir){
        ComputadoraPortatil u= new ComputadoraPortatil();
        System.out.println("el serial del computador es: ");
        
        u.setSerial(vC.validarSerialdeEquipo(sc.next(), l));
        System.out.println("La marca del computador es: ");
        
        u.setMarca(vC.ValidarMarca(sc.next()));
        System.out.println("el tamaño del compuatdor es: ");
        
        u.setTamaño(vC.validarTamaño(sc));
        System.out.println("El precio del computador es: ");
        
        u.setPrecio(vC.validarPrecio(sc));
        System.out.println("El sistema operativo del computador es: 1.Windows 7, 2.Windows 10, 3.Windows 11");
        u.setSistema_operativo(vC.validarSistemaOperativo(sc));
        System.out.println("El procesador del computador es: 1.Intel Core i5, 2.AMD Ryzen");
        
        u.setProcesador(vC.validarProcesador(sc));
        l.add(u);
         
        System.out.println("¿desea registrar otro computador? 1.Si, 2.No");
        int opt = sc.nextInt();
        if(opt==2){
            pedir = false;
            break;
        }
    }
    return l;
}

public void registrarPrestamo(Scanner sc,
                              LinkedList<EstudianteIngenieria> estudiantesIngenieria,
                              LinkedList<EstudianteDiseño> estudiantesDiseno,
                              LinkedList<ComputadoraPortatil> computadoras,
                              LinkedList<TabletaGrafica> tabletas,
                              validacionesR vR,
                              validacionesC vC,
                              validacionesT vT) {
    if (!vR.validarSolicitudPrestamo(sc)) {
        System.out.println("No se registró ningún préstamo.");
        return;
    }

    int tipoEstudiante = vR.validarTipoEstudiante(sc);
    String cedula = vR.validarCedulaPrestamo(sc);

    if (tipoEstudiante == 1) {
        EstudianteIngenieria estudiante = null;
        for (EstudianteIngenieria e : estudiantesIngenieria) {
            if (e.getCedula().equals(cedula)) {
                estudiante = e;
                break;
            }
        }

        if (estudiante == null) {
            System.out.println("Estudiante de ingeniería no encontrado.");
            return;
        }

        if (estudiante.getSerial_Equipo() != null && !estudiante.getSerial_Equipo().isEmpty()) {
            System.out.println("El estudiante ya tiene un préstamo activo.");
            return;
        }

        int tipoEquipo = vR.validarTipoEquipo(sc);
        String serial = vR.validarSerialEquipo(sc);
        if (tipoEquipo == 1) {
            if (!existeComputadora(serial, computadoras)) {
                System.out.println("Computadora no registrada en inventario.");
                return;
            }
        } else {
            if (!existeTableta(serial, tabletas)) {
                System.out.println("Tableta no registrada en inventario.");
                return;
            }
        }

        estudiante.setSerial_Equipo(serial);
        System.out.println("Préstamo registrado para estudiante de ingeniería.");
    } else {
        EstudianteDiseño estudiante = null;
        for (EstudianteDiseño e : estudiantesDiseno) {
            if (e.getCedula().equals(cedula)) {
                estudiante = e;
                break;
            }
        }

        if (estudiante == null) {
            System.out.println("Estudiante de diseño no encontrado.");
            return;
        }

        if (estudiante.getSerial_equipo() != null && !estudiante.getSerial_equipo().isEmpty()) {
            System.out.println("El estudiante ya tiene un préstamo activo.");
            return;
        }

        int tipoEquipo = vR.validarTipoEquipo(sc);
        String serial = vR.validarSerialEquipo(sc);
        if (tipoEquipo == 1) {
            if (!existeComputadora(serial, computadoras)) {
                System.out.println("Computadora no registrada en inventario.");
                return;
            }
        } else {
            if (!existeTableta(serial, tabletas)) {
                System.out.println("Tableta no registrada en inventario.");
                return;
            }
        }

        estudiante.setSerial_equipo(serial);
        System.out.println("Préstamo registrado para estudiante de diseño.");
    }
}

private boolean existeComputadora(String serial, LinkedList<ComputadoraPortatil> computadoras) {
    for (ComputadoraPortatil c : computadoras) {
        if (c.getSerial().equals(serial)) {
            return true;
        }
    }
    return false;
}

private boolean existeTableta(String serial, LinkedList<TabletaGrafica> tabletas) {
    for (TabletaGrafica t : tabletas) {
        if (t.getSerial().equals(serial)) {
            return true;
        }
    }
    return false;
}

public void MostrarEstudianteIng(LinkedList<EstudianteIngenieria> l){
    for ( EstudianteIngenieria o : l ) {
        System.out.println("Nombre: "+ o.getNombre());
        System.out.println("Apellido: "+o.getApellido());
        System.out.println("Cedula: "+o.getCedula());
        System.out.println("Telefono: "+o.getTelefono());
        System.out.println("Numero de semestre: "+o.getNumero_semestre());
        System.out.println("Promedio: "+o.getPromedio());
        System.out.println("Serial del equipo: "+o.getSerial_Equipo());
    }
}
public void MostrarEstudianteDis(LinkedList<EstudianteDiseño> e){
    for (EstudianteDiseño o : e) {
        System.out.println("Nombre: "+o.getNombre());
        System.out.println("Apellido: "+o.getApellido());
        System.out.println("Cedula: "+o.getCedula());
        System.out.println("Telefono: "+o.getTelefono());
        System.out.println("Cantidad de asignaturas: "+o.getCantidad_asignaturas());
        System.out.println("Serial del equipo: "+o.getSerial_equipo());
        }
}
public void MostrarTableta(LinkedList<TabletaGrafica> l){
    for ( TabletaGrafica o : l) {
        System.out.println("Serial: "+o.getSerial());
        System.out.println("Marca: "+o.getMarca());
        System.out.println("Precio: "+o.getPrecio());
        System.out.println("Tamaño: "+o.getTamaño());
        System.out.println("Almacenamiento: "+o.isAlmacenamiento());
        System.out.println("Peso: "+o.getPeso());
        
        
    }
}
public void MostrarComputador(LinkedList<ComputadoraPortatil> l){
    for ( ComputadoraPortatil o : l) {
        System.out.println("Serial: "+o.getSerial());
        System.out.println("Marca: "+o.getMarca());
        System.out.println("Precio: "+o.getPrecio());
        System.out.println("Tamaño: "+o.getTamaño());
        System.out.println("Sistema operativo: "+o.isSistema_operativo());
        System.out.println("Procesador: "+o.isProcesador());
        
        
    }
}


public LinkedList<EstudianteIngenieria> modificEstudianteIngenierias(String Cedula, LinkedList<EstudianteIngenieria> l, validacionesI vI){
    EstudianteIngenieria encontrado = null;
    for (EstudianteIngenieria o : l) {
        if (o.getCedula().equals(Cedula)) {
            encontrado = o;
            break;
        }
    }
    if (encontrado == null) {
        System.out.println("Estudiante no encontrado");
        return l;
    }

    System.out.println("ingrese el nombre");
    encontrado.setNombre(vI.validarNombre(sc.next()));
    System.out.println("Ingrese el apellido");
    encontrado.setApellido(vI.validarApellido(sc.next()));
    System.out.println("ingrese el telefono");
    encontrado.setTelefono(vI.validarTelefono(sc.next()));
    System.out.println("ingrese el numero de semestre");
    encontrado.setNumero_semestre(vI.validarNumerodesemestre(sc));
    System.out.println("ingrese el promedio");
    encontrado.setPromedio(vI.validarPromedio(sc));
    System.out.println("ingrese el serial del equipo");
    encontrado.setSerial_Equipo(vI.validarSerialdeEquipo(sc));

    return l;
}
public LinkedList<EstudianteDiseño> modificEstudianteDiseño(String Cedula, LinkedList<EstudianteDiseño> l, validacionesD vD){
    EstudianteDiseño encontrado = null;
    for (EstudianteDiseño o : l) {
        if (o.getCedula().equals(Cedula)) {
            encontrado = o;
            break;
        }
    }
    if (encontrado == null) {
        System.out.println("Estudiante no encontrado");
        return l;
    }

    System.out.println("ingrese el nombre");
    encontrado.setNombre(vD.validarNombre(sc.next()));
    System.out.println("Ingrese el apellido");
    encontrado.setApellido(vD.validarApellido(sc.next()));
    System.out.println("ingrese el telefono");
    encontrado.setTelefono(vD.validarTelefono(sc.next()));
    System.out.println("La modalidad es virtual o presencial? 1.Presencial, 2.Virtual ");
    encontrado.setModalidad(vD.validarModalidad(sc));
    System.out.println(encontrado.isModalidad() ? "La modalidad es presencial" : "La modalidad es virtual");
    System.out.println("ingrese la cantidad de asignaturas");
    encontrado.setCantidad_asignaturas(vD.validarCantidaddeasignatura(sc));
    System.out.println("ingrese el serial del equipo");
    encontrado.setSerial_equipo(vD.validarSerialdeEquipo(sc));

    return l;
 
}
public LinkedList<TabletaGrafica> modificTableta(String Serial, LinkedList<TabletaGrafica> l, validacionesT vT  ){
    for (TabletaGrafica o : l) {
        if(o.getSerial().equals(Serial)){
            System.out.println("ingrese la marca");
            o.setMarca(vT.ValidarMarca(sc.next()));
            System.out.println("ingrese el tamaño");
            o.setTamaño(vT.validarTamaño(sc));
            System.out.println("ingrese el precio");
            o.setPrecio(vT.validarPrecio(sc));
            System.out.println("cual es el almacenamiento de la tableta? 1.256GB, 2.512GB, 3.1TB");
            o.setAlmacenamiento(vT.validarAlmacenamiento(sc));
            System.out.println("ingrese el peso de la tableta: ");
            o.setPeso(vT.validarPeso(sc));

        }else{
            System.out.println("Tableta no encontrada");

        }
        
    }
    return l;
}
public LinkedList<ComputadoraPortatil> modificComputador(String Serial, LinkedList<ComputadoraPortatil> l, validacionesC vC){
    ComputadoraPortatil encontrado = null;
    for (ComputadoraPortatil o : l) {
        if (o.getSerial().equals(Serial)) {
            encontrado = o;
            break;
        }
    }
    if (encontrado == null) {
        System.out.println("Computador no encontrado");
        return l;
    }

    System.out.println("ingrese la marca");
    encontrado.setMarca(vC.ValidarMarca(sc.next()));
    System.out.println("ingrese el tamaño");
    encontrado.setTamaño(vC.validarTamaño(sc));
    System.out.println("ingrese el precio");
    encontrado.setPrecio(vC.validarPrecio(sc));
    System.out.println("El sistema operativo del computador es: 1.Windows 7, 2.Windows 10, 3.Windows 11");
    int opc = sc.nextInt();
    if (opc >= 1 && opc <= 3) {
        encontrado.setSistema_operativo(true);
    }
    System.out.println("El procesador del computador es: 1.Intel Core i5, 2.AMD Ryzen");
    int opc2 = sc.nextInt();
    if (opc2 == 1 || opc2 == 2) {
        encontrado.setProcesador(true);
    }

    return l;
    
}
public LinkedList<EstudianteIngenieria> eliminarEstudianteIngenieria(String Cedula, LinkedList<EstudianteIngenieria> l){
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
public LinkedList<EstudianteDiseño> eliminarEstudianteDiseño(String Cedula, LinkedList<EstudianteDiseño> l){
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
public LinkedList<EstudianteIngenieria> RegistrarPestramoEI(String Cedula, LinkedList<EstudianteIngenieria> l){
    for (EstudianteIngenieria o : l) {
        if(o.getCedula()==Cedula){
             System.out.println("que equipo desea prestar? 1.Computadora portatil, 2.Tableta grafica");
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
public LinkedList<EstudianteDiseño> RegistrarPestramoED(String Cedula, LinkedList<EstudianteDiseño> D){
    for (EstudianteDiseño o : D) {
        if(o.getCedula()==Cedula){
             System.out.println("que equipo desea prestar? 1.Computadora portatil, 2.Tableta grafica");
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
        
    }return D;
}

        }
     