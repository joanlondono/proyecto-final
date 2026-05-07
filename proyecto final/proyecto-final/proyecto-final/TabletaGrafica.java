public class TabletaGrafica {
    private String Serial;
    private String Marca;
    private float tamaño;
    private float precio;
    public TabletaGrafica() {
    }
    public TabletaGrafica(String serial, String marca, float tamaño, float precio) {
        this.Serial = serial;
        this.Marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
