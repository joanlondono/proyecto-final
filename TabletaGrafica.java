public class TabletaGrafica {
    private String Serial;
    private String Marca;
    private float Tamaño;
    private float Precio;
    private boolean Almacenamiento;
    private float Peso;
    public TabletaGrafica() {
    }
    public TabletaGrafica(String serial, String marca, float tamaño, float precio, boolean almacenamiento, float peso) {
        this.Serial = serial;
        this.Marca = marca;
        this.Tamaño = tamaño;
        this.Precio = precio;
        this.Almacenamiento = almacenamiento;
        this.Peso = peso;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        this.Serial = serial;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    public float getTamaño() {
        return Tamaño;
    }
    public void setTamaño(float tamaño) {
        this.Tamaño = tamaño;
    }
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float precio) {
        this.Precio = precio;
    }
    public boolean isAlmacenamiento() {
        return Almacenamiento;
    }
    public void setAlmacenamiento(boolean almacenamiento) {
        this.Almacenamiento = almacenamiento;
    }
    public float getPeso() {
        return Peso;
    }
    public void setPeso(float peso) {
        this.Peso = peso;
    }
    
}