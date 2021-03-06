public class elevador {
    int capacidade_elevador;
    int andar_escolhido;
    int andar_atual=0;
    int total_andares;
    int pessoas_no_elevador;

    
    
    public void setInicializa(int capacidade_elevador, int total_andares) {

        this.capacidade_elevador = capacidade_elevador;
        this.total_andares = total_andares;

    }
    public void saiPessoa(int pessoas_no_elevador) {
        if (capacidade_elevador <= this.pessoas_no_elevador) {
            this.pessoas_no_elevador = pessoas_no_elevador - this.pessoas_no_elevador;
        }
    }

    public void entraPessoa(int pessoas_no_elevador) {
        if (capacidade_elevador + pessoas_no_elevador <= this.pessoas_no_elevador) {
            this.pessoas_no_elevador = pessoas_no_elevador + this.pessoas_no_elevador;
        }
    }
    public void sobeAndar(int andar_atual) {
        if (andar_atual >= 0 && this.andar_atual <= total_andares) {

            this.andar_atual = andar_atual;
        }
    }
        public void desceAndar(int andar_escolhido){
            if (andar_atual > 0 && this.andar_escolhido < total_andares) {

                this.andar_atual = andar_atual;
            }

        }
    public int getCapacidade_elevador() {
        return capacidade_elevador;
    }
    public void setCapacidade_elevador(int capacidade_elevador) {
        this.capacidade_elevador = capacidade_elevador;
    }

    public int getAndar_atual() {
        return andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public int getTotal_andares() {
        return total_andares;
    }

    public void setTotal_andares(int total_andares) {
        this.total_andares = total_andares;
    }

    public int getPessoas_no_elevador() {
        return pessoas_no_elevador;
    }

    public void setPessoas_no_elevador(int pessoas_no_elevador) {
        this.pessoas_no_elevador = pessoas_no_elevador;
    }
}