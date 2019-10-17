
package proyecto.ventas.administrador;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Orden {
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;

    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
        items=new ArrayList();
    }
    
    public void agregarItem (DetalleOrden detalle){
        items.add(detalle);
    }

    public int getNroItems() {
        return items.size();
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }

    @Override
    public String toString() {
        return "Orden{" + "items=" + items + ", id=" + id + ", creacion=" + creacion + ", envio=" + envio + '}';
    }

    
    
    
    
    
    
}
