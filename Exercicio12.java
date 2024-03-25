public class Exercicio12 {
    public static void executar(){
        /*Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840 */
    
        int[] vetor = new int[12];

        for(int i = 0; i < 12; i++){
            vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do vetor:");
        }
        
        int multiplicador = 1;

        for(int i = 0; i < 12; i++){
            if(vetor[i] > 0 && vetor[i] % 2 == 0){
            multiplicador = multiplicador * vetor[i];
            }
        }
        Prompt.imprimir(multiplicador);







    }
}
