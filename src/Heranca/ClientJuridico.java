package Heranca;

public class ClientJuridico extends Client{
    private int cnpj;

    public ClientJuridico(int cnpj, String nome, int idade){
        super(nome, idade);
        this.cnpj = cnpj;
//        this.setNome(nome);
//        this.setIdade(idade);
    }

    public int getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
}
