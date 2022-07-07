public class WesterosPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome){
        if (tipo == TipoPersonagem.MAGO) {
            return new Mago(nome, 8, 3, 3, 3, 4);
        } else if (tipo == TipoPersonagem.GUERREIRO) {
            return new Guerreiro(nome, 0, 9, 7, 10, 7);
        } else if (tipo == TipoPersonagem.LADRAO) {
            return new Ladrao(nome, 1, 8, 7, 7, 10);
        }
        return null;
    }
}
