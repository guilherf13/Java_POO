package Sobrecarga;

//Exemplo de 2 construtores na mesma class.
public class ContaBancaria {
    private int numeroConta;
    private double valor;
    String titular;

    public ContaBancaria(int numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.valor = 10.11;
    }

    public ContaBancaria(int numeroConta, String titular, float valor){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.valor = valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
