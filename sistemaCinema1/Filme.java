package sistemaCinema1;

public abstract class Filme {

    
    protected static final double PRECO_BASE = 20.0;

    private int id;
    private String titulo;
    private String genero;
    private int duracaoMinutos;

    public Filme(int id, String titulo, String genero, int duracaoMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getDuracaoMinutos() { return duracaoMinutos; }
    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos > 0) {
            this.duracaoMinutos = duracaoMinutos;
        } else {
            System.out.println("Duração inválida!");
        }
    }

   
    public abstract double calcularPreco();

    public String exibirDados() {
        return "Filme #" + id + " | " + titulo + " | Gênero: " + genero
                + " | Duração: " + duracaoMinutos + " min";
    }
}