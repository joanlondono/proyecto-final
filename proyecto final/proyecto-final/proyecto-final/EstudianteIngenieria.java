public class EstudianteIngenieria{
    private int Cedula;
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private int Numero_semestre;
    private float Promedio;
    private String Serial_Equipo;
    public EstudianteIngenieria() {
    }
    public EstudianteIngenieria(int cedula, String nombre, String apellido, int telefono, int numero_semestre,
            float promedio, String serial_Equipo) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Numero_semestre = numero_semestre;
        Promedio = promedio;
        Serial_Equipo = serial_Equipo;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int cedula) {
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
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int telefono) {
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