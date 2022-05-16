public class Veda {
    private String fechaDeInicio;
    private String fechaDeFinalizacion;
    private String zona;
    private String especiesProtegidas;

    public Veda() {
    }

    public Veda(String fechaDeInicio, String fechaDeFinalizacion, String zona, String especiesProtegidas) {
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
        this.zona = zona;
        this.especiesProtegidas = especiesProtegidas;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public void setFechaDeFinalizacion(String fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getEspeciesProtegidas() {
        return especiesProtegidas;
    }

    public void setEspeciesProtegidas(String especiesProtegidas) {
        this.especiesProtegidas = especiesProtegidas;
    }
}
