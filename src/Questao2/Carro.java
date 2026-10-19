package Questao2;

public class Carro extends Veiculo {

        private char categoria;

        public Carro(
                String modelo,
                int ano,
                String placa,
                char categoria
        ) {
            super(modelo, ano, placa);

            if (categoria != 'E' && categoria != 'L') {
                throw new IllegalArgumentException(
                        "A categoria deve ser E ou L."
                );
            }

            this.categoria = categoria;
        }

        @Override
        protected String obterDadosEspecificos() {
            return "Categoria: " + categoria;
        }

        @Override
        public double calcularPreco() {
            if (categoria == 'L') {
                return super.calcularPreco() * 1.3;
            }

            return super.calcularPreco();
        }
    }

