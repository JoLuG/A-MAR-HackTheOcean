public class Especie {
    private String nombre;
    private String descripcion;
    private String imagen;
    private String estatusDeConservacion;

    public Especie(){

    }

    public Especie(String nombre, String descripcion, String imagen, String estatusDeConservacion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.estatusDeConservacion = estatusDeConservacion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getImagen(){
        return imagen;
    }

    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    public String getEstatusDeConservacion(){
        return estatusDeConservacion;
    }

    public void setEstatusDeConservacion(String estatusDeConservacion){
        this.estatusDeConservacion = estatusDeConservacion;
    }



}
