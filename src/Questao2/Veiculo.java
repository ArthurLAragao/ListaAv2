package Questao2;

abstract class Veiculo {
    private String modelo;
    private int ano;
    private String placa;



    Veiculo(String modelo, int ano, String placa) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    double CalcularPreco() {
        return 100.0;
     }

     protected abstract String Obtervalor();

    void ExibirCarro() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Preco do aluguel: " + CalcularPreco());
        System.out.println(Obtervalor());

    }

    class Carro extends Veiculo {
        private char category;


        Carro(String modelo, int ano, String placa, char category) {
            super(modelo, ano, placa);
            this.category = category;
        }

        @Override
        protected String Obtervalor() {
            return "Categoria: " + this.category;
        }

        @Override
        double CalcularPreco() {
            if (this.category == 'E'){
           return 100.0;
            }
       else if (this.category == 'L'){
           return 100.0 * 1.3;
       }
       else {
           return 100.0;
       }
     }

    }

    class Moto extends Veiculo {
        private boolean Storage;

        Moto(String modelo, int ano, String placa, boolean Storage) {
            super(modelo, ano, placa);
            this.Storage = Storage;
        }

        @Override
        protected String Obtervalor() {
            return "Storage: " + this.Storage;
        }

        @Override
        double CalcularPreco() {
            if (this.Storage) {
                return 100.0 * 1.1;
            }
            else {
                return 100.0;
            }
        }

    }




}
