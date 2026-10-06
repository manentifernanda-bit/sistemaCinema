package sistemaCinema1;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana Souza", "111.222.333-44", "(49) 99999-0000", 15, "ana@email.com");
        Funcionario f1 = new Funcionario("Carlos Lima", "555.666.777-88", "(49) 98888-1111", "Bilheteiro", 2200.00);

        Pessoa p1 = c1;
        Pessoa p2 = f1;

        System.out.println(p1.exibirDados());
        System.out.println(p2.exibirDados());

        System.out.println("Ana tem meia-entrada? " + c1.temDireitoMeiaEntrada());
    }

	 
	}
