import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       System.out.print("Quantas pessoas serao digitadas?  ");
       int num = sc.nextInt();

       String [] nome = new String[num];
       int [] idade = new int [num];
       double [] altura = new double [num];
       double soma = 0.0;

       for (int i = 0; i < num ; i++){
           System.out.printf("Dados da %da pessoa: \n", i + 1);

           System.out.print("Nome: ");
           nome [i] = sc.next();
           System.out.print("Iade: ");
           idade [i] = sc.nextInt();
           System.out.print("Altura: ");
           altura [i] = sc.nextDouble();
       }
         for (int i = 0; i < num; i++) {
             soma += altura[i] / num;
         }
         double porcemMenor = 0.0;
         int contador = 0;

         for (int i = 0; i < num; i++) {
            if (idade[i] >= 16){
                contador ++;
            }
         }
         porcemMenor = ((double) contador / num) * 100.0;
         
          System.out.printf(" Altura média: %.2f",soma);
          System.out.printf("\n Pessoas com menos de 16 anos: %.1f", porcemMenor);
          
          for(int i = 0; i < num; i++){
            if (idade[i] < 16){
                System.out.println("\n " + nome[i]);
            }
          }
          
        
    }
}
