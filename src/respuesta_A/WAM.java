package respuesta_A;

class WAV extends FormatoMusical {
    public WAV(String duracion, int tamaño, String artista, String compositor, String generoMusical) {
        super(duracion, tamaño, artista, compositor, generoMusical);
    }

    @Override
    public void reproducir() {
        // Lógica específica para reproducir un archivo wav
        System.out.println("Reproduciendo archivo wav...");
    }
}

