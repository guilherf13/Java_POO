package Polimorfismo;

public class Produto {
    private String produto;
    private int codigo;
    private double preco;

    public Produto(String produto, int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
        this.produto = produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String descricao() {
        return "Produto Generico: " + produto + "Preco: " + preco + " Codigo: " + codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
