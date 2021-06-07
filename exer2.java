import java.util.Scanner; 

public class exer{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite números diferentes!");

        System.out.println("Digite seu primeiro número: ");
        int n1 = sc.nextInt();
       
        System.out.println("Digite seu segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Digite seu terceiro número: ");
        int n3 = sc.nextInt();

        if(n1 > n2 && n2 > n3){
            System.out.println("Esse é o maior número: ");

        }else if (n2 > n1 && n1 > n3){
           System.out.println("Esse é o maior número de todos!" );

        }else{
            System.out.println("Esquece todos os outros esse é o maior!" );
        }
    }
}
