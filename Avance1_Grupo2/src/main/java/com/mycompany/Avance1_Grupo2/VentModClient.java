/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

/**
 *
 * @author hhern
 */
public class VentModClient extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentModClient
     */
    public VentModClient() {
        initComponents();
        carga();
        
    }
    public void carga(){
        for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
            placaBusc.addItem(Vehiculos.getAutos().get(i).getPlaca()); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNewClient = new javax.swing.JTextField();
        placaBusc = new javax.swing.JComboBox<>();
        valorBusc = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        labelFinal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modificar Cliente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Numero de placa a buscar:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nuevo valor:");

        placaBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaBuscActionPerformed(evt);
            }
        });

        valorBusc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombre", "Direccion", "Telefono", "Correo", "Placa", "Modelo", "Marca", "Color", "Año", "Tipo de combustible", "Especialidad" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Valores a modificar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placaBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(placaBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placaBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaBuscActionPerformed
        
    }//GEN-LAST:event_placaBuscActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
            if (placaBusc.getSelectedItem().toString().equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                if (valorBusc.getSelectedItem().toString().equalsIgnoreCase("Cedula")) {
                    Vehiculos.getAutos().get(i).setCedula(Integer.parseInt(textNewClient.getText()));
                }else if(valorBusc.getSelectedItem().toString().equalsIgnoreCase("Nombre")){
                    Vehiculos.getAutos().get(i).setNombre(textNewClient.getText());
                }else if(valorBusc.getSelectedItem().toString().equalsIgnoreCase("Direccion")){
                    Vehiculos.getAutos().get(i).setDireccion(textNewClient.getText());
                }else if(valorBusc.getSelectedItem().toString().equalsIgnoreCase("Telefono")){
                    Vehiculos.getAutos().get(i).setTelefono(Integer.parseInt(textNewClient.getText()));
                }else if (valorBusc.getSelectedItem().toString().equalsIgnoreCase("Correo")){
                    Vehiculos.getAutos().get(i).setCorreo(textNewClient.getText());
                }else if(valorBusc.getSelectedItem().toString().equalsIgnoreCase("Placa")){
                    Vehiculos.getAutos().get(i).setPlaca(textNewClient.getText());
                }else if(valorBusc.getSelectedItem().toString().equalsIgnoreCase("Modelo")){
                    Vehiculos.getAutos().get(i).setModelo(textNewClient.getText());
                }else if (valorBusc.getSelectedItem().toString().equalsIgnoreCase("Marca")){
                    Vehiculos.getAutos().get(i).setMarca(textNewClient.getText());
                }else if (valorBusc.getSelectedItem().toString().equalsIgnoreCase("Color")){
                    Vehiculos.getAutos().get(i).setColor(textNewClient.getText());
                }else if(valorBusc.getSelectedItem().toString().equalsIgnoreCase("Año")){
                    Vehiculos.getAutos().get(i).setAño(Integer.parseInt(textNewClient.getText()));
                }else if (valorBusc.getSelectedItem().toString().equalsIgnoreCase("Tipo de combustible")){
                    Vehiculos.getAutos().get(i).setTipoGasolina(textNewClient.getText());
                }else if (valorBusc.getSelectedItem().toString().equalsIgnoreCase("Especialidad")){
                    Vehiculos.getAutos().get(i).setEspecialidadReferencia(textNewClient.getText());
                }
            }
        }
        textNewClient.setText("");
        labelFinal.setText("Se ha modificado correctamente");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelFinal;
    private javax.swing.JComboBox<String> placaBusc;
    private javax.swing.JTextField textNewClient;
    private javax.swing.JComboBox<String> valorBusc;
    // End of variables declaration//GEN-END:variables
}
