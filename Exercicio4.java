public class Exercicio4 {
    public static void executar(){
        /*Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número n qualquer, depois mostre na tela o índice dos elementos que são inferiores a n. */

        int[] vetor = new int[5];

        int num = Prompt.lerInteiro("Digite um valor para a variavel: ");

        for(int i = 0; i < 5; i++){
            vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do vetor:");
        }
        for(int i = 0; i < 5; i++){
            if(vetor[i] < num){
                Prompt.imprimir("O valor do indice " + i + " é menor que o número digitado");
            }
        }
    }
}
