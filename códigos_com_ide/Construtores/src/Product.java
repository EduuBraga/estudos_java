import java.util.Objects;

public class Product {
    String nome;
    double preco;
    static int quantidadeProdutosCadastrados;

    Product() {
        quantidadeProdutosCadastrados++;
    }

    Product(String nome) {
        Objects.requireNonNull(nome, "O produto deve ter um nome");

        quantidadeProdutosCadastrados++;
        this.nome = nome;
    }

    Product(String nome, double preco) {
        validandoArgumentosConstrutores(nome, preco);

        quantidadeProdutosCadastrados++;
        this.nome = nome;
        this.preco = preco;
    }

    static void validandoArgumentosConstrutores(String nome, double preco){
        Objects.requireNonNull(nome, "O produto deve ter um nome");

        if(preco < 0){
            throw new IllegalArgumentException();
        }
    }
}
