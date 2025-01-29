package biblioteca;

public class Usuario {
	String nombre, correo;
    boolean membresiaActiva;
    
    public Usuario(String nombre, String correo, boolean membresiaActiva) {
        this.nombre = nombre;
        this.correo = correo;
        this.membresiaActiva = membresiaActiva;
    }
}
