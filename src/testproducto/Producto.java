/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproducto;

/**
 *
 * @author Samuel A
 */
public class Producto {
    
    // Atributos comunes a todos los productos
    private String claveProducto;
    private String nombreProducto;
    private String fechaCaducidad;
    private int numeroLote;
    private double precioVenta; // Validado: debe ser > 0

    /**
     * Constructor de la clase Producto.
     * @param claveProducto Clave única del producto (String).
     * @param nombreProducto Nombre o descripción del producto (String).
     * @param fechaCaducidad Fecha de caducidad del producto (String).
     * @param numeroLote Número de lote del producto (int).
     * @param precioVenta Precio de venta del producto (double).
     */
    public Producto(String claveProducto, String nombreProducto, String fechaCaducidad,
                    int numeroLote, double precioVenta) {
        this.claveProducto = claveProducto;
        this.nombreProducto = nombreProducto;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;

        // Validación del Precio de Venta 
        if (precioVenta <= 0.0) {
            throw new IllegalArgumentException("El Precio de Venta debe ser mayor que 0.0");
        }
        this.precioVenta = precioVenta;
    }

    // --- Getters y Setters---
  
    
    /**
     * @return the claveProducto
     */
    public String getClaveProducto() {
        return claveProducto;
    }

    /**
     * @param claveProducto the claveProducto to set
     */
    public void setClaveProducto(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the numeroLote
     */
    public int getNumeroLote() {
        return numeroLote;
    }

    /**
     * @param numeroLote the numeroLote to set
     */
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    /**
     * @return the precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Establece el precio de venta con validación.
     * @param precioVenta El nuevo precio de venta (debe ser > 0).
     */
    public void setPrecioVenta(double precioVenta) {
        if (precioVenta <= 0.0) {
            throw new IllegalArgumentException("El Precio de Venta debe ser mayor que 0.0");
        }
        this.precioVenta = precioVenta;
    }
    
    
    // --- Método toString() ---
    
    /**
     * Devuelve una representación String del objeto Producto.
     * @return String con la información detallada del producto.
     */
    @Override
    public String toString() {
        return String.format("Clave del Producto: %s\n" +
                             "Descripcion: %s\n" +
                             "Fecha Caducidad: %s\n" +
                             "Num. de Lote: %d\n" +
                             "Precio de Venta: %.2f",
                             claveProducto, nombreProducto, fechaCaducidad,
                             numeroLote, precioVenta);
    }
    
}
