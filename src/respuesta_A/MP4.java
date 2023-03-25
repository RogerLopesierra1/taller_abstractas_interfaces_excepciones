package respuesta_A;



public class MP4 implements FormatoVideo{
	
	private String duracion;
	private double tamano;
	private String creador;
    private String tipoVideo;   

	public MP4(String duracion, double tamano, String creador, String tipoVideo) {
		super();
		this.duracion = duracion;
		this.tamano = tamano;
		this.creador = creador;
		this.tipoVideo = tipoVideo;
	}	

	public String getDuracion() {
		return duracion;
	}

	public double getTamano() {
		return tamano;
	}

	public String getCreador() {
		return creador;
	}

	public String getTipoVideo() {
		return tipoVideo;
	}

	@Override
	public void reproducir() {
		System.out.println("reproducir audio MP4");		
	}

}
