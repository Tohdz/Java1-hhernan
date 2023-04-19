/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportesroble;

import Controllers.ChoferesControllers;
import Controllers.MenuControllers;
import Controllers.PersonasControllers;
import Controllers.UsuariosControllers;
import Controllers.VehiculosControllers;
import Controllers.ViajesControllers;
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
        PersonasControllers personas = new PersonasControllers();
        ChoferesControllers choferes = new ChoferesControllers();
        VehiculosControllers vehiculos = new VehiculosControllers();
        ViajesControllers viajes = new ViajesControllers();
        MenuControllers menu = new MenuControllers();
        usuarios.precarga();
        personas.precarga();
        vehiculos.precarga();
        choferes.precarga();
        viajes.precarga();

        String user =JOptionPane.showInputDialog("Ingrese el codigo de Usuario: ");
        String password =JOptionPane.showInputDialog("Ingrese la contraseña: ");
        for (int u = 0; u < usuarios.getUsuarios().size(); u++) {
            if (user == null ? usuarios.getUsuarios().get(u).getCodigoU() == null : user.equals(usuarios.getUsuarios().get(u).getCodigoU())&&password == null ? usuarios.getUsuarios().get(u).getClave() == null : password.equals(usuarios.getUsuarios().get(u).getClave())){
                menu.menu();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario Invalido, Valide sus privilegios");
            }
        }
    }
    
}
