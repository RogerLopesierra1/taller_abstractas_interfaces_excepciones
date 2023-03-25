package respuesta_A;

public class ReproductorMultimedia {
    public static void main(String[] args) {
        MP3 archivoMP3 = new MP3("4:25", 1024, "Artista1", "Compositor1", "Rock");
        WAV archivoWAV = new WAV("3:15", 512, "Artista2", "Compositor2", "Jazz");
        MP4 archivoMP4 = new MP4("5:20", 650,"Creador1", "TipoVideo1");

        archivoMP3.reproducir(); // Imprime "Reproduciendo archivo mp3..."
        archivoWAV.reproducir(); // Imprime "Reproduciendo archivo wav..."
        archivoMP4.reproducir(); // Imprime "Reproduciendo audio del archivo mp4..."

        System.out.println("Artista del archivo mp3: " + archivoMP3.getArtista()); // Imprime "Artista1"
        System.out.println("Creador del archivo mp4: " + archivoMP4.getCreador()); // Imprime "Creador1"
    }
}
