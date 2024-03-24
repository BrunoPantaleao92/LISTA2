public class Exercicio5 {
    public static void executar(){
        /*Elabore um programa que leia 5 números do teclado e os armazene em um vetor. Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes que o número n aparece no vetor. */

        int[] vetor = new int[5];

        int num = Prompt.lerInteiro("Digite um valor para a variavel: ");

        for(int i = 0; i < 5; i++){
            vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do vetor:");
        }
        for(int i = 0; i < 5; i++){
            if(vetor[i] == num){
                Prompt.imprimir("O valor do indice " + i + " é igual ao número digitado");
            }
        }
    }
}
