public class Exercicio10 {
    public static void executar(){
        /*Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é oúltimo elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim por diante. */
      
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i = 0; i < 5; i++){
            vetorA[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número do vetor:");
        }

        int a = 4;
        for(int i = 0; i < 5 ; i++){
            vetorB[i] = vetorA[a];
            a--;
        }


        Prompt.linhaEmBranco();
        Prompt.separador();
        
        for(int i = 0; i < 5 ; i++){
            Prompt.imprimir(vetorB[i]);
    
        }
    }
}