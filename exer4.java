import java.util.*;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double n1 = sc.nextInt();

        
        System.out.println("Digite mais um número real: ");
        double n2 = sc.nextInt();

        System.out.println("Escolha: 1 para divisão, 2 para multiplicação, 3 para soma e 4 para subtração")
        int res = sc.nextInt()

        if (res == 1){
        double res1 = n1 / n2;
        System.out.println("A divisão entre esses números é igual a " + res1);
        
        }else if (res == 2){
        double res2 = n1 * n2;
        System.out.println("A multiplicação desses números é igual a" + res2);

        }else if (res == 3){
            double res3 = n1 + n2;
            System.out.println("A soma desses números é igual a " + res3);
        }
    }
}