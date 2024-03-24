public class Exercicio9 {
    public static void executar(){
        
        /*Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras:
        a. Os elementos das posições pares de C são os elementos das posições pares de A;
        b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B */

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];



        for(int i = 0; i < 5; i++){
            vetorA[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do 1º vetor:");
        }

        for(int i = 0; i < 5; i++){
            vetorB[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do 2º vetor:");
        }

        int a = 0;
        int b = 0;

        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                vetorC[i] = vetorA[a];
                a++;
            }
            else{
                vetorC[i] = vetorB[b];
                b++;
            }
        }

        Prompt.linhaEmBranco();
        Prompt.separador();
        
        for(int i = 0; i < 10 ; i++){
            Prompt.imprimir(vetorC[i]);
        }
    }

}