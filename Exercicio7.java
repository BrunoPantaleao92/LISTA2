public class Exercicio7 {
    public static void executar(){
        /*Faça um programa que leia dois vetores de 5 elementos cada e verifique se elessão iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem coincidir.*/
        int[] vetor = new int[5];
        int[] vetor2 = new int[5];


        for(int i = 0; i < 5; i++){
            vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do 1º vetor:");

    }

    for(int i = 0; i < 5; i++){
        vetor2[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do 2º vetor:");

    }

    boolean saoIguais = true;
    for(int i = 0; i < 5; i++){
        if (vetor[i] != vetor2[i]) {
           saoIguais = false;
            break;
        }

    }
        
    if(saoIguais){
            Prompt.imprimir("Os vetores são iguais");
        }
        else{
            Prompt.imprimir("Os vetores são diferentes");
        }
    }
}
