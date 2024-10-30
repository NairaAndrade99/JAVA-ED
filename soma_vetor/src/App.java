import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Quantos numeros voce vai digitar? ");
       int num = sc.nextInt();

       double [] vetor = new double[num];

       double soma = 0.0, media = 0.0;

       for (int i = 0; i < vetor.length; i++) {
          System.out.println("Digite um numero: ");
          double n = sc.nextDouble();
          vetor[i] = n;
       }
       System.out.print(" Valores = " );
       for (int i = 0; i < vetor.length; i++) {
                   System.out.print(" " + vetor[i]);
       }
         System.out.print("\n ");
       for (int i = 0; i < vetor.length; i++) {
             soma += vetor[i];
       }
       for (int i = 0; i < vetor.length; i++){
            media += vetor[i] / num;
       }
        System.out.println("SOMA = " + soma);
        System.out.println("Media = " + media);
       
    }
}
