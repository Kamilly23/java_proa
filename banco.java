class banco {
    String nome;
    int numero_conta;
    String agencia;
    double saldo;
    String data_check;

    public banco(String nome, int numero_conta, String agencia, double saldo, String data_check) {
        this.nome = nome;
        this.numero_conta = numero_conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data_check = data_check;
    }

    public String getNome() {
      return nome;
     }

     public void setNome(String nome) {
     this.nome = nome;
    }

    public int getConta() {
     return numero_conta;
    }

    public void deposito(double depositar){
        saldo = saldo + depositar;
        System.out.println("Seu valor foi depositado com sucesso! \nnovo saldo: " + saldo);
        return;
    }

    public void redimentoMensal(){
        if(saldo > 0){
            double calc = (1.002  * saldo);
            saldo = calc;
            System.out.println("\nseu rendimento foi calculado com sucesso! seu saldo atual: " + saldo);
            return;
        }
    System.out.print("\nsem saldo na conta.");
    }

    public void sacar(double saque){
        if(saque > saldo){
            System.out.print("\ninfelizmente nao ha saldo suficiente na conta.");
            return;
        }
        if(saque > 0) {
            saldo = saldo - saque;

            System.out.println("\nsaque efetuado com sucesso!\n seu saldo eh de " + saldo);
            return;
        }

    System.out.print("\nnao foi possivel sacar o valor inserido.");
    }

 

    public class Main {
        public static void main(String[] args) {
            banco conta = new banco("Kamilly Costa" , 2304, "Nubank", 2003, "sexta");

            conta.deposito(1.000);

            conta.sacar(250);

            conta.redimentoMensal();

        }
    }
}