package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas,
			String co_autor, String editorial, String edicion, String interpretacion) {
		
		super(origen,titulo,autor,paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
		
	}
	
	public int palabrasTotales(int parametro) {
		return getPaginas() * parametro * 2;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.co_autor + "\n";
		r += this.editorial + "\n";
		r += this.edicion + "\n";
		return r;
	}
	
	public String getCo_autor() {
		return co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
}
