public class EstudianteDiseño {
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private boolean modalidad;
    private int cantidad_asignaturas;
    private String serial_equipo;
    public EstudianteDiseño() {
    }
    public EstudianteDiseño(int cedula, String nombre, String apellido, int telefono, boolean modalidad,
            int cantidad_asignaturas, String serial_equipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.modalidad = modalidad;
        this.cantidad_asignaturas = cantidad_asignaturas;
        this.serial_equipo = serial_equipo;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public boolean isModalidad() {
        return modalidad;
    }
    public void setModalidad(boolean modalidad) {
        this.modalidad = modalidad;
    }
    public int getCantidad_asignaturas() {
        return cantidad_asignaturas;
    }
    public void setCantidad_asignaturas(int cantidad_asignaturas) {
        this.cantidad_asignaturas = cantidad_asignaturas;
    }
    public String getSerial_equipo() {
        return serial_equipo;
    }
    public void setSerial_equipo(String serial_equipo) {
        this.serial_equipo = serial_equipo;
    }
    
    

    
}