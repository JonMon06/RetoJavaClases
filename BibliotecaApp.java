package biblioteca;

public class BibliotecaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libreria libreria = new Libreria("Biblioteca Central", "Calle 123", "555-1234");
        Libro libro1 = new Libro("Cien Años de Soledad", "978-3-16-148410-0", "Novela", 3);
        Usuario usuario1 = new Usuario("Juan Pérez", "juan@email.com", true);
        Empleado empleado1 = new Empleado("Carlos López", 1, "Bibliotecario");
        Prestamo prestamo1 = new Prestamo("2024-01-10", "2024-02-10", "Pendiente", usuario1, libro1, empleado1);
        Penalizacion penalizacion1 = new Penalizacion("Devolución tardía", 10.0, "No pagado", usuario1);
        
        System.out.println("Librería: " + libreria.nombre);
        System.out.println("Libro prestado: " + prestamo1.libro.titulo);
        System.out.println("Usuario: " + prestamo1.usuario.nombre);
        System.out.println("Empleado a cargo: " + prestamo1.empleado.nombre);
        System.out.println("Penalización: " + penalizacion1.motivo + " - Monto: $" + penalizacion1.monto);
    
	}

}
