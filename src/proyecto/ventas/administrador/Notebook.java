
package proyecto.ventas.administrador;


public class Notebook {
     private String marca;
    private String modelo;
    private String procesador;
    private float tamañoDisco;

    public Notebook(String marca, String modelo, String procesador, float tamañoDisco) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.tamañoDisco = tamañoDisco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public float getTamañoDisco() {
        return tamañoDisco;
    }

    @Override
    public String toString() {
        return "Notebook{" + "marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", tama\u00f1oDisco=" + tamañoDisco +" Gb"+ '}';
    }
    
    
}
