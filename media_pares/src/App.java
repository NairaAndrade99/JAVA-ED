import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

       System.out.print("Quantos elemntos vai ter o vetor: ");
       int num = sc.nextInt();

       int [] vetor = new int [num];
       double soma = 0.0;
       int conte = 0;

       for (int i = 0; i < num; i++){
         System.out.print("Digite um numero: ");
         vetor[i] = sc.nextInt();
       }
       
       for (int i = 0; i < num;i++){
          if (vetor[i] % 2  == 0){
             soma += vetor[i];
                conte ++;
          }
       } 
        double media =  soma / conte;
     if (conte > 0){
      System.out.printf("Media dos pares = %.1f ", media);
     }else {
         System.out.println("Nenhum numero par: ");
     }
        
    }
}
