/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.ControladorProductos;
import modelo.NoPerecederos;
import modelo.Perecederos;
import modelo.ProductosModelo;
import vista.VistaProductos;

/**
 *
 * @author Equipo
 */
public class ProductosPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perecederos moPed= new Perecederos();
        NoPerecederos moNoPed= new NoPerecederos();
        VistaProductos vi = new VistaProductos();
        ControladorProductos co = new ControladorProductos(moPed, moNoPed, vi);
        co.Iniciar();
        vi.setVisible(true);
    }
    
}
