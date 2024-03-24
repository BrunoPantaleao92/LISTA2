public class Exercicio6 {
    public static void executar(){
        /* Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor com 5 pesos e calcule a média ponderada do aluno. */

        double[] notas = new double[5];

        for(int i = 0; i < 5; i++){

            double nota = Prompt.lerDecimal("Digite a " + (i + 1) + "ª nota");
            notas[i] = nota;
        }

        double[] pesos = new double[5];

        for(int i = 0; i < 5; i++){

            double peso = Prompt.lerDecimal("Digite o " + (i + 1) + "º peso");
            pesos[i] = peso;
        }

        Prompt.imprimir("A média ponderada do aluno é: " + (notas[0] * pesos[0] + notas[1] * pesos[1] + notas[2] * pesos[2] + notas[3] * pesos[3] + notas[4] * pesos[4]) / (pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4]));
    }
}
