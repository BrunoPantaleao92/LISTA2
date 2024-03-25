public class Exercicio13 {
    public static void executar(){
        /*Elabore um algoritmo que receba um número n e retorne um vetor com os n primeiros termos da sequência de Fibonacci.
        Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 13, 21}. */
    

        int num = Prompt.lerInteiro("Digite a quantidade de termos da sequencia de Fibonacci a serem mostrados: ");

        int[] vetor = new int[num];

        if (num >= 1) {
            vetor[0] = 1;
        }
        if (num >= 2) {
            vetor[1] = 1;
        }
        for (int i = 2; i < num; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
        }
        for(int i = 1; i < num; i++){
            Prompt.imprimir(vetor[i]);
        }
    }
}
