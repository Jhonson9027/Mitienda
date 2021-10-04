
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author jhons
 */
public class Conexion {
    
    connection conectar = null;
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mitienda","root","");
            JOptionPane.showMessageDialog(null,"Exitosa","Conexion",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException | SQLException e)
        {
        JOptionPane.showMessageDialog(null,"Error" + e ,"Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return conectar;
    }
    
}
