import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner (System.in);

          System.out.print("Quantos numeros voce vai digitar?");
          int num = sc.nextInt();

          double [] vetor = new double [num];

          for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite um numero: ");
                vetor[i] = sc.nextDouble();

          } 
          double maior = vetor[0];
          int posicaoMaior = 0;

          for (int i = 0; i < vetor.length; i++) {
                 if (vetor[i] > maior){
                    maior = vetor[i];
                    posicaoMaior = i;
          }
        }
          System.out.printf(" Maior valor = %.2f \n", maior);
          System.out.printf(" Posicao do maior valor  = %d", posicaoMaior );
              

          }
        
    
}
