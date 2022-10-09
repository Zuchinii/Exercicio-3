
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double a, b;
        
        System.out.println("Digite o primeiro numero da soma");
        a = entrada.nextDouble();
        System.out.println("Digite o segundo numero da soma");
        b = entrada.nextDouble();
        double c;
        c= a + b;

        System.out.println("O resultado da soma é de: " + c);
        


    }
}
