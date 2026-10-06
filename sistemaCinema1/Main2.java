package sistemaCinema1;

import java.time.LocalDateTime;

public class Main2 {

    public static void main(String[] args) {

       
        Filme f1 = new Filme3D(1, "Avatar", "Ficção", 162, 8.0);
        Filme f2 = new FilmeNormal(2, "Divertida Mente", "Animação", 95, true);

        System.out.println(f1.exibirDados());
        System.out.println(f2.exibirDados());
        System.out.println("Preço Avatar: R$ " + f1.calcularPreco());
        System.out.println("Preço Divertida Mente: R$ " + f2.calcularPreco());
        System.out.println();

      
        Sala sala1 = new Sala(1, 80);
        Sessao s1 = new Sessao(1, LocalDateTime.of(2026, 10, 10, 19, 30), sala1, f1);

       
        Cliente ana = new Cliente("Ana Souza", "111.222.333-44", "(49) 99999-0000", 15, "ana@email.com");
        Cliente jose = new Cliente("José Pereira", "999.888.777-66", "(49) 97777-2222", 70, "jose@email.com");

        
        Ingresso i1 = new Ingresso(1, s1, ana);
        Ingresso i2 = new Ingresso(2, s1, jose);

        System.out.println(i1.exibirDados());
        System.out.println();
        System.out.println(i2.exibirDados());
    }
}