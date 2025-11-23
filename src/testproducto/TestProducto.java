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

        // ... Aquí irían las pruebas de las otras subclases ...
    }
}
    
    

