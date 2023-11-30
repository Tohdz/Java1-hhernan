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
public class MecIncentivos extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();
    Connection connect = con.conectar();

    DefaultTableModel model = new DefaultTableModel();

    public MecIncentivos() {
        initComponents();
        modelotabla();
    }

    public void limpiar() {
        DefaultTableModel model = (DefaultTableModel) incent.getModel();
        model.setRowCount(0);
    }

    public void modelotabla() {
        model.addColumn("Nombre Mecanico");
        model.addColumn("Incentivo");
        incent.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        incent = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        mecBusc = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        incent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Mecanico", "Incentivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(incent);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Buscar mecanicos: ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mecBusc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mecBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mecBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mecBusc.removeAllItems();
        Statement busc = null;
        try {
            String sql = "SELECT nom_mec FROM mecanicos";
            busc = connect.createStatement();
            ResultSet rs = busc.executeQuery(sql);
            while (rs.next()) {
                String valor = rs.getString("nom_mec");
                mecBusc.addItem(valor);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Mecanicos no encontrados");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
        Statement busc = null;
        int cont = 0;
        try {
            String sql = "SELECT nom_mec FROM servicios";
            busc = connect.createStatement();
            ResultSet rs = busc.executeQuery(sql);
            String nomMec = "";
            while (rs.next()) {
                nomMec = rs.getString("nom_mec");
                if (nomMec.equalsIgnoreCase(mecBusc.getSelectedItem().toString())) {
                    cont += 1;
                }
            }
            String[] datos = {nomMec, String.valueOf(cont)};
            model.addRow(datos);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error al comparar empleados");
        }
        try {
            String nomMecActualizar = incent.getValueAt(0, 0).toString();
            String incentivoActualizar = incent.getValueAt(0, 1).toString();
            String sqlUpdate = "UPDATE mecanicos SET incentivo=? WHERE nom_mec=?";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, incentivoActualizar);
            preparedStatement.setString(2, nomMecActualizar);
            preparedStatement.executeUpdate();
            System.out.println(nomMecActualizar);
            System.out.println(incentivoActualizar);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error al actualizar incentivo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable incent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mecBusc;
    // End of variables declaration//GEN-END:variables
}
