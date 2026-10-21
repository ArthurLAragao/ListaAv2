package Questao3;

public abstract class Passagem {
    private String origem;
    private String destino;
    private int numAssento;
    private double preco;

    Passagem(String origem, String destino, int numAssento, double preco) {
        this.origem = origem;
        this.destino = destino;
        this.numAssento = numAssento;
        this.preco = 30;

    }

    abstract String PuxarValor();

    void ExibirPassagem() {
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("NumAssento: " + numAssento);
        PuxarValor();

    }

    class Convencional extends Passagem {
        private double taxa;


        Convencional(String origem, String destino, int numAssento, double preco, double taxa) {
            super(origem, destino, numAssento, preco);
            this.taxa = 1;
        }

        @Override
        String PuxarValor() {
            preco *= taxa;
            System.out.println("Seus Beneficions sao: Nenhum Beneficio");
            return String.format("%.2f", preco);
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
        preco *= taxa;
        System.out.println("Seus Beneficions sao: Ar-condicionado e Poltrona Reclinavel");
        return String.format("%.2f", preco);
        }





    }



}
