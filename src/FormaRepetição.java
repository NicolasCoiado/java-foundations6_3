import java.util.Scanner;
public class FormaRepetição {
    public static void criarRetangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da altura do retângulo:");
        int altura = sc.nextInt();
        System.out.print("Digite o valor da largura do retângulo:");
        int largura = sc.nextInt();

        for (int a=0; a<altura; a++){
            System.out.println("");
            for (int l=0; l<largura; l++){
                System.out.print("#");
            }
        }
    }
    public static void criarTriangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da perna do triângulo:");
        int perna = sc.nextInt();

        for (int linha = 0; linha<=perna; linha++){
            for (int coluna = 0; coluna<linha; coluna++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
