public interface RegistroPescasdor {
    public void registrarPescador(String nombre, String DNI, String dirección, String teléfono, String fechaDeNacimiento);
    public void listarPescadores();
    public void buscarPescador(String DNI);
    public void modificarPescador(String DNI, String nombre, String dirección, String teléfono, String fechaDeNacimiento);
    public void eliminarPescador(String DNI);

}
