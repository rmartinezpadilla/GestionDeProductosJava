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
public class NoPerecederos extends ProductosModelo{
    private String tipo;

    public NoPerecederos() {
        super();        
    }
    
    public NoPerecederos(String nombre, double precio,  int cantidadProductos, String tipo) {
        super(nombre, precio, cantidadProductos);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void calcular(int cantidadProductos) {
        super.calcular(cantidadProductos); //To change body of generated methods, choose Tools | Templates.
        
    }

   
    
    
    
    
    
}
