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
public class Perecederos extends ProductosModelo{
    
    private int diasACaducar;

    public Perecederos() {
        super();
        
    }
    
    public Perecederos(String nombre, double precio, int cantidadProductos, int diasACaducar) {
        super(nombre, precio, cantidadProductos);
        this.diasACaducar=diasACaducar;
        
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public void calcular(int cantidadProductos) {        
        double temp=0; 
        if (this.diasACaducar==1) {                       
            temp=super.getPrecio()/4;
            super.setPrecio(temp);               
        }
        else if (this.diasACaducar==2) {
            temp=super.getPrecio()/3;
            super.setPrecio(temp);
        }
        else if (this.diasACaducar==3) {
            temp=super.getPrecio()/2;
            super.setPrecio(temp);
        }        
        super.calcular(cantidadProductos); //To change body of generated methods, choose Tools | Templates.
    }
    
         
    
}
