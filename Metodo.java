import java.util.Scanner;
import java.util.LinkedList;
public class Metodo {
Scanner sc = new Scanner(System.in);
    public LinkedList<EstudianteIngenieria> LlenarEstudianteIg(LinkedList<EstudianteIngenieria> l){
        boolean pedir= true;
        while(pedir){
        EstudianteIngenieria o = new EstudianteIngenieria();
        System.out.println("ingrese el nombre del estudiante: ");
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
        boolean pedir= true;
        while(pedir){
        TabletaGrafica i = new TabletaGrafica();
        System.out.println("el serial de la tableta es: ");
        i.setSerial(sc.next());
        System.out.println("la marca de la tableta es: ");
        i.setMarca(sc.next());
        System.out.println("el tamaño de la tableta es: ");
        i.setTamaño(sc.nextFloat()); 
        System.out.println("ingrese el precio de la tableta: ");
        i.setPrecio(sc.nextFloat());
        System.out.println("¿ingrsar otro estudiante?, 1.Si, 2.No");
        int opt = sc.nextInt();
            if (opt == 2) {
                pedir = false;
                break;
                }
}
    return l;
}
public LinkedList<ComputadorPortatil> LlenarCompu(LinkedList<ComputadorPortatil> l){
    
}

}