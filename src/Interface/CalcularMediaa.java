package Interface;

//Class que implementa a interface CalcularMedia.
public class CalcularMediaa implements CalcularMedia{
    double valor1, valor2;

    @Override
    public Double calcularMedia(double valor1, double valor2) {
        return valor1+valor2;
    }
}
