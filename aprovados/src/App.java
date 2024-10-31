import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int num = sc.nextInt();

        String [] nome = new String [num];
        double [] nota1 = new double [num];
        double [] nota2 = new double [num];
        double [] media = new double [num];

        for (int i = 0; i < num; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %d o aluno: ", i + 1);
            nome[i] = sc.next();
            nota1[i] = sc.nextInt();
            nota2[i] = sc.nextInt(); 
        }
        double maior = media[0];
        int posicao = 0;

        System.out.printf("Alunos aprovados: ");  
        for (int i = 0; i < num; i++ ){
             media [i] = nota1[i] + nota2[i] / 2;
             if (media[i] > maior){
                maior = media[i];
                posicao = i;
                System.out.printf(nome[i]);   
             }
        }
        
        
    }
}
