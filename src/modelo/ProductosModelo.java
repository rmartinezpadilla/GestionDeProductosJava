/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Equipo
 */
public class ProductosModelo {
    
private String nombre;
private double precio;
private int cantidadProductos;
private double totalAPagar;


    public ProductosModelo() {
            }

    public ProductosModelo(String nombre, double precio, int cantidadProductos) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadProductos =cantidadProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }
    
    

public void calcular(int cantidadProductos){
    double temp=0;    
    temp= cantidadProductos*this.precio;    
   this.totalAPagar=temp;
}


    
}
