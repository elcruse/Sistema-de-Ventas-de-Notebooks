
package proyecto.ventas.administrador;



public class DetalleOrden {
    private Notebook item;
    private float precioUnitario;
    private int cantidad;

    public DetalleOrden(Notebook item, float precioUnitario, int cantidad) {
        this.item = item;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Notebook getItem() {
        return item;
    }

    

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" + "item=" + item + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + '}';
    }

    

    
    
    
    
}
