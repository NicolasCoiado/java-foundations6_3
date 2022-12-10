import java.util.Scanner;
public class FormaRepetiçãoTeste {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        FormaRepetição form = new FormaRepetição();

        System.out.println("Digite que tipo de forma deseja:");
        System.out.println("(1) Retangulo");
        System.out.println("(2) Triângulo isósceles");
        int forma = sc.nextInt();

        if(forma==1){
            form.criarRetangulo();
        } else if (forma==2) {
            form.criarTriangulo();
        }else{
            System.out.println("O valor não corresponde a uma figura.");
        }
    }
}
