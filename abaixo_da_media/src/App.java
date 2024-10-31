import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);

       System.out.print("Quantos elementos vai ter o vetor: ");
       int num = sc.nextInt();

       double [] vetor = new double [num];
       double soma = 0.0;

       for (int i = 0; i < num; i++){
           System.out.print("Digite um numero: ");
           vetor[i] = sc.nextDouble();
       }
       for (int i = 0; i < num;i++){
          soma += vetor[i] / num;
       }

       System.out.printf ("Media do vetor %.3f\n ", soma);

       System.out.println("Elementos abaixo da media: ");
       for (int i = 0; i < num; i++){
            if (vetor [i] <= 10){
                System.out.println(vetor[i]);
            }
       }
       
    }
}
