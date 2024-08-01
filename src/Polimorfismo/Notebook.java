package Polimorfismo;

public class Notebook extends Produto{
    public Notebook(String produto, int codigo, double preco) {
        super(produto, codigo, preco);
    }

    public String descricao(){
        return "Produto Notebook: " + getProduto() + "Preco: " + getPreco() + " Codigo: " + getCodigo();
    }
}
