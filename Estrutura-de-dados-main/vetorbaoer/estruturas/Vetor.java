public class Vetor {

    private Integer[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade){
        this.tamanho = 0;
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
    }
    public void adicionar (Integer valor){
        if (this.tamanho == this.capacidade){
            this.capacidade = this.capacidade * 2;
        }
        this.elementos[this.tamanho] = valor;
        return;
    } 

    public void mostrarElementos() {
        for (int i = 0; i<this.tamanho; i++) {
            System.out.print(this.elementos[i]);

            if (!(i == (this.tamanho - 1))) {
                System.out.print(", ");
            }
        }
    }
    public Integer taLa(int numero){
        for (int i = 0; i < this.tamanho; i++){
            if (numero == this.elementos[i]){
                return i;  
            }
        }
        return null;  
    }
    public void remover(int numero) {
        if(taLa(numero) == null){
            System.out.println("não taLa");
        }else{
        for (int i = taLa(numero); i < this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.elementos[this.tamanho-1] = null;
        this.tamanho--;
    }
        mostrarElementos();
    }
}