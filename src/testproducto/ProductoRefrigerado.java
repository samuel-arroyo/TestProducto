/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproducto;

/**
 *
 * @author Samuel A
 */
public class ProductoRefrigerado extends Producto {
    
    // Atributo específico
    private String codigoSupervision;
    
    /**
     * Constructor de la clase ProductoRefrigerado.
     * @param claveProducto Clave única del producto.
     * @param nombreProducto Nombre del producto.
     * @param fechaCaducidad Fecha de caducidad.
     * @param numeroLote Número de lote.
     * @param precioVenta Precio de venta.
     * @param codigoSupervision Código del organismo de supervisión alimentaria.
     */
    

    
    public ProductoRefrigerado(String claveProducto, String nombreProducto, String fechaCaducidad, int numeroLote, double precioVenta, String esP007) {
        
        // Llama al constructor de la superclase Producto
        super(claveProducto, nombreProducto, fechaCaducidad, numeroLote, precioVenta);
        this.codigoSupervision = codigoSupervision;

    }
    
    // --- Getters y Setters ---

    /**
     * @return the codigoSupervision
     */
    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    /**
     * @param codigoSupervision the codigoSupervision to set
     */
    public void setCodigoSupervision(String codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }
    
    // --- Método toString ---

    /**
     * Devuelve una representación String del objeto ProductoRefrigerado.
     * @return String con la información detallada del producto refrigerado.
     */
    @Override
    public String toString() {
        return String.format("%s\n" +
                             "Codigo de Supervision: %s",
                             super.toString(), codigoSupervision);
    }
    
    
    
}
