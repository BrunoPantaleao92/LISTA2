public class Exercicio3 {
    public static void executar(){
        /*Faça um programa que leia em um vetor uma sequência finita de números digitados pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do primeiro vetor e depois apresente os valores deste vetor. */

        int sequencia = Prompt.lerInteiro("Digite o tamanho da sequencia de números: ");

        int vetor[] = new int[sequencia];
        int vetor2[] = new int[sequencia];

        for(int i = 0; i < sequencia; i++){
           vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número da sequencia:");

           vetor2[i] = vetor[i] * 2;
        }

        Prompt.linhaEmBranco();
        Prompt.separador();

        for(int i = 0; i < sequencia; i++){
        Prompt.imprimir(vetor2[i]);
        }

    }
}
