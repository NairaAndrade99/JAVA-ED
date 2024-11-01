import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int num = sc.nextInt();

        String [] nome = new String [num];
        double [] nota1 = new double [num];
        double [] nota2 = new double [num];
        double media = 0.0;
        

        for (int i = 0; i < num; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %d o aluno: ", i + 1);
            System.out.println("");
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble(); 
        }
        

        System.out.printf("Alunos aprovados: \n");  
        for (int i = 0; i < num; i++ ){
             media = nota1[i] + nota2[i] / 2;
             if (media >=  6 ){
                
                System.out.println(nome[i]);   
             }
        }
        
        
    }
}
