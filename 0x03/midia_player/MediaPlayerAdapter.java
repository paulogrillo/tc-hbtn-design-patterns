public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }
    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if (tipoMedia != TipoMedia.MP3) {
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }
    public MediaPlayerAdapter() {
    }
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if (tipoMedia == TipoMedia.VLC) {
            System.out.print("Reproduzindo " + tipoMedia.name() + ": "  + nomeArquivo);
        }
    }
}