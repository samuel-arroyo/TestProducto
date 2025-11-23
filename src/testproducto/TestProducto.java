/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproducto;

/**
 *
 * @author Samuel A
 */
public class TestProducto {

    /**
     * @param args the command line arguments
    **/
    public static void main(String[] args) {
     
        // ------------------------------------
        // PRUEBA DE LA SUPERCLASE PRODUCTO 
        // ------------------------------------
       
        // Crear un objeto de la clase Producto con los datos de prueba del PDF [cite: 63-64]
        Producto miProducto = 
            new Producto("74329389", "abc", "23/10/2025", 1, 2500);
        
        // Imprimiendo los datos de prueba de la superclase [cite: 65]
        System.out.println("Prueba de la superclase:\n" + miProducto.toString());
    
        // ------------------------------------------------------------------
        // --- PRUEBA DE LA SUBCLASE PRODUCTOFRESCO ---
        // -------------------------------------------------------------------

        ProductoFresco productoFresco = new ProductoFresco(
            "2839283", "Tilapia", "19/11/2025", 1, 180.23, "20/11/2025", "China");
        
        System.out.println("\nDatos del producto fresco:\n" + productoFresco.toString());
        
        // ------------------------------------------------
        // PRUEBA DE LA SUBCLASE PRODUCTOREFRIGERADO
        // ------------------------------------------------
        
        // Datos de prueba: se añaden los campos de Producto + el campo específico.
        ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado(
           "1122334", 
           "Yogurt Natural", 
           "01/12/2025", 
           2, 
           55.75, 
           "ESP007" 
        );
        
        // Asegúrate de corregir también el nombre de la variable si usas 'productoRefrigerado'
        System.out.println("\nDatos del producto refrigerado:\n" + productoRefrigerado.toString());
        
        // ------------------------------------------------
        // PRUEBA DE LA SUBCLASE PRODUCTOCONGELADO
        // ------------------------------------------------
        
        System.out.println("\n*** PRUEBA DE PRODUCTO CONGELADO ***");
        try {
            // 1. Instanciación del objeto ProductoCongelado
            ProductoCongelado productoCongelado = new ProductoCongelado(
                "5566778", 
                "Pescado Congelado", 
                "15/03/2026", 
                3, 
                345.99, 
                -18.0 // Temperatura VÁLIDA (debe ser < 0)
            );
        
            // 2. LÍNEA CLAVE: Imprimir el objeto para mostrar los datos
            System.out.println("Datos del producto congelado:\n" + productoCongelado.toString());

        } catch (IllegalArgumentException e) {
            
            // Este bloque captura si la validación falla (ej. si usaras 10.0 °C)
            System.err.println("Error al crear Producto Congelado: " + e.getMessage());
        }
    }
}

