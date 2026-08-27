package flaamingo.aprendendo.basic.exercicio.estruturascondicionais;

public class Exercios27 {

    public static void main(String[] args) {

        int codigoProduto = 3;

        if (codigoProduto == 1) {
            System.out.println("Eletrônico");
        } else if (codigoProduto == 2) {
            System.out.println("Alimento");
        } else if (codigoProduto == 3) {
            System.out.println("Roupa");
        } else if (codigoProduto == 4) {
            System.out.println("Livro");
        } else {
            System.out.println("Categoria inválida");
        }
    }

}
