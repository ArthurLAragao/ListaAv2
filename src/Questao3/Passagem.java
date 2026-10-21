package Questao3;

public abstract class Passagem {
    private String origem;
    private String destino;
    private int numPoltrona;
    private double valorBase;

    public Passagem(String origem, String destino, int numPoltrona, double valorBase) {
        this.origem = origem;
        this.destino = destino;
        this.numPoltrona = numPoltrona;
        this.valorBase = valorBase;
    }

    public double getValorBase() {
        return valorBase;
    }

    public abstract String getCategoria();

    public abstract double calcularValorFinal();

    public abstract String getBeneficios();

    public void imprimirBilhete() {
        System.out.println("----- BILHETE -----");
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Poltrona: " + numPoltrona);
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Benefícios: " + getBeneficios());
        System.out.printf("Valor final: R$ %.2f%n", calcularValorFinal());
        System.out.println();
    }
}
