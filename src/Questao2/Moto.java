package Questao2;

public class Moto extends Veiculo {

        private boolean possuiBau;

        public Moto(
                String modelo,
                int ano,
                String placa,
                boolean possuiBau
        ) {
            super(modelo, ano, placa);
            this.possuiBau = possuiBau;
        }

        @Override
        protected String obterDadosEspecificos() {
            if (possuiBau) {
                return "Possui bau: Sim";
            }

            return "Possui bau: Nao";
        }

        @Override
        public double calcularPreco() {
            if (possuiBau) {
                return super.calcularPreco() * 1.1;
            }

            return super.calcularPreco();
        }
    }

