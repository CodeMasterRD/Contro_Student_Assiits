
package Logica;


import GUI.DialogoOperacines;
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
//        AsminDarshboard pDarshboard = new AsminDarshboard();
//        pDarshboard.setVisible(true);
//        pDarshboard.setLocationRelativeTo(null);
        
        
   
//        DBConexion conexion = new DBConexion();
//        conexion.getConexion();
    }
    
}
