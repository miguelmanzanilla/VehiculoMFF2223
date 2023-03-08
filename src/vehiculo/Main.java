
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoFernandezFernandezMiguel2223 miVehiculoFernandezFernandezMiguel2223;
        int stockActual;
        
        miVehiculoFernandezFernandezMiguel2223 = new VehiculoFernandezFernandezMiguel2223("Seat",18000,100);
        operativaVehiculosFernandezFernandezMiguel2223(miVehiculoFernandezFernandezMiguel2223, 50); 
    }

    private static void operativaVehiculosFernandezFernandezMiguel2223(VehiculoFernandezFernandezMiguel2223 miVehiculoFernandezFernandezMiguel2223, int Cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoFernandezFernandezMiguel2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoFernandezFernandezMiguel2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoFernandezFernandezMiguel2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
