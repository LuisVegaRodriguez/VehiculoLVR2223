
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args, int cantidad) {
        VehiculoVegaRodriguezLuis2223 miVehiculoVegaRodriguezLuis2223;
        int stockActual;
        
        miVehiculoVegaRodriguezLuis2223 = new VehiculoVegaRodriguezLuis2223("Seat",18000,100);
        operativaVehiculosVegaRodriguezLuis2223(miVehiculoVegaRodriguezLuis2223);
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoVegaRodriguezLuis2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoVegaRodriguezLuis2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosVegaRodriguezLuis2223(VehiculoVegaRodriguezLuis2223 miVehiculoVegaRodriguezLuis2223) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoVegaRodriguezLuis2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    
