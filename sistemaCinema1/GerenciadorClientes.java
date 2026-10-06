package sistemaCinema1;

import java.util.ArrayList;

public class GerenciadorClientes {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public boolean cadastrar(Cliente cliente) {
        if (buscarPorCpf(cliente.getCpf()) != null) {
            return false; 
        }
        clientes.add(cliente);
        return true;
    }

    public void listar() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c.exibirDados());
        }
    }

    public Cliente buscarPorCpf(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Cliente> buscarPorNome(String trecho) {
        ArrayList<Cliente> encontrados = new ArrayList<>();
        for (Cliente c : clientes) {
            if (c.getNome().toLowerCase().contains(trecho.toLowerCase())) {
                encontrados.add(c);
            }
        }
        return encontrados;
    }

    public boolean atualizar(String cpf, String novoNome, String novoTelefone, int novaIdade, String novoEmail) {
        Cliente c = buscarPorCpf(cpf);
        if (c == null) {
            return false;
        }
        c.setNome(novoNome);
        c.setTelefone(novoTelefone);
        c.setIdade(novaIdade);
        c.setEmail(novoEmail);
        return true;
    }

    public boolean remover(String cpf) {
        Cliente c = buscarPorCpf(cpf);
        if (c == null) {
            return false;
        }
        clientes.remove(c);
        return true;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}