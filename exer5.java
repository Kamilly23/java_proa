import java.util.Scanner;

public interface exer5 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int n1 = scanner.nextInt();
        System.out.println(n1 > 0 || !(n1 < 0));

        System.out.print("Digite outro numero: ");

        int n2 = scanner.nextInt();
        System.out.println(n2 > 0 || !(n2 < 0));


        if (n1=n2 && n1=n2 > 0){
            System.out.println(n1 + "é positivo!!");
      
        }else if (n1=n2 && n1=n2 < 0){
            System.out.println(n2 + "é negativo!!");
     
}
  }
    }