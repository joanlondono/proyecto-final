public class EstudianteIngenieria{
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int Numero_semestre;
    private float Promedio;
    private String Serial_Equipo;
    public EstudianteIngenieria() {
    }
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numero_semestre,
            float promedio, String serial_Equipo) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Numero_semestre = numero_semestre;
        Promedio = promedio;
        Serial_Equipo = serial_Equipo;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public int getNumero_semestre() {
        return Numero_semestre;
    }
    public void setNumero_semestre(int numero_semestre) {
        Numero_semestre = numero_semestre;
    }
    public float getPromedio() {
        return Promedio;
    }
    public void setPromedio(float promedio) {
        Promedio = promedio;
    }
    public String getSerial_Equipo() {
        return Serial_Equipo;
    }
    public void setSerial_Equipo(String serial_Equipo) {
        Serial_Equipo = serial_Equipo;
    }
    
}