/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

import javax.swing.JOptionPane;

/**
 *
 * @author Thomas
 */
public class Reportes {
    
    public void mostrarEspecialidades() {
    String especialidades = "<html><b>Especialidades:</b><br><br>" +
                "- <u>Mecánica básica:</u><br>" +
                "&nbsp;&nbsp;&nbsp;• Cambio de aceite y filtros<br>" +
                "&nbsp;&nbsp;&nbsp;• Cambio de bujías<br>" +
                "&nbsp;&nbsp;&nbsp;• Cambio de llantas<br>" +
                "&nbsp;&nbsp;&nbsp;• Revisión de frenos<br>" +
                "&nbsp;&nbsp;&nbsp;• Revisión de luces<br><br>" +

                "- <u>Mecánica automóviles Diesel:</u><br>" +
                "&nbsp;&nbsp;&nbsp;• Revisión de motor<br>" +
                "&nbsp;&nbsp;&nbsp;• Tune up<br>" +
                "&nbsp;&nbsp;&nbsp;• Desgastes mecánicos<br>" +
                "&nbsp;&nbsp;&nbsp;• Sistemas eléctricos<br><br>" +

                "- <u>Mecánica automóviles Eléctricos:</u><br>" +
                "&nbsp;&nbsp;&nbsp;• Sistema eléctrico y auxiliares<br>" +
                "&nbsp;&nbsp;&nbsp;• Batería<br>" +
                "&nbsp;&nbsp;&nbsp;• Revisión de frenos<br>" +
                "&nbsp;&nbsp;&nbsp;• Cambio de roles<br><br>" +

                "- <u>Mecánica automóviles Gasolina:</u><br>" +
                "&nbsp;&nbsp;&nbsp;• Revisión de motor<br>" +
                "&nbsp;&nbsp;&nbsp;• Tune up<br>" +
                "&nbsp;&nbsp;&nbsp;• Desgaste mecánico<br>" +
                "&nbsp;&nbsp;&nbsp;• Sistemas eléctricos<br>" +
                "&nbsp;&nbsp;&nbsp;• Cambio de roles<br>" +
                "&nbsp;&nbsp;&nbsp;• Cambio de caja de cambios<br><br>" +

                "- <u>Mecánica automóviles Motos:</u><br>" +
                "&nbsp;&nbsp;&nbsp;• Diagnosticar<br>" +
                "&nbsp;&nbsp;&nbsp;• Reparar componentes<br>" +
                "&nbsp;&nbsp;&nbsp;• Sistema de lubricación y refrigeración<br>" +
                "&nbsp;&nbsp;&nbsp;• Sistema de combustible<br>" +
                "&nbsp;&nbsp;&nbsp;• Sistema de encendido<br>" +
                "&nbsp;&nbsp;&nbsp;• Sistema de frenos<br>" +
                "&nbsp;&nbsp;&nbsp;• Sistema de dirección<br>" +
                "&nbsp;&nbsp;&nbsp;• Sistema de suspensión<br>" +
                "&nbsp;&nbsp;&nbsp;• Transmisión<br>" +
                "&nbsp;&nbsp;&nbsp;• Carga eléctrica<br><br>" +

                "- <u>Mecánica maquinaria Pesada:</u><br>" +
                "&nbsp;&nbsp;&nbsp;• Mantenimientos<br>" +
                "&nbsp;&nbsp;&nbsp;• Reparación<br>" +
                "&nbsp;&nbsp;&nbsp;• Transmisiones<br>" +
                "&nbsp;&nbsp;&nbsp;• Propulsión<br>" +
                "&nbsp;&nbsp;&nbsp;• Eléctrico<br>" +
                "&nbsp;&nbsp;&nbsp;• Chasis<br>";

    JOptionPane.showMessageDialog(null, especialidades, "Especialidades y Subespecialidades", JOptionPane.INFORMATION_MESSAGE);
}
    
}
