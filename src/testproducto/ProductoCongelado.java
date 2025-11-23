/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproducto;

/**
 *
 * @author Samuel A
 */
public class ProductoCongelado extends Producto {
    
    // Atributo específico
    private double precioVenta;
    private double temperaturaCongelacion;
    
    /**
     * Constructor de la clase ProductoCongelado.
     * @param claveProducto Clave única del producto.
     * @param nombreProducto Nombre del producto.
     * @param fechaCaducidad Fecha de caducidad.
     * @param numeroLote Número de lote.
     * @param precioVenta Precio de venta.
     * @param temperaturaCongelacion Temperatura de congelación recomendada (debe ser < 0).
     */
    
    public ProductoCongelado(String claveProducto, String nombreProducto, 
            String fechaCaducidad, int numeroLote, double precioVenta,double temperaturaCongelacion) {
        
        // Llama al constructor de la superclase Producto
        super(claveProducto, nombreProducto, fechaCaducidad, numeroLote, precioVenta);
        
        // Validación de temperatura: Un producto congelado típicamente requiere T < 0
        if (temperaturaCongelacion >= 0.0) { 
            throw new IllegalArgumentException("La temperatura de congelacion debe ser menor a 0.0°C");
        }
        this.temperaturaCongelacion = temperaturaCongelacion;
    }
    
    // --- Getters Y Setters ---

    /**
     * @return the temperaturaCongelacion
     */
    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    /**
     * Establece la temperatura de congelación con validación.
     * @param temperaturaCongelacion La nueva temperatura (debe ser < 0).
     */
    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        if (temperaturaCongelacion >= 0.0) { 
            throw new IllegalArgumentException("La temperatura de congelacion debe ser menor a 0.0°C");
        }
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    // --- Método toString---

    /**
     * Devuelve una representación String del objeto ProductoCongelado.
     * @return String con la información detallada del producto congelado.
     */
    @Override
    public String toString() {
        return String.format("%s\n" +
                             "Temperatura de Congelacion Recomendada: %.2f °C",
                             super.toString(), temperaturaCongelacion);
    }
    
    
}
