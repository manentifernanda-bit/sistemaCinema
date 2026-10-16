package sistemaCinema1;

import java.util.ArrayList;

public class GerenciadorFilmes {

    private ArrayList<Filme> filmes = new ArrayList<>();

    
    public boolean cadastrar(Filme filme) {
        if (buscarPorId(filme.getId()) != null) {
            return false; 
        }
        filmes.add(filme);
        return true;
    }

    public void listar() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }
        for (Filme f : filmes) {
            System.out.println(f.exibirDados());
        }
    }

    public Filme buscarPorId(int id) {
        for (Filme f : filmes) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    public ArrayList<Filme> buscarPorTitulo(String trecho) {
        ArrayList<Filme> encontrados = new ArrayList<>();
        for (Filme f : filmes) {
            if (f.getTitulo().toLowerCase().contains(trecho.toLowerCase())) {
                encontrados.add(f);
            }
        }
        return encontrados;
    }

    public boolean atualizar(int id, String novoTitulo, String novoGenero, int novaDuracao) {
        Filme f = buscarPorId(id);
        if (f == null) {
            return false;
        }
        f.setTitulo(novoTitulo);
        f.setGenero(novoGenero);
        f.setDuracaoMinutos(novaDuracao);
        return true;
    }

    public boolean remover(int id) {
        Filme f = buscarPorId(id);
        if (f == null) {
            return false;
        }
        filmes.remove(f);
        return true;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }
}