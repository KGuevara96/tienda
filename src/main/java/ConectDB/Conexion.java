package ConectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection cn = null;
    String url = "jdbc:postgresql://localhost:5432/tienda";
    String user = "POO";
    String pass = "";
    public Connection ConexionSQL(){
        try{
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection(url,user,pass);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa","Conexion",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Conexion fallida: "+e,"Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return cn;
    }
    public void Cerrar(){
        try{
            cn.close();
           //  JOptionPane.showMessageDialog(null, "Desconexion exitosa","Conexion",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Desconexion fallida: "+e,"Conexion",JOptionPane.ERROR_MESSAGE);
        }
    }
}
