public class ComputadoraPortatil {
    private String serial;
    private String marca;
    private float tamaño;
    private float precio;
    private boolean Sistema_operativo;
    private boolean procesador;
    public ComputadoraPortatil() {
    }
    public ComputadoraPortatil(String serial, String marca, float tamaño, float precio) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        
    }
    public ComputadoraPortatil(boolean sistema_operativo, boolean procesador) {
        this.Sistema_operativo = sistema_operativo;
        this.procesador = procesador;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
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
    public boolean isSistema_operativo() {
        return Sistema_operativo;
    }
    public void setSistema_operativo(boolean sistema_operativo) {
        this.Sistema_operativo = sistema_operativo;
    }
    public boolean isProcesador() {
        return procesador;
    }
    public void setProcesador(boolean procesador) {
        this.procesador = procesador;
    }
    
   

}