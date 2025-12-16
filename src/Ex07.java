import java.util.Scanner;
public class Ex07 {

    public static void main(String[] args) throws Exception {
    
    //Número válido
    //Peça um número entre 1 e 10.
    //Repita até o usuário digitar um valor válido.
    
    Scanner scan = new Scanner(System.in);
    int n1;
    do { 
        System.out.println("Digite um número entre 1 e 10");
    n1 = scan.nextInt();
    } while (n1 >= 1 && n1 > 10);
        System.out.println("Fim do programa");
    }
    
}
