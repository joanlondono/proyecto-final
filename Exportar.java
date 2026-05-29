import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {
    public void exportarArchivoEI(LinkedList<EstudianteIngenieria> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("EstudiantesI.txt")) {
                for (EstudianteIngenieria obj : lista) {
                    e.write("Nombre: " + obj.getNombre() + "\n");
                    e.write("telefono " + obj.getTelefono() + "\n");
                    e.write("Cedula: " + obj.getCedula() + "\n");
                    e.write("numero de semestre: "+obj.getNumero_semestre());
                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
    public void exportarArchivoED(LinkedList<EstudianteDiseño> ED) {
        if (ED.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("EstudiantesD.txt")) {
                for (EstudianteDiseño obj : ED) {
                    e.write("Nombre: " + obj.getNombre() + "\n");
                    e.write("Telefono " + obj.getTelefono() + "\n");
                    e.write("Cedula: " + obj.getCedula() + "\n");
                    e.write("telefono: " + obj.getTelefono() + "\n");
                    e.write("cantidad de asignaturas: " + obj.getCantidad_asignaturas() + "\n");
                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void exportarArchivoT(LinkedList<TabletaGrafica> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Tabletas.txt")) {
                for (TabletaGrafica obj : lista) {
                    e.write("Serial: " + obj.getSerial() + "\n");
                    e.write("Precio: " + obj.getPrecio() + "\n");
                    e.write("Marca: " + obj.getMarca() + "\n");

                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
     public void exportarArchivoC(LinkedList<ComputadoraPortatil> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Computadoras.txt")) {
                for (ComputadoraPortatil obj : lista) {
                    e.write("Serial: " + obj.getSerial() + "\n");
                    e.write("Precio: " + obj.getPrecio() + "\n");
                    e.write("Marca: " + obj.getMarca() + "\n");
                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    

}
    
