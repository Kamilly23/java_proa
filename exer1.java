import java.util.*; 

public class exer1 {
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um numero: ");
    int n = sc.nextInt();

    if (n > 0){
        System.out.println(n + "é positivo!!");
  
    }else if (n < 0){
        System.out.println(n + "é negativo!!");
 
    }else{
        System.out.println("Você inseriu um número 0!!");
     }
    } 
}