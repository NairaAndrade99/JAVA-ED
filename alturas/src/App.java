import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       System.out.println("Quantas pessoas serao digitadas?  ");
       int num = sc.nextInt();

       String [] nome = new String[num];
       int [] idade = new int [num];
       double [] altura = new double [num];
       double soma = 0.0;

       for (int i = 1; i < num + 1; i++){
           System.out.printf("Dados da %da pessoa: ", i);

           System.out.println("Nome: ");
           nome [i] = sc.nextLine();
           System.out.println("Iade: ");
           idade [i] = sc.nextInt();
           System.out.println("Altura: ");
           altura [i] = sc.nextDouble();
       }
       for (int i = 1; i < num; i++) {
            soma += altura[i];
       }
       for (int i = 1; i < num; i++) {
            
       }
       for (int i = 1; i < num; i++){
            if (idade[i] < 16){
                System.out.println();
            }
       }

        
    }
}
