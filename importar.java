
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class importar {

    public LinkedList<EstudianteIngenieria> ImportarArchivoEI() {

        String rutaArchivo = "EstudiantesI.txt";
        LinkedList<EstudianteIngenieria> lista = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            EstudianteIngenieria est = null;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("Cedula:")) {
                    est = new EstudianteIngenieria();
                    est.setCedula(linea.substring(8).trim());

                } else if (linea.startsWith("Nombre:")) {
                    if (est != null) {
                        est.setNombre(linea.substring(8).trim());
                    }

                } else if (linea.startsWith("Apellido:")) {
                    if (est != null) {
                        est.setApellido(linea.substring(10).trim());
                    }

                } else if (linea.startsWith("Telefono:")) {
                    if (est != null) {
                        est.setTelefono(linea.substring(10).trim());
                    }

                } else if (linea.startsWith("Numero_semestre:")) {
                    if (est != null) {
                        est.setNumero_semestre(
                            Integer.parseInt(linea.substring(17).trim())
                        );
                    }

                } else if (linea.startsWith("Promedio:")) {
                    if (est != null) {
                        est.setPromedio(
                            Float.parseFloat(linea.substring(9).trim())
                        );
                    }

                } else if (linea.startsWith("Serial_Equipo:")) {
                    if (est != null) {
                        est.setSerial_Equipo(linea.substring(15).trim());

                        
                        lista.add(est);
                        est = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente");

        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }

        return lista;
    }
    

    public LinkedList<EstudianteDiseño> importarArchivoED() {

        String rutaArchivo = "EstudiantesD.txt";
        LinkedList<EstudianteDiseño> lista = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            EstudianteDiseño est = null;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("Cedula:")) {
                    est = new EstudianteDiseño();
                    est.setCedula(linea.substring(8).trim());

                } else if (linea.startsWith("Nombre:")) {
                    if (est != null) {
                        est.setNombre(linea.substring(8).trim());
                    }

                } else if (linea.startsWith("Apellido:")) {
                    if (est != null) {
                        est.setApellido(linea.substring(10).trim());
                    }

                } else if (linea.startsWith("Telefono:")) {
                    if (est != null) {
                        est.setTelefono(linea.substring(10).trim());
                    }

                } else if (linea.startsWith("Modalidad:")) {
                    if (est != null) {
                        est.setModalidad(
                            Boolean.parseBoolean(linea.substring(10).trim())
                        );
                    }

                } else if (linea.startsWith("Cantidad_asignaturas:")) {
                    if (est != null) {
                        est.setCantidad_asignaturas(
                            Integer.parseInt(linea.substring(22).trim())
                        );
                    }

                } else if (linea.startsWith("Serial_Equipo:")) {
                    if (est != null) {
                        est.setSerial_equipo(linea.substring(15).trim());

                        
                        lista.add(est);
                        est = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente");

        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }

        return lista;
    }
   



    public LinkedList<ComputadoraPortatil> importarArchivoC() {

        String rutaArchivo = "Computadoras.txt";
        LinkedList<ComputadoraPortatil> lista = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            ComputadoraPortatil comp = null;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("Serial:")) {
                    comp = new ComputadoraPortatil();
                    comp.setSerial(linea.substring(7).trim());

                } else if (linea.startsWith("Marca:")) {
                    if (comp != null) {
                        comp.setMarca(linea.substring(6).trim());
                    }

                } else if (linea.startsWith("Tamaño:")) {
                    if (comp != null) {
                        comp.setTamaño(
                            Float.parseFloat(linea.substring(7).trim())
                        );
                    }

                } else if (linea.startsWith("Precio:")) {
                    if (comp != null) {
                        comp.setPrecio(
                            Float.parseFloat(linea.substring(7).trim())
                        );
                    }

                } 
else if (linea.startsWith("Sistema_operativo:")) {
                    if (comp != null) {
                        comp.setSistema_operativo(
                            Boolean.parseBoolean(linea.substring(19).trim())
                        );
                    }

                } else if (linea.startsWith("Procesador:")) {
                    if (comp != null) {
                        comp.setProcesador(
                            Boolean.parseBoolean(linea.substring(11).trim())
                        );

                        // ✅ objeto completo
                        lista.add(comp);
                        comp = null;
                    }
                    
 }
            }

            System.out.println("Archivo importado correctamente");

        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }

        return lista;
    }
  

    public LinkedList<TabletaGrafica> importarArchivoT() {

        String rutaArchivo = "Tabletas.txt";
        LinkedList<TabletaGrafica> lista = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            TabletaGrafica tab = null;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("Serial:")) {
                    tab = new TabletaGrafica();
                    tab.setSerial(linea.substring(7).trim());

                } else if (linea.startsWith("Marca:")) {
                    if (tab != null) {
                        tab.setMarca(linea.substring(6).trim());
                    }

                } else if (linea.startsWith("Tamaño:")) {
                    if (tab != null) {
                        tab.setTamaño(
                            Float.parseFloat(linea.substring(7).trim())
                        );
                    }

                } else if (linea.startsWith("Precio:")) {
                    if (tab != null) {
                        tab.setPrecio(
                            Float.parseFloat(linea.substring(7).trim())
                        );
                    }

                } else if (linea.startsWith("Almacenamiento:")) {
                    if (tab != null) {
                        tab.setAlmacenamiento(
                            Boolean.parseBoolean(linea.substring(15).trim())
                        );
                    }

                } else if (linea.startsWith("Peso:")) {
                    if (tab != null) {
                        tab.setPeso(
                            Float.parseFloat(linea.substring(5).trim())
                        );

                        // ✅ objeto completo
                        lista.add(tab);
                        tab = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente");

        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }

        return lista;
    }
}


                


