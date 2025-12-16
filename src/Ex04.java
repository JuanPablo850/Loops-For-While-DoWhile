import java.util.Scanner;
public class Ex04 {
        public static void main(String[] args) throws Exception {

            //Exercícios com WHILE
            //Validação de senha
            //Peça uma senha ao usuário enquanto ela for diferente de "1234".

            Scanner scan = new Scanner(System.in);
            int senha = 1234;
            
            System.out.println("Digite a senha correta: ");
            int res = scan.nextInt();

            while(res != senha){
                System.out.println("Senha incorreta, tente novamente: ");
                res = scan.nextInt();
            }
            System.out.println("Senha correta!");
            
        }
}
