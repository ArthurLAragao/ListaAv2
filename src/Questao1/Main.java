package Questao1;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro("Thor", "Ana", 5, 30.0, 'G'),
                new Cachorro("Mel", "Bruno", 3, 6.0, 'P'),
                new Gato("Luna", "Carla", 2, 4.0, true),
                new Gato("Mingau", "Diego", 4, 5.0, false)
        };

        for (Animal animal : animais) {
            animal.exibirFicha();
        }
    }
}

