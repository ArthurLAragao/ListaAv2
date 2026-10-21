package Questao3;

public abstract class Passagem {
    private String origem;
    private String destino;
    private int numAssento;
    private double precoBase;

    Passagem(String origem, String destino, int numAssento, double precoBase) {
        this.origem = origem;
        this.destino = destino;
        this.numAssento = numAssento;
        this.precoBase = 30;

    }

    abstract String PuxarValor();

    void ExibirPassagem() {
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("NumAssento: " + numAssento);
        System.out.println("PrecoBase: " + precoBase);
        PuxarValor();

    }

    class Convencional extends Passagem {
        private double taxa;
        private double precoFinal;


        Convencional(String origem, String destino, int numAssento, double preco, double taxa,  double PrecoFinal) {
            super(origem, destino, numAssento, preco);
            this.taxa = 1;
            this.PrecoFinal = PrecoFinal;
        }

        @Override
        String PuxarValor() {

            precoFinal = precoBase * taxa;
            System.out.println("Seus Beneficions sao: Nenhum Beneficio");
            return String.format("%.2f", precoFinal);
        }
    }


    class Executiva extends Passagem {
        private double taxa;


        Executiva(String origem, String destino, int numAssento, double preco, double taxa) {
            super(origem, destino, numAssento, preco);
            this.taxa = 1.35;
        }

        @Override
        String PuxarValor() {
        precoBase *= taxa;
        System.out.println("Seus Beneficions sao: Ar-condicionado e Poltrona Reclinavel");
        return String.format("%.2f", precoBase);
        }





    }

    class Leito extends Passagem {
        private double taxa;


        Leito(String origem, String destino, int numAssento, double preco, double taxa) {
            super(origem, destino, numAssento, preco);
            this.taxa = 1.35;
        }

        @Override
        String PuxarValor() {
            precoBase *= taxa;
            precoBase += 80;
            System.out.println("Seus Beneficions sao: Os mesmo do executivo + Corbertor e Travesseiro ");
            return String.format("%.2f", precoBase);
        }





    }

}
