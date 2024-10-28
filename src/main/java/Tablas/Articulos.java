package Tablas;

public class Articulos {

    private String CodBarras;
    private String Nombre;
    private String Clasificacion;
    private String CantStock;

    public Articulos() {
    }

    public Articulos(String CodBarras, String Nombre, String Clasificacion, String CantStock) {
        this.CodBarras = CodBarras;
        this.Nombre = Nombre;
        this.Clasificacion = Clasificacion;
        this.CantStock = CantStock;
    }
    

    public String getCodBarras() {
        return CodBarras;
    }

    public void setCodBarras(String CodBarras) {
        this.CodBarras = CodBarras;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getCantStock() {
        return CantStock;
    }

    public void setCantStock(String CantStock) {
        this.CantStock = CantStock;
    }
    
    

}
