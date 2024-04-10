import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner escaner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = escaner.nextLine();
        System.out.println("Olá! "+nome+" Seu gostoso");
    }
}