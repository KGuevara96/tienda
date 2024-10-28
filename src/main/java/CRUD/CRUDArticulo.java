
package CRUD;
import ConectDB.Conexion;
import Tablas.Articulos;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
public class CRUDArticulo extends Conexion{

    ResultSet rs;
    Articulos ar= new Articulos();
    
   
    public ArrayList<Articulos> buscar(Articulos articulo){
        ArrayList<Articulos> articulos = new ArrayList<>();
        try{
            Connection connection=ConexionSQL();
            java.sql.Statement st=connection.createStatement();
            String sql="SELECT * FROM public.articulo where codigo_barras = "+articulo.getCodBarras()+" ORDER BY codigo_barras ASC ";
            rs=st.executeQuery(sql);
            while(rs.next()){
                ar.setCodBarras(rs.getString("codigo_barras"));
                
                ar.setNombre(rs.getString("nombre"));
                
                ar.setClasificacion(rs.getString("clasificacion"));
                
                ar.setCantStock(rs.getString("cantidad_stock"));
                articulos.add(ar);
            }
        st.close();
        connection.close();
        }catch(Exception e){
            
        }
        return  articulos;
    }
    public ArrayList<Articulos> buscarAll(){
        ArrayList<Articulos> articulos = new ArrayList<>();
        try{
            Connection connection=ConexionSQL();
            java.sql.Statement st=connection.createStatement();
            String sql="SELECT codigo_barras, nombre, clasificacion, cantidad_stock FROM public.articulo; ";
            rs=st.executeQuery(sql);
            while(rs.next()){
                Articulos art=new Articulos();
                art.setCodBarras(rs.getString("codigo_barras"));
                
                art.setNombre(rs.getString("nombre"));
                
                art.setClasificacion(rs.getString("clasificacion"));
                
                art.setCantStock(rs.getString("cantidad_stock"));
                articulos.add(art);
            }
        st.close();
        connection.close();
        }catch(Exception e){
            
        }
        return  articulos;
    }
}
