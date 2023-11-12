/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

/**
 *
 * @author hhern
 */
public class VentModEmple extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentModEmple
     */
    public VentModEmple() {
        initComponents();
    }

    public void carga(){
        if (chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica Basica")) {
            cedulas.removeAllItems();
            for (int i = 0; i < Mecanicos.getMecBasica().size(); i++) {
                cedulas.addItem(String.valueOf(Mecanicos.getMecBasica().get(i).getCedula()));
            }
        }else if (chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores diesel")){
            cedulas.removeAllItems();
            for (int i = 0; i < Mecanicos.getMecDiesel().size(); i++) {
                cedulas.addItem(String.valueOf(Mecanicos.getMecDiesel().get(i).getCedula()));
            }
        }else if (chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores gasolina")){
            cedulas.removeAllItems();
            for (int i = 0; i < Mecanicos.getMecGasolina().size(); i++) {
                cedulas.addItem(String.valueOf(Mecanicos.getMecGasolina().get(i).getCedula()));
            }
        }else if(chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores electricos")){
            cedulas.removeAllItems();
            for (int i = 0; i < Mecanicos.getMecElectricos().size(); i++) {
                cedulas.addItem(String.valueOf(Mecanicos.getMecElectricos().get(i).getCedula()));
            }
        }else if(chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica de maquinaria pesada")){
            cedulas.removeAllItems();
            for (int i = 0; i < Mecanicos.getMecPesada().size(); i++) {
                cedulas.addItem(String.valueOf(Mecanicos.getMecPesada().get(i).getCedula()));
            }
        }else if(chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica de motos")){
            cedulas.removeAllItems();
            for (int i = 0; i < Mecanicos.getMecMotos().size(); i++) {
                cedulas.addItem(String.valueOf(Mecanicos.getMecMotos().get(i).getCedula()));
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseEspec = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        chooseValor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        textNew = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        labelFinal = new javax.swing.JLabel();
        cedulas = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modificar  empleados");

        chooseEspec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chooseEspec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Valores a modificar:");

        chooseValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chooseValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificacion", "Nombre", "Direccion", "Telefono", "Correo" }));
        chooseValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseValorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nuevo valor:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cedulas.setEditable(true);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Busca de Identificaciones:");
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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chooseValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNew, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(chooseEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(labelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        carga();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica Basica")) {
            for (int i = 0; i < Mecanicos.getMecBasica().size(); i++) {
                if (cedulas.getSelectedItem().toString().equalsIgnoreCase(String.valueOf(Mecanicos.getMecBasica().get(i).getCedula()))) {
                    if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Identificacion")) {
                        Mecanicos.getMecBasica().get(i).setCedula(Integer.parseInt(textNew.getText()));
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Nombre")){
                        Mecanicos.getMecBasica().get(i).setNombre(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Direccion")){
                        Mecanicos.getMecBasica().get(i).setDireccion(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Telefono")){
                        Mecanicos.getMecBasica().get(i).setTelefono(Integer.parseInt(textNew.getText()));
                    }else if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Correo")){
                        Mecanicos.getMecBasica().get(i).setCorreo(textNew.getText());
                    }
                }
            }
        }else if (chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores diesel")){
            for (int i = 0; i < Mecanicos.getMecDiesel().size(); i++) {
                if (cedulas.getSelectedItem().toString().equalsIgnoreCase(String.valueOf(Mecanicos.getMecDiesel().get(i).getCedula()))) {
                    if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Identificacion")) {
                        Mecanicos.getMecDiesel().get(i).setCedula(Integer.parseInt(textNew.getText()));
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Nombre")){
                        Mecanicos.getMecDiesel().get(i).setNombre(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Direccion")){
                        Mecanicos.getMecDiesel().get(i).setDireccion(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Telefono")){
                        Mecanicos.getMecDiesel().get(i).setTelefono(Integer.parseInt(textNew.getText()));
                    }else if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Correo")){
                        Mecanicos.getMecDiesel().get(i).setCorreo(textNew.getText());
                    }
                }
            }
        }else if (chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores gasolina")){
            for (int i = 0; i < Mecanicos.getMecGasolina().size(); i++) {
                if (cedulas.getSelectedItem().toString().equalsIgnoreCase(String.valueOf(Mecanicos.getMecGasolina().get(i).getCedula()))) {
                    if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Identificacion")) {
                        Mecanicos.getMecGasolina().get(i).setCedula(Integer.parseInt(textNew.getText()));
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Nombre")){
                        Mecanicos.getMecGasolina().get(i).setNombre(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Direccion")){
                        Mecanicos.getMecGasolina().get(i).setDireccion(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Telefono")){
                        Mecanicos.getMecGasolina().get(i).setTelefono(Integer.parseInt(textNew.getText()));
                    }else if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Correo")){
                        Mecanicos.getMecGasolina().get(i).setCorreo(textNew.getText());
                    }
                }
            }
        }else if(chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores electricos")){
            for (int i = 0; i < Mecanicos.getMecElectricos().size(); i++) {
                if (cedulas.getSelectedItem().toString().equalsIgnoreCase(String.valueOf(Mecanicos.getMecElectricos().get(i).getCedula()))) {
                    if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Identificacion")) {
                        Mecanicos.getMecElectricos().get(i).setCedula(Integer.parseInt(textNew.getText()));
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Nombre")){
                        Mecanicos.getMecElectricos().get(i).setNombre(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Direccion")){
                        Mecanicos.getMecElectricos().get(i).setDireccion(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Telefono")){
                        Mecanicos.getMecElectricos().get(i).setTelefono(Integer.parseInt(textNew.getText()));
                    }else if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Correo")){
                        Mecanicos.getMecElectricos().get(i).setCorreo(textNew.getText());
                    }
                }
            }
        }else if(chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica de maquinaria pesada")){
            for (int i = 0; i < Mecanicos.getMecPesada().size(); i++) {
                if (cedulas.getSelectedItem().toString().equalsIgnoreCase(String.valueOf(Mecanicos.getMecPesada().get(i).getCedula()))) {
                    if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Identificacion")) {
                        Mecanicos.getMecPesada().get(i).setCedula(Integer.parseInt(textNew.getText()));
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Nombre")){
                        Mecanicos.getMecPesada().get(i).setNombre(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Direccion")){
                        Mecanicos.getMecPesada().get(i).setDireccion(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Telefono")){
                        Mecanicos.getMecPesada().get(i).setTelefono(Integer.parseInt(textNew.getText()));
                    }else if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Correo")){
                        Mecanicos.getMecPesada().get(i).setCorreo(textNew.getText());
                    }
                }
            }
        }else if(chooseEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica de motos")){
            for (int i = 0; i < Mecanicos.getMecMotos().size(); i++) {
                if (cedulas.getSelectedItem().toString().equalsIgnoreCase(String.valueOf(Mecanicos.getMecMotos().get(i).getCedula()))) {
                    if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Identificacion")) {
                        Mecanicos.getMecMotos().get(i).setCedula(Integer.parseInt(textNew.getText()));
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Nombre")){
                        Mecanicos.getMecMotos().get(i).setNombre(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Direccion")){
                        Mecanicos.getMecMotos().get(i).setDireccion(textNew.getText());
                    }else if(chooseValor.getSelectedItem().toString().equalsIgnoreCase("Telefono")){
                        Mecanicos.getMecMotos().get(i).setTelefono(Integer.parseInt(textNew.getText()));
                    }else if (chooseValor.getSelectedItem().toString().equalsIgnoreCase("Correo")){
                        Mecanicos.getMecMotos().get(i).setCorreo(textNew.getText());
                    }
                }
            }
        }
        textNew.setText("");
        labelFinal.setText("Se ha modificado correctamente");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chooseValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseValorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cedulas;
    private javax.swing.JComboBox<String> chooseEspec;
    private javax.swing.JComboBox<String> chooseValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelFinal;
    private javax.swing.JTextField textNew;
    // End of variables declaration//GEN-END:variables
}
