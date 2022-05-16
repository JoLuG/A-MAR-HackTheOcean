public class Mapa {
    private String coordenadas;
    private String escala;

    public Mapa(String coordenadas, String escala) {
        this.coordenadas = coordenadas;
        this.escala = escala;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }
}
