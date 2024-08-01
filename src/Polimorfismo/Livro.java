package Polimorfismo;

public class Livro extends Produto{
    public Livro(String produto, int codigo, double preco) {
        super(produto, codigo, preco);
    }

    public String descricao() {
        return "Produto Livro: " + getProduto() + "Preco: " + getPreco() + " Codigo: " + getCodigo();
    }
}
