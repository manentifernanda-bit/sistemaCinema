package sistemaCinema1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sessao {

    private int id;
    private LocalDateTime dataHora;
    private Sala sala;
    private Filme filme;

    public Sessao(int id, LocalDateTime dataHora, Sala sala, Filme filme) {
        this.id = id;
        this.dataHora = dataHora;
        this.sala = sala;
        this.filme = filme;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public Sala getSala() { return sala; }
    public void setSala(Sala sala) { this.sala = sala; }

    public Filme getFilme() { return filme; }
    public void setFilme(Filme filme) { this.filme = filme; }

    public String exibirDados() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Sessão #" + id + " | " + dataHora.format(formato)
                + " | " + sala.exibirDados()
                + " | Filme: " + filme.getTitulo();
    }
}