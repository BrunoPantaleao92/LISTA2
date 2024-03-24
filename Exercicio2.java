public class Exercicio2 {
    public static void executar(){
        /*Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero. */

        int sequencia = Prompt.lerInteiro("Digite o tamanho da sequencia de números: ");

        int vetor[] = new int[sequencia];

        for(int i = 0; i < sequencia; i++){
           vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número da sequencia:");
        }
        
        Prompt.linhaEmBranco();
        Prompt.separador();

        for(int i = 0; i < sequencia; i++){
            if(vetor[i] == 0){
                System.out.println("\n O número: " + vetor[i] + " na posição do vetor: " + i + " é igual a zero");
            }
            else if(vetor[i] > 0){
                System.out.println("\n O número: " + vetor[i] + " na posição do vetor: " + i +" é positivo");
            }
            else{
                System.out.println("\n O número: " + vetor[i] + " na posição do vetor: " + i + " é negativo");
            }
        }

    }

}
