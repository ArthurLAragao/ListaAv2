
    package Questao3;

    public class Main {
        public static void main(String[] args) {
            Passagem convencional = new Convencional("Fortaleza", "Juazeiro do Norte", 10, 150.00);
            Passagem executiva = new Executiva("Fortaleza", "Juazeiro do Norte", 15, 150.00);
            Passagem leito = new Leito("Fortaleza", "Juazeiro do Norte", 20, 150.00);

            convencional.imprimirBilhete();
            executiva.imprimirBilhete();
            leito.imprimirBilhete();


        }
    }
