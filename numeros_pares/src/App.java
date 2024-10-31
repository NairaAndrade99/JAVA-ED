import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner (System.in);

      System.out.print("Quantos numeros voce vai digitar? ");
      int num = sc.nextInt();

      int [] vetor = new int [num];
      int soma = 0;

      for (int i = 0; i < vetor.length; i++){
        System.out.print("Digite um numero: ");
        vetor [i] = sc.nextInt();

      }
      System.out.println("Numeros pares: ");
      for (int i = 0; i < vetor.length; i++){
           if (vetor[i] % 2 == 0){
             System.out.print(" " + vetor[i]);
             soma ++;
           }
      }
       System.out.printf("\n Quantidade de pares = %d", soma);
   
    }
}
