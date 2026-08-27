package flaamingo.aprendendo.basic.exercicio.estruturascondicionais;

public class Exercios23 {
   public static void main(String[] args) {

       double salario = 2750;

       if (salario >= 7000) {
           System.out.println("Salario alto");
       } else if (salario <= 1500) {
           System.out.println(" Salario baixo" );
       } else if (salario >= 1501) {
           System.out.println("Salario médio ");
       } else {
           System.out.println(" Salario bom.");
       }

   }

}

/**
 * Faixa salarial
 * Crie uma variável salario.
 *
 * Classifique:
 *
 * até 1500: "Salário baixo"
 * de 1501 até 3000: "Salário médio"
 * de 3001 até 7000: "Salário bom"
 * acima de 7000: "Salário alto"*/