package sistemaCinema1;

public class Cliente extends Pessoa {

    private int idade;
    private String email;

    public Cliente(String nome, String cpf, String telefone, int idade, String email) {
        super(nome, cpf, telefone);
        this.idade = idade;
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
    public boolean temDireitoMeiaEntrada() {
        return idade < 12 || idade >= 60;
    }

    @Override
    public String exibirDados() {
        return "[CLIENTE] " + super.exibirDados()
                + " | Idade: " + idade + " | E-mail: " + email;
    }
}