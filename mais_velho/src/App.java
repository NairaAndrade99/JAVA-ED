import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantas pessoas voce vai digitar: ");
        int num = sc.nextInt();

         String [] nome = new String [num];
         int [] idade = new int [num];

         for (int i = 0; i < num  ; i++){
             System.out.printf("Dados da %da pessoa: \n", i + 1);

             System.out.print("Nome: ");
             nome[i] = sc.next();

             System.out.print("Idade: ");
             idade[i] = sc.nextInt();      
         }
         int maior = idade[0];
         int posicao = 0;
         
         for (int i = 0; i < nome.length;i++){
            if (idade[i] > maior ){
                maior = idade[i];
                posicao = i;
                
            }
         }
         System.out.printf("Pessoa mais velha: %s ", nome[posicao]);



        

    }
}
