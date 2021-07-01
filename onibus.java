import jdk.jfr.DataAmount;

public class onibus {

    int onibus;
    String brasil;
    String turismo;
    int paradas;
    int capacidade_onibus;
    int pessoas_onibus;

    public onibus(int onibus, String brasil, String turismo, int paradas, int capacidade_onibus, int pessoas_onibus) {
        this.onibus = onibus;
        this.brasil = brasil;
        this.capacidade_onibus = capacidade_onibus;
        this.pessoas_onibus = pessoas_onibus;
        this.paradas = paradas;
        this.turismo = turismo;

    }

    public int getParadas() {
        return paradas;
    }


  public void setPessoas_onibus(int pessoas_onibus) {
        if (this.pessoas_onibus <= capacidade_onibus) {
            this.pessoas_onibus = pessoas_onibus;

        }
    }

    public void saida(int pessoas_onibus) {
        if (pessoas_onibus <= this.pessoas_onibus) {
            this.pessoas_onibus = pessoas_onibus - this.pessoas_onibus;
        }
    }

  public String parar(){

       return "O onibus parou";
    }



}

public class exem{
    public static void main(String[] args) {
        onibus b1 = new onibus(1, "Destino", "Bahia", 1, 40, 35);
        onibus b2 = new onibus(2, "Destino", "Rio de Janeiro", 2, 35, 30);
        onibus b3 = new onibus(3, "Destino", "Pernanbuco", 0, 40, 38);
        System.out.println(b1.getParadas());
        System.out.println(b2.getParadas());
        System.out.println(b3.getParadas());

    }


}