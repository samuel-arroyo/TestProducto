/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproducto;

/**
 *
 * @author Samuel A
 */
public class ProductoFresco extends Producto{
    
    // Atributos específicos
    private String fechaEnvasado;
    private String paisOrigen;
    
    /**
     * Constructor de la clase ProductoFresco.
     * @param claveProducto Clave única del producto.
     * @param nombreProducto Nombre del producto.
     * @param fechaCaducidad Fecha de caducidad.
     * @param numeroLote Número de lote.
     * @param precioVenta Precio de venta.
     * @param fechaEnvasado Fecha en que fue envasado el producto.
     * @param paisOrigen País de origen del producto.
     */
    public ProductoFresco(String claveProducto, String nombreProducto, 
            String fechaCaducidad,int numeroLote, double precioVenta,
            String fechaEnvasado, String paisOrigen) {
        
        // Llama al constructor de la superclase Producto 
        super(claveProducto, nombreProducto, fechaCaducidad, numeroLote, precioVenta);
        
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    // --- Getters y Setters ---

    /**
     * @return the fechaEnvasado
     */
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    /**
     * @param fechaEnvasado the fechaEnvasado to set
     */
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    /**
     * @return the paisOrigen
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * @param paisOrigen the paisOrigen to set
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    // --- Método toString ---

    /**
     * Devuelve una representación String del objeto ProductoFresco, incluyendo la información de la 
     * superclase.
     * @return String con la información detallada del producto fresco.
     */
    @Override
    public String toString() {
        // Reutiliza el toString() de la superclase y añade la información específica
        return String.format("%s\n" +
                             "Fecha de Envasado: %s\n" +
                             "Lugar de Origen: %s\n",
                             super.toString(), fechaEnvasado, paisOrigen);
    }
    
    
}
