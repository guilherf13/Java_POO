package Sobrecarga;

public class ContaBancariaApp {
    public static void main (String[] args){
        ContaBancaria contaBancaria1 = new ContaBancaria(1,"gui");
        ContaBancaria contaBancaria2 = new ContaBancaria(2,"Andre", 1000f);
        System.out.println("Numero da conta:" + contaBancaria1.getNumeroConta() + "Titular: " + contaBancaria1.getTitular() + "Valor: " + contaBancaria1.getValor());
        System.out.println("Numero da conta:" + contaBancaria2.getNumeroConta() + "Titular: " + contaBancaria2.getTitular() + "Valor: " + contaBancaria2.getValor());
    }
}
