import Questao2.Veiculo;

static void main(String[]args) {

            Carro corolla = new Carro(
                    "Corolla",
                    2024,
                    "ABC1D23",
                    'L'
            );

            Carro onix = new Carro(
                    "Onix",
                    2023,
                    "DEF4G56",
                    'E'
            );

            Moto honda = new Moto(
                    "Honda CG",
                    2022,
                    "GHI7J89",
                    true
            );

            Moto yamaha = new Moto(
                    "Yamaha Fazer",
                    2024,
                    "KLM0N12",
                    false
            );

            corolla.exibirFicha();
            onix.exibirFicha();
            honda.exibirFicha();
            yamaha.exibirFicha();
        }
    }

