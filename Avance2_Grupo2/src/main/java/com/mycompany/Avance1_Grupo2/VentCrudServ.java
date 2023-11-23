/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hhern
 */
public class VentCrudServ extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();
    Connection connect = con.conectar();

    public VentCrudServ() {
        initComponents();
        listar("servicios");
    }

    public void calendar() {
        Date fecha = date.getDate();
        long fech = fecha.getTime();
        java.sql.Date fecha_sql = new java.sql.Date(fech);

    }

    public void listar(String tabla) {
        String sql = "select * from " + tabla;
        Statement St;
        Conexion cone = new Conexion();
        Connection conexion = cone.conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Identificador");
        model.addColumn("Nombre cliente");
        model.addColumn("Placa");
        model.addColumn("Nombre mecanico");
        model.addColumn("Especialidad");
        model.addColumn("Servicios");
        model.addColumn("Sub servicios");
        model.addColumn("Precio");
        model.addColumn("Fecha");
        model.addColumn("Hora");
        table_esp.setModel(model);
        String[] datos = new String[10];
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
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al extraer datos" + ex.getMessage());
        }
    }

    public void modificar() {
        int selectedRow = table_esp.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar una fila");
        } else {
            int fila = table_esp.getSelectedRow();
            String txt = precio.getText();
            String txt2 = (String) table_esp.getValueAt(fila, 2);
            try {
                String sql = "UPDATE servicios SET pre=? WHERE plac_cli=?";
                PreparedStatement modi = connect.prepareStatement(sql);
                modi.setString(1, txt);
                modi.setString(2, txt2);
                modi.executeUpdate();
                JOptionPane.showMessageDialog(null, "Servicio modificado con exito");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "Servicio no modificado");
            }
            precio.setText("");
            listar("servicios");
        }
    }

    public void eliminar() {
        int selectedRow = table_esp.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar una fila");
        } else {
            try {
                int fila = table_esp.getSelectedRow();
                String sql = "delete from servicios where ident=?";
                String iden = (String)table_esp.getValueAt(fila, 0);
                PreparedStatement del = connect.prepareStatement(sql);
                del.setString(1, iden);
                del.executeUpdate();
                JOptionPane.showMessageDialog(null, "Servicio  eliminado con exito");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "Servicio no eliminado");
            }
            precio.setText("");
            listar("servicios");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table_cli1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Especialidades = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        placaBusc = new javax.swing.JComboBox<>();
        mecBusc = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        servBusc = new javax.swing.JComboBox<>();
        subBusc = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_esp = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        precio = new javax.swing.JTextField();
        hora = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();

        table_cli1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Placa", "Modelo", "Marca", "Color", "Año", "Combustible", "Especialidad"
            }
        ));
        table_cli1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_cli1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_cli1);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CRUD Servicios");

        Especialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Especialidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos" }));
        Especialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialidadesActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Busqueda de Placas:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Busqueda de mecanicos:");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        placaBusc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        placaBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaBuscActionPerformed(evt);
            }
        });

        mecBusc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Busqueda de servicios:");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Busqueda de Subservicios:");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        servBusc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        subBusc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        table_esp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre cliente", "Placa", "Nombre mecanico", "Especialidad", "Servicio", "Sub servicio", "Precio", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_esp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_espMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_esp);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Modificar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("Eliminar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("Busqueda de precio sugerido:");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        precio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        hora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00am", "9:00am", "10:00am", "11:00am", "12:00pm", "1:00pm", "2:00pm", "3:00pm", "4:00pm", "5:00pm" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Fecha:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Hora:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(servBusc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Especialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(placaBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mecBusc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subBusc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Especialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(placaBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(mecBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(servBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(18, 18, 18)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(subBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspecialidadesActionPerformed

    private void placaBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaBuscActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        placaBusc.removeAllItems();
        try {
            String sql = "SELECT placa_cli FROM clientes";
            Statement busc = connect.createStatement();
            ResultSet rs = busc.executeQuery(sql);
            while (rs.next()) {
                String valor = rs.getString("placa_cli");
                placaBusc.addItem(valor);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Placas no agregadas");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mecBusc.removeAllItems();
        String esp_sel = Especialidades.getSelectedItem().toString();
        try {
            String sql = "SELECT nom_mec FROM mecanicos WHERE esp_mec= ?";
            PreparedStatement busc = connect.prepareStatement(sql);
            busc.setString(1, esp_sel);
            ResultSet rs = busc.executeQuery();
            while (rs.next()) {
                String valor = rs.getString("nom_mec");
                mecBusc.addItem(valor);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Placas no agregadas");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica Basica")) {
            servBusc.removeAllItems();
            String[] newItems = {"Cambio de aceite y filtros", "Cambio de bujias", "Cambio de llantas", "Revision de frenos", "Revision de luces"};
            servBusc.setModel(new DefaultComboBoxModel<>(newItems));
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores diesel")) {
            servBusc.removeAllItems();
            String[] newItems = {"Revision de motor", "Tune up", "Desgastes mecanicos", "Sistemas electricos"};
            servBusc.setModel(new DefaultComboBoxModel<>(newItems));
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores gasolina")) {
            servBusc.removeAllItems();
            String[] newItems = {"Revision de motor", "Tune up", "Desgaste mecanico", "Sistemas electricos", "Cambio de roles", "Cambio de caja de cambios"};
            servBusc.setModel(new DefaultComboBoxModel<>(newItems));
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores electricos")) {
            servBusc.removeAllItems();
            String[] newItems = {"Sistema electrico y auxiliares", "Bateria", "Revision de frenos", "Cambio de roles"};
            servBusc.setModel(new DefaultComboBoxModel<>(newItems));
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica de maquinaria pesada")) {
            servBusc.removeAllItems();
            String[] newItems = {"Mantenimientos", "Reparacion", "Transmisiones", "Propulsion", "Electrico", "Chasis"};
            servBusc.setModel(new DefaultComboBoxModel<>(newItems));
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica de motos")) {
            servBusc.removeAllItems();
            String[] newItems = {"Diagnosticar", "Reparar componentes", "Sistema de lubricación y refrigeración", "Sistema de combustible", "Sistema de encendido", "Sistema de frenos", "Sistema de dirección", "Sistema de suspensión", "Transmisión", "Carga eléctrica"};
            servBusc.setModel(new DefaultComboBoxModel<>(newItems));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica Basica")) {
            if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de aceite y filtros")) {
                subBusc.removeAllItems();
                String[] newItems = {"Motor", "Caja", "Hidraulico"};
                subBusc.setModel(new DefaultComboBoxModel<>(newItems));
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de llantas")) {
                subBusc.removeAllItems();
                String[] newItems = {"Llantas nuevas", "Balanceo", "Tramado"};
                subBusc.setModel(new DefaultComboBoxModel<>(newItems));
            } else {
                subBusc.removeAllItems();
            }
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores diesel")) {
            subBusc.removeAllItems();
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores gasolina")) {
            if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de caja de cambios")) {
                subBusc.removeAllItems();
                String[] newItems = {"Caja manual", "Caja automatica"};
                subBusc.setModel(new DefaultComboBoxModel<>(newItems));
            } else {
                subBusc.removeAllItems();
            }
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores electricos")) {
            subBusc.removeAllItems();
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica de maquinaria pesada")) {
            subBusc.removeAllItems();
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica de motos")) {
            subBusc.removeAllItems();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            String id = placaBusc.getSelectedItem().toString();
            String sql = "SELECT nombre_cli FROM clientes WHERE placa_cli= ?";
            PreparedStatement busc = connect.prepareStatement(sql);
            busc.setString(1, id);
            ResultSet rs = busc.executeQuery();
            String nul = subBusc.getSelectedItem() != null ? subBusc.getSelectedItem().toString() : "-";
            Date fecha = date.getDate();
            long fech = fecha.getTime();
            java.sql.Date fecha_sql = new java.sql.Date(fech);
            if (rs.next()) {
                String nomplac = rs.getString("nombre_cli");
                PreparedStatement save = connect.prepareStatement("INSERT INTO servicios(nom_cli,plac_cli,nom_mec,esp,ser,sub_ser,pre,fecha,hora) VALUES(?,?,?,?,?,?,?,?,?)");
                save.setString(1, nomplac);
                save.setString(2, placaBusc.getSelectedItem().toString());
                save.setString(3, mecBusc.getSelectedItem().toString());
                save.setString(4, Especialidades.getSelectedItem().toString());
                save.setString(5, servBusc.getSelectedItem().toString());
                save.setString(6, nul);
                save.setString(7, precio.getText());
                save.setDate(8, fecha_sql);
                save.setString(9, hora.getSelectedItem().toString());

                save.execute();
            }
            JOptionPane.showMessageDialog(null, "Servicio registrado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Servicio no registrado");
        }
        precio.setText("");
        listar("servicios");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void table_cli1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_cli1MouseClicked

    }//GEN-LAST:event_table_cli1MouseClicked

    private void table_espMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_espMouseClicked
        int fila = table_esp.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un servicio");
        } else {
            String prec = (String) table_esp.getValueAt(fila, 7);
            precio.setText(prec);
        }
    }//GEN-LAST:event_table_espMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        modificar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica Basica")) {
            if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de aceite y filtros")) {
                if (subBusc.getSelectedItem().toString().equalsIgnoreCase("Motor")) {
                    precio.setText("35000");
                } else if (subBusc.getSelectedItem().toString().equalsIgnoreCase("Caja")) {
                    precio.setText("25000");
                } else if (subBusc.getSelectedItem().toString().equalsIgnoreCase("Hidraulico")) {
                    precio.setText("20000");
                }
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de bujias")) {
                precio.setText("40000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de llantas")) {
                if (subBusc.getSelectedItem().toString().equalsIgnoreCase("Llantas nuevas")) {
                    precio.setText("230000");
                } else if (subBusc.getSelectedItem().toString().equalsIgnoreCase("Balanceo")) {
                    precio.setText("23000");
                } else if (subBusc.getSelectedItem().toString().equalsIgnoreCase("Tramado")) {
                    precio.setText("23000");
                }
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Revision de frenos")) {
                precio.setText("46000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Revision de luces")) {
                precio.setText("50000");
            }
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores diesel")) {
            if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Revision de motor")) {
                precio.setText("60000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Tune up")) {
                precio.setText("100000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Desgastes mecanicos")) {
                precio.setText("200000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistemas electricos")) {
                precio.setText("80000");
            }
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores gasolina")) {
            if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Revision de motor")) {
                precio.setText("60000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Tune up")) {
                precio.setText("40000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Desgaste mecanico")) {
                precio.setText("40000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistemas electricos")) {
                precio.setText("76000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de roles")) {
                precio.setText("50000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de caja de cambios")) {
                if (subBusc.getSelectedItem().toString().equalsIgnoreCase("Caja manual")) {
                    precio.setText("100000");
                } else if (subBusc.getSelectedItem().toString().equalsIgnoreCase("Caja automatica")) {
                    precio.setText("100000");
                }
            }
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores electricos")) {
            if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistema electrico y auxiliares")) {
                precio.setText("40000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Bateria")) {
                precio.setText("40000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Revision de frenos")) {
                precio.setText("46000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Cambio de roles")) {
                precio.setText("50000");
            }
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica de maquinaria pesada")) {
            if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Mantenimientos")) {
                precio.setText("140000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Reparacion")) {
                precio.setText("400000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Transmisiones")) {
                precio.setText("300000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Propulsion")) {
                precio.setText("460000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Electrico")) {
                precio.setText("100000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Chasis")) {
                precio.setText("150000");
            }
        } else if (Especialidades.getSelectedItem().toString().equalsIgnoreCase("Mecanica de motos")) {
            if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Diagnosticar")) {
                precio.setText("10000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Reparar componentes")) {
                precio.setText("40000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistema de lubricación y refrigeración")) {
                precio.setText("20000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistema de combustible")) {
                precio.setText("25000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistema de encendido")) {
                precio.setText("10000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistema de frenos")) {
                precio.setText("10000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistema de dirección")) {
                precio.setText("15000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Sistema de suspensión")) {
                precio.setText("10000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Transmisión")) {
                precio.setText("30000");
            } else if (servBusc.getSelectedItem().toString().equalsIgnoreCase("Carga eléctrica")) {
                precio.setText("25000");
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Especialidades;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> mecBusc;
    private javax.swing.JComboBox<String> placaBusc;
    private javax.swing.JTextField precio;
    private javax.swing.JComboBox<String> servBusc;
    private javax.swing.JComboBox<String> subBusc;
    public javax.swing.JTable table_cli1;
    public javax.swing.JTable table_esp;
    // End of variables declaration//GEN-END:variables
}
