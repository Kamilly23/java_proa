import java.util.Scanner;

public class exer6 {
    public static void main(String[] args){

        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);


        int n1 = scanner.nextInt();

        System.out.print("Digite mais um número: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite mais um número: ");
        int n3 = scanner.nextInt();

        System.out.print("Digite mais um número vai: ");
        int n4 = scanner.nextInt();

        System.out.print("Digite mais um número vamos: ");
        int n5 = scanner.nextInt();

        System.out.print("Digite mais um número: ");
        int n6 = scanner.nextInt();

        System.out.print("Digite mais um número: ");
        int n7 = scanner.nextInt();

        System.out.print("Digite um número: ");
        int n8 = scanner.nextInt();

        System.out.print("Digite mais um número: ");   
        int n9 = scanner.nextInt();

        System.out.print("Digite o ultimo número prometo: ");
        int n10 = scanner.nextInt(); 

        try {
        new ProcessBuilder("cls").inheritIO().start().waitFor(); 
        } catch(Exception e) {
        e.printStackTrace();}

        System.out.print("A soma de todos numero equivale a: " + (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10));
}
 }
