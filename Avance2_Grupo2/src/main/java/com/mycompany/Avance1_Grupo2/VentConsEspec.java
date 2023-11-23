/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

/**
 *
 * @author hhern
 */
public class VentConsEspec extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentConsEspec
     */
    public VentConsEspec() {
        initComponents();
    }

    public String strtohtml(String texto) {
        return "<html><p>" + texto + "</p></html>";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Especialidad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lcd = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta por Especialidades");

        Especialidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos" }));
        Especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialidadActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Informe Completo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lcd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton1)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lcd, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspecialidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Especialidad.getSelectedItem().toString().equalsIgnoreCase("Mecanica Basica")) {
            String info1 = "";
            for (int i = 0; i < MecanicaBasica.getMecBasica().size(); i++) {
                info1 = info1 + ("Nombre del cliente: " + MecanicaBasica.getMecBasica().get(i).getNombreCliente() + "\n" + "Placa: " + MecanicaBasica.getMecBasica().get(i).getPlaca() + "\n" + "Nombre del mecanico: " + MecanicaBasica.getMecBasica().get(i).getNombreMec() + "\n" + "Especialidad: " + MecanicaBasica.getMecBasica().get(i).getEspecialidad() + "\n" + "Sub Especialidad: " + MecanicaBasica.getMecBasica().get(i).getSubEspec() + "\n" + "Valor de reparacion: " + MecanicaBasica.getMecBasica().get(i).getValorRep() + "\n");
            }
            lcd.setText(strtohtml(info1));
        } else if (Especialidad.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores diesel")) {
            String info1 = "";
            for (int i = 0; i < MecanicaDiesel.getMecDiesel().size(); i++) {
                info1 = info1 + ("Nombre del cliente: " + MecanicaDiesel.getMecDiesel().get(i).getNombreCliente() + "\n" + "Placa: " + MecanicaDiesel.getMecDiesel().get(i).getPlaca() + "\n" + "Nombre del mecanico: " + MecanicaDiesel.getMecDiesel().get(i).getNombreMec() + "\n" + "Especialidad: " + MecanicaDiesel.getMecDiesel().get(i).getEspecialidad() + "\n" + "Sub Especialidad: " + MecanicaDiesel.getMecDiesel().get(i).getSubEspec() + "\n" + "Valor de reparacion: " + MecanicaDiesel.getMecDiesel().get(i).getValorRep() + "\n");
            }
            lcd.setText(strtohtml(info1));
        } else if (Especialidad.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores gasolina")) {
            String info1 = "";
            for (int i = 0; i < MecanicaGasolina.getMecGasolina().size(); i++) {
                info1 = info1 + ("Nombre del cliente: " + MecanicaGasolina.getMecGasolina().get(i).getNombreCliente() + "\n" + "Placa: " + MecanicaGasolina.getMecGasolina().get(i).getPlaca() + "\n" + "Nombre del mecanico: " + MecanicaGasolina.getMecGasolina().get(i).getNombreMec() + "\n" + "Especialidad: " + MecanicaGasolina.getMecGasolina().get(i).getEspecialidad() + "\n" + "Sub Especialidad: " + MecanicaGasolina.getMecGasolina().get(i).getSubEspec() + "\n" + "Valor de reparacion: " + MecanicaGasolina.getMecGasolina().get(i).getValorRep() + "\n");
            }
            lcd.setText(strtohtml(info1));
        } else if (Especialidad.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores electricos")) {
            String info1 = "";
            for (int i = 0; i < MecanicaElectricos.getMecElectricos().size(); i++) {
                info1 = info1 + ("Nombre del cliente: " + MecanicaElectricos.getMecElectricos().get(i).getNombreCliente() + "\n" + "Placa: " + MecanicaElectricos.getMecElectricos().get(i).getPlaca() + "\n" + "Nombre del mecanico: " + MecanicaElectricos.getMecElectricos().get(i).getNombreMec() + "\n" + "Especialidad: " + MecanicaElectricos.getMecElectricos().get(i).getEspecialidad() + "\n" + "Sub Especialidad: " + MecanicaElectricos.getMecElectricos().get(i).getSubEspec() + "\n" + "Valor de reparacion: " + MecanicaElectricos.getMecElectricos().get(i).getValorRep() + "\n");
            }
            lcd.setText(strtohtml(info1));
        } else if (Especialidad.getSelectedItem().toString().equalsIgnoreCase("Mecanica de maquinaria pesada")) {
            String info1 = "";
            for (int i = 0; i < MecanicaPesada.getMecPesada().size(); i++) {
                info1 = info1 + ("Nombre del cliente: " + MecanicaPesada.getMecPesada().get(i).getNombreCliente() + "\n" + "Placa: " + MecanicaPesada.getMecPesada().get(i).getPlaca() + "\n" + "Nombre del mecanico: " + MecanicaPesada.getMecPesada().get(i).getNombreMec() + "\n" + "Especialidad: " + MecanicaPesada.getMecPesada().get(i).getEspecialidad() + "\n" + "Sub Especialidad: " + MecanicaPesada.getMecPesada().get(i).getSubEspec() + "\n" + "Valor de reparacion: " + MecanicaPesada.getMecPesada().get(i).getValorRep() + "\n");
            }
            lcd.setText(strtohtml(info1));
        } else if (Especialidad.getSelectedItem().toString().equalsIgnoreCase("Mecanica de motos")) {
            String info1 = "";
            for (int i = 0; i < MecanicaMotos.getMecMotos().size(); i++) {
                info1 = info1 + ("Nombre del cliente: " + MecanicaMotos.getMecMotos().get(i).getNombreCliente() + "\n" + "Placa: " + MecanicaMotos.getMecMotos().get(i).getPlaca() + "\n" + "Nombre del mecanico: " + MecanicaMotos.getMecMotos().get(i).getNombreMec() + "\n" + "Especialidad: " + MecanicaMotos.getMecMotos().get(i).getEspecialidad() + "\n" + "Sub Especialidad: " + MecanicaMotos.getMecMotos().get(i).getSubEspec() + "\n" + "Valor de reparacion: " + MecanicaMotos.getMecMotos().get(i).getValorRep() + "\n");
            }
            lcd.setText(strtohtml(info1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Especialidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lcd;
    // End of variables declaration//GEN-END:variables
}
