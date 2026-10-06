package sistemaCinema1;

public class Ingresso {

    private int id;
    private double valor;
    private Sessao sessao;
    private Cliente cliente;

    public Ingresso(int id, Sessao sessao, Cliente cliente) {
        this.id = id;
        this.sessao = sessao;
        this.cliente = cliente;
        this.valor = calcularValor();
    }

    
    private double calcularValor() {
        double preco = sessao.getFilme().calcularPreco();
        if (cliente.temDireitoMeiaEntrada()) {
            preco = preco / 2;
        }
        return preco;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public Sessao getSessao() { return sessao; }
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
        this.valor = calcularValor();
    }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.valor = calcularValor();
    }

    public String exibirDados() {
        return "Ingresso #" + id
                + "\n  Cliente: " + cliente.getNome()
                + "\n  " + sessao.exibirDados()
                + "\n  Valor: R$ " + String.format("%.2f", valor);
    }
}