/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.ImageIcon;

/**
 *
 * @author Equipo
 */
public class VistaProductos extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductos
     */
    public VistaProductos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../img/icons8-google-tag-manager-48.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTiposDeProductos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        rbPerecedero = new javax.swing.JRadioButton();
        rbNoPerecedero = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jbxDias = new javax.swing.JComboBox<>();
        jlTitleDias = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jbxTipoDeProducto = new javax.swing.JComboBox<>();
        jlTitleDias1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMiTabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCantidadPerecederos = new javax.swing.JLabel();
        lblCantidadNoPerecederos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCantidadTotal = new javax.swing.JLabel();
        btnCrearPDF = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblTotalAPagar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("PRECIO ($)");

        txtNombreProducto.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        txtPrecioProducto.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        btnGroupTiposDeProductos.add(rbPerecedero);
        rbPerecedero.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        rbPerecedero.setForeground(new java.awt.Color(255, 0, 51));
        rbPerecedero.setText("Perecedero");
        rbPerecedero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rbPerecederoFocusLost(evt);
            }
        });
        rbPerecedero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbPerecederoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbPerecederoMouseExited(evt);
            }
        });

        btnGroupTiposDeProductos.add(rbNoPerecedero);
        rbNoPerecedero.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        rbNoPerecedero.setForeground(new java.awt.Color(255, 0, 51));
        rbNoPerecedero.setText("No Perecedero");
        rbNoPerecedero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rbNoPerecederoFocusLost(evt);
            }
        });
        rbNoPerecedero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNoPerecederoMouseClicked(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-save-file-64.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusPainted(false);

        btnSalir.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cerrar-ventana-48.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);

        jbxDias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbxDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jbxDias.setEnabled(false);

        jlTitleDias.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jlTitleDias.setForeground(new java.awt.Color(51, 102, 255));
        jlTitleDias.setText("Dias");
        jlTitleDias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aksajs(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-agregar-archivo-64.png"))); // NOI18N
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setEnabled(false);
        btnNuevo.setFocusPainted(false);

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("CANTIDAD");

        txtCantidad.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jbxTipoDeProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbxTipoDeProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Granos", "Verduras", "Frutas", "Productos lácteos", "Proteínas" }));
        jbxTipoDeProducto.setEnabled(false);

        jlTitleDias1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jlTitleDias1.setForeground(new java.awt.Color(51, 102, 255));
        jlTitleDias1.setText("Tipo");
        jlTitleDias1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aksajs(evt);
            }
        });

        tblMiTabla.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        tblMiTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad", "Total a Pagar"
            }
        ));
        jScrollPane1.setViewportView(tblMiTabla);

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Perecededos:");

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("No Perecededos:");

        lblCantidadPerecederos.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblCantidadPerecederos.setForeground(new java.awt.Color(255, 0, 51));
        lblCantidadPerecederos.setText("####");

        lblCantidadNoPerecederos.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblCantidadNoPerecederos.setForeground(new java.awt.Color(255, 0, 51));
        lblCantidadNoPerecederos.setText("####");

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("Total Productos:");

        lblCantidadTotal.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblCantidadTotal.setForeground(new java.awt.Color(255, 0, 51));
        lblCantidadTotal.setText("####");

        btnCrearPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pdf-64.png"))); // NOI18N
        btnCrearPDF.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("TOTAL A PAGAR:");

        lblTotalAPagar.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        lblTotalAPagar.setForeground(new java.awt.Color(255, 0, 51));
        lblTotalAPagar.setText("####");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPerecedero)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitleDias)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNoPerecedero))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btnCrearPDF)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTitleDias1)
                            .addComponent(jbxTipoDeProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(53, 53, 53))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNombreProducto)
                                .addGap(7, 7, 7)
                                .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(71, 71, 71)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadNoPerecederos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCantidadPerecederos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalAPagar)
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTitleDias)
                            .addComponent(jlTitleDias1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPerecedero)
                            .addComponent(rbNoPerecedero)
                            .addComponent(jbxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbxTipoDeProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(btnSalir))
                                    .addComponent(btnNuevo)
                                    .addComponent(btnCrearPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 9, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblCantidadPerecederos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblCantidadNoPerecederos))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblCantidadTotal)
                    .addComponent(lblTotalAPagar))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("PRODUCTOS");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-google-tag-manager-48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aksajs(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aksajs
        // TODO add your handling code here:
    }//GEN-LAST:event_aksajs

    private void rbPerecederoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPerecederoMouseClicked
        // TODO add your handling code here:
        jbxDias.setEnabled(true);
    }//GEN-LAST:event_rbPerecederoMouseClicked

    private void rbPerecederoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPerecederoMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_rbPerecederoMouseExited

    private void rbPerecederoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbPerecederoFocusLost
        // TODO add your handling code here:
        jbxDias.setEnabled(false);
    }//GEN-LAST:event_rbPerecederoFocusLost

    private void rbNoPerecederoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNoPerecederoMouseClicked
        // TODO add your handling code here:
        jbxTipoDeProducto.setEnabled(true);
    }//GEN-LAST:event_rbNoPerecederoMouseClicked

    private void rbNoPerecederoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbNoPerecederoFocusLost
        // TODO add your handling code here:
        jbxTipoDeProducto.setEnabled(false);
    }//GEN-LAST:event_rbNoPerecederoFocusLost

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrearPDF;
    private javax.swing.ButtonGroup btnGroupTiposDeProductos;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> jbxDias;
    public javax.swing.JComboBox<String> jbxTipoDeProducto;
    public javax.swing.JLabel jlTitleDias;
    public javax.swing.JLabel jlTitleDias1;
    public javax.swing.JLabel lblCantidadNoPerecederos;
    public javax.swing.JLabel lblCantidadPerecederos;
    public javax.swing.JLabel lblCantidadTotal;
    public javax.swing.JLabel lblTotalAPagar;
    public javax.swing.JRadioButton rbNoPerecedero;
    public javax.swing.JRadioButton rbPerecedero;
    public javax.swing.JTable tblMiTabla;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
