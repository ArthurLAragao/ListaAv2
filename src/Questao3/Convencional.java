package Questao3;

public class Convencional extends Passagem {

    public Convencional(String origem, String destino, int numPoltrona, double valorBase) {
        super(origem, destino, numPoltrona, valorBase);
    }

    @Override
    public String getCategoria() {
        return "Convencional";
    }

    @Override
    public double calcularValorFinal() {
        return getValorBase();
    }

    @Override
    public String getBeneficios() {
        return "Nenhum benefício adicional";
    }
}
