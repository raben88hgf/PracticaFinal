/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 22PROGB07
 */
public class datosenfermeria {
    Connection cn;
    public Connection conectar(){
    String host="datosenfermeria://190.1.0.131/";
    String user="22progb12";
    String pass="usuario12";
    String bd="22progb12";
    try{
    cn=DriverManager.getConnection(host+bd,user,pass);
    JOptionPane.showMessageDialog(null,"Conecion exitosa");
    System.out.println("Conecion exitosa");
    
}catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Erro"+ex.getMessage());
    System.out.println(ex.getCause()+"Error");
}
    return cn;
}
}
