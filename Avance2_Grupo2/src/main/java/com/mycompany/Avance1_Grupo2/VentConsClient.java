/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

/**
 *
 * @author hhern
 */
public class VentConsClient extends javax.swing.JInternalFrame {

    public VentConsClient() {
        initComponents();
    }

    public String strtohtml(String texto){
        return "<html><p>"+ texto + "</p></html>";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        lcd1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta de clientes");

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Informe completo");
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
                .addGap(16, 16, 16)
                .addComponent(lcd1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lcd1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String info1 = "";
        for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
            info1 = info1 + ("Numero de Identificacion: " + Vehiculos.getAutos().get(i).getCedula() + "\n" + "Nombre: " + Vehiculos.getAutos().get(i).getNombre() + "\n" + "Direccion: " + Vehiculos.getAutos().get(i).getDireccion() + "\n" + "Telefono: " + Vehiculos.getAutos().get(i).getTelefono() + "\n" + "Correo: " + Vehiculos.getAutos().get(i).getCorreo() + "\n" + "Placa: " + Vehiculos.getAutos().get(i).getPlaca() + "\n" + "Modelo: " + Vehiculos.getAutos().get(i).getModelo() + "\n" + "Marca: " + Vehiculos.getAutos().get(i).getMarca() + "\n" + "Color: " + Vehiculos.getAutos().get(i).getColor() + "\n" + "Año: " + Vehiculos.getAutos().get(i).getAño() + "\n" + "Tipo de combustible: " + Vehiculos.getAutos().get(i).getTipoGasolina() + "\n" + "Especialidad: " + Vehiculos.getAutos().get(i).getEspecialidadReferencia() + "\n");
        }
        this.lcd1.setText(strtohtml(info1));
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lcd1;
    // End of variables declaration//GEN-END:variables
}
