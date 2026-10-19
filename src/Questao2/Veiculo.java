package Questao2;

public abstract class Veiculo {

    private String modelo;
    private int ano;
    private String placa;

    public Veiculo(String modelo, int ano, String placa) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public double calcularPreco() {
        return 100.0;
    }

    protected abstract String obterDadosEspecificos();

    public void exibirFicha() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);

        System.out.println(obterDadosEspecificos());

        System.out.printf(
                "Preco do aluguel: R$ %.2f%n",
                calcularPreco()
        );

        System.out.println("-------------------------");
    }
}