public class Captura {
    private String fecha;
    private String especie;
    private String pescador;
    private String autoridadMaritima;
    private String ubicacion;
    private String cantidad;


    public Captura(String fecha, String especie, String pescador, String autoridadMaritima, String ubicacion, String cantidad) {
        this.fecha = fecha;
        this.especie = especie;
        this.pescador = pescador;
        this.autoridadMaritima = autoridadMaritima;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPescador() {
        return pescador;
    }

    public void setPescador(String pescador) {
        this.pescador = pescador;
    }

    public String getAutoridadMaritima() {
        return autoridadMaritima;
    }

    public void setAutoridadMaritima(String autoridadMaritima) {
        this.autoridadMaritima = autoridadMaritima;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /*
    

Instrucciones:

El método capturar especie() permitirá al pescador registrar una especie capturada. Se deberá solicitar la siguiente información:

Nombre de la especie: el nombre de la especie capturada.

Cantidad: la cantidad de especies capturadas.

Ubicación: la ubicación de la captura.

El método notificarAutoridad() permitirá notificar a las autoridades marítimas sobre las capturas de especies en peligro de extinción. Se deberá solicitar la siguiente información:

Nombre de la especie: el nombre de la especie capturada.

Cantidad: la cantidad de especies capturadas.

Ubicación: la ubicación de la captura.
*/
    public void capturar() {
        System.out.println("Captura de especie");
        System.out.println("Nombre de la especie: " + especie);
        System.out.println("Cantidad: " + especie);
        System.out.println("Ubicación: " + ubicacion);
    }

    public void notificarAutoridad() {
        System.out.println("Notificar autoridad");
        System.out.println("Nombre de la especie: " + especie);
        System.out.println("Cantidad: " + especie);
        System.out.println("Ubicación: " + ubicacion);
    }

    public static void main(String[] args) {
        Captura captura = new Captura("12/12/2020", "Pulpo", "Juan", "María", "Calle falsa 123");
        captura.capturar();
        captura.notificarAutoridad();
    }
}
