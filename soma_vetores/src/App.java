import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Quantos valores vai ter cada vetor: ");
       int num = sc.nextInt();

       int [] vetorA = new int [num];
       int [] vetorB = new int [num];
       int [] vetorC = new int [num];

       System.out.println("Digite os valores do vetor A: ");
       for (int i = 0; i < num;i++){
            vetorA[i] = sc.nextInt();
    }
       System.out.println("Digite os valores do vetor B: ");
       for (int i = 0; i < num;i++){
        vetorB[i] = sc.nextInt();
    }
       for (int i = 0; i < num;i++){
        vetorC[i] = vetorA[i] + vetorB[i];
    }  
       System.out.println("VETOR RESULTANTE: ");
       for (int i = 0; i < num;i++){
         System.out.println(vetorC [i]);
       }



    }
}
