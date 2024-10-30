import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);

       int [] vetor = new int [10];

        System.out.println("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Digite um numero: ");
            int n = sc.nextInt();
            vetor[i] = n;
       }
       System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < num; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
        }
    }
 }
}
