package flaamingo.aprendendo.basic.exercicio.estruturascondicionais;

public class Exercios16 {
    static void main(String[] args) {

        double valorCompra = 250.00;

        if (valorCompra >= 200) {
            double desconto = 0.10;
            double ValorFinal = valorCompra - desconto;

            System.out.println(" Valor final da compra: R$ " + valorFinal);
        } else {
            System.out.println(" Valor original da compra: R$ " + valorCompra);
        }
    }
}
