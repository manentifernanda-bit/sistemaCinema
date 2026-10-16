package sistemaCinema1;

public class Filme3D extends Filme {

    private double taxaOculos3D;

    public Filme3D(int id, String titulo, String genero, int duracaoMinutos, double taxaOculos3D) {
        super(id, titulo, genero, duracaoMinutos);
        this.taxaOculos3D = taxaOculos3D;
    }

    public double getTaxaOculos3D() { return taxaOculos3D; }
    public void setTaxaOculos3D(double taxaOculos3D) { this.taxaOculos3D = taxaOculos3D; }

    @Override
    public double calcularPreco() {
        return PRECO_BASE + taxaOculos3D;
    }

    @Override
    public String exibirDados() {
        return "[3D] " + super.exibirDados()
                + " | Taxa dos óculos: R$ " + String.format("%.2f", taxaOculos3D);
    }
}