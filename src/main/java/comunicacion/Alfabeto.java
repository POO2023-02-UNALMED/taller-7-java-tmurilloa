package comunicacion;

public class Alfabeto extends Pictograma {
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String acumulador = "";
		for (String letra: letras) {
			if (acumulador.equals("")){
				acumulador = acumulador + letra;
			}
			else {
				acumulador = acumulador + ", " + letra;
			}
		}
		return acumulador;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String[] getLetras() {
		return letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
		
}

