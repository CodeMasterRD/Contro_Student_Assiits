
package Logica;

import GUI.HomeStudentsGUI;
import GUI.MenuStudentsGUI;
import Percistencia.DBConexion;
import java.io.FileNotFoundException;
import java.sql.SQLException;


public class ControStudenAssits {

    
    public static void main(String[] args) throws FileNotFoundException, SQLException{
        //TODO code application logic here
        HomeStudentsGUI pantallaHome = new HomeStudentsGUI();
        pantallaHome.setVisible(true);
        pantallaHome.setLocationRelativeTo(null);
   
//        DBConexion conexion = new DBConexion();
//        conexion.getConexion();
    }
    
}
