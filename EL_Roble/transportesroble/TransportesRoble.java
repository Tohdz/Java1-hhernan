/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportesroble;

import Controllers.MenuControllers;
import Controllers.UsuariosControllers;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class TransportesRoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuariosControllers usuarios = new UsuariosControllers();
        MenuControllers menu = new MenuControllers();
        usuarios.disponibilidad();
        String user =JOptionPane.showInputDialog("Ingrese el codigo de Usuario: ");
        String password =JOptionPane.showInputDialog("Ingrese la contraseña: ");
        for (int u = 0; u < usuarios.getUsuarios().size(); u++) {
            if (user == null ? usuarios.getUsuarios().get(u).getCodigoU() == null : user.equals(usuarios.getUsuarios().get(u).getCodigoU())&&password == null ? usuarios.getUsuarios().get(u).getClave() == null : password.equals(usuarios.getUsuarios().get(u).getClave())){
                menu.menu();
            }
        }   
    }
    
}
