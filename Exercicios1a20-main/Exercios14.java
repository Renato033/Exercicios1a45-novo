package flaamingo.aprendendo.basic.exercicio.estruturascondicionais;

public class Exercios14 {
    static void main() {
        boolean emailCorreto = true;
        boolean senhaCorreta = true;

        if (emailCorreto && senhaCorreta) {
            System.out.println("Logim realizado com sucesso.");
        } else {
            System.out.println(" Email ou senha invalidos.");
        }
    }
}
