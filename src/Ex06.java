import java.util.Scanner;
public class Ex06 {

     public static void main(String[] args) throws Exception {

        //Exercícios com DO WHILE
        //Confirmação de escolha
        //Peça ao usuário:
        //Deseja continuar? (S/N)
        //O programa deve executar ao menos uma vez.

        Scanner scan = new Scanner(System.in);
           char opcao;     
         do{ 
            System.out.println("Você deseja continuar o programa ? (S/N)");
            opcao = scan.next().charAt(0);
        } while (opcao == 'S' || opcao == 's');
            
             System.out.println("Fim do programa.");
            
    }
}

