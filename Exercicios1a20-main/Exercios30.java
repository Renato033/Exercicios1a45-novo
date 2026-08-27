package flaamingo.aprendendo.basic.exercicio.estruturascondicionais;

public class Exercios30 {

    public static void main(String[] args) {

        int tipoCliente = 3;
        double valorCompra = 500.00;
        double desconto = 0;

        switch (tipoCliente) {
            case 1:
                desconto = 0.0;
                break;

            case 2:
                desconto = 0.05;
                break;

            case 3:
                desconto = 0.10;
                break;

            case 4:
                desconto = 0.15;
                break;

            default:
                System.out.println("Tipo de cliente inválido.");
                return;
        }

        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }

}
