
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class importar {

    public LinkedList<EstudianteIngenieria> ImportarArchivoEI() {

        String rutaArchivo = "EstudiantesI.txt";
        LinkedList<EstudianteIngenieria> EI = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            EstudianteIngenieria est = null;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("Cedula:")) {
                    if (est == null) {
                        est = new EstudianteIngenieria();
                    }
                    est.setCedula(linea.substring(8).trim());

                } else if (linea.startsWith("Nombre:")) {
                    if (est == null) {
                        est = new EstudianteIngenieria();
                    }
                    est.setNombre(linea.substring(8).trim());

                } else if (linea.startsWith("Apellido:")) {
                    if (est == null) {
                        est = new EstudianteIngenieria();
                    }
                    est.setApellido(linea.substring(10).trim());

                } else if (linea.startsWith("Telefono:")) {
                    if (est == null) {
                        est = new EstudianteIngenieria();
                    }
                    est.setTelefono(linea.substring(10).trim());

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

                } else if (linea.startsWith("Serial_Equipo:") || linea.startsWith("Serial del equipo:")) {
                    if (est != null) {
                        est.setSerial_Equipo(linea.substring(linea.indexOf(':') + 1).trim());
                        EI.add(est);
                        est = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente");

        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }

        return EI;
    }
    

    public LinkedList<EstudianteDiseño> importarArchivoED() {

        String rutaArchivo = "EstudiantesD.txt";
        LinkedList<EstudianteDiseño> ED = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            EstudianteDiseño est = null;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("Cedula:")) {
                    if (est == null) {
                        est = new EstudianteDiseño();
                    }
                    est.setCedula(linea.substring(8).trim());

                } else if (linea.startsWith("Nombre:")) {
                    if (est == null) {
                        est = new EstudianteDiseño();
                    }
                    est.setNombre(linea.substring(8).trim());

                } else if (linea.startsWith("Apellido:")) {
                    if (est == null) {
                        est = new EstudianteDiseño();
                    }
                    est.setApellido(linea.substring(10).trim());

                } else if (linea.startsWith("Telefono:")) {
                    if (est == null) {
                        est = new EstudianteDiseño();
                    }
                    est.setTelefono(linea.substring(10).trim());

                } else if (linea.startsWith("Modalidad:")) {
                    if (est == null) {
                        est = new EstudianteDiseño();
                    }
                    est.setModalidad(parseBooleanValor(linea.substring(10).trim()));

                } else if (linea.toLowerCase().startsWith("cantidad_asignaturas:") || linea.toLowerCase().startsWith("cantidad de asignaturas:")) {
                    if (est != null) {
                        est.setCantidad_asignaturas(
                            Integer.parseInt(linea.substring(linea.indexOf(':') + 1).trim())
                        );
                    }

                } else if (linea.startsWith("Serial_Equipo:") || linea.startsWith("Serial del equipo:")) {
                    if (est != null) {
                        est.setSerial_equipo(linea.substring(linea.indexOf(':') + 1).trim());
                        ED.add(est);
                        est = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente");

        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }

        return ED;
    }
   



    public LinkedList<ComputadoraPortatil> importarArchivoC() {

        String rutaArchivo = "Computadoras.txt";
        LinkedList<ComputadoraPortatil> C = new LinkedList<>();

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

                } else if (linea.startsWith("Sistema_operativo:") || linea.startsWith("Sistema operativo:")) {
                    if (comp != null) {
                        comp.setSistema_operativo(parseBooleanValor(linea.substring(linea.indexOf(':') + 1).trim()));
                    }

                } else if (linea.startsWith("Procesador:")) {
                    if (comp != null) {
                        comp.setProcesador(parseBooleanValor(linea.substring(11).trim()));

                        // ✅ objeto completo
                        C.add(comp);
                        comp = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente");

        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }

        return C;
    }
  

    public LinkedList<TabletaGrafica> importarArchivoT() {

        String rutaArchivo = "Tabletas.txt";
        LinkedList<TabletaGrafica> T = new LinkedList<>();

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
                        tab.setAlmacenamiento(parseBooleanValor(linea.substring(15).trim()));
                    }

                } else if (linea.startsWith("Peso:")) {
                    if (tab != null) {
                        tab.setPeso(
                            Float.parseFloat(linea.substring(5).trim())
                        );

                        // ✅ objeto completo
                        T.add(tab);
                        tab = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente");

        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }

        return T;
    }

    private boolean parseBooleanValor(String valor) {
        String texto = valor.trim().toLowerCase();
        return texto.equals("true")
            || texto.equals("si")
            || texto.equals("sí")
            || texto.equals("s")
            || texto.equals("presencial");
    }
}


                


