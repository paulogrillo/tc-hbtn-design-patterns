public class VideoMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void reproduzirVlc(String nomeArquivo) {
        System.out.print("Reproduzindo VLC: " + nomeArquivo);
    }
    @Override
    public void reproduzirMp4(String nomeArquivo) {
        System.out.print("Reproduzindo MP4: " + nomeArquivo);
    }
}