/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

/**
 *
 * @author hhern
 */
public class VentConsEmple extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentConsEmple
     */
    public VentConsEmple() {
        initComponents();
    }

    public String strtohtml(String texto) {
        return "<html><p>" + texto + "</p></html>";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choEspec = new javax.swing.JComboBox<>();
        printLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultar Empleados");

        choEspec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        choEspec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos" }));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(choEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (choEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica Basica")) {
            String info1 = "";
            for (int i = 0; i < Mecanicos.getMecBasica().size(); i++) {
                info1 = info1 + ("Numero de Identificacion: " + Mecanicos.getMecBasica().get(i).getCedula() + "\n" + "Nombre: " + Mecanicos.getMecBasica().get(i).getNombre() + "\n" + "Direccion: " + Mecanicos.getMecBasica().get(i).getDireccion() + "\n" + "Telefono: " + Mecanicos.getMecBasica().get(i).getTelefono() + "\n" + "Correo: " + Mecanicos.getMecBasica().get(i).getCorreo());
            }
            printLabel.setText(strtohtml(info1));
        } else if (choEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores diesel")) {
            String info1 = "";
            for (int i = 0; i < Mecanicos.getMecDiesel().size(); i++) {
                info1 = info1 + ("Numero de Identificacion: " + Mecanicos.getMecDiesel().get(i).getCedula() + "\n" + "Nombre: " + Mecanicos.getMecDiesel().get(i).getNombre() + "\n" + "Direccion: " + Mecanicos.getMecDiesel().get(i).getDireccion() + "\n" + "Telefono: " + Mecanicos.getMecDiesel().get(i).getTelefono() + "\n" + "Correo: " + Mecanicos.getMecDiesel().get(i).getCorreo());
            }
            printLabel.setText(strtohtml(info1));
        } else if (choEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores gasolina")) {
            String info1 = "";
            for (int i = 0; i < Mecanicos.getMecGasolina().size(); i++) {
                info1 = info1 + ("Numero de Identificacion: " + Mecanicos.getMecGasolina().get(i).getCedula() + "\n" + "Nombre: " + Mecanicos.getMecGasolina().get(i).getNombre() + "\n" + "Direccion: " + Mecanicos.getMecGasolina().get(i).getDireccion() + "\n" + "Telefono: " + Mecanicos.getMecGasolina().get(i).getTelefono() + "\n" + "Correo: " + Mecanicos.getMecGasolina().get(i).getCorreo());
            }
            printLabel.setText(strtohtml(info1));
        } else if (choEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica automotores electricos")) {
            String info1 = "";
            for (int i = 0; i < Mecanicos.getMecElectricos().size(); i++) {
                info1 = info1 + ("Numero de Identificacion: " + Mecanicos.getMecElectricos().get(i).getCedula() + "\n" + "Nombre: " + Mecanicos.getMecElectricos().get(i).getNombre() + "\n" + "Direccion: " + Mecanicos.getMecElectricos().get(i).getDireccion() + "\n" + "Telefono: " + Mecanicos.getMecElectricos().get(i).getTelefono() + "\n" + "Correo: " + Mecanicos.getMecElectricos().get(i).getCorreo());
            }
            printLabel.setText(strtohtml(info1));
        } else if (choEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica de maquinaria pesada")) {
            String info1 = "";
            for (int i = 0; i < Mecanicos.getMecPesada().size(); i++) {
                info1 = info1 + ("Numero de Identificacion: " + Mecanicos.getMecPesada().get(i).getCedula() + "\n" + "Nombre: " + Mecanicos.getMecPesada().get(i).getNombre() + "\n" + "Direccion: " + Mecanicos.getMecPesada().get(i).getDireccion() + "\n" + "Telefono: " + Mecanicos.getMecPesada().get(i).getTelefono() + "\n" + "Correo: " + Mecanicos.getMecPesada().get(i).getCorreo());
            }
            printLabel.setText(strtohtml(info1));
        } else if (choEspec.getSelectedItem().toString().equalsIgnoreCase("Mecanica de motos")) {
            String info1 = "";
            for (int i = 0; i < Mecanicos.getMecMotos().size(); i++) {
                info1 = info1 + ("Numero de Identificacion: " + Mecanicos.getMecMotos().get(i).getCedula() + "\n" + "Nombre: " + Mecanicos.getMecMotos().get(i).getNombre() + "\n" + "Direccion: " + Mecanicos.getMecMotos().get(i).getDireccion() + "\n" + "Telefono: " + Mecanicos.getMecMotos().get(i).getTelefono() + "\n" + "Correo: " + Mecanicos.getMecMotos().get(i).getCorreo());
            }
            printLabel.setText(strtohtml(info1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choEspec;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel printLabel;
    // End of variables declaration//GEN-END:variables
}
