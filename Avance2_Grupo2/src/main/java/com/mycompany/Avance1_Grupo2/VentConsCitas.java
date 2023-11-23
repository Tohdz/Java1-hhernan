/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

/**
 *
 * @author hhern
 */
public class VentConsCitas extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentConsCitas
     */
    public VentConsCitas() {
        initComponents();
    }
   
    public String strtohtml(String texto){
        return "<html><p>"+ texto + "</p></html>";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dias = new javax.swing.JComboBox<>();
        lcd = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        dias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Informe completo");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcd, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lcd, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (dias.getSelectedItem().toString().equalsIgnoreCase("Lunes")) {
            String info1 = "";
            for (int i = 0; i < ModuloCitas.getLunes().size(); i++) {
                info1 = info1 + (ModuloCitas.getLunes().get(i));
            }
            lcd.setText(strtohtml(info1));
        }else if(dias.getSelectedItem().toString().equalsIgnoreCase("Martes")){
            String info1 = "";
            for (int i = 0; i < ModuloCitas.getMartes().size(); i++) {
                info1 = info1 + (ModuloCitas.getMartes().get(i));
            }
            lcd.setText(strtohtml(info1));
        }else if(dias.getSelectedItem().toString().equalsIgnoreCase("Miercoles")){
            String info1 = "";
            for (int i = 0; i < ModuloCitas.getMiercoles().size(); i++) {
                info1 = info1 + (ModuloCitas.getMiercoles().get(i));
            }
            lcd.setText(strtohtml(info1));
        }else if(dias.getSelectedItem().toString().equalsIgnoreCase("Jueves")){
            String info1 = "";
            for (int i = 0; i < ModuloCitas.getJueves().size(); i++) {
                info1 = info1 + (ModuloCitas.getJueves().get(i));
            }
            lcd.setText(strtohtml(info1));
        }else if(dias.getSelectedItem().toString().equalsIgnoreCase("Viernes")){
            String info1 = "";
            for (int i = 0; i < ModuloCitas.getViernes().size(); i++) {
                info1 = info1 + (ModuloCitas.getViernes().get(i));
            }
            lcd.setText(strtohtml(info1));
        }else if(dias.getSelectedItem().toString().equalsIgnoreCase("Sabado")){
            String info1 = "";
            for (int i = 0; i < ModuloCitas.getSabado().size(); i++) {
                info1 = info1 + (ModuloCitas.getSabado().get(i));
            }
            lcd.setText(strtohtml(info1));
        }else if(dias.getSelectedItem().toString().equalsIgnoreCase("Domingo")){
            String info1 = "";
            for (int i = 0; i < ModuloCitas.getDomingo().size(); i++) {
                info1 = info1 + (ModuloCitas.getDomingo().get(i));
            }
            lcd.setText(strtohtml(info1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lcd;
    // End of variables declaration//GEN-END:variables
}
