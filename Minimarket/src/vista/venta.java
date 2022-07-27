/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import bd.Conexion;
import com.sun.glass.events.KeyEvent;
import controlador.Registro;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Producto;
import modelo.Venta;
import modelo.detVenta;



/**
 *
 * @author JoTa
 */
public class venta extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();
    Registro reg = new Registro ();
    Producto pro = new Producto();
    Cliente cli = new Cliente ();
    detVenta detvent = new detVenta();
    public int boleta,precio,total,id,item,cantidad,pagoTotal,idrun;
    public String nombre;
    public boolean efectivo;
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    /**
     * Creates new form Ventas
     */
    public venta() {
        this.setContentPane(fondo);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(null);
        this.setTitle("Minimarket DuocUC");
        
        DefaultComboBoxModel modeloProducto = new DefaultComboBoxModel(pro.mostrarProductos());
        cmboProducto.setModel(modeloProducto);
        DefaultComboBoxModel modeloCliente = new DefaultComboBoxModel(cli.mostrarProductos());
        cmboCliente.setModel(modeloCliente);
        
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmboProducto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnFinVent = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txtTotalcant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmboCliente = new javax.swing.JComboBox<>();
        cbxEfectivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venta de Productos");

        cmboProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboProductoItemStateChanged(evt);
            }
        });
        cmboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboProductoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio Producto");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecciona Producto");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnFinVent.setText("Finalizar Venta");
        btnFinVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinVentActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio Total Venta");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProducto", "Nombre Producto", "Cantidad", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total  por cantidad");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selecione Cliente");

        cmboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboClienteItemStateChanged(evt);
            }
        });
        cmboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboClienteActionPerformed(evt);
            }
        });

        cbxEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        cbxEfectivo.setText("Pago en efectivo");
        cbxEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEfectivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel7))
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(cmboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxEfectivo)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 198, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFinVent, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(txtTotalcant)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel7)
                    .addComponent(cmboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEfectivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinVent)
                    .addComponent(btnVolver))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboProductoActionPerformed
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_cmboProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
                nombre = pro.getNombre();
        if (!"".equals(txtCantidad.getText())) {
            if (!"".equals(txtTotalcant.getText())) {
                item = item + 1;
                modelo = (DefaultTableModel)tblProductos.getModel();
                for (int i = 0; i < tblProductos.getRowCount(); i++) {
                      
                }
                
                ArrayList lista = new ArrayList();
                lista.add(item);
                lista.add(id);
                lista.add(nombre);
                lista.add(cantidad);
                lista.add(precio);
                lista.add(total);
                Object[] obj = new Object[]{
                    lista.get(1),lista.get(2),lista.get(3),lista.get(4),lista.get(5)
                };
                modelo.addRow(obj);
                tblProductos.setModel(modelo);
                pagoTotal = pagoTotal + total;
                txtTotal.setText(""+pagoTotal);
                }else{
                    JOptionPane.showMessageDialog(null,"Precione Enter en Cantidad de Producto para asignar Precio");
                    txtCantidad.requestFocus();
        }
                
        } else{
            JOptionPane.showMessageDialog(null,"Ingrese Cantidad de Producto");
            txtCantidad.requestFocus();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void cmboProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboProductoItemStateChanged
        // TODO add your handling code here:
        
         if (evt.getStateChange() == ItemEvent.SELECTED){
            Producto pr =(Producto) cmboProducto.getSelectedItem();
            
            id = pr.getIdproducto();
            pro = reg.buscarPorIdProducto(id);
            txtPrecio.setText(""+ pro.getPrecio());
            precio = pro.getPrecio();
        }
    }//GEN-LAST:event_cmboProductoItemStateChanged

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        // TODO add your handling code here:
     if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            if(!"".equals(txtCantidad.getText())){
                cantidad = Integer.parseInt(txtCantidad.getText());
                total = precio * cantidad;
                txtTotalcant.setText(""+total);
                
                }else{
                 JOptionPane.showMessageDialog(null,"Ingrese Cantidad de Producto");
                 txtCantidad.requestFocus();
                }
            
   
     }
        
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnFinVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinVentActionPerformed
        // TODO add your handling code here:
        Registro rg = new Registro();
        if (tblProductos.getRowCount()>0){
            
            efectivo = cbxEfectivo.isSelected();
            Venta nuevoVenta = new Venta(new Date(),0,idrun,pagoTotal,efectivo);
            rg.agregarVenta(nuevoVenta); 
            List<Venta> lista = rg.ultimaboleta();

            for (Venta tmp : lista) {
                boleta = tmp.getIdventa() ;
            }
               
            
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                Conexion conexion1 = new Conexion();
                Connection cnx = conexion1.obtenerConexion();
            
                  String query =("INSERT INTO detventa(idventa, idproducto, cantidad, preciouni) VALUES ("+boleta+","+tblProductos.getValueAt(i, 0)+","+tblProductos.getValueAt(i, 2)+","+tblProductos.getValueAt(i, 3)+")");
                try {              
                    PreparedStatement stmt = cnx.prepareStatement(query);
                    stmt.executeUpdate();
                    stmt.close();
                } catch (SQLException e) {
                     System.out.println("Error SQL al agregar Detalle Venta" + e.getMessage());
                }
                    }
                JOptionPane.showMessageDialog(this, "Se agregó Venta con la boleta Numero " + boleta, "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                  JOptionPane.showMessageDialog(this,"La tabla se encuentra vacia");  
                }
    }//GEN-LAST:event_btnFinVentActionPerformed

    private void cmboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboClienteActionPerformed

    private void cmboClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboClienteItemStateChanged
        // TODO add your handling code here:
         if (evt.getStateChange() == ItemEvent.SELECTED){
            Cliente cl =(Cliente) cmboCliente.getSelectedItem();
            
            idrun = cl.getIdrun();
            cli = reg.buscarPorIdCliente(id);
        }
    }//GEN-LAST:event_cmboClienteItemStateChanged

    private void cbxEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEfectivoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFinVent;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox cbxEfectivo;
    private javax.swing.JComboBox<String> cmboCliente;
    private javax.swing.JComboBox<String> cmboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalcant;
    // End of variables declaration//GEN-END:variables

            class FondoPanel extends JPanel{
        private Image img;
        
        @Override
        public void paint (Graphics g){
        img = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")).getImage();
        
        g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
        
        setOpaque(false);
        
        super.paint(g);
    }
        
    }



}