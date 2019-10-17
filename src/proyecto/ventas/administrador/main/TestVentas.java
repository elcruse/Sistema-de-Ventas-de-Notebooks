
package proyecto.ventas.administrador.main;
import java.text.DateFormat;
import java.text.ParseException;  
import java.text.SimpleDateFormat;
import java.util.Date; 
import java.util.Scanner;
import proyecto.ventas.administrador.*;

public class TestVentas {
      private Cliente cliente;
    
    public static void main(String[] args) throws ParseException {
   
        TestVentas test= new TestVentas();
        test.cargar();
        test.imprimir();
    }
    
    private void cargar() throws ParseException{
        Notebook notebook= new Notebook("To shiva","KLM","N25",50);
        DetalleOrden detalle=new DetalleOrden(notebook,25000,1);
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca Fecha de Envio: DD/MM/YYYY ");
        String entrada;//Entrada recogida como sea (scanner)
        entrada=sc.next();
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha
        Date fechaEnvio = format.parse(entrada); // Creamos un date con la entrada en el formato especificado
        Date fechaActual = new Date();
        cliente= new Cliente("Jimmy",95692723);
        Orden orden= new Orden(01,fechaActual);
        orden.agregarItem(detalle);
        orden.setEnvio(fechaEnvio);
        cliente.addOrden(orden);
    }
    
    private void imprimir(){
    System.out.println(cliente);
    }
    
}
