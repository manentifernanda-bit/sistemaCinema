package sistemaCinema1;

    	import java.time.LocalDateTime;
    	import java.util.ArrayList;

    	public class Main {

    	    public static void main(String[] args) {

    	        // ========================================
    	        // 1. CADASTRO E EXIBIÇÃO DE PESSOAS
    	        // ========================================

    	        System.out.println("===== PESSOAS =====");

    	        Cliente c1 = new Cliente(
    	            "Ana Souza",
    	            "111.222.333-44",
    	            "(49) 99999-0000",
    	            15,
    	            "ana@email.com"
    	        );

    	        Funcionario f1 = new Funcionario(
    	            "Carlos Lima",
    	            "555.666.777-88",
    	            "(49) 98888-1111",
    	            "Bilheteiro",
    	            2200.00
    	        );

    	        Pessoa p1 = c1;
    	        Pessoa p2 = f1;

    	        System.out.println(p1.exibirDados());
    	        System.out.println(p2.exibirDados());

    	        System.out.println(
    	            "Ana tem meia-entrada? " + c1.temDireitoMeiaEntrada()
    	        );


    	        // ========================================
    	        // 2. FILMES E PREÇOS
    	        // ========================================

    	        System.out.println("\n===== FILMES E PREÇOS =====");

    	        Filme filme1 = new Filme3D(
    	            1, "Avatar", "Ficção", 162, 8.0
    	        );

    	        Filme filme2 = new FilmeNormal(
    	            2, "Divertida Mente", "Animação", 95, true
    	        );

    	        System.out.println(filme1.exibirDados());
    	        System.out.println(filme2.exibirDados());

    	        System.out.println(
    	            "Preço Avatar: R$ " + filme1.calcularPreco()
    	        );

    	        System.out.println(
    	            "Preço Divertida Mente: R$ " + filme2.calcularPreco()
    	        );


    	        // ========================================
    	        // 3. SESSÕES E INGRESSOS
    	        // ========================================

    	        System.out.println("\n===== SESSÕES E INGRESSOS =====");

    	        Sala sala1 = new Sala(1, 80);

    	        Sessao s1 = new Sessao(
    	            1,
    	            LocalDateTime.of(2026, 10, 10, 19, 30),
    	            sala1,
    	            filme1
    	        );

    	        Cliente ana = new Cliente(
    	            "Ana Souza",
    	            "111.222.333-44",
    	            "(49) 99999-0000",
    	            15,
    	            "ana@email.com"
    	        );

    	        Cliente jose = new Cliente(
    	            "José Pereira",
    	            "999.888.777-66",
    	            "(49) 97777-2222",
    	            70,
    	            "jose@email.com"
    	        );

    	        Ingresso i1 = new Ingresso(1, s1, ana);
    	        Ingresso i2 = new Ingresso(2, s1, jose);

    	        System.out.println(i1.exibirDados());
    	        System.out.println();
    	        System.out.println(i2.exibirDados());


    	        // ========================================
    	        // 4. GERENCIAMENTO DE FILMES
    	        // ========================================

    	        System.out.println("\n===== GERENCIAMENTO DE FILMES =====");

    	        GerenciadorFilmes gf = new GerenciadorFilmes();

    	        gf.cadastrar(
    	            new Filme3D(1, "Avatar", "Ficção", 162, 8.0)
    	        );

    	        gf.cadastrar(
    	            new FilmeNormal(2, "Divertida Mente", "Animação", 95, true)
    	        );

    	        gf.cadastrar(
    	            new FilmeNormal(3, "Vingadores", "Ação", 143, false)
    	        );

    	        boolean deuCerto = gf.cadastrar(
    	            new FilmeNormal(1, "Repetido", "Drama", 90, true)
    	        );

    	        System.out.println(
    	            "Cadastrou filme com id repetido? " + deuCerto
    	        );

    	        System.out.println("\n--- Lista de filmes ---");
    	        gf.listar();

    	        System.out.println("\n--- Busca por id 2 ---");

    	        Filme filmeAchado = gf.buscarPorId(2);

    	        if (filmeAchado != null) {
    	            System.out.println(filmeAchado.exibirDados());
    	        }

    	        System.out.println("\n--- Busca por título 'vin' ---");

    	        ArrayList<Filme> resultado = gf.buscarPorTitulo("vin");

    	        for (Filme filme : resultado) {
    	            System.out.println(filme.exibirDados());
    	        }

    	        System.out.println("\n--- Atualizando filme 2 ---");

    	        gf.atualizar(
    	            2,
    	            "Divertida Mente 2",
    	            "Animação",
    	            96
    	        );

    	        Filme filmeAtualizado = gf.buscarPorId(2);

    	        if (filmeAtualizado != null) {
    	            System.out.println(filmeAtualizado.exibirDados());
    	        }

    	        System.out.println("\n--- Removendo filme 3 ---");

    	        gf.remover(3);
    	        gf.listar();


    	        // ========================================
    	        // 5. GERENCIAMENTO DE CLIENTES
    	        // ========================================

    	        System.out.println("\n===== GERENCIAMENTO DE CLIENTES =====");

    	        GerenciadorClientes gc = new GerenciadorClientes();

    	        gc.cadastrar(
    	            new Cliente(
    	                "Ana Souza",
    	                "111.222.333-44",
    	                "(49) 99999-0000",
    	                15,
    	                "ana@email.com"
    	            )
    	        );

    	        gc.cadastrar(
    	            new Cliente(
    	                "José Pereira",
    	                "999.888.777-66",
    	                "(49) 97777-2222",
    	                70,
    	                "jose@email.com"
    	            )
    	        );

    	        System.out.println("\n--- Lista de clientes ---");
    	        gc.listar();

    	        System.out.println("\n--- Atualizando a idade da Ana ---");

    	        gc.atualizar(
    	            "111.222.333-44",
    	            "Ana Souza",
    	            "(49) 99999-0000",
    	            18,
    	            "ana@email.com"
    	        );

    	        Cliente clienteAtualizado =
    	            gc.buscarPorCpf("111.222.333-44");

    	        if (clienteAtualizado != null) {
    	            System.out.println(clienteAtualizado.exibirDados());
    	        }

    	        System.out.println("\n--- Removendo o José ---");

    	        gc.remover("999.888.777-66");
    	        gc.listar();


    	        // ========================================
    	        // FIM DO PROGRAMA
    	        // ========================================

    	        System.out.println("\n===== FIM DO SISTEMA DE CINEMA =====");
    	    }
    	}