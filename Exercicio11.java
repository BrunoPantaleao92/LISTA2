public class Exercicio11 {
    public static void executar(){
        
        /*Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteirosde tamanho igual a 5.
        Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140 */

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i = 0; i < 5; i++){
            vetorA[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do 1º vetor:");
        }

        for(int i = 0; i < 5; i++){
            vetorB[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do 2º vetor:");
        }

        int produtoescalar = 0;

        for(int i = 0; i < 5; i++){
          produtoescalar = produtoescalar + vetorA[i] * vetorB[i];
        }

        Prompt.linhaEmBranco();
        Prompt.separador();

        Prompt.imprimir("O produto escalar é: " + produtoescalar);

    }
}
