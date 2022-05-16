public class Pescador {
    private String nombre;
    private String DNI;
    private String dirección;
    private String teléfono;
    private String fechaDeNacimiento;

    public Pescador(String nombre, String DNI, String dirección, String teléfono, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
