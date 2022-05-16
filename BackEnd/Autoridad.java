public class Autoridad {
    private String nombre;
    private String DNI;
    private String direccion;
    private String telefono;
    private String fechaDeNacimiento;

    public Autoridad(String nombre, String DNI, String direccion, String telefono, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + DNI + "\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nFecha de nacimiento: " + fechaDeNacimiento;


    }
}
