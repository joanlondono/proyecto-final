import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {
    public void exportarArchivoEI(LinkedList<EstudianteIngenieria> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Estudiantes.txt")) {
                for (EstudianteIngenieria obj : lista) {
                    e.write("Nombre: " + obj.getNombre() + "\n");
                    e.write("Carnet: " + obj.getTelefono() + "\n");
                    e.write("Cedula: " + obj.getCedula() + "\n");
                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
    public void exportarArchivoED(LinkedList<EstudianteDiseño> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Estudiantes.txt")) {
                for (EstudianteDiseño obj : lista) {
                    e.write("Nombre: " + obj.getNombre() + "\n");
                    e.write("Carnet: " + obj.getTelefono() + "\n");
                    e.write("Cedula: " + obj.getCedula() + "\n");
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
            try (FileWriter e = new FileWriter("Tecnologia.txt")) {
                for (TabletaGrafica obj : lista) {
                    e.write("Nombre: " + obj.getSerial() + "\n");
                    e.write("Carnet: " + obj.getPrecio() + "\n");
                    e.write("Cedula: " + obj.getMarca() + "\n");
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
            try (FileWriter e = new FileWriter("Tecnologia.txt")) {
                for (ComputadoraPortatil obj : lista) {
                    e.write("Nombre: " + obj.getSerial() + "\n");
                    e.write("Carnet: " + obj.getPrecio() + "\n");
                    e.write("Cedula: " + obj.getMarca() + "\n");
                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    

}
    
