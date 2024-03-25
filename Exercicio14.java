public class Exercicio14 {
    public static void executar(){
        /*Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento na última posição do vetor.
        Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor atualizado na tela.*/

        int[] vetor = new int[5];

        for(int i = 0; i < 5; i++){
            vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do vetor:");
        }
        
        int maior = vetor[0];


        for(int i = 0; i < 5; i++){
            if (vetor[0] > vetor[i]) {
                maior = vetor[0];
            }
            else{
                maior = vetor[i];
            }
        }

        int aux = vetor[4];

        for(int i = 0; i < 5; i++){
            if (vetor[i] == maior){
                vetor[i] = aux;
            }
        }

        vetor[4] = maior;

        Prompt.linhaEmBranco();
        Prompt.separador();

        Prompt.imprimir("O vetor reorganizado é: ");
        for(int i = 0; i < 5; i++){
        Prompt.imprimir(vetor[i]);
        }

    }
}
