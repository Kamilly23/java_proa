import java.util.*;

public class exer3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
 
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();    
        
        System.out.println("Digite o primeiro número: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n2 > n3){
           int res1 = n1 + n2;
           System.out.println("A soma desses números é igual a " + res1);

        }else if (n3 > n1 && n1 > n2){
            int res2 = n3 + n1;
            System.out.println("A soma desses números é igual a " + res2);

        } else {
            int res3 = n2 + n3;
            System.out.println("A soma desses números é igual a " + res3);
        }
   }
}

