/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author hhern
 */
public class Conexion {

    String bd = "projprog";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "Njhvto0693*";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion() {
        this.bd=bd;
    }
    

    public Connection conectar() {
        
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a base de datos");
        }
        return cx;
    }
    
    public void desconectar(){
        try{
            cx.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al desconectar base de datos");
        }
    }
    
   
    
}
