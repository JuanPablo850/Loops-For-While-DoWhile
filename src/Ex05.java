import java.util.Scanner;
public class Ex05 {
     public static void main(String[] args) throws Exception {

    //Soma até zero
    //Leia números inteiros e some-os.
    //O programa deve parar quando o usuário digitar 0.

    Scanner scan = new Scanner(System.in);
    int n1 = 1, n2, res;
    
    while(n1 != 0){
        System.out.print("Digite um número inteiro: ");
        n1 = scan.nextInt();
        System.out.print("Digite outro número inteiro: ");
        n2 = scan.nextInt();
        res = n1 + n2;
        System.out.printf("%d + %d = %d\n", n1, n2, res);
        System.out.println("Caso queira cancelar a operação, digite '0' ");
        System.out.println("Caso queira continuar a operação, digite qualquer número. ");
        n1 = scan.nextInt();
    }
    


}
}
