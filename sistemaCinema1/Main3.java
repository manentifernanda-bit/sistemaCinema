package sistemaCinema1;

import java.util.ArrayList;

public class Main3 {

    public static void main(String[] args) {

        GerenciadorFilmes gf = new GerenciadorFilmes();

        gf.cadastrar(new Filme3D(1, "Avatar", "Ficção", 162, 8.0));
        gf.cadastrar(new FilmeNormal(2, "Divertida Mente", "Animação", 95, true));
        gf.cadastrar(new FilmeNormal(3, "Vingadores", "Ação", 143, false));

        boolean deuCerto = gf.cadastrar(new FilmeNormal(1, "Repetido", "Drama", 90, true));
        System.out.println("Cadastrou filme com id repetido? " + deuCerto);

        System.out.println("\n--- Lista de filmes ---");
        gf.listar();

        System.out.println("\n--- Busca por id 2 ---");
        Filme achado = gf.buscarPorId(2);
        if (achado != null) {
            System.out.println(achado.exibirDados());
        }

        System.out.println("\n--- Busca por título 'vin' ---");
        ArrayList<Filme> resultado = gf.buscarPorTitulo("vin");
        for (Filme f : resultado) {
            System.out.println(f.exibirDados());
        }

        System.out.println("\n--- Atualizando filme 2 ---");
        gf.atualizar(2, "Divertida Mente 2", "Animação", 96);
        System.out.println(gf.buscarPorId(2).exibirDados());

        System.out.println("\n--- Removendo filme 3 ---");
        gf.remover(3);
        gf.listar();

       
        GerenciadorClientes gc = new GerenciadorClientes();

        gc.cadastrar(new Cliente("Ana Souza", "111.222.333-44", "(49) 99999-0000", 15, "ana@email.com"));
        gc.cadastrar(new Cliente("José Pereira", "999.888.777-66", "(49) 97777-2222", 70, "jose@email.com"));

        System.out.println("\n--- Lista de clientes ---");
        gc.listar();

        System.out.println("\n--- Atualizando a idade da Ana ---");
        gc.atualizar("111.222.333-44", "Ana Souza", "(49) 99999-0000", 18, "ana@email.com");
        System.out.println(gc.buscarPorCpf("111.222.333-44").exibirDados());

        System.out.println("\n--- Removendo o José ---");
        gc.remover("999.888.777-66");
        gc.listar();
    }
}