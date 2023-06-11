/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lacostaentucasa.Vista;

import com.mycompany.lacostaentucasa.Controlador.Controlador_empleado_laboral;
import com.mycompany.lacostaentucasa.Controlador.Controlador_pantallas;
import com.mycompany.lacostaentucasa.Modelo.Empleado_laboral;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeffrey Hernandez
 */
public class Vista_Empleado_laboral extends javax.swing.JFrame {

    /**
     * Creates new form Vista_menu
     */
    public Vista_Empleado_laboral() {
        initComponents();
        cargar_modelo_empleado_laboral();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_doc_empleado = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_numero_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_empleado_laboral = new javax.swing.JTable();
        btn_registrar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        txt_buscar_por = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btn_volver_menu = new javax.swing.JButton();
        txt_fecha_nacimiento = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_id_tipo_empleado = new javax.swing.JTextField();
        txt_id_sucursal = new javax.swing.JTextField();
        txt_id_sistema_social = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });

        jLabel1.setText("Doc Empleado");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Número Telefono");

        jLabel5.setText("Dirección");

        jLabel6.setText("Fecha Nacimiento");

        jLabel7.setText("Email");

        jLabel8.setText("Id Tipo Empleado");

        jLabel9.setText("Id Sucursal");

        jLabel10.setText("Id Sistema Social");

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Empleado Laboral");

        tbl_empleado_laboral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_empleado_laboral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleado_laboralMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_empleado_laboral);

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_listar.setText("Listar");
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jButton8.setText("Buscar Por ID");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        btn_volver_menu.setText("Volver a Menu");
        btn_volver_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver_menuActionPerformed(evt);
            }
        });

        txt_fecha_nacimiento.setText("yyyy-mm-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(370, 370, 370))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_numero_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_doc_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_eliminar)
                                    .addComponent(btn_actualizar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_buscar_por, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id_sistema_social, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id_tipo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registrar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_listar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8)))
                        .addGap(84, 84, 84)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_volver_menu)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_doc_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_numero_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(btn_registrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_listar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_actualizar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_id_tipo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_id_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_id_sistema_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_buscar_por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btn_volver_menu)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    DefaultTableModel modelo_empleado_laboral = new DefaultTableModel();
    private void cargar_modelo_empleado_laboral(){
    modelo_empleado_laboral.addColumn("doc_Empleado_Laboral");
    modelo_empleado_laboral.addColumn("nombres");
    modelo_empleado_laboral.addColumn("apellidos");
    modelo_empleado_laboral.addColumn("numero_telefonico");
    modelo_empleado_laboral.addColumn("direccion");
    modelo_empleado_laboral.addColumn("fecha_nacimiento");
    modelo_empleado_laboral.addColumn("email");
    modelo_empleado_laboral.addColumn("id_tipo_empleado");
    modelo_empleado_laboral.addColumn("id_Sucursal");
    modelo_empleado_laboral.addColumn("id_sistema_social");
    
    tbl_empleado_laboral.setModel(modelo_empleado_laboral);
    }
    private void limpiar_espacios(){
        String lmp = "";
        txt_apellidos.setText(lmp);
        txt_direccion.setText(lmp);
        txt_doc_empleado.setText(lmp);
        txt_email.setText(lmp);
        txt_fecha_nacimiento.setText(lmp);
        txt_id_sistema_social.setText(lmp);
        txt_id_tipo_empleado.setText(lmp);
        txt_numero_telefono.setText(lmp);
        txt_nombres.setText(lmp);
        txt_id_sucursal.setText(lmp);
    }
    private void cargar_datos_en_txt(){
        int fila_select = tbl_empleado_laboral.getSelectedRow();
        if (fila_select >= 0){
            txt_doc_empleado.setText((tbl_empleado_laboral.getValueAt(fila_select, 0)).toString());
            txt_nombres.setText((tbl_empleado_laboral.getValueAt(fila_select, 1)).toString());
            txt_apellidos.setText((tbl_empleado_laboral.getValueAt(fila_select, 2)).toString());
            txt_numero_telefono.setText((tbl_empleado_laboral.getValueAt(fila_select, 3)).toString());
            txt_direccion.setText((tbl_empleado_laboral.getValueAt(fila_select, 4)).toString());
            txt_fecha_nacimiento.setText((tbl_empleado_laboral.getValueAt(fila_select, 5)).toString());
            txt_email.setText((tbl_empleado_laboral.getValueAt(fila_select, 6)).toString());
            txt_id_tipo_empleado.setText((tbl_empleado_laboral.getValueAt(fila_select, 7)).toString());
            txt_id_sucursal.setText((tbl_empleado_laboral.getValueAt(fila_select, 8)).toString());
            txt_id_sistema_social.setText((tbl_empleado_laboral.getValueAt(fila_select, 9)).toString());
        }
        txt_doc_empleado.setEnabled(false);
    }
    
    
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        int doc_Empleado_Laboral = Integer.parseInt(txt_doc_empleado.getText());
        String nombres=txt_nombres.getText();
        String apellidos=txt_apellidos.getText();
        String numero_telefonico=txt_numero_telefono.getText();
        String direccion=txt_direccion.getText();
        String fecha_nacimiento=txt_fecha_nacimiento.getText();
        String email=txt_email.getText();
        int id_tipo_empleado=Integer.parseInt(txt_id_tipo_empleado.getText());
        int id_Sucursal=Integer.parseInt(txt_id_sucursal.getText());
        int id_sistema_social=Integer.parseInt(txt_id_sistema_social.getText());
        
        Empleado_laboral emp = new Empleado_laboral(doc_Empleado_Laboral,nombres,apellidos,numero_telefonico,direccion,fecha_nacimiento,email,id_tipo_empleado,id_Sucursal,id_sistema_social);
        Controlador_empleado_laboral.guardar_empleado_laboral(emp);
        
        Controlador_empleado_laboral.cargar_empleado_laboral(tbl_empleado_laboral, modelo_empleado_laboral);
        limpiar_espacios();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        // TODO add your handling code here:
        Controlador_empleado_laboral.cargar_empleado_laboral(tbl_empleado_laboral, modelo_empleado_laboral);
    }//GEN-LAST:event_btn_listarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Id a eliminar"));
        Controlador_empleado_laboral.eliminar_empleado_laboral(id, tbl_empleado_laboral, modelo_empleado_laboral);
        Controlador_empleado_laboral.cargar_empleado_laboral(tbl_empleado_laboral, modelo_empleado_laboral);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        int doc_Empleado_Laboral = Integer.parseInt(txt_doc_empleado.getText());
        String nombres=txt_nombres.getText();
        String apellidos=txt_apellidos.getText();
        String numero_telefonico=txt_numero_telefono.getText();
        String direccion=txt_direccion.getText();
        String fecha_nacimiento=txt_fecha_nacimiento.getText();
        String email=txt_email.getText();
        int id_tipo_empleado=Integer.parseInt(txt_id_tipo_empleado.getText());
        int id_Sucursal=Integer.parseInt(txt_id_sucursal.getText());
        int id_sistema_social=Integer.parseInt(txt_id_sistema_social.getText());
        
        Empleado_laboral emp = new Empleado_laboral(doc_Empleado_Laboral,nombres,apellidos,numero_telefonico,direccion,fecha_nacimiento,email,id_tipo_empleado,id_Sucursal,id_sistema_social);
        Controlador_empleado_laboral.actualizar_empleado_laboral(emp);
        
        Controlador_empleado_laboral.cargar_empleado_laboral(tbl_empleado_laboral, modelo_empleado_laboral);
        limpiar_espacios();
        txt_doc_empleado.setEnabled(true);
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txt_buscar_por.getText());
        Controlador_empleado_laboral.buscar_empleado_laboral(tbl_empleado_laboral, modelo_empleado_laboral, id);
        txt_buscar_por.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btn_volver_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_menuActionPerformed
        // TODO add your handling code here:
        Controlador_pantallas.abrir_pantalla_menu();
        Controlador_pantallas.cerrar_pantalla_empleado();
    }//GEN-LAST:event_btn_volver_menuActionPerformed

    private void tbl_empleado_laboralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleado_laboralMouseClicked
        // TODO add your handling code here:
        cargar_datos_en_txt();
    }//GEN-LAST:event_tbl_empleado_laboralMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Empleado_laboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Empleado_laboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Empleado_laboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Empleado_laboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Empleado_laboral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_volver_menu;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_empleado_laboral;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_buscar_por;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_doc_empleado;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fecha_nacimiento;
    private javax.swing.JTextField txt_id_sistema_social;
    private javax.swing.JTextField txt_id_sucursal;
    private javax.swing.JTextField txt_id_tipo_empleado;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_numero_telefono;
    // End of variables declaration//GEN-END:variables
}
