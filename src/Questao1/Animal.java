package Questao1;

abstract class Animal {
    private String nome;
    private String tutor;
    private int idade;
    private double peso;

    public Animal(String nome, String tutor, int idade, double peso) {
        this.nome = nome;
        this.tutor = tutor;
        this.idade = idade;
        this.peso = peso;
    }

    public double calcularConsulta() {
        return 120.0;
    }

    protected abstract String obterDadosEspecificos();

    public final void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Tutor: " + tutor);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Peso: %.1f kg%n", peso);

        System.out.println(obterDadosEspecificos());

        System.out.printf(
                "Valor da consulta: R$ %.2f%n",
                calcularConsulta()
        );

        System.out.println("--------------------");
    }
}

class Cachorro extends Animal {
    private char porte;

    public Cachorro(
            String nome, String tutor, int idade, double peso, char porte
    ) {
        super(nome, tutor, idade, peso);
        this.porte = porte;
    }

    @Override
    protected String obterDadosEspecificos() {
        return "Porte: " + porte;
    }

    @Override
    public double calcularConsulta() {
        double valorBase = super.calcularConsulta();

        if (porte == 'G') {
            return valorBase * 1.25;
        }

        return valorBase;
    }
}

class Gato extends Animal {
    private boolean castrado;

    public Gato(
            String nome, String tutor, int idade, double peso,
            boolean castrado
    ) {
        super(nome, tutor, idade, peso);
        this.castrado = castrado;
    }

    @Override
    protected String obterDadosEspecificos() {
        return "Castrado: " + (castrado ? "Sim" : "Não");
    }

    @Override
    public double calcularConsulta() {
        double valorBase = super.calcularConsulta();

        if (castrado) {
            return valorBase * 0.90;
        }

        return valorBase;
    }
}
