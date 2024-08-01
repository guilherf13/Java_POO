package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Vingadores", 123, 50);
        Notebook notebook = new Notebook("Samsung", 1540, 2999.99);
        Produto produto = new Produto("Chave de Solda", 123, 500.00);

        System.out.println(livro.descricao());
        System.out.println(notebook.descricao());
        System.out.println(produto.descricao());

    }
}
