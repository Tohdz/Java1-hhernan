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
public class VentCrudClient extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();
    Connection connect = con.conectar();

    public VentCrudClient() {
        initComponents();
        listar("clientes");
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
        model.addColumn("Placa");
        model.addColumn("Modelo");
        model.addColumn("Marca");
        model.addColumn("Color");
        model.addColumn("Año");
        model.addColumn("Combustible");
        model.addColumn("Especialidad");
        table_cli.setModel(model);
        String[] datos = new String[12];
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
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al extraer datos" + ex.getMessage());
        }
    }

    public void modificar() {
        int selectedRow = table_cli.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar una fila");
        } else {
            String id = textCedula.getText();
            String nom = textNombre.getText();
            String dir = textDireccion.getText();
            String tel = textTelefono.getText();
            String cor = textCorreo.getText();
            String plac = textPlaca.getText();
            String mod = textModelo.getText();
            String mar = textMarca.getText();
            String col = textColor.getText();
            String ano = textAno.getText();
            String com = textCombustible.getSelectedItem().toString();
            String esp = textEspecialidad.getSelectedItem().toString();
            try {
                String sql = "UPDATE clientes SET nombre_cli=?, direccion_cli=?, telefono_cli=?, correo_cli=?, placa_cli=?, modelo_cli=?, marca_cli=?, color_cli=?, año_cli=?, combustible_cli=?, especialidad_cli=? WHERE id_cli=?";
                PreparedStatement modi = connect.prepareStatement(sql);
                modi.setString(1, nom);
                modi.setString(2, dir);
                modi.setString(3, tel);
                modi.setString(4, cor);
                modi.setString(5, plac);
                modi.setString(6, mod);
                modi.setString(7, mar);
                modi.setString(8, col);
                modi.setString(9, ano);
                modi.setString(10, com);
                modi.setString(11, esp);
                modi.setInt(12, Integer.parseInt(id));
                modi.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente modificado con exito");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "Cliente no fue modificado");
            }
            textCedula.setText("");
            textNombre.setText("");
            textDireccion.setText("");
            textTelefono.setText("");
            textCorreo.setText("");
            textPlaca.setText("");
            textModelo.setText("");
            textMarca.setText("");
            textColor.setText("");
            textAno.setText("");
            listar("clientes");
        }
    }

    public void eliminar() {
        int selectedRow = table_cli.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar una fila");
        } else {
            try {
                String sql = "delete from clientes where placa_cli=?";
                String pla = textPlaca.getText();
                PreparedStatement del = connect.prepareStatement(sql);
                del.setString(1, pla);
                del.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "Cliente no fue eliminado");
            }
            textCedula.setText("");
            textNombre.setText("");
            textDireccion.setText("");
            textTelefono.setText("");
            textCorreo.setText("");
            textPlaca.setText("");
            textModelo.setText("");
            textMarca.setText("");
            textColor.setText("");
            textAno.setText("");
            textCedula.requestFocus();
            listar("clientes");
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_cli = new javax.swing.JTable();
        textMarca = new javax.swing.JTextField();
        textColor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textAno = new javax.swing.JTextField();
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
        jLabel12 = new javax.swing.JLabel();
        textCedula = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textCorreo = new javax.swing.JTextField();
        textPlaca = new javax.swing.JTextField();
        textModelo = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        textEspecialidad = new javax.swing.JComboBox<>();
        textCombustible = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CRUD Clientes");

        table_cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Placa", "Modelo", "Marca", "Color", "Año", "Combustible", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_cli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_cliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_cli);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Cedula:");

        textAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Direccion:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Placa:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Modelo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Marca:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Color:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Año:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Tipo de combustible:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Especialidad:");

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

        textCombustible.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel", "Gas LP" }));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(textTelefono)
                            .addComponent(textPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textNombre)
                            .addComponent(textDireccion)
                            .addComponent(textCedula))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAno)
                            .addComponent(textMarca)
                            .addComponent(textColor)
                            .addComponent(textEspecialidad, 0, 207, Short.MAX_VALUE)
                            .addComponent(textModelo)
                            .addComponent(textCombustible, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(167, 167, 167)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(textCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(textEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAnoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            PreparedStatement save = connect.prepareStatement("INSERT INTO clientes(id_cli,nombre_cli,direccion_cli,telefono_cli,correo_cli,placa_cli,modelo_cli,marca_cli,color_cli,año_cli,combustible_cli,especialidad_cli) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            save.setString(1, textCedula.getText());
            save.setString(2, textNombre.getText());
            save.setString(3, textDireccion.getText());
            save.setString(4, textTelefono.getText());
            save.setString(5, textCorreo.getText());
            save.setString(6, textPlaca.getText());
            save.setString(7, textModelo.getText());
            save.setString(8, textMarca.getText());
            save.setString(9, textColor.getText());
            save.setString(10, textAno.getText());
            save.setString(11, textCombustible.getSelectedItem().toString());
            save.setString(12, textEspecialidad.getSelectedItem().toString());
            save.execute();
            JOptionPane.showMessageDialog(null, "Cliente registrado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Cliente no fue registrado");
        }
        textCedula.setText("");
        textNombre.setText("");
        textDireccion.setText("");
        textTelefono.setText("");
        textCorreo.setText("");
        textPlaca.setText("");
        textModelo.setText("");
        textMarca.setText("");
        textColor.setText("");
        textAno.setText("");
        textCedula.requestFocus();
        listar("clientes");

    }//GEN-LAST:event_guardarActionPerformed

    private void table_cliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_cliMouseClicked
        int fila = table_cli.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un usuario");
        } else {
            String id = (String) table_cli.getValueAt(fila, 0);
            String nom = (String) table_cli.getValueAt(fila, 1);
            String dir = (String) table_cli.getValueAt(fila, 2);
            String tel = (String) table_cli.getValueAt(fila, 3);
            String cor = (String) table_cli.getValueAt(fila, 4);
            String plac = (String) table_cli.getValueAt(fila, 5);
            String mod = (String) table_cli.getValueAt(fila, 6);
            String mar = (String) table_cli.getValueAt(fila, 7);
            String col = (String) table_cli.getValueAt(fila, 8);
            String ano = (String) table_cli.getValueAt(fila, 9);
            textCedula.setText(id);
            textNombre.setText(nom);
            textDireccion.setText(dir);
            textTelefono.setText(tel);
            textCorreo.setText(cor);
            textPlaca.setText(plac);
            textModelo.setText(mod);
            textMarca.setText(mar);
            textColor.setText(col);
            textAno.setText(ano);
        }
    }//GEN-LAST:event_table_cliMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable table_cli;
    private javax.swing.JTextField textAno;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textColor;
    private javax.swing.JComboBox<String> textCombustible;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JComboBox<String> textEspecialidad;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
