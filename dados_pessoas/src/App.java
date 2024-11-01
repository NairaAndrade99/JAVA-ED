import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

    System.out.println("Quantas pessoas serao digitadas? ");
    int num  = sc.nextInt();

     double [] altura = new double [num]; 
     char [] sexo = new char [num];

     for(int i = 0; i < num; i++){
        System.out.printf("Altura da %da pessoa ", i + 1);
        altura[i] = sc.nextDouble();
        System.out.printf("Genero da %da pessoa ", i + 1);
        sexo[i] = sc.next().charAt(0);
     }
     double menorAltura = altura[0];
     int posicaoMenor = 0;

     for (int i = 0; i < num; i++) {
         if (altura[i] < menorAltura){
             menorAltura = altura[i];
             posicaoMenor = i;
         }
        
        }

     double maiorAltura = altura[0];
     int posicaoMaior = 0;

     for (int i = 0; i < num; i++) {
         if (altura[i] > maiorAltura){
            maiorAltura = altura[i];
            posicaoMaior = i;
         }
        
        }
     double somaSexoFeminino = 0.0;
     int contagemFeminino = 0;
     int contagemMasculino = 0;

     for (int i = 0; i < num; i++) {
        if (sexo[i] == 'f'){
            somaSexoFeminino += altura[i];
            contagemFeminino ++;
        }else {
            contagemMasculino ++;
        }
     }
      double media = somaSexoFeminino / contagemFeminino;

       System.err.printf(" Menor altura = %.2f  ", altura[posicaoMenor]);
       System.out.printf("\n Maior altura = %.2f  ", altura[posicaoMaior]);
       System.out.printf("\n Media das alturas das mulheres = %.2f ", media);
       System.out.printf("\n Numero de homens = %d", contagemMasculino);
    }
}
