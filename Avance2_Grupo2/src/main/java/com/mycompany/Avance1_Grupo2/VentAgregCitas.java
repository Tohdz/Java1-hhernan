/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

/**
 *
 * @author hhern
 */
public class VentAgregCitas extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentAgregCitas
     */
    public VentAgregCitas() {
        initComponents();
    }

    ModuloCitas cita = new ModuloCitas();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        placaBusc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        finalLabel = new javax.swing.JLabel();
        textFecha = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        dias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Placas a buscar:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        placaBusc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Digite aqui la placa a reservar:");

        textFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechaActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Reservar");
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel1))
                                .addGap(22, 22, 22)
                                .addComponent(placaBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(placaBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(finalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
            if (dias.getSelectedItem().toString().equalsIgnoreCase("Lunes")) {
                if (placaBusc.getSelectedItem().toString().equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                    cita.setPlacaC(Vehiculos.getAutos().get(i).getPlaca());
                }
                cita.setFecha_dia(textFecha.getText());
                ModuloCitas.getFechas().add(textFecha.getText());
                ModuloCitas.getLunes().add(cita);
                cita = new ModuloCitas();
                textFecha.setText("");
                finalLabel.setText("Guardado con exito");
            }else if(dias.getSelectedItem().toString().equalsIgnoreCase("Martes")){
                if (placaBusc.getSelectedItem().toString().equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                    cita.setPlacaC(Vehiculos.getAutos().get(i).getPlaca());
                }
                cita.setFecha_dia(textFecha.getText());
                ModuloCitas.getFechas().add(textFecha.getText());
                ModuloCitas.getMartes().add(cita);
                cita = new ModuloCitas();
                textFecha.setText("");
                finalLabel.setText("Guardado con exito");
            }else if(dias.getSelectedItem().toString().equalsIgnoreCase("Miercoles")){
                if (placaBusc.getSelectedItem().toString().equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                    cita.setPlacaC(Vehiculos.getAutos().get(i).getPlaca());
                }
                cita.setFecha_dia(textFecha.getText());
                ModuloCitas.getFechas().add(textFecha.getText());
                ModuloCitas.getMiercoles().add(cita);
                cita = new ModuloCitas();
                textFecha.setText("");
                finalLabel.setText("Guardado con exito");
            }else if (dias.getSelectedItem().toString().equalsIgnoreCase("Jueves")){
                if (placaBusc.getSelectedItem().toString().equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                    cita.setPlacaC(Vehiculos.getAutos().get(i).getPlaca());
                }
                cita.setFecha_dia(textFecha.getText());
                ModuloCitas.getFechas().add(textFecha.getText());
                ModuloCitas.getJueves().add(cita);
                cita = new ModuloCitas();
                textFecha.setText("");
                finalLabel.setText("Guardado con exito");
            }else if (dias.getSelectedItem().toString().equalsIgnoreCase("Viernes")){
                if (placaBusc.getSelectedItem().toString().equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                    cita.setPlacaC(Vehiculos.getAutos().get(i).getPlaca());
                }
                cita.setFecha_dia(textFecha.getText());
                ModuloCitas.getFechas().add(textFecha.getText());
                ModuloCitas.getViernes().add(cita);
                cita = new ModuloCitas();
                textFecha.setText("");
                finalLabel.setText("Guardado con exito");
            }else if (dias.getSelectedItem().toString().equalsIgnoreCase("Sabado")){
                if (placaBusc.getSelectedItem().toString().equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                    cita.setPlacaC(Vehiculos.getAutos().get(i).getPlaca());
                }
                cita.setFecha_dia(textFecha.getText());
                ModuloCitas.getFechas().add(textFecha.getText());
                ModuloCitas.getSabado().add(cita);
                cita = new ModuloCitas();
                textFecha.setText("");
                finalLabel.setText("Guardado con exito");
            }else if (dias.getSelectedItem().toString().equalsIgnoreCase("Domingo")){
                if (placaBusc.getSelectedItem().toString().equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                    cita.setPlacaC(Vehiculos.getAutos().get(i).getPlaca());
                }
                cita.setFecha_dia(textFecha.getText());
                ModuloCitas.getFechas().add(textFecha.getText());
                ModuloCitas.getDomingo().add(cita);
                cita = new ModuloCitas();
                textFecha.setText("");
                finalLabel.setText("Guardado con exito");
            }
        }
        System.out.println(ModuloCitas.getFechas());
        System.out.println(ModuloCitas.getLunes());
        System.out.println(ModuloCitas.getMartes());
        System.out.println(ModuloCitas.getMiercoles());
        System.out.println(ModuloCitas.getJueves());
        System.out.println(ModuloCitas.getViernes());
        System.out.println(ModuloCitas.getSabado());
        System.out.println(ModuloCitas.getDomingo());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        placaBusc.removeAllItems();
        for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
            placaBusc.addItem(Vehiculos.getAutos().get(i).getPlaca());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dias;
    private javax.swing.JLabel finalLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> placaBusc;
    private javax.swing.JTextField textFecha;
    // End of variables declaration//GEN-END:variables
}
