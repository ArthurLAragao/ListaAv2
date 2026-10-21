package Questao3;

public class Executiva extends Passagem {

    public Executiva(String origem, String destino, int numPoltrona, double valorBase) {
        super(origem, destino, numPoltrona, valorBase);
    }

    @Override
    public String getCategoria() {
        return "Executiva";
    }

    @Override
    public double calcularValorFinal() {
        return getValorBase() * 1.35;
    }

    @Override
    public String getBeneficios() {
        return "Ar-condicionado e poltrona reclinável";
    }
}
