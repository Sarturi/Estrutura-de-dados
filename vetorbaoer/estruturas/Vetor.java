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
            System.out.println("Não é possivel adicionar um novo");
            return;
        }
        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    } 

    public void mostrarElementos(){
        for (int i = 0; i<this.tamanho; i++)
        System.out.println(this.elementos[i]);
        System.out.println(",  ");
    }
    public void taLa(int numero){
        for (int i = 0; i<this.tamanho; i++){
            if(numero == this.elementos[i]){
                System.out.println("sim");
                System.out.println("Posição: " + i);
            }
        }
    }
}