public class Exercicio1 {
    public static void executar(){

        /*Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais ou superiores à média. */

        double[] notas = new double[5];

        for(int i = 0; i < 5; i++){

        double nota = Prompt.lerDecimal("Digite a " + (i + 1) + "ª nota");
        notas[i] = nota;

        }

        double soma = 0;

        for(int i = 0; i < 5; i++){
            soma = soma + notas[i];
        }

        System.out.println("A média do aluno é :" + (soma / 5));

        for(int i = 0; i < 5; i++){
            if (notas[i] == (soma / 5)){
                Prompt.imprimir("Nota igual a média: " + notas[i]);
            }
            else if (notas[i] > (soma / 5)){
                Prompt.imprimir("Nota acima da média: " + notas[i]);
            }
            else{
                Prompt.imprimir("Nota abaixo da média: " + notas[i]);
            }
        }
        
    }

}
