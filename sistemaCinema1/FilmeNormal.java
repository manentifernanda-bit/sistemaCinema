package sistemaCinema1;

public class FilmeNormal extends Filme {

    private boolean ehDublado;

    public FilmeNormal(int id, String titulo, String genero, int duracaoMinutos, boolean ehDublado) {
        super(id, titulo, genero, duracaoMinutos);
        this.ehDublado = ehDublado;
    }

    public boolean isEhDublado() { return ehDublado; }
    public void setEhDublado(boolean ehDublado) { this.ehDublado = ehDublado; }

    @Override
    public double calcularPreco() {
        return PRECO_BASE;
    }

    @Override
    public String exibirDados() {
        String audio = ehDublado ? "Dublado" : "Legendado";
        return "[NORMAL] " + super.exibirDados() + " | Áudio: " + audio;
    }
}