import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {
    public void exportarArchivoEI(LinkedList<EstudianteIngenieria> EI) {
        if (EI.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        }

        try (FileWriter e = new FileWriter("EstudiantesI.txt", true)) {
            for (EstudianteIngenieria obj : EI) {
                e.write("Cedula: " + obj.getCedula() + "\n");
                e.write("Nombre: " + obj.getNombre() + "\n");
                e.write("Apellido: " + obj.getApellido() + "\n");
                e.write("Telefono: " + obj.getTelefono() + "\n");
                e.write("Numero_semestre: " + obj.getNumero_semestre() + "\n");
                e.write("Promedio: " + obj.getPromedio() + "\n");
                e.write("Serial_Equipo: " + obj.getSerial_Equipo() + "\n");
                e.write("------------------------------------------------------ \n");
            }
            System.out.println("Archivo exportado correctamente ");
        } catch (IOException e) {
            System.out.println("Error al exportar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void exportarArchivoED(LinkedList<EstudianteDiseño> ED) {
        if (ED.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        }

        try (FileWriter e = new FileWriter("EstudiantesD.txt", true)) {
            for (EstudianteDiseño obj : ED) {
                e.write("Cedula: " + obj.getCedula() + "\n");
                e.write("Nombre: " + obj.getNombre() + "\n");
                e.write("Apellido: " + obj.getApellido() + "\n");
                e.write("Telefono: " + obj.getTelefono() + "\n");
                e.write("Modalidad: " + (obj.isModalidad() ? "Presencial" : "Virtual") + "\n");
                e.write("Cantidad_asignaturas: " + obj.getCantidad_asignaturas() + "\n");
                e.write("Serial_Equipo: " + obj.getSerial_equipo() + "\n");
                e.write("------------------------------------------------------ \n");
            }
            System.out.println("Archivo exportado correctamente ");
        } catch (IOException e) {
            System.out.println("Error al exportar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void exportarArchivoT(LinkedList<TabletaGrafica> T) {
        if (T.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        }

        try (FileWriter e = new FileWriter("Tabletas.txt", true)) {
            for (TabletaGrafica obj : T) {
                e.write("Serial: " + obj.getSerial() + "\n");
                e.write("Marca: " + obj.getMarca() + "\n");
                e.write("Tamaño: " + obj.getTamaño() + "\n");
                e.write("Precio: " + obj.getPrecio() + "\n");
                e.write("Almacenamiento: " + (obj.isAlmacenamiento() ? "Sí" : "No") + "\n");
                e.write("Peso: " + obj.getPeso() + "\n");
                e.write("------------------------------------------------------ \n");
            }
            System.out.println("Archivo exportado correctamente ");
        } catch (IOException e) {
            System.out.println("Error al exportar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void exportarArchivoC(LinkedList<ComputadoraPortatil> C) {
        if (C.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        }

        try (FileWriter e = new FileWriter("Computadoras.txt", true)) {
            for (ComputadoraPortatil obj : C) {
                e.write("Serial: " + obj.getSerial() + "\n");
                e.write("Marca: " + obj.getMarca() + "\n");
                e.write("Tamaño: " + obj.getTamaño() + "\n");
                e.write("Precio: " + obj.getPrecio() + "\n");
                e.write("Sistema_operativo: " + (obj.isSistema_operativo() ? "Sí" : "No") + "\n");
                e.write("Procesador: " + (obj.isProcesador() ? "Sí" : "No") + "\n");
                e.write("------------------------------------------------------ \n");
            }
            System.out.println("Archivo exportado correctamente ");
        } catch (IOException e) {
            System.out.println("Error al exportar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
    
