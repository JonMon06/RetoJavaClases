package biblioteca;

public class Prestamo {
	String fechaPrestamo, fechaDevolucion, estado;
    Usuario usuario;
    Libro libro;
    Empleado empleado;
    
    public Prestamo(String fechaPrestamo, String fechaDevolucion, String estado, Usuario usuario, Libro libro, Empleado empleado) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.usuario = usuario;
        this.libro = libro;
        this.empleado = empleado;
    }
}
