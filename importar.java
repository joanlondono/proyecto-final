
    
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class importar {
    public LinkedList<EstudianteIngenieria> ImportarArchivoEI() {
        String rutaArchivo = "Estudiantes.txt";
        LinkedList<EstudianteIngenieria> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            EstudianteIngenieria obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new EstudianteIngenieria();
                    obj.setNombre(linea.substring(8));
                } else if (linea.startsWith("Carnet:")) {
                    if (obj != null) {
                        obj.setCedula(linea.substring(8));
                    }

                } else if (linea.startsWith("Cedula:")) {
                    if (obj != null) {
                        obj.setNumero_semestre(Integer.parseInt(linea.substring(8)));
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {
            
            
        }
        return lista;
    }
    public LinkedList<EstudianteDiseño> ImportarArchivoED() {
        String rutaArchivo = "Estudiantes.txt";
        LinkedList<EstudianteDiseño> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            EstudianteDiseño obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new EstudianteDiseño();
                    obj.setNombre(linea.substring(8));
                } else if (linea.startsWith("Carnet:")) {
                    if (obj != null) {
                        obj.setCedula(linea.substring(8));
                    }

                } else if (linea.startsWith("Cedula:")) {
                    if (obj != null) {
                        obj.setCantidad_asignaturas(Integer.parseInt(linea.substring(8)));
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {
            
            
        }
        return lista;
    }
    



}
