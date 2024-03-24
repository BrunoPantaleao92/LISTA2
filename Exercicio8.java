public class Exercicio8 {
    public static void executar(){
        /*Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos de B */

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];



        for(int i = 0; i < 5; i++){
            vetorA[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do 1º vetor:");
        }

        for(int i = 0; i < 5; i++){
            vetorB[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do 2º vetor:");
        }

        for(int i = 0; i < 5; i++){
            vetorC[i] = vetorA[i];
            }

        for(int i = 0; i < 5 ; i++){
                vetorC[i + 5] = vetorB[i];
        }

        for(int i = 0; i < 10 ; i++){
                    Prompt.imprimir(vetorC[i]);
        }
    }
 }

