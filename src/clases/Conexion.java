/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Conexion {
    Connection connect = null;
    
    public Connection conectar (){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/asistencia","root","");
            //JOptionPane.showMessageDialog(null, "CONECTADO");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return connect;
    }
    
}
    

