import java.util.Scanner;
public class Ex08 {

    public static void main(String[] args) throws Exception {

        //Calculadora simples
        //Crie um menu com operações (+, -, *, /).
        //Após cada cálculo, pergunte se deseja continuar.

        Scanner scan = new Scanner(System.in);

        int res, n1, n2;
        char opcao;

        do { 
            System.out.println("Escolha uma opção de cálculo:\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão");
            res = scan.nextInt();
            switch (res){
                case 1:
                    System.out.print("Digite um número para somar: ");
                    n1 = scan.nextInt();
                    System.out.print("Digite outro número: ");
                    n2 = scan.nextInt();
                    res = n1 + n2;
                    System.out.printf("%d + %d = %d", n1, n2, res);
                    break;
                case 2:
                    System.out.print("Digite um número para subtrair: ");
                    n1 = scan.nextInt();
                    System.out.print("Digite outro número: ");
                    n2 = scan.nextInt();
                    res = n1 - n2;
                    System.out.printf("%d - %d = %d", n1, n2, res);
                    break;
                case 3:
                    System.out.print("Digite um número para multiplicar: ");
                    n1 = scan.nextInt();
                    System.out.print("Digite outro número: ");
                    n2 = scan.nextInt();
                    res = n1 * n2;
                    System.out.printf("%d x %d = %d", n1, n2, res);
                    break;
                case 4:
                    System.out.print("Digite um número para dividir: ");
                    n1 = scan.nextInt();
                    System.out.print("Digite outro número: ");
                    n2 = scan.nextInt();
                    res = n1 / n2;
                    System.out.printf("%d / %d = %d\n", n1, n2, res);
                    break;
                default:
            }
            System.out.println("\nDeseja continuar a operação? (S/N)");
             opcao = scan.next().charAt(0);
            
        }while (opcao == 'S' || opcao == 's');
            System.out.println("Fim da operação.");

        }
}
