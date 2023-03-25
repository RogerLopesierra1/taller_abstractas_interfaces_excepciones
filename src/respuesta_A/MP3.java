package respuesta_A;

class MP3 extends FormatoMusical {
    public MP3(String duracion, int tamaño, String artista, String compositor, String generoMusical) {
        super(duracion, tamaño, artista, compositor, generoMusical);
    }

    @Override
    public void reproducir() {
        // Lógica específica para reproducir un archivo mp3
        System.out.println("Reproduciendo archivo mp3...");
    }
}
