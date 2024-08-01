package Heranca;

public class ClientFisico extends Client{
    private int cpf;

    public ClientFisico(int cpf, String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
        this.setNome(nome);
        this.setIdade(idade);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
