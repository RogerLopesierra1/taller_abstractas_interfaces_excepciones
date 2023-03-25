package respuesta_A;

public class ReproductorMusica {
    public static void main(String[] args) {
        MP3 archivoMP3 = new MP3("4:25", 1024, "Artista1", "Compositor1", "Rock");
        WAV archivoWAV = new WAV("3:15", 512, "Artista2", "Compositor2", "Jazz");        

        archivoMP3.reproducir(); // Imprime "Reproduciendo archivo mp3..."
        archivoWAV.reproducir(); // Imprime "Reproduciendo archivo wav..."
    }
}
