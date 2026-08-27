package flaamingo.aprendendo.basic;

public class OperadoresParte04 {

    public static void main(String[] args) {

        // || OR -> OU

        double dinheiro = 180.0;
        boolean amigosBanca = true;

        boolean isEntradaFesta = dinheiro >= 200 || amigosBanca;

        System.out.println("Pode entrar na festa? " + isEntradaFesta);


        // Exercício 2

        double totalCompra = 0;

        totalCompra += 50;
        totalCompra += 100;
        totalCompra += 50;

        totalCompra /= 2;

        System.out.printf("Total da compra = %.2f%n", totalCompra);
    }
}