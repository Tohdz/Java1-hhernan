/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hhern
 */
public class VentCrudEmple extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();
    Connection connect = con.conectar();

    public VentCrudEmple() {
        initComponents();
        listar("mecanicos");
    }

    public void listar(String tabla) {
        String sql = "select * from " + tabla;
        Statement St;
        Conexion cone = new Conexion();
        Connection conexion = cone.conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Identificacion");
        model.addColumn("Nombre");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Correo");
        model.addColumn("Especialidad");
        model.addColumn("% incentivos");
        table_mec.setModel(model);
        String[] datos = new String[7];
        try {
            St = conexion.createStatement();
            ResultSet rs = St.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al extraer datos" + ex.getMessage());
        }
    }

    public void modificar() {
        int selectedRow = table_mec.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar una fila");
        } else {
            String id = textCedula.getText();
            String nom = textNombre.getText();
            String dir = textDireccion.getText();
            String tel = textTelefono.getText();
            String cor = textCorreo.getText();
            String esp = textEspecialidad.getSelectedItem().toString();
            try {
                String sql = "UPDATE mecanicos SET nom_mec=?, dir_mec=?, tel_mec=?, corr_mec=?, esp_mec=? WHERE id_mec=?";
                PreparedStatement modi = connect.prepareStatement(sql);
                modi.setString(1, nom);
                modi.setString(2, dir);
                modi.setString(3, tel);
                modi.setString(4, cor);
                modi.setString(5, esp);
                modi.setInt(6, Integer.parseInt(id));
                modi.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado modificado con exito");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "Empleado no fue modificado");
            }
            textCedula.setText("");
            textNombre.setText("");
            textDireccion.setText("");
            textTelefono.setText("");
            textCorreo.setText("");
            listar("mecanicos");
        }
    }

    public void eliminar() {
        int selectedRow = table_mec.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar una fila");
        } else {
            try {
                String sql = "delete from mecanicos where id_mec=?";
                int id = Integer.parseInt(textCedula.getText());
                PreparedStatement del = connect.prepareStatement(sql);
                del.setInt(1, id);
                del.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado eliminado con exito");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "Empleado no fue eliminado");
            }
            textCedula.setText("");
            textNombre.setText("");
            textDireccion.setText("");
            textTelefono.setText("");
            textCorreo.setText("");
            listar("mecanicos");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textCedula = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        textCorreo = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        textEspecialidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_mec = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CRUD Empleados");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textEspecialidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Direccion:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Correo:");

        table_mec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Especialidad", "% incentivos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_mec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_mecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_mec);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Cedula:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Especialidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(textTelefono)
                            .addComponent(textNombre)
                            .addComponent(textDireccion)
                            .addComponent(textCedula))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(437, 437, 437))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            PreparedStatement save = connect.prepareStatement("INSERT INTO mecanicos(id_mec,nom_mec,dir_mec,tel_mec,corr_mec,esp_mec,incentivo) VALUES(?,?,?,?,?,?,?)");
            save.setString(1, textCedula.getText());
            save.setString(2, textNombre.getText());
            save.setString(3, textDireccion.getText());
            save.setString(4, textTelefono.getText());
            save.setString(5, textCorreo.getText());
            save.setString(6, textEspecialidad.getSelectedItem().toString());
            save.setInt(7, 0);
            save.execute();
            JOptionPane.showMessageDialog(null, "Empleado registrado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Empleado no fue registrado");
        }
        textCedula.setText("");
        textNombre.setText("");
        textDireccion.setText("");
        textTelefono.setText("");
        textCorreo.setText("");
        listar("mecanicos");
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table_mecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_mecMouseClicked
        int fila = table_mec.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un usuario");
        } else {
            String id = (String) table_mec.getValueAt(fila, 0);
            String nom = (String) table_mec.getValueAt(fila, 1);
            String dir = (String) table_mec.getValueAt(fila, 2);
            String tel = (String) table_mec.getValueAt(fila, 3);
            String cor = (String) table_mec.getValueAt(fila, 4);
            textCedula.setText(id);
            textNombre.setText(nom);
            textDireccion.setText(dir);
            textTelefono.setText(tel);
            textCorreo.setText(cor);
        }
    }//GEN-LAST:event_table_mecMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable table_mec;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JComboBox<String> textEspecialidad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
