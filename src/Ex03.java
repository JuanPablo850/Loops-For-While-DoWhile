import java.util.Scanner;
public class Ex03 {

     public static void main(String[] args) throws Exception {
     
        //Tabuada
        //Peça um número ao usuário e exiba a tabuada dele (1 a 10).
    
        Scanner scan = new Scanner(System.in);
        int n1, res;
        System.out.println("Digite um número: ");
        n1 = scan.nextInt();
        
        for(int count = 0; count <= 10; count++){
            res = n1 * count;
            System.out.printf("%d X %d = %d\n", n1, count, res);
        }

    
    
    
    }
}
