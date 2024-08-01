package Heranca;

public class ClientApp {
    public static void main(String[] args) {

        ClientJuridico juridico = new ClientJuridico(1254,"Bob", 12);
        ClientFisico fisico = new ClientFisico(3345,"Andre", 13);

        System.out.println("Os dados são nome ClientJuridico " + juridico.getNome());
        System.out.println("Os dados são nome ClientFisico " + fisico.getNome());
    }
}
