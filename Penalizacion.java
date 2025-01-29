package biblioteca;

public class Penalizacion {
	 String motivo, estado;
	    double monto;
	    Usuario usuario;
	    
	    public Penalizacion(String motivo, double monto, String estado, Usuario usuario) {
	        this.motivo = motivo;
	        this.monto = monto;
	        this.estado = estado;
	        this.usuario = usuario;
	    }
}
