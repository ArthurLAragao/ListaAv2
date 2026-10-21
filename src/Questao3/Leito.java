package Questao3;

public class Leito extends Executiva {

    public Leito(String origem, String destino, int numPoltrona, double valorBase) {
        super(origem, destino, numPoltrona, valorBase);
    }

    @Override
    public String getCategoria() {
        return "Leito";
    }

    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal() + 80;
    }

    @Override
    public String getBeneficios() {
        return super.getBeneficios() + ", cobertor e travesseiro";
    }
}
