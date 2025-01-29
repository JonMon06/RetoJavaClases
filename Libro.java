package biblioteca;

public class Libro {
	String titulo, ISBN, genero;
    int ejemplaresDisponibles;
    
    public Libro(String titulo, String ISBN, String genero, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.genero = genero;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }
}
