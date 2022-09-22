/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.NoPerecederos;
import modelo.Perecederos;
import modelo.ProductosModelo;
import vista.VistaProductos;

/**
 *
 * @author Equipo
 */
public class ControladorProductos implements ActionListener{
    
    private Perecederos moPed;
    private NoPerecederos moNoPed;
    private VistaProductos vi;
    
      // ArrayList de objetos productos. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<ProductosModelo> misListaProductos = new ArrayList<ProductosModelo>();
        DefaultTableModel modeloTabla;
        
        //variables locales
    String nombre, tipo;
    double precio=0, totalAPagar=0;
    int dias, cantidadProductosPerecederos=0, cantidadProductosNoPerecederos=0, cantidad=0, cantidadTotalDeProductos=0;    
         
    public ControladorProductos(Perecederos moPed, NoPerecederos moNoPed, VistaProductos vi) {
        this.moPed = moPed;
        this.moNoPed = moNoPed;
        this.vi = vi;
        
        
        this.vi.btnGuardar.addActionListener(this);        
        this.vi.btnSalir.addActionListener(this);
        this.vi.btnNuevo.addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource()==vi.btnSalir) {
            System.exit(0);
        }        
        else if (ae.getSource()==vi.btnNuevo) {
            habilitarCampos();
            limpiarCampos();
            vi.btnNuevo.setEnabled(false);
        }
        else if (ae.getSource()==vi.btnGuardar) {
                    
            if (!estanVacios() || selectVacios()) {
                     JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
            }else{
                        if (!isNumeric(vi.txtPrecioProducto.getText()) || !isTexto(vi.txtNombreProducto.getText()) || !isNumeric(vi.txtCantidad.getText())) {
                            JOptionPane.showMessageDialog(null, "Por favor revisar los datos insertados");
                }else{
                                nombre = vi.txtNombreProducto.getText();
                                precio = Double.parseDouble(vi.txtPrecioProducto.getText());
                                dias = Integer.parseInt(vi.jbxDias.getSelectedItem().toString());   
                                cantidad = Integer.parseInt(vi.txtCantidad.getText());
                                tipo = vi.jbxTipoDeProducto.getSelectedItem().toString();
             
                    if (vi.rbPerecedero.isSelected()) {
                   // miArrayPerecederos[cantidadProductosPerecederos] = new Perecederos(nombre, precio, dias); 
                   
                                vi.jbxDias.setEnabled(true);   
                                vi.jlTitleDias.setEnabled(true);
                                vi.btnGuardar.setEnabled(true);                    
                                vi.rbNoPerecedero.setEnabled(false);
                                Perecederos miProductoPerecedero = new Perecederos(nombre, precio, cantidad, dias);
                                miProductoPerecedero.calcular(cantidad);
                                totalAPagar=totalAPagar+miProductoPerecedero.getTotalAPagar();
                                misListaProductos.add(miProductoPerecedero);
                                vi.btnGuardar.setEnabled(false);                    
                                cantidadProductosPerecederos++;                                       
                        }else if (vi.rbNoPerecedero.isSelected()) {
                 
                                vi.jbxDias.setEnabled(false);   
                                vi.jlTitleDias.setEnabled(false);
                                vi.btnGuardar.setEnabled(true);                    
                                vi.rbPerecedero.setEnabled(false);
                                //System.out.println("voy bien");
                                NoPerecederos miProductoNoPerecedero = new NoPerecederos(nombre, precio, cantidad, tipo);
                                miProductoNoPerecedero.calcular(cantidad);
                                totalAPagar=totalAPagar+miProductoNoPerecedero.getTotalAPagar();
                                misListaProductos.add(miProductoNoPerecedero);                   
                                vi.btnGuardar.setEnabled(false);                    
                                cantidadProductosNoPerecederos++;                                                          
             }
                                
                                cantidadTotalDeProductos++;
                                inhabilitarCampos();                        
                                vi.btnNuevo.setEnabled(true);                          
                                limpiarTabla();
                                listarEnTabla();
                                vi.lblCantidadPerecederos.setText(String.valueOf(cantidadProductosPerecederos));
                                vi.lblCantidadNoPerecederos.setText(String.valueOf(cantidadProductosNoPerecederos));
                                vi.lblTotalAPagar.setText(String.valueOf(totalAPagar));
                                vi.lblCantidadTotal.setText(String.valueOf(cantidadTotalDeProductos));
                        }
                        
                                                                       
            }
                        
                     
        }
                        
       
    }
    
    
    public boolean estanVacios() {
        return !vi.txtNombreProducto.getText().isEmpty()&& !vi.txtPrecioProducto.getText().isEmpty()
                && !vi.txtCantidad.getText().isEmpty();
    }
    
    
    public boolean selectVacios(){
        boolean rpta=false;
        
        if (vi.rbNoPerecedero.isSelected()==false && vi.rbPerecedero.isSelected()==false) {
            rpta=true;
        }
        return  rpta;
        
    }
          
     public void inhabilitarCampos() {
         vi.txtNombreProducto.setEnabled(false);
         vi.txtPrecioProducto.setEnabled(false);
         vi.txtCantidad.setEnabled(false);
         vi.jbxDias.setEnabled(false);
         vi.jbxTipoDeProducto.setEnabled(false);
         vi.rbPerecedero.setEnabled(false);
         vi.rbNoPerecedero.setEnabled(false);                  
     }
     
     public void habilitarCampos() {
         vi.txtNombreProducto.setEnabled(true);
         vi.txtPrecioProducto.setEnabled(true);   
         vi.txtCantidad.setEnabled(true); 
         vi.rbPerecedero.setEnabled(true);
         vi.rbNoPerecedero.setEnabled(true);  
         vi.btnGuardar.setEnabled(true);
         vi.jbxDias.setEnabled(true);
           vi.jbxTipoDeProducto.setEnabled(true);
     }
    
     public void limpiarCampos(){
        vi.txtNombreProducto.setText("");
        vi.txtPrecioProducto.setText("");
        vi.txtCantidad.setText("");
        vi.rbNoPerecedero.setSelected(false);
        vi.rbPerecedero.setSelected(false);
        vi.jbxDias.setSelectedIndex(0);
        
    }
     
     public void listarEnTabla(){
         modeloTabla = (DefaultTableModel) vi.tblMiTabla.getModel();
         Object[] ob = new  Object[4];
         
         for (int i = 0; i < misListaProductos.size(); i++) {
             ob[0] = misListaProductos.get(i).getNombre();
             ob[1] = misListaProductos.get(i).getPrecio();
             ob[2] = misListaProductos.get(i).getCantidadProductos();
             ob[3] = misListaProductos.get(i).getTotalAPagar();
             modeloTabla.addRow(ob);
         }
         
         vi.tblMiTabla.setModel(modeloTabla);
     }
     
     public void limpiarTabla(){
    DefaultTableModel temp = (DefaultTableModel) vi.tblMiTabla.getModel();
    int filas = vi.tblMiTabla.getRowCount();

    for (int a = 0; filas > a; a++) {
        temp.removeRow(0);
    }
}
     
     private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
     
     private static boolean isTexto(String cadena){
	try {
		Integer.parseInt(cadena);
		return false;
	} catch (NumberFormatException nfe){
		return true;
	}
}
     
    public void Iniciar(){
        vi.setTitle("PRODUCTOS");
        vi.setLocationRelativeTo(null);
        
    }

    private void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
