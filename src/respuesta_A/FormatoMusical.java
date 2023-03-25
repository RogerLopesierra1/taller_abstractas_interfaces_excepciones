package respuesta_A;

abstract class FormatoMusical {
	private String duracion;
	private double tamano;
	private String artista;
	private String compositor;
	private String genero;
	
	public FormatoMusical() {
		
	}

	public FormatoMusical(String duracion, double tamano, String artista, String compositor, String genero) {		
		this.duracion = duracion;
		this.tamano = tamano;
		this.artista = artista;
		this.compositor = compositor;
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public double getTamano() {
		return tamano;
	}

	public String getArtista() {
		return artista;
	}

	public String getCompositor() {
		return compositor;
	}

	public String getGenero() {
		return genero;
	}
	
	
	public abstract void reproducir();
	
	
}
